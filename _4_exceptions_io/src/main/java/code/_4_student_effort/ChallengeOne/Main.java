package code._4_student_effort.ChallengeOne;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        Input input = new Input("_4_exceptions_io/_test_files/in/phonebook.txt");

        //Usecase One:
//        input.getInput();
//        Map<String,String> listPhoneNumbers = input.getPhoneBook();
//
//        Phonebook phoneBook = new Phonebook("My phonebook",listPhoneNumbers);
//        phoneBook.getPhoneNumber("Abbey");

        //Usecase Two:
        Phonebook phonebook = new Phonebook("My phonebook");
        phonebook.getPhoneOptimized("Abbey", input.getScanner());


    }
}
