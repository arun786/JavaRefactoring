package com.arun.refactoring;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author arun on 12/18/20
 */
public class SplitVariableTest {
    SplitVariable splitVariable = new SplitVariable();

    @Test
    public void discountTest() {
        assertEquals(1, splitVariable.discount(1, 1));
    }

    @Test
    public void discountRefactoredTest() {
        assertEquals(1, splitVariable.discountRefactored(1, 1));
    }
}