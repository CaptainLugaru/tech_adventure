
package net.mcreator.techadventure.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.techadventure.TechAdventureModElements;

@TechAdventureModElements.ModElement.Tag
public class EmaraldtabItemGroup extends TechAdventureModElements.ModElement {
	public EmaraldtabItemGroup(TechAdventureModElements instance) {
		super(instance, 146);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabemaraldtab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Items.EMERALD);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
