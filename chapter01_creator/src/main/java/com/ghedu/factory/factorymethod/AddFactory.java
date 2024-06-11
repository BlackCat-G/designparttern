package com.ghedu.factory.factorymethod;

import com.ghedu.factory.simple.Add;
import com.ghedu.factory.simple.Operation;

public class AddFactory implements IOperationFactory{
    @Override
    public Operation createOption() {
        return new Add();
    }
}
