import com.king.InsertSort;

public class InsertTest {

    /**
     * 插入排序算法
     * @param args
     */
    public static void main(String[] args) {

        int[] array ={49,38,65,97,75,13,27,49};
        InsertSort sort = new InsertSort();
        sort.Insert(array);
    }
}
