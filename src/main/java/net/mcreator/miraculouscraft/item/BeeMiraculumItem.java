
package net.mcreator.miraculouscraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.miraculouscraft.itemgroup.MiraculousCraftItemGroup;
import net.mcreator.miraculouscraft.MiraculouscraftModElements;

@MiraculouscraftModElements.ModElement.Tag
public class BeeMiraculumItem extends MiraculouscraftModElements.ModElement {
	@ObjectHolder("miraculouscraft:bee_miraculum")
	public static final Item block = null;

	public BeeMiraculumItem(MiraculouscraftModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MiraculousCraftItemGroup.tab).maxStackSize(1).isImmuneToFire().rarity(Rarity.COMMON));
			setRegistryName("bee_miraculum");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
