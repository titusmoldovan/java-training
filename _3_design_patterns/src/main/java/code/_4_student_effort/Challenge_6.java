package code._4_student_effort;

//Builder pattern
class Person {
    private String name;
    private String job; //optional parameter
    private String university; //optional parameter
    private String drivingLicense; //optional parameter
    private boolean isMarried; //optional parameter

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getUniversity() {
        return university;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public boolean isMarried() {
        return isMarried;
    }

    private Person(Builder builder) {
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicense = builder.drivingLicense;
        this.isMarried = builder.isMarried;
    }

    static class Builder {
        private String name;
        private String job; //optional parameter
        private String university; //optional parameter
        private String drivingLicense; //optional parameter
        private boolean isMarried; //optional parameter

        public Builder(String name) {
            this.name = name;
        }

        public Builder setJob(String job) {
            this.job = job;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder setDrivingLicense(String drivingLicense) {
            this.drivingLicense = drivingLicense;
            return this;
        }

        public Builder setIsMarried(boolean isMarried) {
            this.isMarried = isMarried;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}

public class Challenge_6 {
    public static void main(String[] args) {
        Person person = new Person.Builder("John")
                .setJob("Programmer")
                .setUniversity("Politehnica")
                .setDrivingLicense("B")
                .setIsMarried(false)
                .build();

        System.out.println(person.getName()
                + " is a " + person.getJob()
                + " and studied at " + person.getUniversity()
                + " and has a driving license of category " + person.getDrivingLicense()
                + " and is married " + person.isMarried()
        );

    }
}
