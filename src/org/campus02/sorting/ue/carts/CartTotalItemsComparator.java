package org.campus02.sorting.ue.carts;

import java.util.Comparator;

public class CartTotalItemsComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart o1, Cart o2) {
        return Integer.compare(o2.getTotalItems(), o1.getTotalItems());
    }
}
