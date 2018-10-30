package GameClass.Items.Weapons;

import GameClass.Constants.Integers;
import GameClass.Items.GameItemClass;
import GameClass.Utilities.StringGenerator;
import GameClass.Utilities.Utilities;
import GameInterface.Action.ActionContainer;
import GameInterface.Items.Equipment;
import GameInterface.Items.EquipmentType;
import GameInterface.Items.ItemRarity;

import java.util.Random;

public class Weapon extends GameItemClass implements Equipment {

    /**
     * Данная реализация класса "Оружие" не подразумевает наличие extraPoints (см. Equipment)
     * **/

    /**
     * Основная характеристика оружия, содержащая урон
     * **/
    protected Integer baseDamage;

    /**
     * Действия, предоставляемые оружием при ношении
     * **/
    protected ActionContainer actions;

    /**
     * Тип оружия
     * От типа меняется урон и действия оружия
     * **/
    protected WeaponType weaponType;

    public Weapon(Integer hardnessPoints, ItemRarity rarity) {
        this.rarity = rarity;
        Random randomGenerator = new Random();
        this.generateDamage(randomGenerator, hardnessPoints);
        this.generateCost(randomGenerator);
        this.generateWeight(randomGenerator);
        this.generateType(randomGenerator);
        this.generateActions();
        this.generateName(randomGenerator);
    }

    private void generateActions() {
        //TODO
    }

    private void generateType(Random randomGenerator) {
        WeaponType[] types = WeaponType.values();
        WeaponType type = (WeaponType) Utilities.getRandomElement(types, randomGenerator);
        this.weaponType = type;
    }

    private void generateDamage(Random randomGenerator, Integer hardnessPoints) {
        this.baseDamage = 5 + randomGenerator.nextInt(4) + hardnessPoints*(5 + randomGenerator.nextInt(4));
    }

    private void generateName(Random randomGenerator) {
        StringBuilder sb = new StringBuilder();
        if (randomGenerator.nextInt(100) < Integers.WEAPON_NAME_ADJECTIVE_CHANCE)
            sb.append(StringGenerator.weaponAdjective()).append(" ");
        sb.append(StringGenerator.weaponMainName(this.weaponType));
        if (randomGenerator.nextInt(100) < Integers.WEAPON_NAME_POST_CHANCE)
            sb.append(" ").append(StringGenerator.weaponPostName());
        this.name = sb.toString();
    }

    /**
     * Примерная зависимость ценности оружия от урона
     * **/
    private void generateCost(Random randomGenerator) {
        Integer cost = 5*baseDamage + randomGenerator.nextInt(baseDamage*3);
        this.baseCost = cost;
    }

    /**
     * Примерная генерация веса (может изменяться в зависимости от типа оружия)
     **/
    private void generateWeight(Random randomGenerator) {
        Integer weight = 3 + randomGenerator.nextInt(3);
        this.weight = weight;
    }

    @Override
    public EquipmentType getType() {
        return EquipmentType.WEAPON;
    }

    @Override
    public ActionContainer getActions() {
        return actions;
    }

    @Override
    public Integer getBasePoints() {
        return baseDamage;
    }

    @Override
    public Integer getExtraPoints() {
        return 0;
    }

    @Override
    public Integer getPoints() {
        return baseDamage;
    }

    @Override
    public Integer getFullDurability() {
        return 0;
    }

    @Override
    public Integer getCurrentDurability() {
        return 0;
    }

    @Override
    public Boolean afterMove() {
        return true;
    }

}
