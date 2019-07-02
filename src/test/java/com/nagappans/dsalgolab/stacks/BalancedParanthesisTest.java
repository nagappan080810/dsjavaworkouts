package com.nagappans.dsalgolab.stacks;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BalancedParanthesisTest {
    @Test
    public void isBalancedParanthesis() {
        BalancedParanthesis balancedParanthesis = new BalancedParanthesis();
        assertTrue(balancedParanthesis.isBalancedParanethesis("[()]{}{[()()]()}"));
        assertFalse(balancedParanthesis.isBalancedParanethesis("[(])"));
    }
}
