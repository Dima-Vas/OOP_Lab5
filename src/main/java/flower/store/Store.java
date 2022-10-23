package flower.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public List<FlowerBucket> bucketItems = new ArrayList<>();

    public List<FlowerBucket> find(Flower favouriteFlower) {
        List<FlowerBucket> output = new ArrayList<>();
        for (FlowerBucket bt : bucketItems) {
            for (FlowerPack pk : bt.bucketItems) {
                if (pk.getFlower().equals(favouriteFlower)) {
                    output.add(bt);
                    break;
                }
            }
        }
        return output;
    }

    public void add(FlowerBucket toAdd) {
        bucketItems.add(toAdd);
    }
}
