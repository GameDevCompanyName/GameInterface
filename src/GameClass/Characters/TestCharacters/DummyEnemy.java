package GameClass.Characters.TestCharacters;

import java.util.List;

import GameClass.Actions.BasicAttack;
import GameInterface.Action.Action;
import GameInterface.Character.Character;
import GameInterface.Character.NPC.Opponent;
import GameInterface.Character.NPC.OpponentType;
import GameInterface.Items.ItemContainer;

public class DummyEnemy extends DummyCharacter implements Opponent {

    @Override
    public Boolean isAttackable() {
        return true;
    }

    @Override
    public Boolean isTalkable() {
        return false;
    }

    @Override
    public Boolean isAvoidable() {
        return true;
    }

    @Override
    public List<String> getWarPhrases() {
        return null;
    }

    @Override
    public ItemContainer getLoot() {
        return null;
    }

    @Override
    public Boolean makeNextFightTurn(Character enemy) {
        Action action = new BasicAttack("Бац", 1.0);
        action.use(this, enemy);
        return true;
    }

    @Override
    public Boolean isValuableForLore() {
        return false;
    }

    @Override
    public OpponentType getType() {
        return OpponentType.BANDIT;
    }

    @Override
    public Boolean isAgressive() {
        return true;
    }

}
