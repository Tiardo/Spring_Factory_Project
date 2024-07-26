package ProjectManager.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class FactoryController {



    @GetMapping(value = "/myApi/1", produces = "text/plain; charset=utf-8")
    public void pivo() {

//        RestTemplate restTemplate = new RestTemplate();
//        String response = restTemplate.getForObject("http://localhost:8080/myApi/1", String.class);
//        System.out.println(response);

        System.out.println("Pivo");

    }
    @GetMapping(value = "/myApi/2", produces = "text/plain; charset=utf-8")
    public void vodka() {
        System.out.println("Vodka");

    }
    @GetMapping(value = "/myApi/3", produces = "text/plain; charset=utf-8")
    public void viski() {
        System.out.println("Viski");

    }


}