public class University {
    String universityName;

    University(String name) {
        this.universityName = name;
    }

    // Inner class - Department
    class Department {
        String deptName;
        String deptCode;

        Department(String deptName, String deptCode) {
            this.deptName = deptName;
            this.deptCode = deptCode;
        }

        void displayDepartmentDetails() {
            System.out.println("\n=== Department Details ===");
            System.out.println("University: " + universityName);
            System.out.println("Department Name: " + deptName);
            System.out.println("Department Code: " + deptCode);
        }
    }

    // Inner class - Student
    class Student {
        String studentName;
        int rollNo;

        Student(String studentName, int rollNo) {
            this.studentName = studentName;
            this.rollNo = rollNo;
        }

        void displayStudentDetails() {
            System.out.println("\n=== Student Details ===");
            System.out.println("University: " + universityName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Roll Number: " + rollNo);
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create outer class object
        University uni = new University("Amrita University");

        // Create inner class objects using the outer class object
        University.Department dept = uni.new Department("Computer Science", "CSE101");
        University.Student student = uni.new Student("Riya Kapoor", 2025123);

        // Display info
        dept.displayDepartmentDetails();
        student.displayStudentDetails();
    }
}
