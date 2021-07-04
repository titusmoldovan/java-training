public enum pizzaSize {
    Small(1),
    Medium(2),
    Family(3);
    int sizeId;

    pizzaSize(int sizeID) {
        this.sizeId = sizeId;
    }

    public int getSizeId() {
        return sizeId;
    }

    @Override
    public String toString() {
        return
                "size=" + sizeId +
                        '}';
    }
}
