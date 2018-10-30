package GameClass.Items;

import GameInterface.Items.GameItem;
import GameInterface.Items.ItemContainer;
import GameInterface.Items.ItemRarity;

public class GameItemClass implements GameItem {

    protected String name;
    protected ItemRarity rarity;
    protected Integer weight;
    protected Integer baseCost;
    protected Boolean isUsable;
    protected Boolean isDisposable;
    protected Boolean isDropable;
    protected Boolean isSellable;
    protected Boolean isSoulbound;
    protected Boolean isTransferable;
    protected ItemContainer currentContainer;

    public GameItemClass(String name,
                         ItemRarity rarity,
                         Integer weight,
                         Integer baseCost,
                         Boolean isUsable,
                         Boolean isDisposable,
                         Boolean isDropable,
                         Boolean isSellable,
                         Boolean isSoulbound,
                         Boolean isTransferable) {
        this.name = name;
        this.rarity = rarity;
        this.weight = weight;
        this.baseCost = baseCost;
        this.isUsable = isUsable;
        this.isDisposable = isDisposable;
        this.isDropable = isDropable;
        this.isSellable = isSellable;
        this.isSoulbound = isSoulbound;
        this.isTransferable = isTransferable;
    }

    public GameItemClass(String name, ItemRarity rarity, Integer weight, Integer baseCost) {
        this.name = name;
        this.rarity = rarity;
        this.weight = weight;
        this.baseCost = baseCost;
        this.isUsable = false;
        this.isDisposable = false;
        this.isDropable = true;
        this.isSellable = true;
        this.isSoulbound = false;
        this.isTransferable = true;
    }

    public GameItemClass() {
        this.name = null;
        this.rarity = null;
        this.weight = null;
        this.baseCost = null;
        this.isUsable = false;
        this.isDisposable = false;
        this.isDropable = true;
        this.isSellable = true;
        this.isSoulbound = false;
        this.isTransferable = true;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ItemRarity getRarity() {
        return rarity;
    }

    @Override
    public Integer getWeight() {
        return weight;
    }

    @Override
    public Integer getBaseCost() {
        return baseCost;
    }

    @Override
    public Boolean isUsable() {
        return isUsable;
    }

    @Override
    public Boolean isDisposable() {
        return isDisposable;
    }

    @Override
    public Boolean isDropable() {
        return isDropable;
    }

    @Override
    public Boolean isSellable() {
        return isSellable;
    }

    @Override
    public Boolean isSoulbound() {
        return isSoulbound;
    }

    @Override
    public Boolean isTransferable() {
        return isTransferable;
    }

    @Override
    public ItemContainer getContainer() {
        return currentContainer;
    }

    @Override
    public void dispose() {
        boolean canTakeFromContainer = currentContainer.takeItem(this);
        if (!canTakeFromContainer) {
            //TODO
            return;
        }
    }

    @Override
    public Boolean transfer(ItemContainer newContainer) {
        if (!isTransferable)
            return false;
        if (currentContainer == null){
            boolean canPutInContainer = newContainer.putItem(this);
            if (!canPutInContainer){
                //TODO
                return false;
            } else {
                this.currentContainer = newContainer;
                return true;
            }
        }
        boolean canTakeFromContainer = currentContainer.takeItem(this);
        if (!canTakeFromContainer){
            //TODO
            return false;
        } else {
            boolean canPutInContainer = newContainer.putItem(this);
            if (!canPutInContainer){
                //TODO
                currentContainer.putItem(this);
                return false;
            } else {
                this.currentContainer = newContainer;
                return true;
            }
        }
    }

}
