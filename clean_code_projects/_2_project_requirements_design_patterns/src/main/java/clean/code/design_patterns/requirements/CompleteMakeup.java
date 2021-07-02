import java.util.HashMap;
import java.util.Map;

public class CompleteMakeup {
    private final String makeupType;
    private final Primer primer;
    private final Foundation foundation;
    private final Lipstick lipstick;
    private final Eyeshadow eyeshadow;
    private final Eyeliner eyeliner;
    private final Lashes lashes;

    public String getMakeupType() {
        return makeupType;
    }

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
        this.makeupType = builder.makeupType;
        this.primer = builder.primer;
        this.foundation = builder.foundation;
        this.lipstick = builder.lipstick;
        this.eyeliner = builder.eyeliner;
        this.eyeshadow = builder.eyeshadow;
        this.lashes = builder.lashes;
    }

    public static class Builder {
        private final String makeupType;
        private final Primer primer;
        private final Foundation foundation;
        private Lipstick lipstick;
        private Eyeshadow eyeshadow;
        private Eyeliner eyeliner;
        private Lashes lashes;

        public Builder(String makeupType, Primer primer, Foundation foundation) {
            this.makeupType = makeupType;
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
        /*
        I use builder pattern in order to create different types of
        makeup looks.
         */
        CompleteMakeup bridalMakeup = new CompleteMakeup.Builder("Bridal Makeup", new Primer("mattifying"), new Foundation("Estee Lauder", "High"))
                .applyEyeshadow(new Eyeshadow("nude"))
                .applyLipstick(new Lipstick("light pink", "glossy"))
                .build();
        CompleteMakeup arabicMakeup = new CompleteMakeup.Builder("Arabic Makeup", new Primer("hydrating"), new Foundation("MAC", "High"))
                .applyEyeliner(new Eyeliner("black", "graphic"))
                .putLashes(new Lashes(11))
                .build();
        CompleteMakeup pinupMakeup = new CompleteMakeup.Builder("Pin-up Makeup", new Primer("hydrating"), new Foundation("Huda Beauty", "medium"))
                .applyLipstick(new Lipstick("red", "matte"))
                .applyEyeliner(new Eyeliner("black", "pin-up"))
                .putLashes(new Lashes(10))
                .build();

        //System.out.println(bridalMakeup.lipstick.getColour());

        /*
        I use singleton pattern in order to create a professional instagram
        account where makeup looks are posted. Although there may be multiple
        physical salons, there is only one instagram account where all the work
        is promoted.
         */


        Map<Integer, CompleteMakeup> myPosts = new HashMap<>();
        myPosts.put(1, bridalMakeup);
        myPosts.put(2, arabicMakeup);
        myPosts.put(3, pinupMakeup);

        Singleton professionalInstagramAccount = Singleton.getInstance("Beauty Enhancer Salon", myPosts);

        professionalInstagramAccount.displayPosts();

        CompleteMakeup smokeyMakeup = new CompleteMakeup.Builder("Smokey eyes", new Primer("mattifying"), new Foundation("Dior", "Medium"))
                .applyEyeshadow(new Eyeshadow("black"))
                .putLashes(new Lashes(12))
                .build();

        myPosts.remove(2);
        myPosts.put(4, smokeyMakeup);

        //System.out.println(professionalInstagramAccount.getPosts().get(4).makeupType);
        professionalInstagramAccount.displayPosts();

    }
}