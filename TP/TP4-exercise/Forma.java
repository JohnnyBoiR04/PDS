public abstract class Forma {
    protected String cor;

    public Forma(String cor) {
        this.cor = cor;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    public String getCor() {
        return cor;
    }

    public abstract String toString();
}

