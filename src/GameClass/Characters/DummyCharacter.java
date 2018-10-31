package GameClass.Characters;

import GameInterface.Action.ActionContainer;
import GameInterface.Character.Character;
import GameInterface.Character.Effects.Effect;
import GameInterface.Character.Effects.EffectContainer;
import GameInterface.Items.Equipment;
import GameInterface.Items.ItemContainer;
import GameInterface.World.Location.Location;

public class DummyCharacter implements Character {

    protected Integer HP = 100;
    protected Location currentLocation;

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
    public Integer getAttack() {
        return 1;
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
        return null;
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
