/**
 * Created by Kuba on 17.05.2017.
 */
public class PizzaFactoryPlocka implements PizzaFactory {
    private int test;
    public PizzaFactoryPlocka() {
    }

    @Override
    public String getNameRestaurant() {
        return "Plocka";
    }

    public int getTest() {
        return test;
    }
}
