package searcher;
import java.util.Arrays;
public class SimpleSearcher extends Searcher {
    public SimpleSearcher(int[] array, int k) throws IndexingError {
        super(array, k);
    }
    public int findElement() throws IndexingError {
        int[] array = getArray();
        int k = getIndex();
        if (k <= 0 || k > array.length) {
            throw new IndexingError();
        }
        Arrays.sort(array);
        return array[array.length - k];
    }
}
