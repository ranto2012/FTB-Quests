package dev.ftb.mods.ftbquests.gui.quests;

import com.feed_the_beast.mods.ftbguilibrary.utils.MouseButton;
import com.feed_the_beast.mods.ftbguilibrary.widget.Panel;
import dev.ftb.mods.ftbquests.gui.EmergencyItemsScreen;
import dev.ftb.mods.ftbquests.quest.theme.property.ThemeProperties;
import net.minecraft.network.chat.TranslatableComponent;

/**
 * @author LatvianModder
 */
public class EmergencyItemsButton extends TabButton {
	public EmergencyItemsButton(Panel panel) {
		super(panel, new TranslatableComponent("ftbquests.file.emergency_items"), ThemeProperties.EMERGENCY_ITEMS_ICON.get());
	}

	@Override
	public void onClicked(MouseButton button) {
		playClickSound();
		new EmergencyItemsScreen().openGui();
	}
}