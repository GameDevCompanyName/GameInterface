package ru.gdcn.beastmaster64revelations.GameClass.WorldElemets;

import ru.gdcn.beastmaster64revelations.GameClass.Characters.NPC.NPCclass;
import ru.gdcn.beastmaster64revelations.GameClass.Characters.PlayerClass;
import ru.gdcn.beastmaster64revelations.GameInterface.Character.NPC.NPC;
import ru.gdcn.beastmaster64revelations.GameInterface.World.Location.Location;
import ru.gdcn.beastmaster64revelations.GameInterface.World.Location.LocationType;
import ru.gdcn.beastmaster64revelations.GameInterface.World.Location.Treasure;
import ru.gdcn.beastmaster64revelations.GameInterface.World.MapPoint;

import java.util.ArrayList;
import java.util.List;

public class LocationClass implements Location {

    private String name;
    private String description;
    private LocationType type;
    private Boolean valueForLore;
    private Double difficulty;
    private ArrayList<Location> neighbours;
    private Location dungeon;
    private Location enterToAnotherKingdom;
    private Boolean isTravelled;
    private Boolean hasTreasure;
    //private TreasureClass treasure;
    private NPCclass npc;
    private MapPoint coordinates;

    public LocationClass (String name,
                          String description,
                          LocationType type,
                          Boolean valueForLore,
                          Double difficulty,
                          NPCclass npc,
                          //,TreasureClass treasure
                          MapPoint coordinates){
        this.name = name;
        this.description = description;
        this.valueForLore = valueForLore;
        this.difficulty = difficulty;
        this.npc = npc;
        this.coordinates = coordinates;
        this.type = type;
        isTravelled = false;
        //TODO neighbours, dungeon, enterToAnotherKingdom, hasTreasure
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Boolean valueForLore() {
        return valueForLore != null && valueForLore;
    }

    @Override
    public Double getDifficulty() {
        return difficulty;
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
        return isTravelled != null && isTravelled;
    }

    @Override
    public Boolean hasTreasure() {
        return hasTreasure;
    }

    @Override
    public Treasure getTreasure() {
        return null;
    }

    @Override
    public LocationType getType() {
        return type;
    }

    @Override
    public Boolean hasPlayer() {
        return null;
    }//TODO

    @Override
    public MapPoint getCoordinates() {
        return coordinates;
    }

    @Override
    public Boolean isCivil() {
        return null;
    }

    @Override
    public Boolean hasMonument() {
        return false;
    }

    @Override
    public Boolean hasNPC() {
        return npc != null && !npc.isDead();
    }

    @Override
    public NPC getNPC() {
        return npc;
    }

    @Override
    public void playerGone() {

    }

    @Override
    public void playerCame() {

    }
}
