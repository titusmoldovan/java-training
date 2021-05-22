package code._4_student_effort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Challenge4 {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        int n, noPairs = 0;
        MyScanner sc = new MyScanner();
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            array.add(sc.nextInt());
        }

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (array.get(i) + array.get(j) + array.get(k) == 0
                                        && array.get(i) != 0
                                        && array.get(j) != 0
                                        && array.get(k) != 0) {
                        array.set(i, 0);
                        array.set(j, 0);
                        array.set(k, 0);
                        noPairs++;
                    }
                }
            }
        }
        System.out.println(noPairs);
    }

    static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}

