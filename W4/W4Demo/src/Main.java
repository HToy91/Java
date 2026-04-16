import W4Demo.Course;
import W4Demo.FileHelper;
import java.text.MessageFormat;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       String filePath =
               "/Users/josevargasfigueroa/Documents/Java/W4/W4Demo/src/W4Demo/SampleData.csv";
       List<Course> courses = FileHelper.createCourseList(filePath);

       for (Course course: courses) {
          print(course);
       }
    }

    public static void print(Course course) {
        System.out.println(MessageFormat.format("{0} | {1} | {2} | {3}",
                course.courseNumber,
                course.dayOfWeek,
                course.room,
                course.courseName
                ));
    }
}