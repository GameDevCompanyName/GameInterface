package GameInterface.Character.NPC;

import GameInterface.Character.Character;

public interface Opponent extends Character {

    /** Возвращает тип противника - один из BEAST, BANDIT, KNIGHT, BOSS **/
    public OpponentType getType();

    public Boolean isAgressive();

}
