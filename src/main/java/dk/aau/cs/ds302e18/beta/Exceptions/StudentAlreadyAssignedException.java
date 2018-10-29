package dk.aau.cs.ds302e18.beta.Exceptions;

public class StudentAlreadyAssignedException extends Exception {
    public StudentAlreadyAssignedException() {
        super("Student already assigned");
    }
}
