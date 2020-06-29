import com.CODERS.BAY.Assignment;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssignmentTest {

    @Test
    @DisplayName("An assignment that is graded with less than 50 percent of the points results in a Grade 5")
    public void testGradeBadAssignment() {
        Assignment testAssignment = new Assignment("test1", 100d);
        assertEquals(5, testAssignment.grade(40d));
    }

    @Test
    @DisplayName("An assignment that is graded with 100 percent of the points results in a Grade 1")
    public void testGradeGoodAssignment() {
        Assignment testAssignment = new Assignment("test2", 100d);
        assertEquals(1, testAssignment.grade(100d));
    }

    @Test
    @DisplayName("An assignment that is graded with more than 100 percent of the points results in a Grade 1")
    public void testGradeGreatAssignment() {
        Assignment testAssignment = new Assignment("test3", 100d);
        assertEquals(1, testAssignment.grade(111d));
    }

}
