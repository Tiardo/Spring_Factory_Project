package FactoryR;

import Factory.FactoryInterface;
import Factory.FactoryVodka;

public class FactoryVodkaR implements FactoryEssence{
    @Override
    public FactoryInterface createFactory(){
        return new FactoryVodka();

    }
}