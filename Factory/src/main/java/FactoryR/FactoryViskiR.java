package FactoryR;

import Factory.FactoryInterface;
import Factory.FactoryViski;

public class FactoryViskiR implements FactoryEssence{
    @Override
    public FactoryInterface createFactory(){
        return new FactoryViski();

    }
}