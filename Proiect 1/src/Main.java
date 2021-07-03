import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Restaurant fastfood = Restaurant.getInstance();
        fastfood.setInitialMenu();
        fastfood.getMenu().addExtra(new Extra(2, "Masline"));
        System.out.println(fastfood.getMenu().seeMenu());
        Employee sarah = new Employee(); // let's consider that we have only one employee
        ArrayList<Client> clients = new ArrayList<>();
        MyScanner sc = new MyScanner();
        while (true) {
            System.out.println("Aveti urmatoarele optiuni:");
            System.out.println("quit :: se inchide restaurantul");
            System.out.println("add clients :: adauga clienti in coada");
            System.out.println("serve :: serveste clientii");
            String read = sc.nextLine();
            if (read.equals("quit")) {
                break;
            }
            if (read.equals("add clients")) {
                boolean moreClients = true;
                while (moreClients) {
                    Client c;
                    System.out.println("Cati bani are?");
                    int money = sc.nextInt();
                    System.out.println("Ce meniu doreste?");
                    String food = sc.next();
                    System.out.println("Doreste ceva extra? Da/Nu");
                    if (sc.next().equals("Da")) {
                        ArrayList<String> extras = new ArrayList<>();
                        boolean ok = true;
                        while (ok) {
                            System.out.println("Ce doreste?");
                            extras.add(sc.next());
                            System.out.println("Altceva? Da/Nu");
                            if (sc.next().equals("Nu"))
                                ok = false;
                        }
                        c = new Client(money, food, extras);
                    } else {
                        c = new Client(money, food, null);
                    }
                    clients.add(c);
                    System.out.println("Mai sunt clienti? Da/Nu");
                    if (sc.next().equals("Nu")) {
                        moreClients = false;
                    }
                }
            }
            if (read.equals("serve")) {
                sarah.serve(clients);
            }
            System.out.println();
        }
    }

    static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
