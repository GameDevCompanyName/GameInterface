package gdcn.BeastMaster.Character.NPC;

import gdcn.BeastMaster.Character.Character;
import gdcn.BeastMaster.ItemContainer;

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

}
