
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wratixor.backstick.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BackstickModTabs {
	public static CreativeModeTab TAB_TAB_BS;

	public static void load() {
		TAB_TAB_BS = new CreativeModeTab("tabtab_bs") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BackstickModItems.BACK_STICK.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
