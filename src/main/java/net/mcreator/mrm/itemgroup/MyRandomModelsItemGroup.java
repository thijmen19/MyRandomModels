
package net.mcreator.mrm.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.mrm.block.TableBirchBlock;
import net.mcreator.mrm.MrmModElements;

@MrmModElements.ModElement.Tag
public class MyRandomModelsItemGroup extends MrmModElements.ModElement {
	public MyRandomModelsItemGroup(MrmModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmy_random_models") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TableBirchBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
