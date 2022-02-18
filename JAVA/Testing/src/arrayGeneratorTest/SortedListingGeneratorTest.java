package arrayGeneratorTest;
import Practical_8.arrayGenerator.SortedListingGenerator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;
import Practical_8.arrayGenerator.ArrayGenerator;
class SortedListingGeneratorTest extends ListingGeneratorTest {
    protected ArrayGenerator getGenerator(int size) {
        return new SortedListingGenerator(size);
    }
    public void testSorted(int size) {
        ArrayGenerator generator = getGenerator(size);
        for (int index = 1; index < generator.getSize(); index++) {
            if (generator.getArray()[index-1]>=generator.getArray()[index]) {
                fail("Entries in listing are not sorted");
            }
        }
    }
    @Test
    public void testOneSorted() {
        testSorted(1);
    }
    @Test
    public void testTwoSorted() {
        testSorted(2);
    }
    @Test
    public void testFourSorted() {
        testSorted(4);
    }
    @Test
    public void testHundredSorted() {
        testSorted(100);
    }
    @Test
    public void testThousandSorted() {
        testSorted(1000);
    }
    @Test
    public void testMillionSorted() {
        testSorted(1000000);
    }
}