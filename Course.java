package javaoop.exercises._1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Course {
    String courseName = "Develop";
    short maxStudent = 0;
    byte qualityRatingOutOf10 = 0;
    String courseDescription = "";
    boolean completedCourse = false;

    String [] peopleNames = {"Alice", "Aragon", "Alex"};
    Integer [] peopleAges = {23, 31, 38};
    List<String> studentNames = new ArrayList<>(Arrays.asList(peopleNames));
    List<Integer> studentAges = new ArrayList<>(Arrays.asList(peopleAges));
}
