public enum pizzaName {
    Neapolitan(1), Chicago(2), Carnivora(3),
    Sicilian(4), Greek(5), California(6),
    Detroit(7);

    int nameId;

    pizzaName(int nameId) {
        this.nameId = nameId;
    }

    public int getNameId() {
        return nameId;
    }


}
