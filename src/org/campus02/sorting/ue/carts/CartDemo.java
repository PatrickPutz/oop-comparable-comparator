package org.campus02.sorting.ue.carts;

import java.util.ArrayList;
import java.util.Collections;

public class CartDemo {

    public static void main(String[] args) {

        Cart c1 = new Cart("pat", 21, 10, 250.00);
        Cart c2 = new Cart("leo", 15, 15, 200.00);
        Cart c3 = new Cart("mary", 3, 5, 500.00);
        Cart c4 = new Cart("flo", 15, 10, 400.00);
        Cart c5 = new Cart("pat", 22, 11, 300.00);

        ArrayList<Cart> carts = new ArrayList<>();
        carts.add(c1);
        carts.add(c2);
        carts.add(c3);
        carts.add(c4);
        carts.add(c5);

        System.out.println("<<< Initial List >>>");
        for (Cart cart : carts) {
            System.out.println(cart.toString());
        }

        Collections.sort(carts);

        System.out.println("<<< Sorted List >>>");
        for (Cart cart : carts) {
            System.out.println(cart.toString());
        }

        Collections.sort(carts, new CartUsernameComparator());
        System.out.println("<<< Sorted By Username >>>");
        for (Cart cart : carts) {
            System.out.println(cart.toString());
        }

        Collections.sort(carts, new CartTotalItemsComparator());
        System.out.println("<<< Sorted By Total Items >>>");
        for (Cart cart : carts) {
            System.out.println(cart.toString());
        }

        Collections.sort(carts, new ArticlesDescItemsAscComparator());
        System.out.println("<<< ArticlesDescItemsAscComparator >>>");
        for (Cart cart : carts) {
            System.out.println(cart.toString());
        }

        Collections.sort(carts, new UsernameDescTotalAmountAscComparator());
        System.out.println("<<< UsernameDescTotalAmountAscComparator >>>");
        for (Cart cart : carts) {
            System.out.println(cart.toString());
        }

        Collections.sort(carts, new AvgAmountPerItemAscComparator());
        System.out.println("<<< AvgAmountPerItemAscComparator >>>");
        for (Cart cart : carts) {
            System.out.println(cart.toString());
        }

        Collections.sort(carts, new AvgAmountPerArticleDescComparator());
        System.out.println("<<< AvgAmountPerArticleDescComparator >>>");
        for (Cart cart : carts) {
            System.out.println(cart.toString());
        }
    }

}
