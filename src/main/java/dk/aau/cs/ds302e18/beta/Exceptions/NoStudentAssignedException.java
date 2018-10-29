package dk.aau.cs.ds302e18.beta.Exceptions;

public class NoStudentAssignedException extends Exception {
    public NoStudentAssignedException() {
        super("No student(s) assigned");
    }
}
