package gdcn.BeastMaster.World;

import java.util.List;

public interface Location {

    /** Возвращает имя локации **/
    public String getName();

    /** Возвращает описание локации **/
    public String getDescription();

    /** Возвращает NPC, который находится в данный момент в локации.
     *  Если NPC был убит, возвращает NULL **/
    public Character getNPC();

    /** Возвращает true, если данная локация важна для лора. Предполагается,
     *  что нельзя перейти в следующее королевство, не изучив все локации,
     *  важные для лора во всех предыдущих королевствах **/
    public Boolean valueForLore();

    /** Возвращает численное значение сложности локации **/
    public Integer getDifficulty();

    /** Возвращает список локаций, с которыми связана данная локация.
     *  Предполагается использование структуры связного списка, в котором каждая локация
     *  имеет ссылки на все локации, в которые можно перейти **/
    public List<Location> getLinksToOtherLocations();

    /** Возвращает ссылку на локацию, являющуюся первой локацией в подземелье.
     *  Возвращает NULL, если в данной локации нет входа в подземелье **/
    public Location getEnterToDungeon();

    /** Возвращает ссылку на локацию, в которую можно перейти из текущей и она при этом является
     *  локацией другого королевства **/
    public Location getEnterToAnotherKingdom();

    /** Возвращает true, если игрок уже находился в этой локации **/
    public Boolean isDeveloped();

    /** Возвращает сокровище, находящееся в локации. Если оно уже было собрано
     *  игроком, возвращает NULL
    public Treasure getTreasure();
    **/

    /** Возвращает один из типов локации: DUNGEON, FOREST FLATLAND или ROCK **/
    public LocationType getType();

    /** Возвращает true, если в локации находится игрок **/
    public Boolean hasPlayer();

}
