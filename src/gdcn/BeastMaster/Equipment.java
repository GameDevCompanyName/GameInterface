package gdcn.BeastMaster;

public interface Equipment extends GameItem {

    public EquipmentType getType();

    public Integer getBasePoints();

    public Integer getExtraPoints();

    public Integer getPoints();

    public Integer getFullDurability();

    public Integer getCurrentDurability();

    public Boolean afterMove();

}
