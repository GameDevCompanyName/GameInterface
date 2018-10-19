package gdcn.BeastMaster.Character.Interactions.Fight;

import gdcn.BeastMaster.Character.Interactions.Interaction;

import java.util.List;

public interface Fight extends Interaction {

    //TODO

    /** Возвращает всех Персонажей, замешанных во взаимодействии (например торговца и игрока) **/
    public List<Character> getCharacters();

    /** Возвращает всех Персонажей "левой" стороны
     * Например во время боя "слева" находится Игрок, а "справа" противники.
     * В данном случае данный метод вернёт список содержащий игрока.**/
    public List<Character> getLeftSide();

    /** Аналогичен предыдущему методу, но возвращает противников Персонажа **/
    public List<Character> getRightSide();

}
