package gdcn.BeastMaster.Character.Interactions;

import gdcn.BeastMaster.Character.NPC.Player;
import gdcn.BeastMaster.Character.NPC.Trader;
import gdcn.BeastMaster.Items.GameItem;
import gdcn.BeastMaster.Items.ItemContainer;

public interface Trade {

    /**
     * Возвращает торговца
     **/
    public Trader getTrader();

    /**
     * Возвращает игрока
     **/
    public Player getPlayer();

    /**
     * Возвращает список предметов, которые может купить игрок
     **/
    public ItemContainer getItemsToBuy();

    /**
     * Возвращает список предметов, которые игрок может продать
     **/
    public ItemContainer getItemsToSell();

    /**
     * Пытается купить предмет, проверяет количество денег у игрока,
     * проверяет наличие данного предмета у продающего.
     * В случае успеха переносит предмет в инвентарь Игрока, снимает деньги и всё такое.
     * Возвращает:
     * True  - Если никаких проблем не возникло и получилось купить предмет.
     * False - Если у игрока не хватило денег или не получилось перенести предмет из
     * одного контейнера в другой и т.п.
     **/
    public Boolean buyItem(GameItem item);

    /**
     * Аналогично покупке, но проверяет всё наоборот.
     **/
    public Boolean sellItem(GameItem item);

}
