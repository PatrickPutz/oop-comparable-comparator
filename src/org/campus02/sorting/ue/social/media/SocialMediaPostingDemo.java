package org.campus02.sorting.ue.social.media;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class SocialMediaPostingDemo {

    public static void main(String[] args) {

        ArrayList<Posting> postings = new ArrayList<>();

        Posting p1 = new Posting(15, "x real 1", "screen 1", LocalDateTime.of(2021,3,10,18,30,15), 10, 10, 10);
        Posting p2 = new Posting(25, "a real 2", "screen 2", LocalDateTime.of(2022,3,10,18,30,16), 0, 5, 5);
        Posting p3 = new Posting(35, "k real 3", "screen 3", LocalDateTime.of(2020,4,11,19,15,0), 10, 5, 10);
        Posting p4 = new Posting(45, "o real 4", "screen 4", LocalDateTime.of(2022,4,11,10,13,1), 2, 0, 10);
        Posting p5 = new Posting(55, "b real 5", "screen 5", LocalDateTime.of(2023,5,8,15,10,50), 15, 3, 50);
        Posting p6 = new Posting(65, "a real 6", "screen 6", LocalDateTime.of(2021,5,8,15,0,16), 15, 30, 40);
        Posting p7 = new Posting(75, "y real 7", "screen 7", LocalDateTime.of(2022,6,6,14,17,28), 80, 12, 200);
        Posting p8 = new Posting(85, "c real 8", "screen 8", LocalDateTime.of(2023,7,6,12,9,29), 0, 0, 75);
        Posting p9 = new Posting(95, "i real 9", "screen 9", LocalDateTime.of(2020,8,9,12,8,30), 8, 3, 12);
        Posting p10 = new Posting(105, "k real 10", "screen 10", LocalDateTime.of(2022,9,10,13,20, 45), 340, 270, 1200);

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

        System.out.println("<<< RealnameAscComparator >>>");
        Collections.sort(postings, new RealnameAscComparator());
        for (Posting posting : postings) {
            System.out.println(posting.toString());
        }

        System.out.println("<<< DateTimeDescComparator >>>");
        Collections.sort(postings, new DateTimeDescComparator());
        for (Posting posting : postings) {
            System.out.println(posting.toString());
        }

        System.out.println("<<< LikesDescSharesDescComparator >>>");
        Collections.sort(postings, new LikesDescSharesDescComparator());
        for (Posting posting : postings) {
            System.out.println(posting.toString());
        }

        System.out.println("<<< ViewsDescSharesAscComparator >>>");
        Collections.sort(postings, new ViewsDescSharesAscComparator());
        for (Posting posting : postings) {
            System.out.println(posting.toString());
        }

        System.out.println("<<< CALCULATION LikesPerView >>>");
        for (Posting posting : postings) {
            System.out.println(posting.getRealname() + ": " + (double) posting.getLikes() / (double) posting.getViews());
        }

        System.out.println("<<< LikesPerViewAscComparator >>>");
        Collections.sort(postings, new LikesPerViewAscComparator());
        for (Posting posting : postings) {
            System.out.println(posting.toString());
        }

        System.out.println("<<< CALCULATION ShareLikeRatio >>>");
        for (Posting posting : postings) {
            System.out.println(posting.getRealname() + ": " + (double) posting.getShares() / (double) posting.getLikes());
        }

        System.out.println("<<< ShareLikeRatioDescComparator >>>");
        Collections.sort(postings, new ShareLikeRatioDescComparator());
        for (Posting posting : postings) {
            System.out.println(posting.toString());
        }
    }

}
