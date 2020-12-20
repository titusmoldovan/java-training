package code._4_student_effort.ChallengeFive;

public class SortingChecker {
    public SortingChecker() {
    }

    protected <T extends Comparable> int getSortingDirection(T[] list) {
        int direction = 0;
        for (int i = 0; i < list.length - 1; i++) {
            direction = list[i].compareTo(list[i + 1]);
            if (direction != 0)
                break;
        }
        return direction;

    }

    protected <T extends Comparable> boolean isSorted(T[] list, int direction) {
        if (list.length > 1) {
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i].compareTo(list[i + 1]) == 0) {
                    continue;
                }
                if (list[i].compareTo(list[i + 1]) != direction) {
                    throw new ArrayNotSortedException("list is not sorted!");
                }
            }
        }
        return true;

    }
}
