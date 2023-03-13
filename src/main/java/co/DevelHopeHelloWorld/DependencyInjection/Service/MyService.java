package co.DevelHopeHelloWorld.DependencyInjection.Service;

import co.DevelHopeHelloWorld.DependencyInjection.Component.MyComponent;
import co.DevelHopeHelloWorld.DependencyInjection.DependencyInjectionApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private MyComponent myComponent;
    @Autowired
    public MyService(MyComponent myComponent){
        System.out.println("MyService constructor has been called");
        this.myComponent = myComponent;
    }
    public String getName(){
        System.out.println("MyService.getName() has been called");
        return myComponent.getMyComponentName();
    }

}


