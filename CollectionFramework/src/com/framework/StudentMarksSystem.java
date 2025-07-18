//ArrayList(StudentManagementSystem)

package com.framework;
import java.util.*;

class Student {
    String name;
    int mark;

    Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
}

public class StudentMarksSystem {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== Student Marks Management System ====");
            System.out.println("1. Add Student & Mark");
            System.out.println("2. View All Students");
            System.out.println("3. Calculate Average Mark");
            System.out.println("4. Sort by Marks (Ascending)");
            System.out.println("5. Show Top Scorer");
            System.out.println("6. Show Bottom Scorer");
            System.out.println("7. Display Ranks (With Tie Handling)");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter mark: ");
                    int mark = sc.nextInt();
                    students.add(new Student(name, mark));
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        System.out.println("List of Students and Marks:");
                        for (Student s : students) {
                            System.out.println("Name: " + s.name + " | Mark: " + s.mark);
                        }
                    }
                    break;

                case 3:
                    if (students.isEmpty()) {
                        System.out.println("No marks to calculate average.");
                    } else {
                        int total = 0;
                        for (Student s : students) {
                            total += s.mark;
                        }
                        double avg = (double) total / students.size();
                        System.out.println("Average Mark: " + avg);
                    }
                    break;

                case 4:
                    if (students.isEmpty()) {
                        System.out.println("No students to sort.");
                    } else {
                        Collections.sort(students, Comparator.comparingInt(s -> s.mark));
                        System.out.println("Students sorted by marks (ascending).");
                    }
                    break;

                case 5:
                    if (students.isEmpty()) {
                        System.out.println("No data available.");
                    } else {
                        Student top = Collections.max(students, Comparator.comparingInt(s -> s.mark));
                        System.out.println("Top Scorer: " + top.name + " with " + top.mark + " marks.");
                    }
                    break;

                case 6:
                    if (students.isEmpty()) {
                        System.out.println("No data available.");
                    } else {
                        int minMark = students.stream()
                                              .mapToInt(s -> s.mark)
                                              .min()
                                              .getAsInt();

                        System.out.println("Bottom Scorer(s) with " + minMark + " marks:");

                        for (Student s : students) {
                            if (s.mark == minMark) {
                                System.out.println("- " + s.name);
                            }
                        }
                    }
                    break;

                case 7:
                    if (students.isEmpty()) {
                        System.out.println("No data to rank.");
                    } else {
                        ArrayList<Student> rankedList = new ArrayList<>(students);
                        rankedList.sort((a, b) -> b.mark - a.mark); // Descending

                        System.out.println("🏆 Student Rankings:");

                        int rank = 1;
                        int previousMark = -1;
                        int displayRank = 0;

                        for (int i = 0; i < rankedList.size(); i++) {
                            Student s = rankedList.get(i);

                            if (s.mark != previousMark) {
                                displayRank = rank;
                            }

                            System.out.println("Rank " + displayRank + ": " + s.name + " - " + s.mark + " marks");

                            previousMark = s.mark;
                            rank++;
                        }
                    }
                    break;

                case 8:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
            }

        } while (choice != 8);

        sc.close();
    }
}
