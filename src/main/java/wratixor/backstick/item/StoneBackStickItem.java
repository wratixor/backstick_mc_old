
package wratixor.backstick.item;

import wratixor.backstick.init.BackstickModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class StoneBackStickItem extends Item {
	public StoneBackStickItem() {
		super(new Item.Properties().tab(BackstickModTabs.TAB_TAB_BS).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
