package org.campus02.sorting.ue.carts;

import java.util.Comparator;

public class UsernameDescTotalAmountAscComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart o1, Cart o2) {
        if(o2.getUsername().equals(o1.getUsername())){
            return Double.compare(o1.getTotalAmount(), o2.getTotalAmount());
        }
        return o2.getUsername().compareTo(o1.getUsername());
    }
}
