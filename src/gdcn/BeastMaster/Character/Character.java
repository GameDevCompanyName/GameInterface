package gdcn.BeastMaster.Character;

import gdcn.BeastMaster.Action.ActionContainer;
import gdcn.BeastMaster.Character.Effects.Effect;
import gdcn.BeastMaster.Character.Effects.EffectContainer;
import gdcn.BeastMaster.Items.Equipment;
import gdcn.BeastMaster.Items.ItemContainer;
import gdcn.BeastMaster.World.*;

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

    /** =====================================================
     *  Методы для получения дополнительных свойств персонажа
     *  ===================================================== **/

    /** Возвращает инвентарь персонажа **/
    public ItemContainer getItemContainer();

    /** Возвращает контейнер действий персонажа **/
    public ActionContainer getActionContainer();

    /** Возвращает количество денег в кошельке у персонажа **/
    public Integer getMoney();

    /** Возвращает все эффекты, висящие в данный момент на персонаже **/
    public EffectContainer getEffects();

    /** ===============================================
     *  Методы для обновления базовых свойств персонажа
     *  =============================================== **/

    /** NOTE: все методы этого раздела должны принимать
     *  на вход значения определенного диапазона (Например,
     *  нельзя увеличить показатель удачи с помощью метода
     *  gainLuck() на отрицательную величину. Подобные ситуации
     *  во всех нижеперечисленных методах считаются исключительными
     *  и метод вернет значение false **/

    /** Увеличивает показатель удачи персонажа на величину points
     *  Возвращает false в исключительных случаях **/
    public Boolean gainLuck(Integer points);

    /** Увеличивает показатель силы персонажа на величину points
     *  Возвращает false в исключительных случаях **/
    public Boolean gainStrength(Integer points);

    /** Увеличивает показатель ловкости персонажа на величину points
     *  Возвращает false в исключительных случаях **/
    public Boolean gainAgility(Integer points);

    /** Увеличивает показатель интеллекта персонажа на величину points
     *  Возвращает false в исключительных случаях **/
    public Boolean gainIntellect(Integer points);

    /** Уменьшает показатель удачи персонажа на величину points
     *  Возвращает false в исключительных случаях **/
    public Boolean reduceLuck(Integer points);

    /** Уменьшает показатель силы персонажа на величину points
     *  Возвращает false в исключительных случаях **/
    public Boolean reduceStrength(Integer points);

    /** Уменьшает показатель ловкости персонажа на величину points
     *  Возвращает false в исключительных случаях **/
    public Boolean reduceAgility(Integer points);

    /** Уменьшает показатель интеллекта персонажа на величину points
     *  Возвращает false в исключительных случаях **/
    public Boolean reduceIntellect(Integer points);

    /** Увеличивает показатель здоровья персонажа на величину points
     *  Возвращает false в исключительных случаях **/
    public Boolean heal(Integer points);

    /** Уменьшает показатель здоровья персонажа на величину points
     *  Возвращает false в исключительных случаях **/
    public Boolean damage(Integer points);

    /** ======================================================
     *  Методы для обновления дополнительных свойств персонажа
     *  ====================================================== **/

    /** Метод для экипировки брони. Возвращает false в исключительных случаях **/
    public Boolean equipArmor(Equipment item);

    /** Метод для экипировки оружия. Возвращает false в исключительных случаях **/
    public Boolean equipWeapon(Equipment item);

    /** Снимает экипировку. После снятия предмет перемещается в инвентарь персонажа.
     *  Возвращает false в исключительных случаях **/
    public Boolean removeArmor(Equipment item);

    /** Убирает оружие. После снятия предмет перемещается в инвентарь персонажа.
     *  Возвращает false в исключительных случаях **/
    public Boolean removeWeapon(Equipment item);

    /** Увеличивает количество денег персонажа на величину points
     *  Возвращает false в исключительных случаях **/
    public Boolean receiveMoney(Integer points);

    /** Уменьшает количество денег персонажа на величину points
     *  Возвращает false в исключительных случаях **/
    public Boolean loseMoney(Integer points);

    /** Применяет переданный эффект на персонажа
     *  Возвращает false в исключительных случаях **/
    public Boolean putEffect(Effect effect);

    /** =============================
     *  Прочие вспомогательные методы
     *  ============================= **/

    /** Возвращает локацию, в которой находится игрок в данный момент **/
    public Location getLocation();

    /** Возвращает true, если персонаж мертв **/
    public Boolean isDead();
}
