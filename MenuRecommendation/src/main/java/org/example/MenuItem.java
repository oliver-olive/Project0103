package org.example;

public class MenuItem {
    int itemId;
    String itemName;
    double totalRate = 0;
    int numberOfRate = 0;

    double rate = 0;
    Boolean outOfStock = false;
    Boolean markDeal = false;
    public MenuItem(int itemId, String itemName) {
        this.itemId = itemId;
        this.itemName = itemName;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void rateItem(int rating){
        numberOfRate ++;
        totalRate += rating;
        rate = totalRate/numberOfRate;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                "Rating: " + rate +
                '}';
    }
}
