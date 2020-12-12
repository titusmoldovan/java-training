package code._4_student_effort.Challange1;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        String[] info;

        InputStream is = null;
        try {
            is = new FileInputStream("in.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader buf = new BufferedReader(new InputStreamReader(is));

        String line = null;
        do {
            try {
                line = buf.readLine();
                if(line != null)
                {
                    info = line.split(" ");
                    if(info[0].equals("Abbey")  || info[0].equals("Abdul"))
                        System.out.println(info[1]);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        while (line != null);

    }
}
