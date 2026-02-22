package com.narxoz.rpg.loot;

import java.util.List;

public interface LootTable extends Cloneable{

    // TODO: Define loot table behavior methods
    // Consider:
    List<String> getItems();
    int getGoldDrop();
    int getExperienceDrop();
    String getLootInfo();
    LootTable clone();
}
