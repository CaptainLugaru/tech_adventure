
package net.mcreator.techadventure.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.techadventure.item.PinkdiamondswordItem;
import net.mcreator.techadventure.TechAdventureModElements;

@TechAdventureModElements.ModElement.Tag
public class MagictoolsItemGroup extends TechAdventureModElements.ModElement {
	public MagictoolsItemGroup(TechAdventureModElements instance) {
		super(instance, 144);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmagictools") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PinkdiamondswordItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
