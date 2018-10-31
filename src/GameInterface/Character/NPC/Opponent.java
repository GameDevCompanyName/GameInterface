package GameInterface.Character.NPC;

import GameInterface.Character.Character;

public interface Opponent extends NPC {

    /** Возвращает тип противника - один из BEAST, BANDIT, KNIGHT, BOSS **/
    public OpponentType getType();

    public Boolean isAgressive();

}
