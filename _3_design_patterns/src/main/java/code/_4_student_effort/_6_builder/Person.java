package code._4_student_effort._6_builder;

public class Person {
    private final String name;
    private final String job;
    private final String university;
    private final String drivingLicense;
    private final boolean isMarried;

    public Person(Builder builder) {
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicense = builder.drivingLicense;
        this.isMarried = builder.isMarried;
    }

    @Override
    public String toString() {
        return "Person: " +
                "name= " + name +
                ", job= " + job +
                ", university= " + university +
                ", drivingLicense= " + drivingLicense +
                ", isMarried= " + isMarried;
    }

    static class Builder {
        private final String name;
        private String job;
        private String university;
        private String drivingLicense;
        private boolean isMarried;

        public Builder(String name) {
            this.name = name;
        }

        public Builder withJob(String job) {
            this.job = job;
            return this;
        }

        public Builder withUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder withDrivingLicense(String drivingLicense) {
            this.drivingLicense = drivingLicense;
            return this;
        }

        public Builder isMarried(boolean isMarried) {
            this.isMarried = isMarried;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }
}
