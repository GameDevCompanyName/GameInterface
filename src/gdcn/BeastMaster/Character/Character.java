package gdcn.BeastMaster.Character;

import gdcn.BeastMaster.Action.ActionContainer;
import gdcn.BeastMaster.Items.Equipment;
import gdcn.BeastMaster.Items.ItemContainer;

public interface Character {

    /** ==============================================
     *  Методы для получения базовых свойств персонажа
     *  ============================================== **/

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

    /** Возвращает true, если персонаж мертв **/
    public Boolean isDead();

    /** =====================================================
     *  Методы для получения дополнительных свойств персонажа
     *  ===================================================== **/

    /** Возвращает инвентарь персонажа **/
    public ItemContainer getItemContainer();

    /** Возвращает контейнер действий персонажа **/
    public ActionContainer getActionContainer();

    /** Возвращает количество денег в кошельке у персонажа **/
    public Integer getMoney();

    /** Метод для экипировки брони. Возвращает false в исключительных случаях **/
    public Boolean equipArmor();

    /** Метод для экипировки оружия. Возвращает false в исключительных случаях **/
    public Boolean equipWeapon();

    /** Снимает экипировку. После снятия предмет перемещается в инвентарь персонажа.
     *  Возвращает false в исключительных случаях **/
    public Boolean removeArmor();

    /** Убрает оружие. После снятия предмет перемещается в инвентарь персонажа.
     *  Возвращает false в исключительных случаях **/
    public Boolean removeWeapon();
}
