
package net.mcreator.techadventure.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.techadventure.item.TotemofresistanceItem;
import net.mcreator.techadventure.TechAdventureModElements;

@TechAdventureModElements.ModElement.Tag
public class AbilitytabItemGroup extends TechAdventureModElements.ModElement {
	public AbilitytabItemGroup(TechAdventureModElements instance) {
		super(instance, 145);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tababilitytab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TotemofresistanceItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
