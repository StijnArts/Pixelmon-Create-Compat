
package net.mcreator.pixelmoncreatecompat.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.pixelmoncreatecompat.PixelmonCreateCompatModElements;

@PixelmonCreateCompatModElements.ModElement.Tag
public class PixelmonCompatSilverNuggetItem extends PixelmonCreateCompatModElements.ModElement {
	@ObjectHolder("pixelmon_create_compat:pixelmon_compat_silver_nugget")
	public static final Item block = null;

	public PixelmonCompatSilverNuggetItem(PixelmonCreateCompatModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().tab(ItemGroup.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
			setRegistryName("pixelmon_compat_silver_nugget");
		}

		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}