package br.edu.fatec.sjc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;

public class NumberAscOrderTest {

    @Test
    public void testSortWithNumbers() throws StackFullException {
        CustomStack<Integer> stack = new CustomStack<>(6, value -> value);
        stack.push(45);
        stack.push(12);
        stack.push(23);
        stack.push(8);
        stack.push(34);
        stack.push(2);

        NumberAscOrder numberAscOrder = new NumberAscOrder(stack);
        List<Number> sortedList = numberAscOrder.sort();

        assertEquals(List.of(2, 8, 12, 23, 34, 45), sortedList);
    }

    @Test
    public void testSortWithEmptyStack() {
        CustomStack<Integer> stack = new CustomStack<>(6, value -> value);

        NumberAscOrder numberAscOrder = new NumberAscOrder(stack);
        List<Number> sortedList = numberAscOrder.sort();

        assertTrue(sortedList.isEmpty());
    }

}
