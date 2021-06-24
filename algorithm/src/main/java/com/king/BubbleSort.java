package com.king;

/**
 * @author yuan
 * 冒泡排序
 */
public class BubbleSort {

    public static void bubble(int[] a) {
        //一层循环控制
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                //前面的数字大于后面的数字就交换
                if (a[j + 1] < a[j]) {
                    //交换 a[j-1]和 a[j]
                    int temp;
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i : a) {
            System.out.println(i);
        }

    }
}
