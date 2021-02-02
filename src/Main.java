import java.util.List;

public class Main {

    private static Box getBoxExample() {
        var box = new Box();

        box.addProducts(List.of(new Product(1), new Product(2)));

        return box;
    }

    public static void main(String[] args) {
        Box box1 = getBoxExample();
        Box box2 = getBoxExample();

        // A box is now nested inside another box
        box1.addProduct(box2);

        box1.addProduct(new Product(3));

        System.out.println("Total cost should be 9. Result: " + box1.getCost());

    }

}
