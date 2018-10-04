package gdcn.BeastMaster.Character.NPC;

import gdcn.BeastMaster.Character.Character;
import gdcn.BeastMaster.ItemContainer;

import java.util.List;

public interface Trader extends Character {

    /** Возвращает список фраз, используемых Trader в диалоге **/
    public List<String> getPhrases();

    /** Возвращает список предметов, предлагаемых Trader на продажу **/
    public ItemContainer getGoods();


}
