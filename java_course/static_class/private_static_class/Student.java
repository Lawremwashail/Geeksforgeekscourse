public class Student {
  String name;
  int admNo;
  int age;
  private static int studentCount;
  private static int totalAge;
  
  Student(String name, int admNo, int age) {
    this.name = name;
    this.admNo = admNo;
    this.age = age;
    studentCount++;
    totalAge += age;
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
  private static double calculateAvgAge() {
    if (studentCount == 0) return 0;
    return (double) totalAge / studentCount;
  }
  public static void printAvgAge() {
    System.out.println("Average age of the students is: " + calculateAvgAge());
  }
}