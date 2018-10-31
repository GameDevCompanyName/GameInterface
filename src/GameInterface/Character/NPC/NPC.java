package GameInterface.Character.NPC;

import GameInterface.Character.Character;
import GameInterface.Items.ItemContainer;

import java.util.List;

public interface NPC extends Character {

    /** Возвращает true, если NPC можно атаковать **/
    public Boolean isAttackable();

    /** Возвращает true, если с NPC можно взаимодействовать в виде диалога **/
    public Boolean isTalkable();

    /** Возвращает true, если данного NPC можно обойти, т.е.
     *  войдя в локацию с ним, пройти дальше в другие локации,
     *  не вступая с ним в бой или диалог **/
    public Boolean isAvoidable();

    /** Возвращает список фраз, используемых NPC при взаимодействии с ним в бою **/
    public List<String> getWarPhrases();

    /** Возвращает список предметов, выпадающих с персонажа при его убийстве **/
    public ItemContainer getLoot();

    /** Оповещяет непися о том, что сейчас его ход
     * Возвращает True если непись походил, возвращает
     * False если чё-то пошло не так
     * внутри должна быть описана логика выбора действия в бою **/
    public Boolean makeNextFightTurn(Character enemy);

    /** Возвращает true, если данный NPC важен для лора.
     *  Наличие NPC такого типа в локации автоматически делает ее
     *  важной для лора (см. Location, Kingdom). Однако, его
     *  отсутствие не означает обратного **/
    public Boolean isValuableForLore();

}
