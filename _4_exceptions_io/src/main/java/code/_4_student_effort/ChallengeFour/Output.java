package code._4_student_effort.ChallengeFour;

import java.io.*;

public class Output {

    private static BufferedWriter writer;
    private static String outputPath;

    public Output(String outputPath) {
        this.outputPath = outputPath;
    }

    public void writeMessage(String message) throws IOException {
        getWriter().write(message);
        if (getWriter() != null) {
            getWriter().close();
        }
    }

    public static BufferedWriter getWriter() throws IOException {
        if (writer == null) {
            synchronized (BufferedWriter.class) {
                if (writer == null) {
                    writer = new BufferedWriter(new FileWriter(outputPath));
                }
            }
        }
        return writer;
    }
}
