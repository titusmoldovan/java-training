package code._4_student_effort.phonebook;

import code._4_student_effort.ReadFromFile;

public class Main {
    public static void main(String[] args) {
        ReadFromFile readFromFile = new ReadFromFile("_4_exceptions_io/_test_files/in/phonebook.txt");
        Phonebook phonebook = new Phonebook(readFromFile.getText());
        System.out.println(phonebook.findPhoneNumber("Abbey"));
        System.out.println(phonebook.findPhoneNumber("Abdul"));
    }
}
