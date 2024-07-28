package ProjectManager.controller;
import Factory.FactoryInterface;
import FactoryR.FactoryEssence;
import FactoryR.FactoryPivoR;
import FactoryR.FactoryViskiR;
import FactoryR.FactoryVodkaR;
import org.springframework.web.bind.annotation.*;


@RestController
public class FactoryController {


    @GetMapping(value = "/myApi/1", produces = "text/plain; charset=utf-8")
    public FactoryPivoR pivo() {

        FactoryEssence fabMet = createZavod("Pivo");
        FactoryInterface factoryInterface = fabMet.createFactory();
        factoryInterface.fabrickRun();
        return null;
    }

    @GetMapping(value = "/myApi/2", produces = "text/plain; charset=utf-8")
    public FactoryViskiR vodka() {
        FactoryEssence fabMet = createZavod("Viski");
        FactoryInterface factoryInterface = fabMet.createFactory();
        factoryInterface.fabrickRun();
        return null;
    }

    @GetMapping(value = "/myApi/3", produces = "text/plain; charset=utf-8")
    public FactoryVodkaR viski() {
        FactoryEssence fabMet = createZavod("Vodka");
        FactoryInterface factoryInterface = fabMet.createFactory();
        factoryInterface.fabrickRun();
        return null;

    }



    static FactoryEssence createZavod(String names) {
        if (names.equalsIgnoreCase("Pivo")) {
            return new FactoryPivoR();
        } else if (names.equalsIgnoreCase("Viski")) {
            return new FactoryViskiR();
        } else if (names.equalsIgnoreCase("Vodka")) {
            return new FactoryVodkaR();
        } else {
            throw new RuntimeException(names + "Нет такой фабрики");
        }
    }

}











