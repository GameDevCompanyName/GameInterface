package GameClass.Items.Usable.Scrolls;

import GameClass.Items.GameItemClass;
import GameInterface.Action.Action;
import GameInterface.Items.UsableItems.Scroll;
import GameInterface.Items.UsableItems.ScrollType;
import GameInterface.Items.UsableItems.ScrollUseResult;

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
