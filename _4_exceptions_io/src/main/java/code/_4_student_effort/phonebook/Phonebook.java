package code._4_student_effort.phonebook;

public class Phonebook {
    private final String phonebook;

    public Phonebook(String phonebook) {
        this.phonebook = phonebook;
    }

    public String findPhoneNumber(String name) {
        int index = phonebook.indexOf(name);
        StringBuilder phoneNumber = new StringBuilder();
        if (index != -1) {
            while (phonebook.charAt(index) != ' ')
                index++;
            index++;
            while (phonebook.charAt(index) != ' ') {
                phoneNumber.append(phonebook.charAt(index));
                index++;
            }
            return phoneNumber.toString();
        }
        return name + "'s number is not in the given phonebook";
    }
}
