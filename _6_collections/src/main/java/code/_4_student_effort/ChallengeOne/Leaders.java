package code._4_student_effort.ChallengeOne;

import java.util.ArrayList;
import java.util.List;

public class Leaders<T extends Number> {

    public Leaders() {
    }

    public List getLeadersBySum(List<Integer> list) {
        List<Integer> ans = new ArrayList<>();
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            int rightSum = 0;
            for (int j = i + 1; j < size - 1; j++) {
                rightSum = rightSum + list.get(j);
            }
            if (list.get(i) > rightSum) {
                ans.add(list.get(i));
            }
        }
        ans.add(list.get(size - 1));
        return ans;
    }

    public List getLeadersByRank(List<Integer> list) {
        List<Integer> ans = new ArrayList<>();
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            boolean isLeader = true;
            int potentialLeader = list.get(i);
            for (int j = i + 1; j < size - 1; j++) {
                if (list.get(i) < list.get(j)) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                ans.add(potentialLeader);
            }
        }
        ans.add(list.get(size - 1));
        return ans;
    }

}
