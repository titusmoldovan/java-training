package code._4_student_effort.Challange2;

import java.io.*;

public class Main {

    public static String selectOnlyCapitals(String line)
    {
        String result = new String("");
        for(int i = 0; i < line.length(); i++)
            if(line.charAt(i) >= 'A' && line.charAt(i) <= 'Z')
                result = result + line.charAt(i);
        return result;
    }

    public static void main(String args[]) {

        String[] finalMessage;
        String message = "";
        InputStream is = null;
        try {
            is = new FileInputStream("in2.txt");
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
                    message = message + selectOnlyCapitals(line);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        while (line != null);
        finalMessage = message.split("X");
        for(int i = 0; i < finalMessage.length;i++)
        {
            System.out.print(finalMessage[i] + " ");
        }

    }
}
