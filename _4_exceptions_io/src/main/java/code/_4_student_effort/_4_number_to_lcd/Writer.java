package code._4_student_effort._4_number_to_lcd;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    private static final String FILE_NAME = "output.txt";
    private static FileWriter myWriter;

    public void writeDigit(int digit) throws IOException {
        myWriter.write(TypeMapper.compute(digit));
    }

    public static FileWriter getMyWriter() {
        return myWriter;
    }
}
