package org.campus02.sorting.ue.social.media;

import java.util.Comparator;

public class ViewsDescSharesAscComparator implements Comparator<Posting> {
    @Override
    public int compare(Posting o1, Posting o2) {
        if(o2.getViews() == o1.getViews())
            return Integer.compare(o1.getShares(), o2.getShares());
        return Integer.compare(o2.getViews(), o1.getViews());
    }
}
