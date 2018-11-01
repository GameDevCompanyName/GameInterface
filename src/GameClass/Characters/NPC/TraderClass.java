package GameClass.Characters.NPC;

import GameClass.Characters.CharacterClass;
import GameInterface.Action.Action;
import GameInterface.Character.Interactions.Trade;
import GameInterface.Character.NPC.Trader;
import GameInterface.Items.ItemContainer;
import GameInterface.World.Location.Location;

import java.util.ArrayList;
import java.util.List;

//TODO Трейдер должен расширять NPC а не Character
public class TraderClass extends CharacterClass implements Trader {

    //TODO Пока не очень представляю как будет работать трейдер в игре, поэтому нужно будет доделать его попозже
    //Когда будет понятно что от него нужно

    private ArrayList<String> phrases;
    private Trade trade;

    public TraderClass(String name,
                       Location location,
                       Integer strength,
                       Integer agility,
                       Integer intellect,
                       Integer luck) {
        super(name, location, strength, agility, intellect, luck);
    }

    @Override
    public List<String> getPhrases() {
        return phrases;
    }

    @Override
    public ItemContainer getGoods() {
        return null;
    }

    @Override
    public Trade getTrade() {
        return trade;
    }

}
