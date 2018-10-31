package GameClass.Actions;

import GameInterface.Action.Action;
import GameInterface.Action.ActionResult;
import GameInterface.Action.ActionType;
import GameInterface.Character.Character;

public class BasicAttack implements Action {

    protected final String name;
//    protected final Integer AP;
    protected final Double damageModifier;

    public BasicAttack(String name, Double damageModifier){
        this.name = name;
//        this.AP = AP;
        this.damageModifier = damageModifier;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getRequiredAP() {
        //TODO
        return 0;
    }

    @Override
    public ActionType getType() {
        return ActionType.ATACK;
    }

    @Override
    public ActionResult use(Character user, Character other) {
//        Integer damage = user.getAttack() * damageModifier;
//        ActionResult result = other.damage(damage);
//        return result;
        //ToDO
        return ActionResult.MISS;
    }

    @Override
    public String toString() {
        return "АТАКА{" +
                "name='" + name + '\'' +
                ", damageModifier=" + damageModifier +
                '}';
    }
}
