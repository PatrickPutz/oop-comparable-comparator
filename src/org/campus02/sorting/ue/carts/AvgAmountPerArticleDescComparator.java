package org.campus02.sorting.ue.carts;

import java.util.Comparator;

public class AvgAmountPerArticleDescComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart o1, Cart o2) {
        return Double.compare((o2.getTotalAmount() / o2.getNumArticles()), (o1.getTotalAmount() / o1.getNumArticles()));
    }
}
