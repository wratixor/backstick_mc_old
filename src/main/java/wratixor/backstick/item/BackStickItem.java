
package wratixor.backstick.item;

import wratixor.backstick.init.BackstickModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BackStickItem extends Item {
	public BackStickItem() {
		super(new Item.Properties().tab(BackstickModTabs.TAB_TAB_BS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
