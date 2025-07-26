package pixel.academy.setter_injection_app.common;

import org.springframework.stereotype.Component;

@Component
public class MexicanChef implements Chef {

    public MexicanChef() {

        System.out.println("MexicanChef constructor"  + getClass().getSimpleName());
    }


    @Override
    public String getDailyRecipe() {

        return " Preparare la pasta .";
    }

}
