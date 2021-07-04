package Popeiu.Roxana.Proiect2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Notification implements Subject {
    private List<Observer> observers;
    private String message;
    private boolean changed;
    private final Object MUTEX= new Object();

    public Notification(){
        this.observers=new ArrayList<>();
}
    @Override
    public void register(Observer obj) {
        if(obj == null) throw new NullPointerException("Null Observer");
        synchronized (MUTEX) {
            if(!observers.contains(obj)) observers.add(obj);
        }
    }

    @Override
    public void unregister(Observer obj) {
        synchronized (MUTEX) {
            observers.remove(obj);
        }
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal = null;

        synchronized (MUTEX) {
            if (!changed)
                return;
            observersLocal = new ArrayList<>(this.observers);
            this.changed=false;
        }
        for (Observer obj : observersLocal) {
            obj.update();
        }

    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }


    public void postMessage(String msg){
        System.out.println(LocalDate.now()+" Notificarea a fost trimisa la useri:"+msg);
        this.message=msg;
        this.changed=true;
        notifyObservers();
    }

}
