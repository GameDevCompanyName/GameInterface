package ru.gdcn.beastmaster64revelations.GameClass.Characters.TestCharacters;

import ru.gdcn.beastmaster64revelations.GameClass.Items.Equipment.Weapons.Weapon;
import ru.gdcn.beastmaster64revelations.GameClass.Items.ItemContainerClass;
import ru.gdcn.beastmaster64revelations.GameInterface.Action.ActionContainer;
import ru.gdcn.beastmaster64revelations.GameInterface.Character.Character;
import ru.gdcn.beastmaster64revelations.GameInterface.Character.Effects.Effect;
import ru.gdcn.beastmaster64revelations.GameInterface.Character.Effects.EffectContainer;
import ru.gdcn.beastmaster64revelations.GameInterface.Items.Equipment;
import ru.gdcn.beastmaster64revelations.GameInterface.Items.ItemContainer;
import ru.gdcn.beastmaster64revelations.GameInterface.Items.ItemRarity;
import ru.gdcn.beastmaster64revelations.GameInterface.World.Location.Location;

public class DummyCharacter implements Character {

    protected Integer HP = 100;
    protected Location currentLocation;
    protected ItemContainer inventory = new ItemContainerClass(100, false);
    protected Weapon weapon = new Weapon(10, ItemRarity.COMMON);

    @Override
    public String getName() {
        return "Чучело";
    }

    @Override
    public Integer getHP() {
        return HP;
    }

    @Override
    public Integer getStrength() {
        return 10;
    }

    @Override
    public Integer getAgility() {
        return 10;
    }

    @Override
    public Integer getBasicAttack() {
        return getAgility()/2 + getStrength();
    }

    @Override
    public Integer getIntellect() {
        return 10;
    }

    @Override
    public Integer getLuck() {
        return 10;
    }

    @Override
    public ItemContainer getItemContainer() {
        return inventory;
    }

    @Override
    public Equipment getCurrentWeapon() {
        return weapon;
    }

    @Override
    public Equipment getCurrentArmor() {
        return null;
    }

    @Override
    public Integer getFullAttack() {
        return getBasicAttack();
    }

    @Override
    public ActionContainer getActionContainer() {
        return null;
    }

    @Override
    public Integer getMoney() {
        return 0;
    }

    @Override
    public EffectContainer getEffects() {
        return null;
    }

    @Override
    public Boolean gainLuck(Integer points) {
        return false;
    }

    @Override
    public Boolean gainStrength(Integer points) {
        return false;
    }

    @Override
    public Boolean gainAgility(Integer points) {
        return false;
    }

    @Override
    public Boolean gainIntellect(Integer points) {
        return false;
    }

    @Override
    public Boolean reduceLuck(Integer points) {
        return false;
    }

    @Override
    public Boolean reduceStrength(Integer points) {
        return false;
    }

    @Override
    public Boolean reduceAgility(Integer points) {
        return false;
    }

    @Override
    public Boolean reduceIntellect(Integer points) {
        return false;
    }

    @Override
    public Boolean dealHeal(Integer points) {
        HP+=points;
        return true;
    }

    @Override
    public Boolean dealPhysicalDamage(Integer points) {
        HP-=points;
        return true;
    }

    @Override
    public Boolean dealMagicalDamage(Integer points) {
        HP-=points;
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
        return false;
    }

    @Override
    public Boolean loseMoney(Integer points) {
        return false;
    }

    @Override
    public Boolean putEffect(Effect effect) {
        return false;
    }

    @Override
    public Location getLocation() {
        return currentLocation;
    }

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
