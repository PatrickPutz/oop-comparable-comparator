package org.campus02.sorting.ue.social.media;

import java.util.Comparator;

public class LikesDescSharesDescComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting o1, Posting o2) {
        if(o2.getLikes() == o1.getLikes())
            return Integer.compare(o2.getShares(), o1.getShares());
        return Integer.compare(o2.getLikes(), o1.getLikes());
    }
}
