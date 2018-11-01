package ru.gdcn.beastmaster64revelations.GameClass.WorldElemets;

import java.util.ArrayList;
import java.util.List;

import ru.gdcn.beastmaster64revelations.GameClass.Characters.TestCharacters.DummyEnemy;
import ru.gdcn.beastmaster64revelations.GameInterface.Character.NPC.NPC;
import ru.gdcn.beastmaster64revelations.GameInterface.World.Location.Location;
import ru.gdcn.beastmaster64revelations.GameInterface.World.Location.LocationType;
import ru.gdcn.beastmaster64revelations.GameInterface.World.Location.Treasure;
import ru.gdcn.beastmaster64revelations.GameInterface.World.MapPoint;

public class SimpleLocationClass implements Location {

    Boolean hasPlayer;
    MapPoint coordinates;
    NPC someSickFuck;

    public SimpleLocationClass(MapPoint coordinates){
        this.coordinates = coordinates;
        this.someSickFuck = new DummyEnemy();
        hasPlayer = false;
    }

    @Override
    public String getName() {
        return "Тестовая локация";
    }

    @Override
    public String getDescription() {
        return "Локация для тестирования простых вещей. Создана на скорую руку горячей головой.";
    }

    @Override
    public Boolean valueForLore() {
        return false;
    }

    @Override
    public Double getDifficulty() {
        return 1.0;
    }

    @Override
    public List<Location> getLinksToOtherLocations() {
        return new ArrayList<>();
    }

    @Override
    public Location getEnterToDungeon() {
        return null;
    }

    @Override
    public Location getEnterToAnotherKingdom() {
        return null;
    }

    @Override
    public Boolean isTravelled() {
        return false;
    }

    @Override
    public Boolean hasTreasure() {
        return false;
    }

    @Override
    public Treasure getTreasure() {
        return null;
    }

    @Override
    public LocationType getType() {
        return LocationType.FLATLAND;
    }

    @Override
    public Boolean hasPlayer() {
        return hasPlayer;
    }

    @Override
    public MapPoint getCoordinates() {
        return coordinates;
    }

    @Override
    public Boolean isCivil() {
        return false;
    }

    @Override
    public Boolean hasMonument() {
        return false;
    }

    @Override
    public Boolean hasNPC() {
        return (someSickFuck != null);
    }

    @Override
    public NPC getNPC() {
        return someSickFuck;
    }

    @Override
    public void playerGone() {
        hasPlayer = false;
    }

    @Override
    public void playerCame() {
        hasPlayer = true;
    }

}
