public class CompleteMakeup {
    private Primer primer;
    private Foundation foundation;
    private Lipstick lipstick;
    private Eyeshadow eyeshadow;
    private Eyeliner eyeliner;
    private Lashes lashes;

    public Primer getPrimer() {
        return primer;
    }

    public Foundation getFoundation() {
        return foundation;
    }

    public Lipstick getLipstick() {
        return lipstick;
    }

    public Eyeshadow getEyeshadow() {
        return eyeshadow;
    }

    public Eyeliner getEyeliner() {
        return eyeliner;
    }

    public Lashes getLashes() {
        return lashes;
    }

    private CompleteMakeup(Builder builder) {
        this.primer = builder.primer;
        this.foundation = builder.foundation;
        this.lipstick = builder.lipstick;
        this.eyeliner = builder.eyeliner;
        this.eyeshadow = builder.eyeshadow;
        this.lashes = builder.lashes;
    }

    public static class Builder {
        private Primer primer;
        private Foundation foundation;
        private Lipstick lipstick;
        private Eyeshadow eyeshadow;
        private Eyeliner eyeliner;
        private Lashes lashes;

        public Builder(Primer primer, Foundation foundation) {
            this.primer = primer;
            this.foundation = foundation;
        }

        public Builder applyLipstick(Lipstick lipstick) {
            this.lipstick = lipstick;
            return this;
        }

        public Builder applyEyeshadow(Eyeshadow eyeshadow) {
            this.eyeshadow = eyeshadow;
            return this;
        }

        public Builder applyEyeliner(Eyeliner eyeliner) {
            this.eyeliner = eyeliner;
            return this;
        }

        public Builder putLashes(Lashes lashes) {
            this.lashes = lashes;
            return this;
        }


        public CompleteMakeup build() {
            return new CompleteMakeup(this);
        }
    }

    public static void main(String[] args) {
        CompleteMakeup bridalMakeup = new CompleteMakeup.Builder(new Primer("mattifying"), new Foundation("Estee Lauder", "High"))
                .applyEyeshadow(new Eyeshadow("nude"))
                .applyLipstick(new Lipstick("light pink", "glossy"))
                .build();
        CompleteMakeup arabicMakeup = new CompleteMakeup.Builder(new Primer("hydrating"), new Foundation("MAC", "High"))
                .applyEyeliner(new Eyeliner("black", "graphic"))
                .putLashes(new Lashes(11))
                .build();
        CompleteMakeup pinupMakeup = new CompleteMakeup.Builder(new Primer("hydrating"), new Foundation("Huda Beauty", "medium"))
                .applyLipstick(new Lipstick("red", "matte"))
                .applyEyeliner(new Eyeliner("black", "pin-up"))
                .putLashes(new Lashes(10))
                .build();

        System.out.println(bridalMakeup.lipstick.getColour());
    }
}
