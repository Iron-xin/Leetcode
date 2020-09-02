package _2002建造者模式;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public int getCost(){
        int cost = 0;
        for (int i=0;i<items.size();i++) {
            cost += items.get(i).price();
        }
        return cost;
    }

    public void showItems(){
        for (int i=0;i<items.size();i++) {
            System.out.print("Item : "+items.get(i).name());
            System.out.print(", Packing : "+items.get(i).packing().pack());
            System.out.println(", Price : "+items.get(i).price());
        }
    }
}