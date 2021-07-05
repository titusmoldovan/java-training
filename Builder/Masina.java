//Builder
public class Masina {

    private final String producator;
    private final String combustibil;
    private final String motorizare;
    private final String culoare;
    private final String model;
    private final String navigatie;
    private final String clima;


    public String getProducator() {
        return producator;
    }

    public String getModel() {
        return model;
    }

    public String getCombustibil() {
        return combustibil;
    }

    public String getMotorizare() {
        return motorizare;
    }

    public String getCuloare() {
        return culoare;
    }

    public String isNavigatie() {
        return navigatie;
    }

    public String isClima() {
        return clima;
    }

    @Override
    public String toString() {
        return "Masina: Producator: " + this.producator + " Model: " + this.model + " Combustibil: " + this.combustibil
                + " Motorizare: " + this.motorizare + " Culoare: " + this.culoare + " Navigatie: "
                + this.navigatie + " Clima: " + this.clima;
    }

    private Masina(BuilderMasina builder) {
        this.producator = builder.producator;
        this.model = builder.model;
        this.combustibil = builder.combustibil;
        this.motorizare = builder.motorizare;
        this.culoare = builder.culoare;
        this.navigatie = builder.navigatie;
        this.clima = builder.clima;
    }

    public static class BuilderMasina {

        private String producator;
        private String model;
        private String combustibil;
        private String motorizare;
        private String culoare;
        private String navigatie;
        private String clima;


        public BuilderMasina produsDe(String producator) {
            this.producator = producator;
            return this;
        }

        public BuilderMasina model(String model) {
            this.model = model;
            return this;
        }

        public BuilderMasina combustibil(String combustibil) {
            this.combustibil = combustibil;
            return this;
        }

        public BuilderMasina motorizare(String motorizare) {
            this.motorizare = motorizare;
            return this;
        }

        public BuilderMasina culoare(String culoare) {
            this.culoare = culoare;
            return this;
        }

        public BuilderMasina navigatie(String navigatie) {
            this.navigatie = navigatie;
            return this;
        }

        public BuilderMasina clima(String clima) {
            this.clima = clima;
            return this;
        }

        public Masina build() {
            Masina masina = new Masina(this);
            return masina;
        }
    }
}