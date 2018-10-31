package GameClass.Characters;

import GameInterface.Character.Character;
import GameInterface.Items.ItemContainer;
import GameInterface.World.Location.Location;

import java.util.ArrayList;
import java.util.List;

public class PlayerClass extends CharacterClass implements GameInterface.Character.NPC.Player {

    private ArrayList<Character> opponentsKilled;
    private ArrayList<Character> civilsTalked;
    private ArrayList<Character> civilsKilled;
    private ArrayList<Location> locationsTravelled;
    private ArrayList<Location> dungeonsCleared;

    public PlayerClass(String name, Location location, Integer strength, Integer agility, Integer intellect, Integer luck) {
        super(name, location, strength, agility, intellect, luck);
    }

    @Override
    public List<Character> getKilledOpponents() {
        return opponentsKilled;
    }

    @Override
    public List getTalkedCivils() {
        return civilsTalked;
    }

    @Override
    public List getKilledCivils() {
        return civilsKilled;
    }

    @Override
    public List getTravelledLocations() {
        return locationsTravelled;
    }

    @Override
    public List getDungeonsCleared() {
        return dungeonsCleared;
    }

    @Override
    public ItemContainer getShmot() {
        return null;
    }

    @Override
    public Location getPlayerLocation() {
        return currentLocation;
    }
}
