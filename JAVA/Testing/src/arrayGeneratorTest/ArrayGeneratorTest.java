package arrayGeneratorTest;
import org.junit.jupiter.api.*;
import Practical_8.arrayGenerator.ArrayGenerator;
import static org.junit.jupiter.api.Assertions.assertEquals;
abstract class ArrayGeneratorTest {
    private long testStart, testEnd;
    private static long testTotal, testCount;
    @BeforeEach
    public void setUp() {
        testStart = System.nanoTime();
        testCount++;
    }
    @AfterEach
    public void tearDown(TestInfo testInfo) {
        testEnd = System.nanoTime();
        long timeInMicros = (testEnd - testStart) / 1000;
        testTotal += timeInMicros;
        System.out.println("Test " + testInfo.getDisplayName() +
                " took " + timeInMicros + " microseconds");
    }
    @BeforeAll
    public static void setUpBeforeAll() {
        testTotal = 0;
        testCount = 0;
        System.out.println("Tests initialised successfully!");
    }
    @AfterAll
    public static void tearDownAfterAll() {
        System.out.println("Average time to run " +  testCount +
                " tests is " + (testTotal/testCount) + " microseconds");
    }
    protected abstract ArrayGenerator getGenerator(int size);
    public void testSize(int size) {
        ArrayGenerator generator = getGenerator(size);
        assertEquals(size, generator.getSize(), "Generator has the wrong size");
        assertEquals(size, generator.getArray().length, "Generator does not create arrays of the wight size");
    }
    @Test
    public void testOneSize() {
        testSize(1);
    }
    @Test
    public void testTwoSize() {
        testSize(2);
    }
    @Test
    public void testFourSize() {
        testSize(4);
    }
    @Test
    public void testHundredSize() {
        testSize(100);
    }
    @Test
    public void testThousandSize() {
        testSize(1000);
    }
    @Test
    public void testMillionSize() {
        testSize(1000000);
    }
}