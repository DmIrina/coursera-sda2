package MVCPattern;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.ListIterator;

public class StoreOrder extends Observable {
    private ArrayList<String> itemList;
    private ArrayList<BigDecimal> priceList;
    public StoreOrder() {
        itemList = new ArrayList<>();
        priceList = new ArrayList<>();
    }

    public String getItem( int itemNum ) {
        return itemList.get(itemNum);
    }

    public BigDecimal getPrice(int itemNum ) {
        return priceList.get(itemNum);
    }

    public ListIterator<String> getItemList() {
        return itemList.listIterator();
    }

    public ListIterator<BigDecimal> getPriceList() {
        return priceList.listIterator();
    }

    public void deleteItem(int itemNum) {
        itemList.remove(itemNum);
        priceList.remove(itemNum);
        setChanged();
        notifyObservers();
    }


    public void addItem(int barcode) {
// code to add item (probably used with a scanner)
// prices are looked up from a database
// ...
        setChanged();
        notifyObservers();
    }
    public void changePrice(int itemNum, BigDecimal newPrice)
    {
        priceList.set(itemNum,newPrice);
        setChanged();

    }
}