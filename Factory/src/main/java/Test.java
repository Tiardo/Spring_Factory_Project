import Factory.FactoryInterface;
import FactoryR.FactoryEssence;
import FactoryR.FactoryPivoR;
import FactoryR.FactoryViskiR;
import FactoryR.FactoryVodkaR;

public class Test {
    public static void main(String[] args) {
        FactoryEssence devFact = createZavod("Pivo");
        FactoryInterface factoryInterface = devFact.createFactory();

        factoryInterface.fabrickRun();

    }

    static FactoryEssence createZavod(String brink) {
        if (brink.equalsIgnoreCase("Pivo")) {
            return new FactoryPivoR();
        } else if (brink.equalsIgnoreCase("Viski")) {
                return new FactoryViskiR();
            } else if (brink.equalsIgnoreCase("Vodka")) {
                    return new FactoryVodkaR();
                } else {
            throw new RuntimeException(brink + "Нет такого завода");
        }
    }
}
