public class Main{
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
        PizzaBuilder pepperoniPizzaBuilder = new PepperoniPizzaBuilder();
        Pizza pizza;
        
        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();
        
        pizza = waiter.getPizza();
        System.out.println(pizza);
        
        waiter.setPizzaBuilder(spicyPizzaBuilder);
        waiter.constructPizza();
        
        pizza = waiter.getPizza();
        System.out.println(pizza);

        waiter.setPizzaBuilder(pepperoniPizzaBuilder);
        waiter.constructPizza();

        pizza = waiter.getPizza();
        System.out.println(pizza);
    }
}