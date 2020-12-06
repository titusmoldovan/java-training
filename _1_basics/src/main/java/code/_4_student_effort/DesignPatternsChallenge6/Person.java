package code._4_student_effort.DesignPatternsChallenge6;

public class Person {
    private final String name, job, university;
    private final boolean drivingLicense, isMaried;

    public static class Builder {
        private String name, job, university;
        private boolean drivingLicense, isMaried;

        public Builder(String name) {
            this.name = name;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder job(String job) {
            this.job = job;
            return this;
        }

        public Builder university(String university) {
            this.university = university;
            return this;
        }

        public Builder drivingLicense(boolean drivingLicense) {
            this.drivingLicense = drivingLicense;
            return this;
        }

        public Builder isMaried(boolean isMaried) {
            this.isMaried = isMaried;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    public Person(Builder builder) {
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicense = builder.drivingLicense;
        this.isMaried = builder.isMaried;
    }

    @Override
    public String toString() {
        return ("Name - " + name + "; job - " + job + "; university - " + university + "; driving license - " + drivingLicense + "; is married - " + isMaried + ".");
    }
}