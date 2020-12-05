package code._4_student_effort.ChallengeSix;

public class Person {
    private String name;
    private String job;
    private String university;
    private String drivingLicense;
    private boolean isMaried;

    public Person(Builder builder) {
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicense = builder.drivingLicense;
        this.isMaried = builder.isMaried;
    }


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

    public boolean isMaried() {
        return isMaried;
    }

    public static class Builder{
        private String name;
        private String job;
        private String university;
        private String drivingLicense;
        private boolean isMaried;

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

        public Builder setMaried(boolean maried) {
            isMaried = maried;
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
                ", drivingLicense='" + drivingLicense + '\'' +
                ", isMaried=" + isMaried +
                '}';
    }
}
