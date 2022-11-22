import org.example.Solution;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SolutionTest {

    Solution solution;
    int num;

    @BeforeAll
    void setup(){
        solution = new Solution();
    }

    @Test
    public void GivenOneReturnOne(){

        num = 1;

        assertEquals(1, solution.numberOfSteps(num));
    }

    @Test
    public void GivenTwoReturnTwo(){

        num = 2;

        assertEquals(2, solution.numberOfSteps(num));
    }

    @Test
    public void GivenSixReturnFour(){

        num = 6;

        assertEquals(4, solution.numberOfSteps(num));
    }
}
