/**
 * @author hhf
 * @version 1.0
 * @date 2023/4/2 19:22
 */

public class TwoSearch {
    public static void main(String[] args) {
        int[] a = {1,2,4,6,6,7,7,10,23,23,33,45};
         int target  = 6;
         int target4  = 8;

        int result = test1(a , target);
        System.out.println(result);
        int result4 = test4(a , target4);
        System.out.println(result4);

        int result_l = left_test(a , target);
        System.out.println(result_l);
        int result_l2 = left_test2(a , target);
        System.out.println(result_l2);
        int result_l3 = left_test2(a , target4);
        System.out.println(result_l3);

    }
//基础版，i,j都是数组中的元素，切是在循环中找到元素。
    private static int test1(int[] a, int target) {
        int i = 0;
        int j = a.length -1;
        while (i <= j){
            int m = (i+j) >>> 1;
            if (target < a[m]){
                j = m - 1;
            }else if (a[m] < target){
                i = m + 1;
            }else {
                return m;
            }
        }
        return -1;
    }

    /**
     *  二分查找第二版，j作为边界，元素永远不可能是j所在的元素
     *  有三个地方可以改变
     * @param a
     * @param target
     * @return
     */
    private static int test2(int[] a, int target) {
        int i = 0;
        int j = a.length;         // 第一处改变，j元素的边界
        while (i < j){            // i不能等于j了，会造成死循环
            int m = (i+j) >>> 1;
            if (target < a[m]){
                j = m;           //j不需要m-1了，j是作为一个边界值存在
            }else if (a[m] < target){
                i = m + 1;
            }else {
                return m;
            }
        }
        return -1;
    }

    /**
     * 找到最后一个元素，在循环外面确定索引。左右搜索次数变得平衡
     * @param a
     * @param target
     * @return
     */
    private static int test3(int[] a, int target) {
        int i = 0;
        int j = a.length;         // 第一处改变，j元素的边界
        while (i + 1 < j){
            int m = ( i + j ) >>> 1;
            if (target < a[m]){
                j = m;           //j不需要m-1了，j是作为一个边界值存在
            }else {
                i = m;           //i不需要m+1了，i是作为一个边界值存在
            }
        }
        return (a[i] == target) ? i : -1;
    }

    /**
     * 找到则返回元素坐标，找不到则返回元素插入位置
     * @param a
     * @param target
     * @return
     */
    private static int test4(int[] a, int target) {
        int i = 0;
        int j = a.length -1;
        while (i <= j) {
            int m = (i + j) >>> 1;
            if (target < a[m]) {
                j = m - 1;
            } else if (a[m] < target) {
                i = m + 1;
            } else {
                return m;
            }
        }
        return i;                         //第一个基础版在这里做改动
    }


    /**
     * 如果数组有重复元素，返回最左侧元素索引
     * @param a
     * @param target
     * @return  找不到的时候返回-1，能找的时候返回最左侧元素
     */
    private static int left_test(int[] a, int target) {
        int i = 0;
        int j = a.length -1;
        int candidate = -1 ;         //查找到的值是临时值
        while (i <= j) {
            int m = (i + j) >>> 1;
            if (target < a[m]) {
                j = m - 1;
            } else if (a[m] < target) {
                i = m + 1;
            } else {
                candidate = m;
                j = m - 1;
            }
        }
        return candidate;
    }

    /**
     * 如果数组有重复元素，返回最右侧元素的索引
     * @param a
     * @param target
     * @return  找不到的时候返回-1，能找的时候返回最右侧元素
     */
    private static int right_test(int[] a, int target) {
        int i = 0;
        int j = a.length -1;
        int candidate = -1 ;         //查找到的值是临时值
        while (i <= j) {
            int m = (i + j) >>> 1;
            if (target < a[m]) {
                j = m - 1;
            } else if (a[m] < target) {
                i = m + 1;
            } else {
                candidate = m;
                i = m + 1;
            }
        }
        return candidate;
    }



    /**
     * 如果数组有重复元素，返回最左侧元素索引
     * @param a
     * @param target
     * @return  找不到的时候返回大于它的最小索引-插入位置，能找的时候返回最左侧元素
     * >=目标最靠左的索引位置
     */
    private static int left_test2(int[] a, int target) {
        int i = 0;
        int j = a.length -1;
        while (i <= j) {
            int m = (i + j) >>> 1;
            if (target <= a[m]) {
                j = m - 1;
            } else {
                i = m + 1;
            }
        }
        return i;
    }

    /**
     * 如果数组有重复元素，返回最右侧元素的索引
     * @param a
     * @param target
     * @return  找不到的时候返回小于它的最大索引-插入位置，能找的时候返回最右侧元素
     *<=目标的做靠右的索引
     */
    private static int right_test2(int[] a, int target) {
        int i = 0;
        int j = a.length -1;
        while (i <= j) {
            int m = (i + j) >>> 1;
            if (target < a[m]) {
                j = m - 1;
            } else {
                i = m + 1;
            }
        }
        return j;
    }



}
