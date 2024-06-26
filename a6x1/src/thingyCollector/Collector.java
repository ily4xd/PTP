package thingyCollector;
import java.util.*;

import _untouchable_.thingy.Color;
import _untouchable_.thingy.Item;
import _untouchable_.thingy.Size;
import _untouchable_.thingy.Weight;



public class Collector implements Collector_I {
    
    @Override
    public Collection<Item> process(Item item) {
        HashSet<Item> set = new HashSet<Item>();
        
        System.out.println(item.toString());
        boolean sameItem = false;
        final Color itemColor = item.getColor();
        final Size itemSize = item.getSize();
        final Weight itemWeight = item.getWeight();
        final Long itemValue = item.getValue();
        
        
        if(!set.contains(item)) set.add(item);
        
        LinkedList<Item> duplicates = new LinkedList<Item>();
            for(Item individualItem : set) {
                
                if(itemColor.equals(individualItem.getColor())) sameItem = true;
                if(itemSize.equals(individualItem.getSize())) sameItem = true;
                if(itemWeight.equals(individualItem.getWeight())) sameItem = true;
                if(itemValue.equals(individualItem.getValue())) sameItem = true;
                item.equals(individualItem);
            
        }
        
        
        
        final int sizeOfSet = set.size();
        if(sizeOfSet >= 5) return null;
        
        return null;
    }
    
    
    @Override
    public void reset() {}
}
