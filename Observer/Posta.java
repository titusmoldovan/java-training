import java.util.ArrayList;
public class Posta implements Subject{
    private ArrayList<Scrisoare> toateScrisorile;
    private  ArrayList<Observer> observers;

    public Posta() {
        toateScrisorile = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void adaugaScrisoare(Scrisoare o) {
        toateScrisorile.add(o);
        notifica();
    }

    public ArrayList<Scrisoare> getScrisori() {
        return toateScrisorile;
    }

    @Override
    public void ataseaza(Observer o) {
        observers.add(o);
    }

    @Override
    public void deataseaza(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifica() {
        for(int i = 0; i <observers.size();i++)
        {
            observers.get(i).update(this);
        }
    }
}
