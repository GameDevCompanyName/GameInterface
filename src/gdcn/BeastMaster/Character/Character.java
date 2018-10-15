package gdcn.BeastMaster.Character;

import gdcn.BeastMaster.Items.ItemContainer;

public interface Character {

    /** Возвращает имя персонажа **/
    public String getName();

    /** Возвращает количество очков здоровья персонажа **/
    public Integer getHP();

    /** Вовзращает количество очков силы персонажа **/
    public Integer getStrength();

    /** Возвращает количество очков ловкости персонажа **/
    public Integer getAgility();

    /** Вовзращает количество очков атаки персонажа **/
    public Integer getAttack();

    /** Возвращает количество очков интеллекта персонажа **/
    public Integer getIntellect();

    /** Возвращает количество очков удачи персонажа **/
    public Integer getLuck();

    /** Возвращает количество денег в кошельке у персонажа **/
    public Integer getMoney();

    /** Возвращает инвентарь персонажа **/
    public ItemContainer getItemContainer();

    /** Возвращает true, если персонаж мертв **/
    public Boolean isDead();
}
