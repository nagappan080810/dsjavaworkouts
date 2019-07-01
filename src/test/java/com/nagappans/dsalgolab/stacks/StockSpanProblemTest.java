package com.nagappans.dsalgolab.stacks;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class StockSpanProblemTest {
    @Test
    public void findStockSpan() {
        int stockPrice[] = {11, 9, 7, 5, 4, 6, 8, 10, 7, 9};
        StockSpanProblem stockSpanProblem = new StockSpanProblem();
        System.out.println(Arrays.toString(stockSpanProblem.findDaysStockPriceLess(stockPrice)));
        assertEquals("[1, 1, 1, 1, 1, 3, 5, 7, 1, 2]",
                Arrays.toString(stockSpanProblem.findDaysStockPriceLess(stockPrice)));
    }
}
