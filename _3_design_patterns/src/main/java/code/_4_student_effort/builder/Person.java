package code._4_student_effort.builder;

public class Person {
    private final String name, job, university, drivingLicense;
    private final boolean isMarried;

    private Person(Builder builder) {
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicense = builder.drivingLicense;
        this.isMarried = builder.isMarried;
    }

     static class Builder {
        private String name, job, university, drivingLicense;
        private boolean isMarried;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
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

    @Override
    public String toString() {
        return "Name: " + name
                + "\nJob: " + job
                + "\nUniversity: " + university
                + "\nDriving license: " + drivingLicense
                + "\nIs married: " + isMarried;
    }
}
