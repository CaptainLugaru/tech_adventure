
package net.mcreator.techadventure.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.Items;
import net.minecraft.item.Item;
import net.minecraft.item.BucketItem;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.block.material.Material;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.techadventure.procedures.OilMobplayerCollidesBlockProcedure;
import net.mcreator.techadventure.itemgroup.AbilitytabItemGroup;
import net.mcreator.techadventure.TechAdventureModElements;

import java.util.Map;
import java.util.HashMap;

@TechAdventureModElements.ModElement.Tag
public class OilBlock extends TechAdventureModElements.ModElement {
	@ObjectHolder("tech_adventure:oil")
	public static final FlowingFluidBlock block = null;
	@ObjectHolder("tech_adventure:oil_bucket")
	public static final Item bucket = null;
	public static FlowingFluid flowing = null;
	public static FlowingFluid still = null;
	private ForgeFlowingFluid.Properties fluidproperties = null;
	public OilBlock(TechAdventureModElements instance) {
		super(instance, 149);
		FMLJavaModLoadingContext.get().getModEventBus().register(new FluidRegisterHandler());
	}
	private static class FluidRegisterHandler {
		@SubscribeEvent
		public void registerFluids(RegistryEvent.Register<Fluid> event) {
			event.getRegistry().register(still);
			event.getRegistry().register(flowing);
		}
	}
	@Override
	@OnlyIn(Dist.CLIENT)
	public void clientLoad(FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(still, RenderType.getTranslucent());
		RenderTypeLookup.setRenderLayer(flowing, RenderType.getTranslucent());
	}

	@Override
	public void initElements() {
		fluidproperties = new ForgeFlowingFluid.Properties(() -> still, () -> flowing,
				FluidAttributes.builder(new ResourceLocation("tech_adventure:blocks/oil"), new ResourceLocation("tech_adventure:blocks/oil"))
						.luminosity(3).density(1000).viscosity(500).temperature(300).rarity(Rarity.COMMON)).explosionResistance(100f).tickRate(5)
								.levelDecreasePerBlock(1).slopeFindDistance(4).bucket(() -> bucket).block(() -> block);
		still = (FlowingFluid) new ForgeFlowingFluid.Source(fluidproperties).setRegistryName("oil");
		flowing = (FlowingFluid) new ForgeFlowingFluid.Flowing(fluidproperties).setRegistryName("oil_flowing");
		elements.blocks
				.add(() -> new FlowingFluidBlock(still, Block.Properties.create(Material.WATER).hardnessAndResistance(100f).setLightLevel(s -> 0)) {
					@Override
					public void onEntityCollision(BlockState blockstate, World world, BlockPos pos, Entity entity) {
						super.onEntityCollision(blockstate, world, pos, entity);
						int x = pos.getX();
						int y = pos.getY();
						int z = pos.getZ();
						{
							Map<String, Object> $_dependencies = new HashMap<>();
							$_dependencies.put("entity", entity);
							OilMobplayerCollidesBlockProcedure.executeProcedure($_dependencies);
						}
					}
				}.setRegistryName("oil"));
		elements.items.add(() -> new BucketItem(still,
				new Item.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(AbilitytabItemGroup.tab).rarity(Rarity.COMMON))
						.setRegistryName("oil_bucket"));
	}
}
