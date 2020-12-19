package com.arun.refactoring;

/**
 * @author arun on 12/18/20
 */

public class SplitVariable {

    public int discount(int price, int quantity) {
        if (price > 50) price = price - 2;
        if (quantity > 100) price = price - 1;

        return price;
    }

    public int discountRefactored(int price, int quantity) {
        return price - computePriceDiscount(price) - computeQuantityDiscount(quantity);
    }


    private int computePriceDiscount(int price) {
        if (price > 50) {
            return 2;
        } else {
            return 0;
        }
    }

    private int computeQuantityDiscount(int quantity) {
        if (quantity > 100) {
            return 1;
        } else {
            return 0;
        }
    }
}
