package flower.store;

import lombok.Getter;
import lombok.Setter;

@Setter
public class Rose extends Flower{
    @Getter
    public FlowerType type = FlowerType.ROSE;

    public String getType() {
        return type.toString();
    }

}
