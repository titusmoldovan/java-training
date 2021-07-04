public enum doughType {
    crispy(1),
    puffy(2);

    int doughId;

    doughType(int dough) {
        this.doughId = dough;
    }

    public int getDoughId() {
        return doughId;
    }

}
