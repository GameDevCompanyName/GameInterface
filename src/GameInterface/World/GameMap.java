package GameInterface.World;

import GameInterface.World.Location.Location;

import java.util.List;

public interface GameMap {

    //public Location[][] getLocationsArray();

    /**
     * Возвращает локацию по заданным координатам
     **/
    public Location getLocationAt(MapPoint coordinates);

    /**
     * Возвращает соседей клетки с заданными координатами
     **/
    public List<Location> getNeighbours(MapPoint coordinates);

    /**
     * Ширина карты
     **/
    public Integer getWidth();

    /**
     * Высота карты
     **/
    public Integer getHeight();

}
