package GameClass.WorldElemets;

import java.util.List;

import GameInterface.World.GameMap;
import GameInterface.World.Kingdom;
import GameInterface.World.World;

public class SimpleWorldClass implements World {

    GameMap map = new SimpleGameMapClass();

    @Override
    public List<Kingdom> getKingdoms() {
        return null;
    }

    @Override
    public List<Kingdom> getTravelledKingdoms() {
        return null;
    }

    @Override
    public List<Kingdom> getDevelopedKingdoms() {
        return null;
    }

    @Override
    public GameMap getGameMap() {
        return map;
    }

    @Override
    public String getLore() {
        return "Тестовый мир для теста тестов";
    }

}