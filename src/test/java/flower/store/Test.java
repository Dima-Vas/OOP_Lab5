package flower.store;

import java.util.List;
import java.util.Random;

public class Test {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Tulip flower;
    private FlowerPack pack;
    private FlowerBucket bucket;
    private Store store;
    public void init() {
        flower = new Tulip();
        pack = new FlowerPack();
        store = new Store();
        testPrice();
        testColor();
        testType();
        testPack();
        testBucket();
        testStore();
    }

    public void testPrice() {
        int price = MAX_PRICE;
        flower.setPrice(price);
        System.out.println(price == flower.getPrice());
    }

    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        System.out.println("#FF0000".equals(flower.getColor()));
    }

    public void testType() {
        System.out.println("Tulip".equals(flower.getType()));
    }

    public void testPack() {
        pack.setQuantity(10);
        pack.setFlower(flower);
        System.out.println(pack.getPrice() == 1000);
    }

    public void testBucket(){
        FlowerBucket bucket = new FlowerBucket(10);
        for (int i = 0; i < 9; i++) {
            bucket.addPack(pack);
        }
        System.out.println(bucket.price() == 9000);
    }

    public void testStore() {
        FlowerBucket bucket = new FlowerBucket(10);
        for (int i = 0; i < 10; i++) {
            bucket.addPack(pack);
        }
        Store store = new Store();
        store.add(bucket);
        List<FlowerBucket> offers = store.find(flower);

        System.out.println(offers.contains(bucket));
    }
}

