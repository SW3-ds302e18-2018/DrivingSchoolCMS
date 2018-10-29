package dk.aau.cs.ds302e18.beta.Exceptions;

public class NoLessonAssignedException extends Exception {
    public NoLessonAssignedException() {
        super("No lesson(s) assigned");
    }
}
