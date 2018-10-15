package gdcn.BeastMaster.Action;

public interface Action {

    /** Описывает все действия совершаемые с Персонажами**/

    /** Возвращает название действия **/

    public String getName();

    /** Возвращает кол-во необходимых очков действия **/

    public Integer getRequiredAP();

    /** Возвращает тип действия **/

    public ActionType getType();

    /** Применяет действие, совершая необходимые действия с
     * "исполнителем" и "жервтой". **/

    public ActionResult use(Character from, Character other);

}
