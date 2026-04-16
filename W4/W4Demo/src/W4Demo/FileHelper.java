package W4Demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {
    public static List<Course> createCourseList(String filePath) {
        List<Course> courses = new ArrayList<>();
        String line;
        String splitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(splitBy);
                String courseNumber = data[0];
                String courseName = data[1];
                String room = data[2];
                String dayOfWeek = data[3];

                courses.add(new Course(courseNumber, courseName, room, dayOfWeek));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return courses;
    }
}
