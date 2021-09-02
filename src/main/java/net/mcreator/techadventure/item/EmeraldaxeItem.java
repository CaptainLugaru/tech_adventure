
package net.mcreator.techadventure.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.techadventure.itemgroup.EmaraldtabItemGroup;
import net.mcreator.techadventure.TechAdventureModElements;

@TechAdventureModElements.ModElement.Tag
public class EmeraldaxeItem extends TechAdventureModElements.ModElement {
	@ObjectHolder("tech_adventure:emeraldaxe")
	public static final Item block = null;
	public EmeraldaxeItem(TechAdventureModElements instance) {
		super(instance, 41);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(EmaraldtabItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("emeraldaxe"));
	}
}
