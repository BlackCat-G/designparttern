package com.ghedu.factory.factorymethod;

import com.ghedu.factory.simple.Operation;
import com.ghedu.factory.simple.Sub;

public class SubFactory implements IOperationFactory{
    @Override
    public Operation createOption() {
        return new Sub();
    }
}
