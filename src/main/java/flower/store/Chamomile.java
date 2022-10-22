package flower.store;

import lombok.Getter;
import lombok.Setter;

@Setter
public class Chamomile extends Flower{
    @Getter
    public FlowerType type = FlowerType.CHAMOMILE;

    public String getType() {
        return type.toString();
    }

}