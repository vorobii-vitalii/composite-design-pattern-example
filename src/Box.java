import java.util.ArrayList;
import java.util.Collection;

public class Box implements Worthy {
    private final Collection<Worthy> nestedItems = new ArrayList<>();

    public void addItem(Worthy item) {
        nestedItems.add(item);
    }

    public void addItems(Collection<Worthy> items) {
        nestedItems.addAll(items);
    }

    @Override
    public double getCost() {
        double totalCost = 0.0;

        for (Worthy item : nestedItems) {
            totalCost += item.getCost();
        }

        return totalCost;
    }

}
