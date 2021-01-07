package code._4_student_effort.proiect;

public class CakeBoutique {
    private String wheatcake;
    private String cream;
    private boolean  chocolate;
    private boolean whippedcream;
    private PreparationStrategy preparationStrategy;

    private CakeBoutique(Builder builder)
    {
        this.wheatcake= builder.wheatcake;
        this.cream= builder.cream;
        this.chocolate=builder.chocolate;
        this.whippedcream= builder.whippedcream;
        this.preparationStrategy= builder.preparationStrategy;
    }

    public PreparationStrategy getPreparationStrategy() {
        return preparationStrategy;
    }

    @Override
    public String toString() {
        return "CakeBoutique{" +
                "wheatcake='" + wheatcake + '\'' +
                ", cream='" + cream + '\'' +
                ", chocolate=" + chocolate +
                ", whippedcream=" + whippedcream +
                '}';
    }

    public static class Builder{

        private String wheatcake;
        private String cream;
        private boolean  chocolate;
        private boolean whippedcream;
        private PreparationStrategy preparationStrategy;

        public Builder(String wheatcake, String cream, PreparationStrategy preparationStrategy) {
            this.wheatcake = wheatcake;
            this.cream = cream;
            this.preparationStrategy = preparationStrategy;
        }


        public Builder setChocolate(boolean chocolate) {
            this.chocolate = chocolate;
            return this;
        }

        public Builder setWhippedcream(boolean whippedcream) {
            this.whippedcream = whippedcream;
            return this;
        }
 public CakeBoutique build()
 {
     return new CakeBoutique(this);
 }
    }
}
