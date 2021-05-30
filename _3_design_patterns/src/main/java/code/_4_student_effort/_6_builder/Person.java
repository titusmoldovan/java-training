package code._4_student_effort._6_builder;

public class Person {
    private String name;
    private String job;
    private String university;
    private String drivingLicence;
    private boolean isMarried;
    private Person(Builder builder){
        this.name=builder.name;
        this.job=builder.job;
        this.university=builder.university;
        this.drivingLicence=builder.drivingLicence;
        this.isMarried=builder.isMarried;
    }
    @Override
    public String toString(){
        return "Person: "+this.name+"; job:"+this.job+"; university:"+this.university+"; driving licence:"+this.drivingLicence+" ; is married:"+this.isMarried;
    }


    public static class Builder{
        private String name; //required parameter
        private String job; //optional parameter
        private String university; //optional parameter
        private String drivingLicence; //optional parameter
        private boolean isMarried; //optional parameter
        public Builder(String name){
            this.name=name;
        }
        public Builder hasJob(String job){
            this.job=job;
            return this;
        }
        public Builder setDrivingLicence(String drivingLicence){
            this.drivingLicence=drivingLicence;
            return this;
        }
        public Builder setUniversity(String university){
            this.university=university;
            return this;
        }
        public Builder isPersonMarried(boolean isMarried){
            this.isMarried=isMarried;
            return this;
        }
        public Person build(){
            return new Person(this);
        }
    }
}
