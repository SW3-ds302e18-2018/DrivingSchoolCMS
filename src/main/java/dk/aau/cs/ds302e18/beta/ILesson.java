package dk.aau.cs.ds302e18.beta;

import dk.aau.cs.ds302e18.beta.Exceptions.NoStudentAssignedException;
import dk.aau.cs.ds302e18.beta.Exceptions.StudentAlreadyAssignedException;
import dk.aau.cs.ds302e18.beta.Exceptions.StudentNotAssignedException;

import java.util.ArrayList;
import java.util.Date;

interface ILesson {
    ArrayList<Student> getStudentList();
    Instructor getLessonInstructor();
    Date getLessonDate();
    String getLessonLocation();
    int getLessonType();
    boolean isSigned();
    void addStudent(Student student) throws StudentAlreadyAssignedException;
    void removeStudent(Student student) throws NoStudentAssignedException, StudentNotAssignedException;
}
