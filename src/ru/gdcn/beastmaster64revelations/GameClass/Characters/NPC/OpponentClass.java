package ru.gdcn.beastmaster64revelations.GameClass.Characters.NPC;

import ru.gdcn.beastmaster64revelations.GameClass.Actions.BasicAttack;
import ru.gdcn.beastmaster64revelations.GameClass.Characters.CharacterClass;
import ru.gdcn.beastmaster64revelations.GameInterface.Action.Action;
import ru.gdcn.beastmaster64revelations.GameInterface.Character.Character;
import ru.gdcn.beastmaster64revelations.GameInterface.Character.NPC.Opponent;
import ru.gdcn.beastmaster64revelations.GameInterface.Character.NPC.OpponentType;
import ru.gdcn.beastmaster64revelations.GameInterface.Items.ItemContainer;
import ru.gdcn.beastmaster64revelations.GameInterface.World.Location.Location;

import java.util.List;

public class OpponentClass extends NPCclass implements Opponent {

    private OpponentType type;
    private Boolean isAgressive;

    public OpponentClass(String name,
                         Location location,
                         Integer strength,
                         Integer agility,
                         Integer intellect,
                         Integer luck,
                         OpponentType type,
                         Boolean isValuableForLore,
                         Boolean isAgressive) {
        super(name, location, strength, agility, intellect, luck);
        this.type = type;
    }

    @Override
    public OpponentType getType() {
        return type;
    }

    @Override
    public Boolean isAgressive() {
        return isAgressive;
    }

}
