package data_structures;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestResults {

    public static Map getOriginalGrades(){
        Map grades = new HashMap();
        grades.put("Angie", 24);
        grades.put("Johnny", 50);
        grades.put("Schlanda", 79);
        grades.put("Sean", 32);
        grades.put("Mark", 80);
        grades.put("Jeremy", 40);
        grades.put("Mary", 59);
        grades.put("Amber", 55);
        grades.put("Salah", 95);
        grades.put("Jason", 63);

        return grades;
    }

    public static Map getMakeUpGrades(){

        Map grades = new HashMap();
        grades.put("Angie", 97);
        grades.put("Johnny", 89);
        grades.put("Schlanda", 79);
        grades.put("Sean", 82);
        grades.put("Mark", 76);
        grades.put("Jeremy", 98);
        grades.put("Mary", 80);
        grades.put("Amber", 95);
        grades.put("Salah", 90);
        grades.put("Jason", 62);

        return grades;
    }

    /*
        Given map of original grades and makeup grades from
        the same students, create and print a map with each
        student's higher grade between the two tests
     */
    public static void main(String[] args) {
        Map originalGrades = getOriginalGrades();
        Map makeUpGrades = getMakeUpGrades();
        Map highestGrades = getHighestGrades(originalGrades, makeUpGrades);
        System.out.println(highestGrades);

    }

    /* Between 2 grade maps with the SAME PEOPLE, return a map where each
        person has the highest grade from either map
     */
    public static Map getHighestGrades(Map gradeMap1, Map gradeMap2) {
        Map highestGrades = new HashMap();
        Set<Object> people = gradeMap1.keySet();
        people.forEach( person -> {
            int originalGrade = (Integer)gradeMap1.get(person);
            int makeUpGrade = (Integer)gradeMap2.get(person);
            highestGrades.put(person, Math.max(originalGrade, makeUpGrade));
        });
        return highestGrades;
    }
}