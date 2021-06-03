package code._4_student_effort._4_number_to_lcd;

public class TypeMapper {

    static String compute(int digit) {
        switch (digit) {
            case 0:
                return "0000001";
            case 1:
                return "1001111";
            case 2:
                return "0010010";
            case 3:
                return "0000110";
            case 4:
                return "1001100";
            case 5:
                return "0100100";
            case 6:
                return "0100000";
            case 7:
                return "0001111";
            case 8:
                return "0000000";
            case 9:
                return "0000100";
            default:
                return "";
        }
    }
}
