/*: Design a class Student with private fields studentId, name, and marks.
Implement methods to get and set these fields. Create a method calculateGrade() that
returns "A" if marks are greater than or equal to 90, "B" for marks above 75, and "C" for
marks below 75. Instantiate a Student object and print the grade */
class encapsulation{
  private int studentId;
  private String name;
  private int marks;
  public int getStudentId(){
      return studentId;
  }
  public void setStudentId(int studentId){
    this.studentId = studentId;
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  
  }
  public int getMarks(){
    return marks;
  }
  public void setMarks(int marks){
    this.marks = marks;
  }
  public String calculateGrade(){
    if(marks>=90)
      return "A";
      else if(marks>=75)
      return "B";
      else
      return "C";
  }
}
public class Students {
    public static void main(String[] args) {
        encapsulation student = new encapsulation();
        student.setStudentId(1);
        student.setName("Greyu");
        student.setMarks(10);
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Name: " + student.getName());
        System.out.println("Marks: " + student.getMarks());
        System.out.println("Grade: " + student.calculateGrade());
    }
}
