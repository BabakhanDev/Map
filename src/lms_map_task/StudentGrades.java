package lms_map_task;

import java.util.*;

public class StudentGrades {
    private Map<String,List<Integer>> studentGrades;
    public StudentGrades(){
        studentGrades = new TreeMap<>();
    }

    public void addGrade (String studentName, int grade){
        studentGrades.putIfAbsent(studentName,new ArrayList<>());
        studentGrades.get(studentName).add(grade);
    }
    public double calculateArifmetic (String studentName){
        List<Integer> grades = studentGrades.get(studentName);
        if (grades == null || grades.isEmpty()){
            System.out.println("Студент табылган жок же баалары жок.");
            return 0.0;
        }
        int sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public  void  printAllGrades (){
        for (Map.Entry<String, List<Integer>> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + " студенттин баалары: " + entry.getValue());
        }

        }
    }

