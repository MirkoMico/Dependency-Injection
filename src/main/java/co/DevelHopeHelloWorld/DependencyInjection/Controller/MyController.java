package co.DevelHopeHelloWorld.DependencyInjection.Controller;

import co.DevelHopeHelloWorld.DependencyInjection.Component.MyComponent;
import co.DevelHopeHelloWorld.DependencyInjection.Service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private MyService serv;

    public MyController(MyService serv) {
        System.out.println("MyController constructor has been called");
        this.serv = serv;
    }
    @GetMapping("/getName")
    public String getName(){
        return serv.getName();
    }

    @GetMapping("/mess")
    public String mess(){
        return "Welcome!!!!!";
    }



}
