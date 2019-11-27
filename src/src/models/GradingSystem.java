package models;

import java.util.ArrayList;

public class GradingSystem extends ProfessorsTool{
    private ArrayList<Course> activeCourses;
    private ArrayList<CourseTemplate> courseTemplates;

    public GradingSystem(Professor ownerProfessor, ArrayList<Course> activeCourses, ArrayList<CourseTemplate> courseTemplates) {
        super(ownerProfessor);
        this.activeCourses = activeCourses;
        this.courseTemplates = courseTemplates;
    }

    public ArrayList<Course> getActiveCourses() {
        return activeCourses;
    }

    public ArrayList<CourseTemplate> getCourseTemplates() {
        return courseTemplates;
    }

    public void addNewCourse(String name, String semester, String year, ArrayList<Student> students){
        CourseSection courseSection = new CourseSection("First section", students);
        ArrayList<CourseSection> courseSections = new ArrayList<CourseSection>();
        courseSections.add(courseSection);
        CourseTemplate newCourseTemplate = new CourseTemplate(name, semester, year);
        Course newCourse = new Course(name, semester, year, courseSections, newCourseTemplate);
        
        courseTemplates.add(newCourseTemplate);
        activeCourses.add(newCourse);
    }
}