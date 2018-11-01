package GameClass.Characters.NPC;

import GameClass.Actions.BasicAttack;
import GameClass.Characters.CharacterClass;
import GameInterface.Action.Action;
import GameInterface.Character.Character;
import GameInterface.Character.NPC.Opponent;
import GameInterface.Character.NPC.OpponentType;
import GameInterface.Items.ItemContainer;
import GameInterface.World.Location.Location;

import java.util.List;

//TODO Почему Enemy а не Opponent?
public class EnemyClass extends CharacterClass implements Opponent {

    private OpponentType type;
    private Boolean isValuableForLore;

    public EnemyClass(String name,
                      Location location,
                      Integer strength,
                      Integer agility,
                      Integer intellect,
                      Integer luck,
                      OpponentType type,
                      Boolean isValuableForLore) {
        super(name, location, strength, agility, intellect, luck);
        this.type = type;
        this.isValuableForLore = isValuableForLore;
    }

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
    }//TODO

    @Override
    public ItemContainer getLoot() {
        return null;
    }//TODO

    //TODO Этот метод должен находиться не в интерфейсе Opponent а в NPC
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
        return type;
    }

    @Override
    public Boolean isAgressive() {
        return true;
    }

}
