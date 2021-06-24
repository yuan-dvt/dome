package com.king;

/**
 * 二分查找(有序的)
 *
 * @author yuan
 */
public class BinarySearch {
    public static int biSearch(int[] array, int a) {

        //中间数的索引
        int middle;
        //数组长度
        int lo = array.length-1;

        //设置开始位置
        int start = 0;

        //判断最新的数据第一个要小于最后一各数的位置
        while(start < lo){

            //中间位置
            middle = (lo + start)/2;
            //当前中间位置的
            if(array[middle] == a){
                return middle+1;
            }
            //大于往左边查询
            if(array[middle] > a){
                lo = middle-1;
            }
            //大于往右边查询
            if(array[middle] < a){
                start  = middle+1;
            }
        }
        return -1;
    }
}
