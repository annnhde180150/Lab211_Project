package Week4.StudentManagement;

import java.util.*;

public class StudentManager {
    private ArrayList<Student> students;
    private Scanner scanner;
    public StudentManager() {

    }
    public StudentManager(Scanner scanner) {
        ArrayList students = new ArrayList();
        students.add(new Student("DE001", "Nguyen Van A", "SP25", "Java"));
        students.add(new Student("DE002", "Tran Thi B", "FA25", "Java"));
        students.add(new Student("DE003", "Le Van C", "SU25", ".Net"));
        this.students = students;
        this.scanner = scanner;
    }
    public void createStudent() {
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Semester: ");
        String semester = scanner.nextLine();
        String courseName = chooseCourse();
        Student newStudent = new Student(id, name, semester, courseName);
        students.add(newStudent);
    }
    private String chooseCourse() {
        while (true) {
            System.out.print("Enter Course (Java/.Net/C/C++): ");
            String course = scanner.nextLine();
            if (course.equalsIgnoreCase("Java") || course.equalsIgnoreCase(".Net") || course.equalsIgnoreCase("C/C++")) {
                return course;
            }
            System.out.println("Invalid course. Choose again.");
        }
    }
    public void findAndSort(){
        System.out.print("Enter name to search: ");
        String keyword = scanner.nextLine().toLowerCase();
        ArrayList<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (s.getName().toLowerCase().contains(keyword)) {
                result.add(s);
            }
        }
        result.sort(Comparator.comparing(Student::getName));

        for (Student s : result) {
            System.out.println(s);
        }
    }
    public void updateOrDelete() {
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        Student found = null;

        for (Student s : students) {
            if (s.getId().equals(id)) {
                found = s;
                break;
            }
        }

        if (found == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.print("Do you want to update (U) or delete (D)? ");
        String action = scanner.nextLine();

        if (action.equalsIgnoreCase("U")) {
            System.out.print("Enter new Name: ");
            found.setName(scanner.nextLine());
            System.out.print("Enter new Semester: ");
            found.setSemester(scanner.nextLine());
            found.setCourseName(chooseCourse());
        } else if (action.equalsIgnoreCase("D")) {
            students.remove(found);
            System.out.println("Student deleted.");
        }
    }

    public void report() {
        Map<String, Map<String, Integer>> report = new HashMap<>();

        for (Student s : students) {
            String studentKey = s.getName() + " (" + s.getId() + ")";
            report.putIfAbsent(studentKey , new HashMap<>());
            Map<String, Integer> courses = report.get(studentKey);
            courses.put(s.getCourseName(),courses.getOrDefault(s.getCourseName(),0)+1);
        }

        for(String name : report.keySet()) {
            for (Map.Entry<String, Integer> entry : report.get(name).entrySet()){
                System.out.println(name + "|" + entry.getKey() + "|" +entry.getValue());
            }
        }
    }
}
