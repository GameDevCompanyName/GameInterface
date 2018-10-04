package gdcn.BeastMaster.Character.NPC;

import gdcn.BeastMaster.Character.Character;
import gdcn.BeastMaster.ItemContainer;

import java.util.List;

public interface Player extends Character {

    /** Возвращает список убитых противников **/
    public List<Character> getKilledOpponents();

    /** Возвращает список NPC, с которыми игрок вел диалог (предполагается,
     *  что диалог ведет к чему-то важному при первом инициализировании,
     *  далее повторяется либо вообще исчезает **/
    public List getTalkedCivils();

    /** Возвращает список убитых НЕпротивников**/
    public List getKilledCivils();

    /** Возвращает список локаций, в которых находился игрок **/
    public List getTravelledLocations();

    /** Возвращает список подземелий, которые были зачищены игроком, т.е
     *  убит BOSS в последней локации подземелья **/
    public List getDungeonsCleared();

    /** Возвращает список предметов, используемых в данный момент игроком **/
    public ItemContainer getShmot();

}
