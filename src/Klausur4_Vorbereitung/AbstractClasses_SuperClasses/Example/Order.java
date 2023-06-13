package Klausur4_Vorbereitung.AbstractClasses_SuperClasses.Example;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public List<LineItem> lineItems;

    public Order() {
        this.lineItems = new ArrayList<LineItem>();
    }

    public void addLineItem(LineItem item) {
        this.lineItems.add(item);
    }

    public List<LineItem> getLineItems() {
        return this.lineItems;
    }
}
