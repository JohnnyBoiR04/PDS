public class SpicyPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;
    
    public SpicyPizzaBuilder() { this.pizza = new Pizza(); };

    public void buildDough() {
        pizza.setDough("pan baked");
    }
    
    public void buildSauce() {
        pizza.setSauce("hot");
    }
    
    public void buildTopping() {
        pizza.setTopping("salami+chouriço");
    }
    
    public Pizza getPizza() {
        return pizza;
    }
}
