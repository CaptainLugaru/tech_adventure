
package net.mcreator.techadventure.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.techadventure.itemgroup.TechadventuretabItemGroup;
import net.mcreator.techadventure.TechAdventureModElements;

@TechAdventureModElements.ModElement.Tag
public class TerainiumSwordItem extends TechAdventureModElements.ModElement {
	@ObjectHolder("tech_adventure:terainium_sword")
	public static final Item block = null;
	public TerainiumSwordItem(TechAdventureModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 300;
			}

			public float getEfficiency() {
				return 0f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 6;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TerainiumItem.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(TechadventuretabItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("terainium_sword"));
	}
}
