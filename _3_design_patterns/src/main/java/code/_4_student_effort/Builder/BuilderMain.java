package code._4_student_effort.Builder;

class Person {
    private final String name;
    private final String job;
    private final String university;
    private final boolean drivingLicense;
    private final boolean isMaried;

    private Person(Builder builder) {
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicense = builder.drivingLicense;
        this.isMaried = builder.isMaried;
    }

    static class Builder {
        private final String name;
        private String job;
        private String university;
        private boolean drivingLicense;
        private boolean isMaried;

        public Builder(String name) {
            this.name = name;
        }

        public Builder hasJob(String job){
            this.job = job;
            return this;
        }

        public Builder higherStudies(String university){
            this.university = university;
            return this;
        }

        public Builder hasDrivingLicense(boolean drivingLicense) {
            this.drivingLicense = drivingLicense;
            return this;
        }

        public Builder isMaried(boolean isMaried) {
            this.isMaried = isMaried;
            return this;
        }

        public Person build(){
            return new Person(this);
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", university='" + university + '\'' +
                ", drivingLicense=" + drivingLicense +
                ", isMaried=" + isMaried +
                '}';
    }
}

public class BuilderMain {
    public static void main(String[] args) {
        Person Ionut = new Person.Builder("Ionut").build();
        System.out.println(Ionut.toString());

        Person Daniel = new Person.Builder("Daniel")
                .hasJob("Mechanic")
                .higherStudies("AC")
                .hasDrivingLicense(true)
                .isMaried(false)
                .build();

        System.out.println(Daniel);
    }
}
