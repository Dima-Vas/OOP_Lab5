package flower.store;

public enum FlowerType {
    /**
     * Flower types.
     */
    CHAMOMILE("Chamomile"), ROSE("Rose"), TULIP("Tulip");
    private final String stringRepresentation;

    FlowerType(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
