
package net.mcreator.miraculouscraft.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

import net.mcreator.miraculouscraft.MiraculouscraftModElements;

@MiraculouscraftModElements.ModElement.Tag
public class MiraculousCraft2ItemGroup extends MiraculouscraftModElements.ModElement {
	public MiraculousCraft2ItemGroup(MiraculouscraftModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmiraculous_craft_2") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.AIR);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
