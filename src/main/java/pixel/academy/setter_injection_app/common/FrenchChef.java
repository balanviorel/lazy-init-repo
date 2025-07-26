package pixel.academy.setter_injection_app.common;
import org.springframework.stereotype.Component;

@Component
public class FrenchChef implements Chef {

    public FrenchChef() {

        System.out.println("FrenchChef constructor" + getClass().getSimpleName());

    }

    @Override
    public String getDailyRecipe() {
        return "Preparez boeuf bourgignon avec de legumes";
    }
}
