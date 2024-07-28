package FactoryR;

import Factory.FactoryInterface;
import Factory.FactoryPivo;

public class FactoryPivoR implements FactoryEssence{
    @Override
    public FactoryInterface createFactory(){
        return new FactoryPivo();

            }
}