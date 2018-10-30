package GameInterface.World;

public class MapPoint {

    /**
     * Класс для удобного представления координат локаций
     **/

    private final int x;
    private final int y;

    public MapPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
