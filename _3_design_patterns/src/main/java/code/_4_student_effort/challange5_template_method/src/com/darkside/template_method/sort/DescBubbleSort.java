package com.darkside.template_method.sort;

public class DescBubbleSort extends TemplateMethodBubbleSort {
    
	@Override
    public boolean numbersInCorrectOrder(Integer i1, Integer i2) {
        return i1 < i2;
    }
}