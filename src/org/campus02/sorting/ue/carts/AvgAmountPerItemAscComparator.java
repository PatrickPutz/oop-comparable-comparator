package org.campus02.sorting.ue.carts;

import java.util.Comparator;

public class AvgAmountPerItemAscComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart o1, Cart o2) {
        return Double.compare((o1.getTotalAmount() / o1.getTotalItems()), (o2.getTotalAmount() / o1.getTotalItems()));
    }
}
