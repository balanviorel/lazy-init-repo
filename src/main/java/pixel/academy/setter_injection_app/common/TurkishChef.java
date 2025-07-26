package pixel.academy.setter_injection_app.common;

import org.springframework.stereotype.Component;

@Component
public class TurkishChef implements Chef{

    public TurkishChef() {
        System.out.println("TurkishChef constructor: "  + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {

        return " Prepara chebab .";
    }

}
