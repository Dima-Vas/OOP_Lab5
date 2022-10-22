package flower.store;

import lombok.Getter;
import lombok.Setter;

@Setter
public class Tulip extends Flower{
    @Getter
    public FlowerType type = FlowerType.TULIP;

    public String getType() {
        return type.toString();
    }

}