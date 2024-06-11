package com.ghedu.factory.factorymethod;

import com.ghedu.factory.simple.Mul;
import com.ghedu.factory.simple.Operation;

public class MulFactory implements IOperationFactory{
    @Override
    public Operation createOption() {
        return new Mul();
    }
}
