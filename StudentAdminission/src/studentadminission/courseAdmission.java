
package studentadminission;


public class courseAdmission {
    private String courseName;
    private String courseDes;
    private int courseCode;
    
    
    public void courseAdmission(String courseName, String courseDes, int courseCode) {
        this.courseName = courseName;
        this.courseDes = courseDes;
        this.courseCode = courseCode;
    }
    
    public void displayCourseAdmission(){
        System.out.println("===============================");
        System.out.println("Student Course: " + courseName);
        System.out.println("Course Description: " + courseDes);
        System.out.println("Course Coce: " + courseCode);
                
    }
}
