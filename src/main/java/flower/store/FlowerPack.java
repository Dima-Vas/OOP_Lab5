package flower.store;

import lombok.Getter;
import lombok.Setter;

@Setter
public class FlowerPack {
    @Getter
    private Flower flower;
    private int quantity;

    public double getPrice() {
        return flower.getPrice() * quantity;
    }

}
