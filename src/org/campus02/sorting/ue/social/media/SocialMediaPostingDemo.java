package org.campus02.sorting.ue.social.media;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class SocialMediaPostingDemo {

    public static void main(String[] args) {

        ArrayList<Posting> postings = new ArrayList<>();

        Posting p1 = new Posting(15, "real 1", "screen 1", LocalDateTime.of(2022,3,10,18,30,15));
        Posting p2 = new Posting(25, "real 2", "screen 2", LocalDateTime.of(2022,3,10,18,30,16));
        Posting p3 = new Posting(35, "real 3", "screen 3", LocalDateTime.of(2022,4,11,19,15,0));
        Posting p4 = new Posting(45, "real 4", "screen 4", LocalDateTime.of(2022,4,11,10,13,1));
        Posting p5 = new Posting(55, "real 5", "screen 5", LocalDateTime.of(2022,5,8,15,10,50));
        Posting p6 = new Posting(65, "real 6", "screen 6", LocalDateTime.of(2022,5,8,15,0,16));
        Posting p7 = new Posting(75, "real 7", "screen 7", LocalDateTime.of(2022,6,6,14,17,28));
        Posting p8 = new Posting(85, "real 8", "screen 8", LocalDateTime.of(2022,7,6,12,9,29));
        Posting p9 = new Posting(95, "real 9", "screen 9", LocalDateTime.of(2022,8,9,12,8,30));
        Posting p10 = new Posting(105, "real 10", "screen 10", LocalDateTime.of(2022,9,10,13,20, 45));

        postings.add(p2);
        postings.add(p5);
        postings.add(p7);
        postings.add(p10);
        postings.add(p1);
        postings.add(p3);
        postings.add(p9);
        postings.add(p6);
        postings.add(p8);
        postings.add(p4);

        System.out.println("<<< Intial List >>>");
        for (Posting posting : postings) {
            System.out.println(posting.toString());
        }

        System.out.println("<<< Default Sorting >>>");
        Collections.sort(postings);
        for (Posting posting : postings) {
            System.out.println(posting.toString());
        }
    }

}
