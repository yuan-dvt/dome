package com.king;

/**
 * @author yuan
 *  插入排序算法
 */
public class InsertSort {
    public void Insert(int[] array){

        for (int i = 0; i < array.length; i++) {
            //获取到要插入的数据
            int input = array[i];

            //要比较的数据(准备和前一个数比较)
            int index = i -1;

            //当插入的数小于要比较的数交换顺序
            while (index >= 0 && input < array[index]){

                //把要比较的数往后挪一
                array[index + 1] = array[index];
                index --;
            }

            //把要插入放在合适位置（比较的数后面一位）
            array[index + 1] = input;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
