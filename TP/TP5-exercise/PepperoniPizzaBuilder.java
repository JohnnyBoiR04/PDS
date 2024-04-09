public class PepperoniPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;
    
    public PepperoniPizzaBuilder() { this.pizza = new Pizza(); };

    public void buildDough() {
        pizza.setDough("pan");
    }
    
    public void buildSauce() {
        pizza.setSauce("tomato");
    }
    
    public void buildTopping() {
        pizza.setTopping("pepperoni");
    }
    
    public Pizza getPizza() {
        return pizza;
    }
}