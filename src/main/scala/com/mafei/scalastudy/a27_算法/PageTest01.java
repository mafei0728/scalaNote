/*
    @Classname PageTest01
    @Description
    @author mafei0728
    @Date 2020/8/3 23:30
    @version 1.0
*/
package com.mafei.scalastudy.a27_算法;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PageTest01 {
    public static void main(String[] args) {
        PageTest01 p = new PageTest01();
        int[] arr01 = new int[100000000];
        for (int i = 0; i < 100000000; i++) {
            arr01[i] = i;
        }
        try {
            System.out.println(p.fun01(arr01, 121289));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    // 0,1,2,3,4,5,6,7,8
    public int fun01(int[] arr, int a) throws InterruptedException {
        int start = 0;
        int end = arr.length - 1;
        while (true) {
            int index = (end - start + 1) / 2 + start;
            int res = arr[index];
            System.out.println(start + " " + end + " " + index);
            if (res > a) {
                end = index - 1;
            } else if (res < a) {
                start = index + 1;
            } else {
                return index;
            }
            if ((end == start) && arr[end] != a) return -1;
        }

    }

}
