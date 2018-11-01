package ru.gdcn.beastmaster64revelations.GameClass.Characters;

import ru.gdcn.beastmaster64revelations.GameClass.Constants.Integers;
import ru.gdcn.beastmaster64revelations.GameClass.Utilities.Utilities;
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

    //TODO FullAttack должен учитывать надетое оружие
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

    @Override
    public Boolean gainLuck(Integer points) {
        if (this.isDead() || points < 0)
            return false;
        luck += points;
        return true;
    }

    @Override
    public Boolean gainStrength(Integer points) {
        if (this.isDead() || points < 0)
            return false;
        strength += points;
        return true;
    }

    @Override
    public Boolean gainAgility(Integer points) {
        if (this.isDead() || points < 0)
            return false;
        agility += points;
        return true;
    }

    @Override
    public Boolean gainIntellect(Integer points) {
        if (this.isDead() || points < 0)
            return false;
        intellect += points;
        return true;
    }

    @Override
    public Boolean reduceLuck(Integer points) {
        if (this.isDead() || points < 0 || luck - points <= 0)
            return false;
        luck -= points;
        return true;
    }

    @Override
    public Boolean reduceStrength(Integer points) {
        if (this.isDead() || points < 0 || strength - points <= 0)
            return false;
        strength -= points;
        return true;
    }

    @Override
    public Boolean reduceAgility(Integer points) {
        if (this.isDead() || points < 0 || agility - points <= 0)
            return false;
        agility -= points;
        return true;
    }

    @Override
    public Boolean reduceIntellect(Integer points) {
        if (this.isDead() || points < 0 || intellect - points <= 0)
            return false;
        intellect -= points;
        return true;
    }

    @Override
    public Boolean dealHeal(Integer points) {
        if (this.isDead() || points < 0 || HP + points >= Integers.MAX_HP)
            return false;
        HP += points;
        return true;
    }

    @Override
    public Boolean dealPhysicalDamage(Integer points) {
        if (this.isDead() || points < 0 || HP - points <= 0)
            return false;
        HP -= points;
        return true;
    }

    @Override
    public Boolean dealMagicalDamage(Integer points) {
        if (this.isDead() || points < 0 || HP - points <= 0)
            return false;
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
        if (points < 0)
            return false;
        money += points;
        return true;
    }

    @Override
    public Boolean loseMoney(Integer points) {
        if (money < points || points < 0)
            return false;
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

    @Override
    public Boolean changeLocationTo(Location location) {
        if (location == null)
            return false;
        currentLocation = location;
        return true;
    }
    
    @Override
    public Boolean isDead() {
        return (HP <= 0);
    }
}
