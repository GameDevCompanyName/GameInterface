package ru.gdcn.beastmaster64revelations.GameClass.Characters.NPC;

import ru.gdcn.beastmaster64revelations.GameClass.Actions.BasicAttack;
import ru.gdcn.beastmaster64revelations.GameClass.Characters.CharacterClass;
import ru.gdcn.beastmaster64revelations.GameInterface.Action.Action;
import ru.gdcn.beastmaster64revelations.GameInterface.Character.Character;
import ru.gdcn.beastmaster64revelations.GameInterface.Character.NPC.NPC;
import ru.gdcn.beastmaster64revelations.GameInterface.Items.ItemContainer;
import ru.gdcn.beastmaster64revelations.GameInterface.World.Location.Location;

import java.util.List;

public class NPCclass extends CharacterClass implements NPC {

    private Boolean isValuableForLore;

    public NPCclass(String name,
                    Location location,
                    Integer strength,
                    Integer agility,
                    Integer intellect,
                    Integer luck) {
        super(name, location, strength, agility, intellect, luck);
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

    @Override
    public Boolean makeNextFightTurn(Character enemy) {
        Action action = new BasicAttack("Бац", 1.0);
        action.use(this, enemy);
        return true;
    }

    @Override
    public Boolean isValuableForLore() {
        return isValuableForLore;
    }
}
