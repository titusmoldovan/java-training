package code._4_student_effort.challenge6_builder;

public class Person {

    private String name;
    private String job;
    private String university;
    private String drivingLicense;
    private boolean isMarried;

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
        this.name=builder.name;
        this.job=builder.job;
        this.university=builder.university;
        this.drivingLicense=builder.drivingLicense;
        this.isMarried=builder.isMarried;
    }

    public static class Builder {

        private String name;
        private String job;
        private String university;
        private String drivingLicense;
        private boolean isMarried;

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

        public Builder setMarried(boolean married) {
            isMarried = married;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
