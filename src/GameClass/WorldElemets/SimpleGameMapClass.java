package GameClass.WorldElemets;

import java.net.CookieHandler;
import java.util.LinkedList;
import java.util.List;

import GameInterface.World.GameMap;
import GameInterface.World.Location.Location;
import GameInterface.World.Location.LocationType;
import GameInterface.World.MapPoint;

public class SimpleGameMapClass implements GameMap {

    Location[][] map = new Location[3][3];

    @Override
    public Location getLocationAt(MapPoint coordinates) {
        if (coordinates.isWithin(map))
            return map[coordinates.getX()][coordinates.getY()];
        else
            return null;
    }

    @Override
    public List<Location> getNeighbours(MapPoint coordinates) {
        List neighbours = new LinkedList();
        MapPoint next;
        next = coordinates.up();
        if (next.isWithin(map) && !get(next).getType().equals(LocationType.ROCK))
            neighbours.add(get(next));
        next = coordinates.left();
        if (next.isWithin(map) && !get(next).getType().equals(LocationType.ROCK))
            neighbours.add(get(next));
        next = coordinates.right();
        if (next.isWithin(map) && !get(next).getType().equals(LocationType.ROCK))
            neighbours.add(get(next));
        next = coordinates.down();
        if (next.isWithin(map) && !get(next).getType().equals(LocationType.ROCK))
            neighbours.add(get(next));
        return neighbours;
    }

    private Location get(MapPoint point) {
        return map[point.getX()][point.getY()];
    }

    @Override
    public Integer getWidth() {
        return null;
    }

    @Override
    public Integer getHeight() {
        return null;
    }
}
