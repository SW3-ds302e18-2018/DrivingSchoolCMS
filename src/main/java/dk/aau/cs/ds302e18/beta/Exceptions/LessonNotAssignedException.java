package dk.aau.cs.ds302e18.beta.Exceptions;

public class LessonNotAssignedException extends Exception {
    public LessonNotAssignedException() {
        super("Lesson not assigned");
    }
}
