public class Product implements Worthy {
    private final double cost;

    public Product(double cost) {
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return cost;
    }

}
