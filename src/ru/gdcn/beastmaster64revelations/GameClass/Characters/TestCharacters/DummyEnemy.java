package ru.gdcn.beastmaster64revelations.GameClass.Characters.TestCharacters;

import java.util.List;

import ru.gdcn.beastmaster64revelations.GameClass.Actions.BasicAttack;
import ru.gdcn.beastmaster64revelations.GameInterface.Action.Action;
import ru.gdcn.beastmaster64revelations.GameInterface.Character.Character;
import ru.gdcn.beastmaster64revelations.GameInterface.Character.NPC.Opponent;
import ru.gdcn.beastmaster64revelations.GameInterface.Character.NPC.OpponentType;
import ru.gdcn.beastmaster64revelations.GameInterface.Items.ItemContainer;

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
