package ru.gdcn.beastmaster64revelations.GameClass.Characters;

import ru.gdcn.beastmaster64revelations.GameClass.Actions.ActionContainerClass;
import ru.gdcn.beastmaster64revelations.GameInterface.Character.Character;
import ru.gdcn.beastmaster64revelations.GameInterface.Character.NPC.NPC;
import ru.gdcn.beastmaster64revelations.GameInterface.Character.NPC.Opponent;
import ru.gdcn.beastmaster64revelations.GameInterface.Character.NPC.Player;
import ru.gdcn.beastmaster64revelations.GameInterface.World.Dungeon;
import ru.gdcn.beastmaster64revelations.GameInterface.World.Location.Location;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PlayerClass extends CharacterClass implements Player {

    private ArrayList<Opponent> opponentsKilled;
    private ArrayList<NPC> civilsTalked;
    private ArrayList<NPC> civilsKilled;
    private LinkedList<Location> locationsTravelled;
    private LinkedList<Dungeon> dungeonsCleared;

    public PlayerClass(String name,
                       Location location,
                       Integer strength,
                       Integer agility,
                       Integer intellect,
                       Integer luck,
                       ActionContainerClass actions) {
        super(name, location, strength, agility, intellect, luck, actions);
        List<Opponent> opponentsKilled = new ArrayList<Opponent>();
        List<NPC> civilsKilled = new ArrayList<NPC>();
        List<NPC> civilsTalked = new ArrayList<NPC>();
        List<Location> locationsCleared = new ArrayList<Location>();
        List<Dungeon> dungeonsCleared = new ArrayList<Dungeon>();
    }

    @Override
    public List<Opponent> getKilledOpponents() {
        return opponentsKilled;
    }

    @Override
    public List<NPC> getTalkedCivils() {
        return civilsTalked;
    }

    //Civils - мирные пацаны (не противники). Храним список убитых мирных челиков
    @Override
    public List<NPC> getKilledCivils() {
        return civilsKilled;
    }

    @Override
    public List<Location> getTravelledLocations() {
        return locationsTravelled;
    }

    @Override
    public List<Dungeon> getDungeonsCleared() {
        return dungeonsCleared;
    }

    @Override
    public Location getPlayerLocation() {
        return currentLocation;
    }

    public Boolean addKilledOpponent(Opponent opponent){
        if (opponent == null || opponentsKilled.contains(opponent))
            return false;
        opponentsKilled.add(opponent);
        return true;
    }

    public Boolean addKilledCivil(NPC civil){
        if (civil == null || civil instanceof Opponent || civilsKilled.contains(civil))
            return false;
        civilsKilled.add(civil);
        return true;
    }

    public Boolean addTalkedCivil(NPC civil){
        if (civil == null || civil instanceof Opponent || civilsTalked.contains(civil))
            return false;
        civilsTalked.add(civil);
        return true;
    }

    public Boolean addTravelledLocation(Location location){
        if (location == null || locationsTravelled.contains(location))
            return false;
        locationsTravelled.add(location);
        return true;
    }

    public Boolean addDungeonsCleared(Dungeon dungeon){
        if (dungeon == null || dungeonsCleared.contains(dungeon))
            return false;
        dungeonsCleared.add(dungeon);
        return true;
    }

}
