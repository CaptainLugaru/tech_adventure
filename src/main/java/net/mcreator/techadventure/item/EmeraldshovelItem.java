
package net.mcreator.techadventure.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.techadventure.itemgroup.EmaraldtabItemGroup;
import net.mcreator.techadventure.TechAdventureModElements;

@TechAdventureModElements.ModElement.Tag
public class EmeraldshovelItem extends TechAdventureModElements.ModElement {
	@ObjectHolder("tech_adventure:emeraldshovel")
	public static final Item block = null;
	public EmeraldshovelItem(TechAdventureModElements instance) {
		super(instance, 43);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 200;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return -1.5f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 8;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.EMERALD));
			}
		}, 1, -3f, new Item.Properties().group(EmaraldtabItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("emeraldshovel"));
	}
}
