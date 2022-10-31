
package item;

public class ItemList {
        Item [] list;   
        int numOfItem;  
        final int MAX = 100;   
        public ItemList(){
            list = new Item[MAX];
            numOfItem = 0;
        }    
        
        public boolean addItem(Item item){
        if (item == null || numOfItem >= MAX)
            return false;
        
        list[numOfItem]=item;
        numOfItem++;
        return true;

        }
    public static void main(String[] args) {
        
    }
}   
