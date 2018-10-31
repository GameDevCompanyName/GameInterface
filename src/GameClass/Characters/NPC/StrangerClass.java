package GameClass.Characters.NPC;

import GameClass.Characters.CharacterClass;
import GameInterface.Character.NPC.Stranger;
import GameInterface.World.Location.Location;

import java.util.ArrayList;
import java.util.List;

public class StrangerClass extends CharacterClass implements Stranger {

    private ArrayList<String> phrases;
    private ArrayList<String> stories;

    public StrangerClass(String name,
                         Location location,
                         Integer strength,
                         Integer agility,
                         Integer intellect,
                         Integer luck) {
        super(name, location, strength, agility, intellect, luck);
    }

    @Override
    public List<String> getPhrases() {
        return phrases;
    }

    @Override
    public List<String> getStories() {
        return stories;
    }
}
