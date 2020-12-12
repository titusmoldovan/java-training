package code._4_student_effort.Challange3;

import java.io.*;

public class Main {

    public static boolean isAnagram(String word, String potentialAnagram)
    {
        boolean ok = true;
        if(word.length() != potentialAnagram.length())
            return false;
        for(int i = 0; i < word.length(); i++)
        {
            ok = false;
            for(int j = 0; j < potentialAnagram.length(); j++)
                if(word.charAt(i) == potentialAnagram.charAt(j))
                    ok = true;
            if(!ok)
                return ok;
        }
        for(int i = 0; i < potentialAnagram.length(); i++)
        {
            ok = false;
            for(int j = 0; j < word.length(); j++)
                if(word.charAt(j) == potentialAnagram.charAt(i))
                    ok = true;
            if(!ok)
                return ok;
        }
        return true;
    }

    public static void main(String args[])
    {
        String word = "listen";
        String[] splitedLine;
        InputStream is = null;
        FileWriter outputStream = null;
        try {
            is = new FileInputStream("in3.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            outputStream = new FileWriter("output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader buf = new BufferedReader(new InputStreamReader(is));

        String line = null;
        do {
            try {
                line = buf.readLine();
                if(line != null)
                {
                    splitedLine = line.split(" ");
                    for(int i = 0; i < splitedLine.length; i++)
                    {
                        if(isAnagram(word,splitedLine[i]))
                        {
                            outputStream.write(splitedLine[i] + '\n');
                            System.out.println(splitedLine[i]);
                        }
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        while (line != null);
        try {
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
