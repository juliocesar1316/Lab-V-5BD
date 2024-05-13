package br.edu.fatec.sjc;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;


public class NumberAscOrder {
    private final CustomStack<? extends Number> stack;

    public NumberAscOrder(CustomStack<? extends Number> stack) {
        this.stack = stack;
    }

    public List<Number> sort() {
        
        List<Number> numberList = new ArrayList<>(stack.toList());
        numberList.sort(Comparator.comparingDouble(Number::doubleValue));
        
        return numberList;
    }
}
