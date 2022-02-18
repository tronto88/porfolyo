package arrayGenerator;
import java.util.Arrays;
public class SimpleRandomListingGenerator extends RandomListingGenerator {
    public SimpleRandomListingGenerator(int size) {
        super(size);
    }
    protected void randomise() {
        int[] copy = new int[getArray().length];
        boolean[] used = new boolean[getArray().length];
        Arrays.fill(used, false);
        for (int index = 0; index < getArray().length; index++) {
            int randomIndex;
            do {
            randomIndex = getRandomIndex();
            } while (used[randomIndex]);
            copy[index] = getArray()[randomIndex];
            used[randomIndex] = true;  // note that this entry has been used
        }
        for (int index = 0; index < getArray().length; index++) {
            getArray()[index] = copy[index];
        }
    }
}
