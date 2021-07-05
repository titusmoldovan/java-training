import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Locale;

public class main {

    public static void main(String args[]) throws IOException {
        BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));

        String producatorAles;
        String modelAles;
        String combustibilAles;
        String motorizareAleasa;
        String culoareAleasa;
        String navigatieDaNu;
        String climaDaNu;

        String[] producatori = {"DACIA", "TOYOTA", "VOLSKWAGEN", "TESLA", "MERCEDES"};
        String[] modeleDacia = {"LOGAN", "DUSTER"};
        String[] modeleToyota = {"COROLLA", "PRIUS"};
        String[] modeleVolskwagen = {"PASSAT", "GOLF", "ARTEON"};
        String[] modeleTesla = {"MODEL 3", "MODEL S"};
        String[] modeleMercedes = {"CLASS C", "CLASS E", "CLASS G"};
        String[] tipuriCombustibilDacia = {"DIESEL", "BENZINA", "GPL"};
        String[] tipuriCombustibilToyota = {"DIESEL", "BENZINA", "HIBRID BENZINA"};
        String[] tipuriCombustibilVolskwagen = {"DIESEL", "BENZINA"};
        String[] tipuriCombustibilTesla = {"ELECTRIC"};
        String[] tipuriCombustibilMercedes = {"DIESEL", "BENZINA"};
        String[] motorizariDacia = {"1.0", "1.4"};
        String[] motorizariToyota = {"1.6", "2.0"};
        String[] motorizariVolskwagen = {"1.6", "1.8", "2.0"};
        String[] motorizariTesla = {"SINGLE MOTOR", "DUAL MOTOR"};
        String[] motorizariMercedes = {"2.0", "3.0", "6.0"};
        String[] culori = {"ALB", "NEGRU", "ALBASTRU", "ROSU", "MARO", "GALBEN", "GRI"};
        String[] daNu = {"DA", "NU"};
        while (true) {
            System.out.println("Acesta este un configurator de masini in consola." +
                    "\nPoti incepe prin a selecta producatorul dorit din lista de mai jos:\n");

            while (true) {
                listare(producatori);
                producatorAles = myReader.readLine();
                if (verificareValiditate(producatori, producatorAles)) {
                    producatorAles = producatorAles.toUpperCase(Locale.ROOT);
                    System.out.println("A fost ales producatorul: " + producatorAles);
                    break;
                }
            }

            System.out.println("Acum poti selecta modelul dorit din lista de mai jos:\n");

            if (producatorAles.equals("DACIA")) {
                while (true) {
                    listare(modeleDacia);
                    modelAles = myReader.readLine();
                    if (verificareValiditate(modeleDacia, modelAles)) {
                        modelAles = modelAles.toUpperCase(Locale.ROOT);
                        System.out.println("A fost ales modelul: " + modelAles);
                        break;
                    }
                }

                System.out.println("Acum poti selecta combustibilul dorit din lista de mai jos:\n");
                while (true) {
                    listare(tipuriCombustibilDacia);
                    combustibilAles = myReader.readLine();
                    if (verificareValiditate(tipuriCombustibilDacia, combustibilAles)) {
                        combustibilAles = combustibilAles.toUpperCase(Locale.ROOT);
                        System.out.println("A fost ales combustibilul: " + combustibilAles);
                        break;
                    }
                }

                System.out.println("Acum poti selecta motorizarea dorita din lista de mai jos:\n");
                while (true) {
                    listare(motorizariDacia);
                    motorizareAleasa = myReader.readLine();
                    if (verificareValiditate(motorizariDacia, motorizareAleasa)) {
                        motorizareAleasa = motorizareAleasa.toUpperCase(Locale.ROOT);
                        System.out.println("A fost aleasa motorizarea: " + motorizareAleasa);
                        break;
                    }
                }

                System.out.println("Acum poti selecta culoarea dorita din lista de mai jos:\n");
                while (true) {
                    listare(culori);
                    culoareAleasa = myReader.readLine();
                    if (verificareValiditate(culori, culoareAleasa)) {
                        culoareAleasa = culoareAleasa.toUpperCase(Locale.ROOT);
                        System.out.println("A fost aleasa culoarea: " + culoareAleasa);
                        break;
                    }
                }

                System.out.println("Doresti navigatie la masina?\n");
                while (true) {
                    listare(daNu);
                    navigatieDaNu = myReader.readLine();
                    if (verificareValiditate(daNu, navigatieDaNu)) {
                        navigatieDaNu = navigatieDaNu.toUpperCase(Locale.ROOT);
                        System.out.println("Navigatie: " + navigatieDaNu);
                        break;
                    }
                }

                System.out.println("Doresti clima la masina?\n");
                while (true) {
                    listare(daNu);
                    climaDaNu = myReader.readLine();
                    if (verificareValiditate(daNu, climaDaNu)) {
                        climaDaNu = climaDaNu.toUpperCase(Locale.ROOT);
                        System.out.println("Clima: " + climaDaNu);
                        break;
                    }
                }
                Masina masina = new Masina.BuilderMasina()
                        .produsDe(producatorAles)
                        .model(modelAles)
                        .combustibil(combustibilAles)
                        .motorizare(motorizareAleasa)
                        .culoare(culoareAleasa)
                        .navigatie(navigatieDaNu)
                        .clima(climaDaNu)
                        .build();

                System.out.println(masina);
            }
            if (producatorAles.equals("TOYOTA")) {
                while (true) {
                    listare(modeleToyota);
                    modelAles = myReader.readLine();
                    if (verificareValiditate(modeleToyota, modelAles)) {
                        modelAles = modelAles.toUpperCase(Locale.ROOT);
                        System.out.println("A fost ales modelul: " + modelAles);
                        break;
                    }
                }

                System.out.println("Acum poti selecta combustibilul dorit din lista de mai jos:\n");
                while (true) {
                    listare(tipuriCombustibilToyota);
                    combustibilAles = myReader.readLine();
                    if (verificareValiditate(tipuriCombustibilToyota, combustibilAles)) {
                        combustibilAles = combustibilAles.toUpperCase(Locale.ROOT);
                        System.out.println("A fost ales combustibilul: " + combustibilAles);
                        break;
                    }
                }

                System.out.println("Acum poti selecta motorizarea dorita din lista de mai jos:\n");
                while (true) {
                    listare(motorizariToyota);
                    motorizareAleasa = myReader.readLine();
                    if (verificareValiditate(motorizariToyota, motorizareAleasa)) {
                        motorizareAleasa = motorizareAleasa.toUpperCase(Locale.ROOT);
                        System.out.println("A fost aleasa motorizarea: " + motorizareAleasa);
                        break;
                    }
                }

                System.out.println("Acum poti selecta culoarea dorita din lista de mai jos:\n");
                while (true) {
                    listare(culori);
                    culoareAleasa = myReader.readLine();
                    if (verificareValiditate(culori, culoareAleasa)) {
                        culoareAleasa = culoareAleasa.toUpperCase(Locale.ROOT);
                        System.out.println("A fost aleasa culoarea: " + culoareAleasa);
                        break;
                    }
                }

                System.out.println("Doresti navigatie la masina?\n");
                while (true) {
                    listare(daNu);
                    navigatieDaNu = myReader.readLine();
                    if (verificareValiditate(daNu, navigatieDaNu)) {
                        navigatieDaNu = navigatieDaNu.toUpperCase(Locale.ROOT);
                        System.out.println("Navigatie: " + navigatieDaNu);
                        break;
                    }
                }

                System.out.println("Doresti clima la masina?\n");
                while (true) {
                    listare(daNu);
                    climaDaNu = myReader.readLine();
                    if (verificareValiditate(daNu, climaDaNu)) {
                        climaDaNu = climaDaNu.toUpperCase(Locale.ROOT);
                        System.out.println("Clima: " + climaDaNu);
                        break;
                    }
                }
                Masina masina = new Masina.BuilderMasina()
                        .produsDe(producatorAles)
                        .model(modelAles)
                        .combustibil(combustibilAles)
                        .motorizare(motorizareAleasa)
                        .culoare(culoareAleasa)
                        .navigatie(navigatieDaNu)
                        .clima(climaDaNu)
                        .build();

                System.out.println(masina);
            }
            if (producatorAles.equals("VOLSKWAGEN")) {
                while (true) {
                    listare(modeleVolskwagen);
                    modelAles = myReader.readLine();
                    if (verificareValiditate(modeleVolskwagen, modelAles)) {
                        modelAles = modelAles.toUpperCase(Locale.ROOT);
                        System.out.println("A fost ales modelul: " + modelAles);
                        break;
                    }
                }

                System.out.println("Acum poti selecta combustibilul dorit din lista de mai jos:\n");
                while (true) {
                    listare(tipuriCombustibilVolskwagen);
                    combustibilAles = myReader.readLine();
                    if (verificareValiditate(tipuriCombustibilVolskwagen, combustibilAles)) {
                        combustibilAles = combustibilAles.toUpperCase(Locale.ROOT);
                        System.out.println("A fost ales combustibilul: " + combustibilAles);
                        break;
                    }
                }

                System.out.println("Acum poti selecta motorizarea dorita din lista de mai jos:\n");
                while (true) {
                    listare(motorizariVolskwagen);
                    motorizareAleasa = myReader.readLine();
                    if (verificareValiditate(motorizariVolskwagen, motorizareAleasa)) {
                        motorizareAleasa = motorizareAleasa.toUpperCase(Locale.ROOT);
                        System.out.println("A fost aleasa motorizarea: " + motorizareAleasa);
                        break;
                    }
                }

                System.out.println("Acum poti selecta culoarea dorita din lista de mai jos:\n");
                while (true) {
                    listare(culori);
                    culoareAleasa = myReader.readLine();
                    if (verificareValiditate(culori, culoareAleasa)) {
                        culoareAleasa = culoareAleasa.toUpperCase(Locale.ROOT);
                        System.out.println("A fost aleasa culoarea: " + culoareAleasa);
                        break;
                    }
                }

                System.out.println("Doresti navigatie la masina?\n");
                while (true) {
                    listare(daNu);
                    navigatieDaNu = myReader.readLine();
                    if (verificareValiditate(daNu, navigatieDaNu)) {
                        navigatieDaNu = navigatieDaNu.toUpperCase(Locale.ROOT);
                        System.out.println("Navigatie: " + navigatieDaNu);
                        break;
                    }
                }

                System.out.println("Doresti clima la masina?\n");
                while (true) {
                    listare(daNu);
                    climaDaNu = myReader.readLine();
                    if (verificareValiditate(daNu, climaDaNu)) {
                        climaDaNu = climaDaNu.toUpperCase(Locale.ROOT);
                        System.out.println("Clima: " + climaDaNu);
                        break;
                    }
                }
                Masina masina = new Masina.BuilderMasina()
                        .produsDe(producatorAles)
                        .model(modelAles)
                        .combustibil(combustibilAles)
                        .motorizare(motorizareAleasa)
                        .culoare(culoareAleasa)
                        .navigatie(navigatieDaNu)
                        .clima(climaDaNu)
                        .build();

                System.out.println(masina);
            }
            if (producatorAles.equals("TESLA")) {
                while (true) {
                    listare(modeleTesla);
                    modelAles = myReader.readLine();
                    if (verificareValiditate(modeleTesla, modelAles)) {
                        modelAles = modelAles.toUpperCase(Locale.ROOT);
                        System.out.println("A fost ales modelul: " + modelAles);
                        break;
                    }
                }

                System.out.println("Acum poti selecta combustibilul dorit din lista de mai jos:\n");
                while (true) {
                    listare(tipuriCombustibilTesla);
                    combustibilAles = myReader.readLine();
                    if (verificareValiditate(tipuriCombustibilTesla, combustibilAles)) {
                        combustibilAles = combustibilAles.toUpperCase(Locale.ROOT);
                        System.out.println("A fost ales combustibilul: " + combustibilAles);
                        break;
                    }
                }

                System.out.println("Acum poti selecta motorizarea dorita din lista de mai jos:\n");
                while (true) {
                    listare(motorizariTesla);
                    motorizareAleasa = myReader.readLine();
                    if (verificareValiditate(motorizariTesla, motorizareAleasa)) {
                        motorizareAleasa = motorizareAleasa.toUpperCase(Locale.ROOT);
                        System.out.println("A fost aleasa motorizarea: " + motorizareAleasa);
                        break;
                    }
                }

                System.out.println("Acum poti selecta culoarea dorita din lista de mai jos:\n");
                while (true) {
                    listare(culori);
                    culoareAleasa = myReader.readLine();
                    if (verificareValiditate(culori, culoareAleasa)) {
                        culoareAleasa = culoareAleasa.toUpperCase(Locale.ROOT);
                        System.out.println("A fost aleasa culoarea: " + culoareAleasa);
                        break;
                    }
                }

                System.out.println("Doresti navigatie la masina?\n");
                while (true) {
                    listare(daNu);
                    navigatieDaNu = myReader.readLine();
                    if (verificareValiditate(daNu, navigatieDaNu)) {
                        navigatieDaNu = navigatieDaNu.toUpperCase(Locale.ROOT);
                        System.out.println("Navigatie: " + navigatieDaNu);
                        break;
                    }
                }

                System.out.println("Doresti clima la masina?\n");
                while (true) {
                    listare(daNu);
                    climaDaNu = myReader.readLine();
                    if (verificareValiditate(daNu, climaDaNu)) {
                        climaDaNu = climaDaNu.toUpperCase(Locale.ROOT);
                        System.out.println("Clima: " + climaDaNu);
                        break;
                    }
                }
                Masina masina = new Masina.BuilderMasina()
                        .produsDe(producatorAles)
                        .model(modelAles)
                        .combustibil(combustibilAles)
                        .motorizare(motorizareAleasa)
                        .culoare(culoareAleasa)
                        .navigatie(navigatieDaNu)
                        .clima(climaDaNu)
                        .build();

                System.out.println(masina);
            }
            if (producatorAles.equals("MERCEDES")) {
                while (true) {
                    listare(modeleMercedes);
                    modelAles = myReader.readLine();
                    if (verificareValiditate(modeleMercedes, modelAles)) {
                        modelAles = modelAles.toUpperCase(Locale.ROOT);
                        System.out.println("A fost ales modelul: " + modelAles);
                        break;
                    }
                }

                System.out.println("Acum poti selecta combustibilul dorit din lista de mai jos:\n");
                while (true) {
                    listare(tipuriCombustibilMercedes);
                    combustibilAles = myReader.readLine();
                    if (verificareValiditate(tipuriCombustibilMercedes, combustibilAles)) {
                        combustibilAles = combustibilAles.toUpperCase(Locale.ROOT);
                        System.out.println("A fost ales combustibilul: " + combustibilAles);
                        break;
                    }
                }

                System.out.println("Acum poti selecta motorizarea dorita din lista de mai jos:\n");
                while (true) {
                    listare(motorizariMercedes);
                    motorizareAleasa = myReader.readLine();
                    if (verificareValiditate(motorizariMercedes, motorizareAleasa)) {
                        motorizareAleasa = motorizareAleasa.toUpperCase(Locale.ROOT);
                        System.out.println("A fost aleasa motorizarea: " + motorizareAleasa);
                        break;
                    }
                }

                System.out.println("Acum poti selecta culoarea dorita din lista de mai jos:\n");
                while (true) {
                    listare(culori);
                    culoareAleasa = myReader.readLine();
                    if (verificareValiditate(culori, culoareAleasa)) {
                        culoareAleasa = culoareAleasa.toUpperCase(Locale.ROOT);
                        System.out.println("A fost aleasa culoarea: " + culoareAleasa);
                        break;
                    }
                }

                System.out.println("Doresti navigatie la masina?\n");
                while (true) {
                    listare(daNu);
                    navigatieDaNu = myReader.readLine();
                    if (verificareValiditate(daNu, navigatieDaNu)) {
                        navigatieDaNu = navigatieDaNu.toUpperCase(Locale.ROOT);
                        System.out.println("Navigatie: " + navigatieDaNu);
                        break;
                    }
                }

                System.out.println("Doresti clima la masina?\n");
                while (true) {
                    listare(daNu);
                    climaDaNu = myReader.readLine();
                    if (verificareValiditate(daNu, climaDaNu)) {
                        climaDaNu = climaDaNu.toUpperCase(Locale.ROOT);
                        System.out.println("Clima: " + climaDaNu);
                        break;
                    }
                }
                Masina masina = new Masina.BuilderMasina()
                        .produsDe(producatorAles)
                        .model(modelAles)
                        .combustibil(combustibilAles)
                        .motorizare(motorizareAleasa)
                        .culoare(culoareAleasa)
                        .navigatie(navigatieDaNu)
                        .clima(climaDaNu)
                        .build();

                System.out.println(masina);
            }
        }
    }

    public static void listare(String[] string) {
        for (int i = 0; i < string.length; i++) {
            System.out.println(i + 1 + ". " + string[i]);
        }
    }

    public static boolean verificareValiditate(String[] string, String cuvantDeVerificat) {
        cuvantDeVerificat = cuvantDeVerificat.toUpperCase(Locale.ROOT);
        boolean result = Arrays.stream(string).anyMatch(cuvantDeVerificat::equals);
        if (!result) {
            System.out.println("Input gresit! Alege din nou.");
            return false;
        } else return true;
    }
}