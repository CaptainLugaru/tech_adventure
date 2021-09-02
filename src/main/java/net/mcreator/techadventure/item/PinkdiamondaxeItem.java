
package net.mcreator.techadventure.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.techadventure.itemgroup.MagictoolsItemGroup;
import net.mcreator.techadventure.TechAdventureModElements;

@TechAdventureModElements.ModElement.Tag
public class PinkdiamondaxeItem extends TechAdventureModElements.ModElement {
	@ObjectHolder("tech_adventure:pinkdiamondaxe")
	public static final Item block = null;
	public PinkdiamondaxeItem(TechAdventureModElements instance) {
		super(instance, 110);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1200;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 12;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PinkDiamondItem.block));
			}
		}, 1, 1f, new Item.Properties().group(MagictoolsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("pinkdiamondaxe"));
	}
}
