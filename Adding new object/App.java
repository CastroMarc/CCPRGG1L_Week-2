public class App {
    public static void main(String[] args) {

        // Character Class
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();

        // Enemy Class
        Enemy boss = new Enemy();

        boss.damage = 50;
        boss.health = 500;
        boss.armor = 100;
        boss.hasMagicImmunity = true;
        boss.name = "Roshan";
        boss.enemyDialogue();

        Enemy skeleton = new Enemy();

        skeleton.damage = 5;
        skeleton.health = 10;
        skeleton.armor = 5;
        skeleton.hasMagicImmunity = false;
        skeleton.name = "Common Skeleton Warrior";
        skeleton.enemyDialogue();

        Enemy dragon = new Enemy();

        dragon.damage = 40;
        dragon.health = 400;
        dragon.armor = 75;
        dragon.hasMagicImmunity = false;
        dragon.name = "Ancient Wyvern";
        dragon.enemyDialogue();

        // Gear Class

        Gear helmet = new Gear();

        helmet.name = "bronze helmet";
        helmet.rarity = "common";
        helmet.shield = 30;
        helmet.weight = 70;
        helmet.candodgemagicpotions = false;
        helmet.description = "Can be unlocked in level 2";
        helmet.sayMyName();

        helmet.name = "silver helmet";
        helmet.rarity = "uncommon";
        helmet.shield = 50;
        helmet.weight = 90;
        helmet.candodgemagicpotions = false;
        helmet.description = "Can be unlocked in level 8";
        helmet.sayMyName();

        helmet.name = "gold helmet";
        helmet.rarity = "rare";
        helmet.shield = 100;
        helmet.weight = 120;
        helmet.candodgemagicpotions = true;
        helmet.description = "Can be unlocked in level 20";
        helmet.sayMyName();

        Gear vest = new Gear();

        vest.name = "bronze vest";
        vest.rarity = "common";
        vest.shield = 40;
        vest.weight = 100;
        vest.candodgemagicpotions = false;
        vest.description = "Can be unlocked in level 3";
        helmet.sayMyName();

        vest.name = "silver vest";
        vest.rarity = "uncommon";
        vest.shield = 70;
        vest.weight = 120;
        vest.candodgemagicpotions = false;
        vest.description = "Can be unlocked in level 9";
        vest.sayMyName();

        vest.name = "gold vest";
        vest.rarity = "rare";
        vest.shield = 100;
        vest.weight = 140;
        vest.candodgemagicpotions = true;
        vest.description = "Can be unlocked in level 20";
        vest.sayMyName();
        
    }
}
