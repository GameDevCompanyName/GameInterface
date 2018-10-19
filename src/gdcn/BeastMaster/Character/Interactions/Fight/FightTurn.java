package gdcn.BeastMaster.Character.Interactions.Fight;

import gdcn.BeastMaster.Action.Action;

public interface FightTurn {

    /**
     * Возвращает Персонажа-исполнителя
     **/
    public Character getFromCharacter();

    /**
     * Возвращает Персонажа-жертву
     **/
    public Character getToCharacter();

    /**
     * Возвращает выполняемое действие
     **/
    public Action getAction();

    /**
     * Если isPass = true, то Персонаж решил пропустить ход
     **/
    public Boolean isPass();

}
