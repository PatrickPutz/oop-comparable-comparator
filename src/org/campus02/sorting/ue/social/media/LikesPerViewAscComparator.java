package org.campus02.sorting.ue.social.media;

import java.util.Comparator;

public class LikesPerViewAscComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting o1, Posting o2) {
        return Double.compare(((double) o1.getLikes() / (double) o1.getViews()), ((double) o2.getLikes() / (double) o2.getViews()));
    }
}
