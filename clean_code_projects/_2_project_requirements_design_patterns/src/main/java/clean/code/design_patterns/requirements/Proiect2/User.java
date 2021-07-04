package Popeiu.Roxana.Proiect2;

public class User implements Observer{
    private String name;
    private Subject topic;

    public User(String nm){
        this.name=nm;
    }
    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if(msg == null){
            System.out.println(name+":: Nici o notificare");
        }else
            System.out.println(name+":: Notificare primita::"+msg);
    }

    @Override
    public void setSubject(Subject sub) {
        this.topic=sub;
    }

}
