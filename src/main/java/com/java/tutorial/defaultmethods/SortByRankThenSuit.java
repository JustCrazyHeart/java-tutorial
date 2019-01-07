package com.java.tutorial.defaultmethods;

import java.util.*;
/**
 * @author qiboo
 * 2019-01-07
 * 17:30
 */
public class SortByRankThenSuit implements Comparator<Card> {

    public int compare(Card firstCard, Card secondCard) {
        int compVal =
                firstCard.getRank().value() - secondCard.getRank().value();
        if (compVal != 0)
            return compVal;
        else
            return firstCard.getSuit().value() - secondCard.getSuit().value();
    }
}
