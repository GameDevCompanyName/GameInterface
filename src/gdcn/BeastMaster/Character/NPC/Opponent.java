package gdcn.BeastMaster.Character.NPC;

import gdcn.BeastMaster.Character.Character;
import gdcn.BeastMaster.ItemContainer;

public interface Opponent extends Character {

    /** Возвращает тип противника - один из BEAST, BANDIT, KNIGHT, BOSS **/
    public OpponentType getType();

    /** Возвращает список  предметов, используемых противником в данный момент **/
    public ItemContainer getShmot();

}
