package dk.aau.cs.ds302e18.beta.Exceptions;

public class LessonAlreadyAssignedException extends Exception {
    public LessonAlreadyAssignedException() {
        super("Lesson already assigned");
    }
}
