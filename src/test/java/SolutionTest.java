import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        int[] position = {1,2,3,4,7};
        int m = 3;
        int expected = 3;
        int actual = new Solution().maxDistance(position, m);

        Assert.assertEquals(expected, actual);
    }
}
