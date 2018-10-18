package gdcn.BeastMaster.World;

import java.util.List;

public interface Dungeon extends Location {

    /** Возвращает список всех локаций в подземелье (считаются локации, включая входную,
     *  т.е. локация на поверхности не считается подземельем, а та, которая
     *  идет в глубину, уже учитывается) **/
    public List<Location> getLocations();
}
