package code._4_student_effort.Challange6;

public class Person {
    private String name;
    private String job;
    private String university;
    private String drivingLicence;
    private boolean isMarried;
    public Person(Builder builder)
    {
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicence = builder.drivingLicence;
        this.isMarried = builder.isMarried;
    }

    public String getName()
    {
        return name;
    }

    public String getJob()
    {
        return job;
    }

    public String getUniversity()
    {
        return university;
    }

    public String getDrivingLicence()
    {
        return drivingLicence;
    }

    public boolean getIsMarried()
    {
        return isMarried;
    }

    public static class Builder {
        private String name;
        private String job;
        private String university;
        private String drivingLicence;
        private boolean isMarried;

        public Builder(String name)
        {
            this.name = name;
        }
        public Builder withJob(String job)
        {
            this.job = job;
            return this;
        }
        public Builder withUniversity(String university)
        {
            this.university = university;
            return this;
        }

        public Builder withDrivingLicence(String drivingLicence)
        {
            this.drivingLicence = drivingLicence;
            return this;
        }
        public Builder withIsMarried(boolean isMarried)
        {
            this.isMarried = isMarried;
            return this;
        }

        public Person make()
        {
            return new Person(this);
        }
    }

}
