package com.ghedu.factory.factorymethod;

import com.ghedu.factory.simple.Div;
import com.ghedu.factory.simple.Operation;

public class DivFactory implements IOperationFactory{
    @Override
    public Operation createOption() {
        return new Div();
    }
}
