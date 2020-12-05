package code._4_student_effort.hard.drinking;


public class Person implements IPerson {
    private final String name;

    private Person(Builder builder){
        this.name = builder.name;
    }

    @Override
    public void walk() {
        System.out.println(this.name + " is walking!");
    }

    @Override
    public void drink() throws InterruptedException {
        Thread.sleep(101);
        System.out.println(this.name + " is drinking!");
    }

    @Override
    public String getName() {
        return name;
    }

    public static class Builder{
        private String name;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public IPerson build() {
            return (IPerson) java.lang.reflect.Proxy.newProxyInstance(
                    code._2_challenge.hard._2_dringking_time.PersonInvocationHandler.class.getClassLoader(),
                    new Class[]{IPerson.class},
                    new PersonInvocationHandler(new Person(this)));
        }
    }
}
