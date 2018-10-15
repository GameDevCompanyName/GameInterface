package gdcn.BeastMaster.Character.NPC;

import gdcn.BeastMaster.Character.Character;
import gdcn.BeastMaster.Items.ItemContainer;

public interface Opponent extends Character {

    /** Возвращает тип противника - один из BEAST, BANDIT, KNIGHT, BOSS **/
    public OpponentType getType();



}
