public class week9_4 {
    String universityName;

    week9_4(String universityName) {
        this.universityName = universityName;
    }
    class Department {
        String deptName;
        String deptCode;

        Department(String deptName, String deptCode) {
            this.deptName = deptName;
            this.deptCode = deptCode;
        }
       void displayDepartmentDetails() {
            System.out.println("University Name: " + universityName);
            System.out.println("Department Name: " + deptName);
            System.out.println("Department Code: " + deptCode);
        }
    }
   class Student {
        String studentName;
        int rollNumber;

        Student(String studentName, int rollNumber) {
            this.studentName = studentName;
            this.rollNumber = rollNumber;
        }
        void displayStudentDetails() {
            System.out.println("University Name: " + universityName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Roll Number: " + rollNumber);
        }
    }

    public static void main(String[] args) {
        week9_4 university = new week9_4("AMRITA VISHWA VIDYAPEETHAM");

        week9_4.Department department = university.new Department("Computer Science", "CSE011");
        week9_4.Student student = university.new Student("B.Pranathi", 24022);

        department.displayDepartmentDetails();
        System.out.println();
        student.displayStudentDetails();
    }
}
