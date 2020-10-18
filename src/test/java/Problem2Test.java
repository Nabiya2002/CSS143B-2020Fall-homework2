import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Problem2Test {

    private boolean compareArray(int[] a1, int[] a2, int size) {
        for (int i = 0; i < size; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void myTest() {
        int[] array = {0, 0, 0, 1, 1, 2, 2, 3, 4, 5, 5};
        int[] a2 = {0, 1, 2, 3, 4, 5};

        int actualLength = Problem2.remove(array);
        System.out.println(Arrays.toString(array));
        assertEquals(6, actualLength);

        assertTrue(compareArray(array, a2, actualLength));
    }

    @Test
    public void testRemoveDuplicates() {
        int[][] inputs = {
                // DO NOT REMOVE OR CHANGE THE GIVEN TEST CASES!
                {0, 0, 1, 1, 1, 2, 2, 4, 4, 6},
                {0, 2, 2, 2, 4, 4, 4, 6},
                {1},
                {1, 2, 3},
                {-3, -3, -3},
                {10, 10, 12}
        };

        int[][] expects = {
                {0, 1, 2, 4, 6},
                {0, 2, 4, 6},
                {1},
                {1, 2, 3},
                {-3},
                {10, 12}
        };

        assertEquals(expects.length, inputs.length);

        for (int i = 0; i < inputs.length; i++) {
            int actualLength = Problem2.remove(inputs[i]);
            String caseId = "case " + i;
            assertEquals(caseId + " output length FAILED", expects[i].length, actualLength);
            for (int j = 0; j < actualLength; j++) {
                assertEquals(caseId + " element comparison FAILED", expects[i][j], inputs[i][j]);
            }
        }
    }
}
