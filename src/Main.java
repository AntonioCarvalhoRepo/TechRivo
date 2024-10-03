//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] students = {"Student One 6 7 8, Student Two 3 4 5"};

        System.out.println(averageGrades(students));
    }

    private static String averageGrades(String[] students) {
        String[] stringOfStudents = students[0].split(", ");

        String[] student1 = stringOfStudents[0].split(" ");
        String name1 = student1[0] + " " + student1[1];
        List<Integer> grades1 = new ArrayList<>();
        for (int i = 2; i < student1.length; i++) {
            grades1.add(Integer.parseInt(student1[i]));
        }

        String[] student2 = stringOfStudents[1].split(" ");
        String name2 = student2[0] + " " + student2[1];
        List<Integer> grades2 = new ArrayList<>();
        for (int i = 2; i < student1.length; i++) {
            grades2.add(Integer.parseInt(student2[i]));
        }

        long avg1 = Math.round(grades1.stream().mapToDouble(a -> a).average().getAsDouble());
        long avg2 = Math.round(grades2.stream().mapToDouble(a -> a).average().getAsDouble());

        return name1 + " " + avg1 + "," + name2 + " " + avg2;
    }
}
