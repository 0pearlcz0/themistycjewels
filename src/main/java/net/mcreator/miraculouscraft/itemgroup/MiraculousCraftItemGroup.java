
package net.mcreator.miraculouscraft.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

import net.mcreator.miraculouscraft.MiraculouscraftModElements;

@MiraculouscraftModElements.ModElement.Tag
public class MiraculousCraftItemGroup extends MiraculouscraftModElements.ModElement {
	public MiraculousCraftItemGroup(MiraculouscraftModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmiraculous_craft") {
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
