package GameInterface.Character.NPC;

import GameInterface.Character.Character;
import GameInterface.Character.Interactions.Trade;
import GameInterface.Items.ItemContainer;

import java.util.List;

public interface Trader extends Character {

    /** Возвращает список фраз, используемых Trader в диалоге **/
    public List<String> getPhrases();

    /** Возвращает список предметов, предлагаемых Trader на продажу **/
    public ItemContainer getGoods();

    /** Возвращает взаимодействие торговли **/
    public Trade getTrade();

}
