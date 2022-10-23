package flower.store;

public class FlowerBucket {
    int bucketSize;
    int bucketCount = 0;
    FlowerPack[] bucketItems;
    int price = 0;
    public FlowerBucket(int bucketSize) {
        this.bucketSize = bucketSize;
        this.bucketItems = new FlowerPack[bucketSize];
    }

    private boolean isFull(){
        return bucketCount >= bucketSize;
    }

    public void addPack(FlowerPack pack) {
        if (!isFull()) {
            bucketItems[bucketCount] = pack;
            bucketCount += 1;
            price += pack.getPrice();
        }
        else {
            throw new IndexOutOfBoundsException("This bucket is full. Flower pack not added.");
        }
    }

    public int price() {
        return price;
    }
}
