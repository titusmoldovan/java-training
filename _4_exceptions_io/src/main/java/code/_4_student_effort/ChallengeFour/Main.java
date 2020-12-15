package code._4_student_effort.ChallengeFour;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Input input = new Input("_4_exceptions_io/_test_files/in/input_number.txt");
        String message = input.getInput();

        Converter lcdConverter = new Converter(message);
        String lcdNumber = lcdConverter.getLCDNumber();

        System.out.println(lcdNumber);

        Output output = new Output("_4_exceptions_io/_test_files/out/output_number.txt");
        output.writeMessage(lcdNumber);

    }
}
