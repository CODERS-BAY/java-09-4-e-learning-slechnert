import com.CODERS.BAY.Assignment;
import com.CODERS.BAY.Lecture;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LectureTest {

    @Test
    @DisplayName("A Lecture without any assignments returns null for the grade")
    public void testLectureWithoutAssignments() {
        // TODO implement
        Lecture testLecture = new Lecture("test", new ArrayList<Assignment>());
        assertEquals(null, testLecture.getGrade());
    }

    @Test
    @DisplayName("A Lecture with exactly one assignments returns the grade of that assignment")
    public void testLectureWithSingleAssignment() {
        // TODO implement
        Assignment testAssignment = new Assignment("testA", 100d);
        testAssignment.grade(100d);
        ArrayList<Assignment> testArray = new ArrayList<>();
        testArray.add(testAssignment);
        Lecture testLecture = new Lecture("testL", testArray);
        assertEquals(1, testLecture.getGrade());
    }

    @Test
    @DisplayName("A Lecture with many assignments returns the average grade of these assignments")
    public void testLectureWithMultipleAssignment() {
        // TODO implement
        Assignment testAssignment1 = new Assignment("testA1", 100d);
        Assignment testAssignment2 = new Assignment("testA2", 100d);
        Assignment testAssignment3 = new Assignment("testA3", 100d);

        testAssignment1.grade(100d);
        testAssignment2.grade(75d);
        testAssignment3.grade(49d);

        ArrayList<Assignment> testArray = new ArrayList<>();
        testArray.add(testAssignment1);
        testArray.add(testAssignment2);
        testArray.add(testAssignment3);

        Lecture testLecture = new Lecture("testL", testArray);

        assertEquals(3, testLecture.getGrade());
    }

}
