public class Main {
  public static void main(String[] args){
    Student.getStudentCount();
    Student student1 = new Student("Larry", 123, 24);
    Student.getStudentCount();
    Student student2 = new Student("Ambu", 234, 22);
    Student.getStudentCount();
    Student student3 = new Student("Essy", 346, 25);
    Student.getStudentCount();
    Student.printAvgAge();
    
  }
}