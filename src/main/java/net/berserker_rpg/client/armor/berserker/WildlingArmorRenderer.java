package net.berserker_rpg.client.armor.berserker;

import mod.azure.azurelibarmor.renderer.GeoArmorRenderer;
import net.berserker_rpg.item.armor.WildlingArmor;

public class WildlingArmorRenderer extends GeoArmorRenderer<WildlingArmor> {
    public WildlingArmorRenderer() {
        super(new WildlingArmorModel());
    }
}
