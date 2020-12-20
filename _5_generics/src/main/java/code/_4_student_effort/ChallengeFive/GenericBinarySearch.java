package code._4_student_effort.ChallengeFive;

public class GenericBinarySearch {
    private SortingChecker sortChecker;

    public GenericBinarySearch() {
        this.sortChecker = new SortingChecker();
    }

    public <T extends Comparable> boolean binarySearch(T[] list, T element) throws ArrayNotSortedException {
        int direction = sortChecker.getSortingDirection(list);
        if (sortChecker.isSorted(list, direction)) {
            return binarySearch(list, element, direction, 0, list.length - 1);
        } else {
            return false;
        }

    }

    private <T extends Comparable> boolean binarySearch(T[] list, T element, int direction, int start, int end) {
        int midIndex = (start + end) / 2;
        if (element.equals(list[midIndex])) {
            return true;
        } else if (end == start) {
            return false;
        } else if (compareElementSameSign(element, list[midIndex], direction)) {
            return binarySearch(list, element, direction, start, midIndex);
        } else {
            return binarySearch(list, element, direction, midIndex + 1, end);
        }
    }

    private <T extends Comparable> boolean compareElementSameSign(T element, T mid, int direction) {
        return Math.signum(element.compareTo(mid)) == Math.signum(direction);
    }

}
