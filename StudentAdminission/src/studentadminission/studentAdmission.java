
package studentadminission;


 public class studentAdmission {
    private String stdName;
    private String stdGender;
    private int stdAge;
    private int stdGradeLevel; 
 

    public studentAdmission (String stdName, int stdAge, String stdGender, int stdGradeLevel){
        this.stdName = stdName;
        this.stdAge = stdAge;
        this.stdGender = stdGender;
        this.stdGradeLevel = stdGradeLevel;
    }
    public void displaystudentAccount() {
        System.out.println("===============================");
        System.out.println("Student Name: " + stdName);
        System.out.println("Age: " + stdAge);
        System.out.println("Gender: " + stdGender);
        System.out.println("Grade Level: " + stdGradeLevel);
        System.out.println("================================");
    }

}
 