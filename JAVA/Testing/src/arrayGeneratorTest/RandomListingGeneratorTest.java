package arrayGeneratorTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;
import Practical_8.arrayGenerator.ArrayGenerator;
public abstract class RandomListingGeneratorTest extends ListingGeneratorTest {
    public void testRandom(int size) {
        ArrayGenerator generator = getGenerator(size);
        for (int index = 1; index < generator.getSize(); index++) {
            if (generator.getArray()[index-1]>generator.getArray()[index]) {
                return;
            }
        }
        fail("the array is sorted (this may not be an error, but if it keeps happening it almost certainly is)");
    }
    @Test
    public void testHundredRandom() {
        testRandom(100);
    }
    @Test
    public void testThousandRandom() {
        testRandom(1000);
    }
    @Test
    public void testMillionRandom() {
        testRandom(1000000);
    }
}