package code._4_student_effort._4_observer;

import java.util.Arrays;

public class Teacher implements ObservedObject {
    Observer[] observers=new Observer[0];
    @Override
    public void register(Observer obj) {
        this.observers= Arrays.copyOf(this.observers,this.observers.length+1);
        this.observers[this.observers.length-1]=obj;
    }

    @Override
    public void unregister(Observer obj) {
        int index=0;
        for(int i=0;i<observers.length;i++){
            if(observers[i]==obj){
                index=i;
                System.arraycopy(observers,index+1,this.observers,index,this.observers.length-1-index);
                break;
            }
        }
    }
    @Override
    public void notifyObservers(String message) {
        for(int i=0;i<observers.length;i++){
            observers[i].update(message);
        }
    }
    public void teach(String subject){
        for(int i=0;i<observers.length;i++){
            observers[i].update(subject);
        }
    }
}
