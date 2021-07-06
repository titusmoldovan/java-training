package projectOne.exceptions;

public class TypeNotFoundException extends Exception {

    public TypeNotFoundException () { }

    public TypeNotFoundException (String message) {
        super(message);
    }
}
