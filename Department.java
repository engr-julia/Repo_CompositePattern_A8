import java.util.*;

public class Department implements EducationalUnit {
    private String name;
    private List<EducationalUnit> units = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void add(EducationalUnit unit) {
        units.add(unit);
    }

    public void remove(EducationalUnit unit) {
        units.remove(unit);
    }

    @Override
    public void showDetails() {
        System.out.println("  Department: " + name);
        for (EducationalUnit unit : units) {
            unit.showDetails();
        }
    }

    @Override
    public int getStudentCount() {
        int total = 0;
        for (EducationalUnit unit : units) {
            total += unit.getStudentCount();
        }
        return total;
    }

    @Override
    public double getBudget() {
        double total = 0;
        for (EducationalUnit unit : units) {
            total += unit.getBudget();
        }
        return total;
    }
}