
package wratixor.backstick.item;

import wratixor.backstick.init.BackstickModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.nbt.CompoundTag;

public class BackEngraverNetheriteItem extends Item {
	public BackEngraverNetheriteItem() {
		super(new Item.Properties().tab(BackstickModTabs.TAB_TAB_BS).durability(2031).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
		
		ItemStack retval = itemstack.copy();
		int i = retval.getEnchantmentLevel(Enchantments.UNBREAKING);
		if (i > 0) {
			CompoundTag ct = retval.getOrCreateTag();
			int r = ct.getInt("UC");
			if (r < 4 - i) {
				retval.setDamageValue(itemstack.getDamageValue() + 1);
				r++;
			} else {
				r = 0;
			}
			ct.putInt("UC", r);
			retval.setTag(ct);
		} else  {
			retval.setDamageValue(itemstack.getDamageValue() + 1);
		}
		if (retval.getDamageValue() >= retval.getMaxDamage()) {
			return ItemStack.EMPTY;
		}
		return retval;
		

	}

	@Override
	public boolean isRepairable(ItemStack itemstack) {
		return false;
	}

	@Override
	public int getEnchantmentValue() {
		return 15;
	}
}
