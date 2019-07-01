package com.nagappans.dsalgolab.stacks;

public class StockSpanProblem {

    public int[] findDaysStockPriceLess(int[] priceArr) {
        int noOfDaysLess[] = new int[priceArr.length];
        Stack<Integer> descPriceIndex = new Stack<>();
        //by default first one will be 1;
        descPriceIndex.push(0);
        noOfDaysLess[0] = 1;

        for(int i=1; i<priceArr.length; i++) {
            //go back to find the prev greatest price and index one before is no of days price was less
            while(priceArr[descPriceIndex.peek()]<=priceArr[i]) {
                descPriceIndex.pop();
            }
            noOfDaysLess[i] = i - descPriceIndex.peek();
            descPriceIndex.push(i);
        }

        return noOfDaysLess;
    }

}
