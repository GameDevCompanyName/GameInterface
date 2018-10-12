package gdcn.BeastMaster.World;

import java.util.List;

public interface World {

    /** Возвращает список королевств **/
    public List<Kingdom> getKingdoms();

    /** Возвращает список королевств, которые посетил игрок.
     *  Если таких нет, возвращает NULL **/
    public List<Kingdom> getTravelledKingdoms();

    /** Возвращает список королевств, в которых был открыт лор.
     *  Если таких нет, возвращает NULL **/
    public List<Kingdom> getDevelopedKingdoms();

}
