
package net.mcreator.techadventure.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.techadventure.itemgroup.TechadventuretabItemGroup;
import net.mcreator.techadventure.TechAdventureModElements;

@TechAdventureModElements.ModElement.Tag
public class TerainiumhoeItem extends TechAdventureModElements.ModElement {
	@ObjectHolder("tech_adventure:terainiumhoe")
	public static final Item block = null;
	public TerainiumhoeItem(TechAdventureModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 300;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 6;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TerainiumItem.block));
			}
		}, 0, -3f, new Item.Properties().group(TechadventuretabItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("terainiumhoe"));
	}
}
