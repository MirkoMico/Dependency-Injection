package co.DevelHopeHelloWorld.DependencyInjection.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    private String myComponentName;

    public MyComponent(){
        System.out.println("MyComponent constructor has been called");
        this.myComponentName = "Mirko Micocci";
    }

    public String getMyComponentName(){
        System.out.println("MyComponent.getMyComponentName() has been called");
        return myComponentName;



}

}
