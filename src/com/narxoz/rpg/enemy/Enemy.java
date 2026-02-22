package com.narxoz.rpg.enemy;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;

import java.util.List;

/**
 * TODO: Decide — should this be an interface or abstract class?
 *   - Interface: If implementations are very different
 *   - Abstract class: If you want shared fields (name, health, etc.)
 *   Hint: An abstract class with shared stat fields might be cleaner.
 *
 * TODO: Define the core enemy contract.
 *   Every enemy should provide:
 *   - Basic stats (health, damage, defense, speed)
 *   - Abilities they can use
 *   - Loot they drop when defeated
 *   - Information display (for the demo)
 *   - Clone method (for Prototype pattern)
 *
 * TODO: Think about immutability.
 *   - Once built by the Builder, should enemy stats change?
 *   - Should clone() return a mutable or immutable copy?
 *   - How do you allow Prototype to modify cloned stats?
 */
public abstract  class Enemy implements Cloneable{

    // TODO: Define core stat methods
    protected String name;
    protected int health;
    protected int damage;
    protected int defense;
    protected int speed;

    // TODO: Define ability methods
    protected List<Ability> abilities;

    // TODO: Define loot methods
    protected LootTable lootTable;

    protected Enemy(
        String name,
        int health,
        int damage,
        int defense,
        int speed,
        List<Ability> abilities,
        LootTable lootTable){
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.defense = defense;
        this.speed = speed;
        this.abilities = abilities;
        this.lootTable = lootTable;
    }
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public int getDamage(){
        return damage;
    }
    public int getDefense(){
        return defense;
    }
    public int getSpeed(){
        return speed;
    }
    public List<Ability> getAbilities(){
        return abilities;
    }
    public LootTable getLootTable(){
        return lootTable;
    }

    // TODO: Define display method
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Damage: " + damage);
        System.out.println("Defense: " + defense);
        System.out.println("Speed: " + speed);
        System.out.println("Abilities:");
        for (Ability ability : abilities) {
            System.out.println("- " + ability.getName());
        }

        System.out.println("Loot:");
        lootTable.displayLoot();
    }

    // TODO: Define clone method for Prototype pattern
    // - Enemy clone()
    public abstract Enemy clone();
}
