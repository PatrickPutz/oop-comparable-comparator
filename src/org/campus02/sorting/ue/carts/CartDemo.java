package org.campus02.sorting.ue.carts;

import java.util.ArrayList;
import java.util.Collections;

public class CartDemo {

    public static void main(String[] args) {

        Cart c1 = new Cart("pat", 21, 10, 280.00);
        Cart c2 = new Cart("leo", 15, 15, 250.00);
        Cart c3 = new Cart("mary", 3, 5, 490.00);

        ArrayList<Cart> carts = new ArrayList<>();
        carts.add(c1);
        carts.add(c2);
        carts.add(c3);

        System.out.println("<<< Initial List >>>");
        for (Cart cart : carts) {
            System.out.println(cart.toString());
        }

        Collections.sort(carts);

        System.out.println("<<< Sorted List >>>");
        for (Cart cart : carts) {
            System.out.println(cart.toString());
        }

    }

}
