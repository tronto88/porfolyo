package arrayGenerator;
public class CleverRandomListingGenerator extends RandomListingGenerator {
    public CleverRandomListingGenerator(int size) {
        super(size);
    }
    protected void randomise() {
        int[] array = getArray();
        for (int index = 0; index < array.length; index++) {
        int randomIndex = getRandomIndex();
        int randomEntry = array[randomIndex];
        array[randomIndex] = array[index];
        array[index] = randomEntry;
        }
    }
}
