package code._4_student_effort.challenge1_leaders;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Leader {

    private List<Integer> listOfNumbers;

    public Leader(List<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    public List<Integer> getListOfNumbers() {
        return listOfNumbers;
    }

    public void setListOfNumbers(List<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    public List<Integer> getAllLeaders() {

        List<Integer> leaders = new ArrayList<>();
        for (int i = 0; i < listOfNumbers.size(); i++) {
            boolean isLeader = true;
            ListIterator<Integer> listIterator = listOfNumbers.listIterator(i + 1);
            while (listIterator.hasNext() && isLeader) {
                Integer currentNumber = listIterator.next();
                if (listOfNumbers.get(i) < currentNumber)
                    isLeader = false;
            }
            if (isLeader) {
                leaders.add(listOfNumbers.get(i));
            }
        }

        return leaders;
    }
}
