import com.king.BubbleSort;

/**
 * 冒泡排序
 */
public class BubbleSortTest {
    public static void main(String[] args) {

        int[] array={2,6,5,4,7,44,8,1,54,84,454,51,81,78,41,89478};
        BubbleSort sort = new BubbleSort();
        sort.bubble(array);
    }
}
