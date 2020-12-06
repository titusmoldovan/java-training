package code._4_student_effort.Challange3;

public class RealEstateAgentProxy {
    private Appartment[] appartments = new Appartment[50];
    private int nrOfAppartments;
    private int rentIndex;
    public RealEstateAgentProxy()
    {
        nrOfAppartments = 0;
        rentIndex = 0;
    }
    public void represent(Appartment appartment)
    {
        appartments[nrOfAppartments] = appartment;
        nrOfAppartments++;
    }
    public Appartment rent(Student student)
    {
        if(student.getName().charAt(0) == 'P')
            return null;
        else
            return appartments[rentIndex++];
    }
}
