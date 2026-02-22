package com.narxoz.rpg.enemy;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;

import java.util.List;
import java.util.ArrayList;

public class Goblin implements Enemy {

    private String name;
    private int health;
    private int damage;
    private int defense;
    private int speed;
    private List<Ability> abilities;
    private LootTable lootTable;

    public Goblin(String name) {
        this.name = name;
        // Goblin stats: weak but fast
        this.health = 100;
        this.damage = 15;
        this.defense = 5;
        this.speed = 35;
        this.abilities = new ArrayList<>();
        // TODO: Initialize with default abilities
        // TODO: Initialize with default loot table
    }


    // Example method structure:
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage(){ return  damage;}

    public int getDefense(){ return defense;}

    public int getSpeed(){ return speed;}

    public List<Ability> getAbilities(){ return abilities; }

    public LootTable getLootTable(){ return lootTable; }

    public void displayInfo() {
        System.out.println("=== " + name + " (Goblin) ===");
        System.out.println("Health: " + health + " | Damage: " + damage
                + " | Defense: " + defense + " | Speed: " + speed);
        System.out.println("Abilities: " + abilities.size() + " ability(ies)");
        for (Ability a : abilities) {
            System.out.println(" - " + a.getName() + " (Power: " + a.getPower() + ")");
        }
        System.out.println("Loot Table:");
        for (String item : lootTable.getItems().keySet()) {
            System.out.println(" - " + item + " x" + lootTable.getItems().get(item));
        }
    }
    public Enemy clone() {
        Goblin copy = new Goblin(this.name);
        copy.health = this.health;
        copy.damage = this.damage;
        copy.defense = this.defense;
        copy.speed = this.speed;
        List<Ability> abilitiesCopy = new ArrayList<>();
        for (Ability a : this.abilities) {
            abilitiesCopy.add(a.clone());}
        copy.abilities = abilitiesCopy;
        copy.lootTable = this.lootTable.clone();
        return copy;
    }

    // TODO: Add helper methods for Prototype variant creation
    // Consider methods like:
    public void multiplyStats(double multiplier){
        this.health = (int) (this.health * multiplier);
        this.damage = (int) (this.damage * multiplier);
        this.defense = (int) (this.defense * multiplier);
        this.speed = (int) (this.speed * multiplier);
    }
    public void addAbility(Ability ability) {
        this.abilities.add(ability);
    }

    public void setName(String name) {
        this.name = name;
    }
}
