public class Students {
  String name;
  int admNo;
  int age;
  static int studentCount;
  
  Students(String name, int admNo, int age) {
    this.name = name;
    this.admNo = admNo;
    this.age = age;
    studentCount++;
  }
  public static int getStudentCount(){
    if (studentCount == 0) {
      System.out.println("There are no students admitted");
    }
    else if (studentCount == 1) {
      System.out.println("We have admitted " + studentCount + " student");
    }
    else {
      System.out.println("we have admitted " + studentCount + " students");
    }
    
    return studentCount;
    
  }
}