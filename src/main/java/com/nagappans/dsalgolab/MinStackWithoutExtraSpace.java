package com.nagappans.dsalgolab;

public class MinStackWithoutExtraSpace implements IStack<Integer> {
    Stack<Integer> mainStack = new Stack<>();
    int minElement = 0;

    @Override
    public void push(Integer elem) {
        if (mainStack.isEmpty()) {
            minElement = elem;
            mainStack.push(elem);
        } else if (minElement > elem) {
            int temp = 2*elem - minElement;
            mainStack.push(temp);
            minElement = elem;
        } else {
            mainStack.push(elem);
        }
    }

    @Override
    public Integer pop() {
        int result, temp;
        temp = mainStack.pop();
        //if popped elem lesser, it indicates min element position, so reset to previous minimum element..
        if (temp <= minElement) {
            result = minElement;
            minElement = 2 * minElement - temp;
        } else {
            result = temp;
        }
        return result;
    }

    public Integer minElement() {
        return minElement;
    }

    @Override
    public boolean isEmpty() {
        return mainStack.isEmpty();
    }

    @Override
    public Integer peek() {
        int result;
        result = mainStack.peek();
        if (result<minElement) {
            result = minElement;
        }
        return result;
    }
}
