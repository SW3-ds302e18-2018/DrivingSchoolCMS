package dk.aau.cs.ds302e18.beta;

import dk.aau.cs.ds302e18.beta.Exceptions.*;

import java.util.ArrayList;
import java.util.Date;

class Course implements ICourse {
    private ArrayList<Student> studentList;
    private ArrayList<Lesson> lessonList;
    private Instructor courseInstructor;
    private String courseLocation;
    private Date startDate;
    private int courseID;

    public Course(ArrayList<Student> studentList, Instructor courseInstructor, Date startDate, String courseLocation, int courseID) {
        this.studentList = studentList;
        this.lessonList = new ArrayList<>();
        this.courseInstructor = courseInstructor;
        this.startDate = startDate;
        this.courseLocation = courseLocation;
        switch(courseID) {
            case 100: createCourseA();
            break;
            case 200: createCourseB();
            break;
            case 300: createCourseBE();
            break;
        }
    }

    //LessonID not generated dynamically. This is done by the database.
    //LessonType is 2 for theory lesson. This is not dynamically allocated.
    private void createCourseA() {
        //29 teori timer til kørekort A
        for(int i = 0; i < 29; i++) {
            lessonList.add(new Lesson(studentList, courseInstructor, startDate, courseLocation, (byte) 2, 100));
        }
    }

    private void createCourseB() {
        //29 teori timer til kørekort B
        for(int i = 0; i < 29; i++) {
            lessonList.add(new Lesson(studentList, courseInstructor, startDate, courseLocation, (byte) 2, 200));
        }
    }

    private void createCourseBE() {
        //4 teori timer til kørekort BE
        for(int i = 0; i < 3; i++) {
            lessonList.add(new Lesson(studentList, courseInstructor, startDate, courseLocation, (byte) 2, 300));
        }
    }


    //Creating getters
    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public ArrayList<Lesson> getLessonList() {
        return lessonList;
    }

    public Instructor getCourseInstructor() {
        return courseInstructor;
    }

    public String getCourseLocation() {
        return courseLocation;
    }

    public Date getStartDate() {
        return startDate;
    }

    public int getCourseId() {
        return courseID;
    }


    //Creating Setters
    public void setCourseInstructor(Instructor courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    public void setCourseLocation(String courseLocation) {
        this.courseLocation = courseLocation;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setCourseId(int courseId) {
        this.courseID = courseId;
    }


    //Functions to add and remove students and lessons to the course.
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

    public void addLesson(Lesson lesson) throws LessonAlreadyAssignedException {
        if(lessonList.contains(lesson)) {
            try {
                throw new LessonAlreadyAssignedException(); //throw already in array exception
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else {
            lessonList.add(lesson);
        }
    }

    public void removeLesson(Lesson lesson) throws NoLessonAssignedException, LessonNotAssignedException {
        if(lessonList.isEmpty()) {
            try {
                throw new NoLessonAssignedException(); //throw empty exception
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if(!lessonList.contains(lesson)) {
            try {
                throw new LessonNotAssignedException(); //throw not in array exception
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else {
            lessonList.remove(lesson);
        }
    }


}
