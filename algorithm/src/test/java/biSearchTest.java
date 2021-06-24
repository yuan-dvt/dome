import com.king.BinarySearch;

/**
 * 二分查找
 */
public class biSearchTest {
    public static void main(String[] args) {
        int[] array = {4,15,16,18,26,41,49,54,78,95,244};
        int a = 78 ;

        BinarySearch binarySearch = new BinarySearch();
        int search = binarySearch.biSearch(array,a);
        System.out.println(search);
    }
}
