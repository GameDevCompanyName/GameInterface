package ru.gdcn.beastmaster64revelations.GameClass.Items.Usable.Scrolls;

import ru.gdcn.beastmaster64revelations.GameClass.Items.GameItemClass;
import ru.gdcn.beastmaster64revelations.GameInterface.Action.Action;
import ru.gdcn.beastmaster64revelations.GameInterface.Items.UsableItems.Scroll;
import ru.gdcn.beastmaster64revelations.GameInterface.Items.UsableItems.ScrollType;
import ru.gdcn.beastmaster64revelations.GameInterface.Items.UsableItems.ScrollUseResult;

public class ScrollClass extends GameItemClass implements Scroll {

    @Override
    public Action getAction() {
        return null;
    }

    @Override
    public ScrollType getType() {
        return null;
    }

    @Override
    public ScrollUseResult use(Character user, Character other) {
        return null;
    }

}
