package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MenuRecommendation implements IMenuRecommendation{

    Map<Integer, MenuItem> menuItem = new HashMap<>();
    MenuItem recommended = null;
    Boolean haveDeal = false;
    @Override
    public void addItem(int itemId, String displayName) {
        MenuItem m1 = new MenuItem(itemId, displayName);
        menuItem.put(itemId, m1);
    }

    @Override
    public MenuItem getRecommendedItem() {
        double curMaxRate = 0;
        if(!haveDeal) {
            for (Map.Entry<Integer, MenuItem> entry : menuItem.entrySet()) {
                MenuItem m1 = entry.getValue();
                if (m1.rate > curMaxRate && !m1.outOfStock) {
                    curMaxRate = m1.rate;
                    recommended = m1;
                }
            }
        }
        return recommended;
    }

    @Override
    public void outOfStockItem(int itemId) {
        try {
            MenuItem m1 = menuItem.get(itemId);
            m1.outOfStock = true;
            if(recommended == m1){
                haveDeal = false;
                recommended = null;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void restockItem(int itemId) {
        try {
            MenuItem m1 = menuItem.get(itemId);
            m1.outOfStock = false;
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void makeDealOfTheDayItem(int itemId) {
        try {
            MenuItem m1 = menuItem.get(itemId);
            m1.markDeal = true;
            haveDeal = true;
            if(!m1.outOfStock){
                recommended = m1;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void rateItem(int itemId, int rating) {
        try {
            MenuItem m1 = menuItem.get(itemId);
            m1.rateItem(rating);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
//    public double getCurMaxRate(){
//        double curMaxRate = 0
//        for (Map.Entry<Integer, MenuItem> entry : menuItem.entrySet()) {
//            MenuItem m1 = entry.getValue();
//            if (m1.rate > curMaxRate) {
//                curMaxRate = m1.rate;
//            }
//        }
//        return curMaxRate;
//        }

    }

