import java.util.ArrayList;

public class Employee {
    // an employee has to know if the client wants extras or not
    // so he can get another strategy for each case
    Strategy strategy;
    public void serve(ArrayList<Client> clients) {
        ArrayList<Client> toRemove = new ArrayList<>();
        int i = 1;
        for (Client client : clients) {
            System.out.println("Client " + i);
            if (client.extras == null) {
                strategy = new ServeWithoutExtras();
            } else {
                strategy = new ServeWithExtras();
            }
            strategy.serve(client);
            toRemove.add(client);
            i++;
        }
        System.out.println("Liber!");
        clients.removeAll(toRemove);
    }
}
