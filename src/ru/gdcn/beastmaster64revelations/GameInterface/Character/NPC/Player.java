package ru.gdcn.beastmaster64revelations.GameInterface.Character.NPC;

import ru.gdcn.beastmaster64revelations.GameInterface.Character.Character;
import ru.gdcn.beastmaster64revelations.GameInterface.Items.ItemContainer;
import ru.gdcn.beastmaster64revelations.GameInterface.World.Dungeon;
import ru.gdcn.beastmaster64revelations.GameInterface.World.Location.Location;

import java.util.List;

public interface Player extends Character {

    /** Возвращает список убитых противников **/
    public List<Opponent> getKilledOpponents();

    /** Возвращает список NPC, с которыми игрок вел диалог (предполагается,
     *  что диалог ведет к чему-то важному при первом инициализировании,
     *  далее повторяется либо вообще исчезает **/
    public List<NPC> getTalkedCivils();

    /** Возвращает список убитых НЕпротивников**/
    public List<NPC> getKilledCivils();

    /** Возвращает список локаций, в которых находился игрок **/
    public List<Location> getTravelledLocations();

    /** Возвращает список подземелий, которые были зачищены игроком, т.е
     *  убит BOSS в последней локации подземелья **/
    public List<Dungeon> getDungeonsCleared();

    /** Возвращает локацию, в которой находится игрок **/
    public Location getPlayerLocation();

}
