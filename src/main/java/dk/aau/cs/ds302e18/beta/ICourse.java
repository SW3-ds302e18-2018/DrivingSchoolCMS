package dk.aau.cs.ds302e18.beta;

import dk.aau.cs.ds302e18.beta.Exceptions.*;

import java.util.ArrayList;
import java.util.Date;

interface ICourse {
    ArrayList<Student> getStudentList();
    ArrayList<Lesson> getLessonList();
    Instructor getCourseInstructor();
    String getCourseLocation();
    Date getStartDate();
    int getCourseId();
    void addStudent(Student student) throws StudentAlreadyAssignedException;
    void removeStudent(Student student) throws NoStudentAssignedException, StudentNotAssignedException;
    void addLesson(Lesson lesson) throws LessonAlreadyAssignedException;
    void removeLesson(Lesson lesson) throws NoLessonAssignedException, LessonNotAssignedException;
}
