package ru.gdcn.beastmaster64revelations.GameClass.Characters;

import ru.gdcn.beastmaster64revelations.GameInterface.Action.ActionContainer;
import ru.gdcn.beastmaster64revelations.GameInterface.Character.Character;
import ru.gdcn.beastmaster64revelations.GameInterface.Character.Effects.Effect;
import ru.gdcn.beastmaster64revelations.GameInterface.Character.Effects.EffectContainer;
import ru.gdcn.beastmaster64revelations.GameInterface.Items.Equipment;
import ru.gdcn.beastmaster64revelations.GameInterface.Items.ItemContainer;
import ru.gdcn.beastmaster64revelations.GameInterface.World.Location.Location;

public class CharacterClass implements Character {

    protected Integer HP;
    protected Location currentLocation;
    protected String name;
    protected Integer strength;
    protected Integer agility;
    protected Integer intellect;
    protected Integer luck;
    protected Integer money;

    public CharacterClass(String name,
                          Location location,
                          Integer strength,
                          Integer agility,
                          Integer intellect,
                          Integer luck) {
        this.HP = 100;
        this.name = name;
        this.currentLocation = location;
        this.strength = strength;
        this.agility = agility;
        this.intellect = intellect;
        this.luck = luck;
        this.money = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getHP() {
        return HP;
    }

    @Override
    public Integer getStrength() {
        return strength;
    }

    @Override
    public Integer getAgility() {
        return agility;
    }

    @Override
    public Integer getBasicAttack() {
        return getAgility() / 2 + getStrength();
    }

    @Override
    public Integer getIntellect() {
        return intellect;
    }

    @Override
    public Integer getLuck() {
        return luck;
    }

    @Override
    public ItemContainer getItemContainer() {
        return null;
    }//TODO

    @Override
    public Equipment getCurrentWeapon() {
        return null;
    }//TODO

    @Override
    public Equipment getCurrentArmor() {
        return null;
    }//TODO

    //TODO Чем FullAtack должен отличаться от getBasicAtack?
    //Может стоит сделать только один публичный метод с атакой?
    @Override
    public Integer getFullAttack() {
        return getBasicAttack();
    }

    @Override
    public ActionContainer getActionContainer() {
        return null;
    }//TODO

    @Override
    public Integer getMoney() {
        return money;
    }

    @Override
    public EffectContainer getEffects() {
        return null;
    }//TODO

    //TODO А если персонаж мёртв?
    @Override
    public Boolean gainLuck(Integer points) {
        luck += points;
        return true;
    }

    //TODO А если персонаж мёртв?
    @Override
    public Boolean gainStrength(Integer points) {
        strength += points;
        return true;
    }

    //TODO А если персонаж мёртв?
    @Override
    public Boolean gainAgility(Integer points) {
        agility += points;
        return true;
    }

    //TODO А если персонаж мёртв?
    @Override
    public Boolean gainIntellect(Integer points) {
        intellect += points;
        return true;
    }

    //TODO Что если luck <= 0? или персонаж мёртв
    @Override
    public Boolean reduceLuck(Integer points) {
        luck -= points;
        return true;
    }

    //TODO Что если str <= 0? или персонаж мёртв
    @Override
    public Boolean reduceStrength(Integer points) {
        strength -= points;
        return true;
    }

    //TODO Что если agi <= 0? или персонаж мёртв
    @Override
    public Boolean reduceAgility(Integer points) {
        agility -= points;
        return true;
    }

    //TODO Что если int <= 0? или персонаж мёртв
    @Override
    public Boolean reduceIntellect(Integer points) {
        intellect -= points;
        return true;
    }

    //TODO Что если кол-во хп максимально? Нужно отдельно хранить maxHP
    //Что если персонаж мёртв?
    @Override
    public Boolean dealHeal(Integer points) {
        HP += points;
        return true;
    }

    //TODO Что если HP <= 0?
    //Что если персонаж мёртв?
    @Override
    public Boolean dealPhysicalDamage(Integer points) {
        HP -= points;
        return true;
    }

    //TODO Что если HP <= 0?
    //Что если персонаж мёртв?
    @Override
    public Boolean dealMagicalDamage(Integer points) {
        HP -= points;
        return true;
    }

    @Override
    public Boolean equipArmor(Equipment item) {
        return false;
    }

    @Override
    public Boolean equipWeapon(Equipment item) {
        return false;
    }

    @Override
    public Boolean removeArmor(Equipment item) {
        return false;
    }

    @Override
    public Boolean removeWeapon(Equipment item) {
        return false;
    }

    @Override
    public Boolean receiveMoney(Integer points) {
        money += points;
        return true;
    }

    //TODO Что если money < points?
    @Override
    public Boolean loseMoney(Integer points) {
        money -= points;
        return true;
    }

    @Override
    public Boolean putEffect(Effect effect) {
        return false;
    }//TODO

    @Override
    public Location getLocation() {
        return currentLocation;
    }

    //TODO Что если location == null?
    @Override
    public Boolean changeLocationTo(Location location) {
        currentLocation = location;
        return true;
    }
    
    @Override
    public Boolean isDead() {
        return (HP <= 0);
    }
}