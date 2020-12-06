package code._4_student_effort.DesignPatternsChallenge5;

public class AscBubleSort extends TemplateMethodBubleSort {

    @Override
    boolean numbersInCorrectOrder(Integer i1, Integer i2) {
        return (i1 < i2);
    }
}
