package dk.aau.cs.ds302e18.beta;

import dk.aau.cs.ds302e18.beta.Exceptions.NoStudentAssignedException;
import dk.aau.cs.ds302e18.beta.Exceptions.StudentAlreadyAssignedException;
import dk.aau.cs.ds302e18.beta.Exceptions.StudentNotAssignedException;

import java.util.ArrayList;
import java.util.Date;

//mangler notification
class Lesson implements ILesson {
    private ArrayList<Student> studentList;
    private Instructor lessonInstructor;
    private Date lessonDate;
    private String lessonLocation;
    //final so that lesson type cannot be changed once it's been set.
    //This is to prevent lessons from changing type after compeletion.
    //It lesson needs to be changed, a new lesson must be created.
    private final byte lessonType;
    private boolean isSigned;
    private final double lessonID;


    //Creating constructors
    public Lesson(ArrayList<Student> studentList, Instructor lessonInstructor, Date lessonDate, String lessonLocation, byte lessonType, double lessonID) {
        studentList.addAll(studentList);
        this.lessonInstructor = lessonInstructor;
        this.lessonDate = lessonDate;
        this.lessonLocation = lessonLocation;
        this.lessonType = lessonType;
        this.lessonID = lessonID;
    }

    public Lesson(Student student, Instructor lessonInstructor, Date lessonDate, String lessonLocation, byte lessonType, double lessonID) {
        studentList.add(student);
        this.lessonInstructor = lessonInstructor;
        this.lessonDate = lessonDate;
        this.lessonLocation = lessonLocation;
        this.lessonType = lessonType;
        this.lessonID = lessonID;
    }


    //Creating getters
    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public Instructor getLessonInstructor() {
        return lessonInstructor;
    }

    public Date getLessonDate() {
        return lessonDate;
    }

    public String getLessonLocation() {
        return lessonLocation;
    }

    public int getLessonType() {
        return lessonType;
    }

    public boolean isSigned() {
        return isSigned;
    }

    public double getLessonID() {
        return lessonID;
    }


    //Creating setters
    public void setLessonInstructor(Instructor lessonInstructor) {
        this.lessonInstructor = lessonInstructor;
    }

    public void setLessonDate(Date lessonDate) {
        this.lessonDate = lessonDate;
    }

    public void setLessonLocation(String lessonLocation) {
        this.lessonLocation = lessonLocation;
    }

    public void setSigned(boolean signed) {
        isSigned = signed;
    }


    //Functions to add and remove students to a lesson
    public void addStudent(Student student) throws StudentAlreadyAssignedException {
        if(studentList.contains(student)) {
            try {
                throw new StudentAlreadyAssignedException(); //throw already in array exception
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else {
            studentList.add(student);
        }
    }

    public void removeStudent(Student student) throws NoStudentAssignedException, StudentNotAssignedException {
        if(studentList.isEmpty()) {
            try {
                throw new NoStudentAssignedException(); //throw empty exception

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if(!studentList.contains(student)) {
            try {
                throw new StudentNotAssignedException(); //throw not in array exception
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else {
            studentList.remove(student);
        }
    }
}
