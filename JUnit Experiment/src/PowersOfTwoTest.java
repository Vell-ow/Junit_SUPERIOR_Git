import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowersOfTwoTest {

    int[] tests = {1, 5, 57, 32};
    boolean[] results = {true, false, false, true};

    @Test
    void testNumbers()
    {
        assertEquals(results[0], PowersOfTwo.isPowerOfTwo(tests[0]));
    }

    public PowersOfTwoTest() {
        super();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "PowersOfTwoTest{}";
    }
}