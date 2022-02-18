package arrayGeneratorTest;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import Practical_8.arrayGenerator.ArrayGenerator;
import static org.junit.jupiter.api.Assertions.fail;
public abstract class ListingGeneratorTest extends ArrayGeneratorTest {
    public void testContents(int size) {
        ArrayGenerator generator = getGenerator(size);
        boolean[] inList = new boolean[generator.getSize()];
        Arrays.fill(inList, false);
        for (int i = 0; i < generator.getSize(); i++) {
            int entry = generator.getArray()[i];
            System.out.println("i: " + i + "entry: " + entry);
            if (entry < 0 || entry >= generator.getSize()) {
                fail("incorrect entry " + entry + " in array");
            }
            if (inList[entry]) { // if the entry has already been seen
                fail(entry + " occurs more than once in array");
            }
            inList[entry] = true;
        }
        for (int i = 0; i < inList.length; i++) {
            if (!inList[i]) { 
                fail(i + " is not in the array"); 
            }
        }
    }
    @Test
    public void testOneContents() {
        testContents(1);
    }
    @Test
    public void testTwoContents() {
        testContents(2);
    }
    @Test
    public void testFourContents() {
        testContents(4);
    }
    @Test
    public void testHundredContents() {
        testContents(100);
    }
    @Test
    public void testThousandContents() {
        testContents(1000);
    }
    @Test
    public void testMillionContents() {
        testContents(1000000);
    }
}