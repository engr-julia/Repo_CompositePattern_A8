public class NewEraOrg {
    public static void main(String[] args) {

        // Create College
        College engineering = new College("College of Engineering");

        // Create Departments
        Department cs = new Department("Computer Science");
        Department it = new Department("Information Technology");

        // Create Teachers
        Teacher t1 = new Teacher("Mr. Cruz", "Algorithms", 50000);
        Teacher t2 = new Teacher("Ms. Reyes", "Networking", 45000);

        // Create Students
        Student s1 = new Student("Juan", "2024-001", 20000);
        Student s2 = new Student("Maria", "2024-002", 20000);
        Student s3 = new Student("Pedro", "2024-003", 20000);

        // Build Structure
        cs.add(t1);
        cs.add(s1);
        cs.add(s2);

        it.add(t2);
        it.add(s3);

        engineering.add(cs);
        engineering.add(it);

        // Display Details
        System.out.println();
        System.out.println("=== UNIVERSITY STRUCTURE ===");
        System.out.println();
        engineering.showDetails();

        // Total Students
        System.out.println("\nTotal Students: " + engineering.getStudentCount());

        // Total Budget
        System.out.println("Total Budget: " + engineering.getBudget());
    }
}