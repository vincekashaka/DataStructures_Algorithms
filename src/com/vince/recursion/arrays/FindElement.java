package com.vince.recursion.arrays;

import java.util.ArrayList;

public class FindElement {

    public static void main(String[] args) {
        int[] arr = {2, 3 ,1 ,4, 4, 5};
//        System.out.println(find(arr, 4, 0));
//        System.out.println(findIndex(arr, 4, 0));

        ArrayList<Integer> ans = findAllIndex(arr, 4, 0, new ArrayList<>());
        System.out.println(ans);

    }

    static boolean find(int[] arr, int target, int index){
        if (index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    static  int findIndex(int[]  arr, int target, int index){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

//    static ArrayList<Integer> list = new ArrayList<>();
//    static void findAllIndex(int[]  arr, int target, int index) {
//        if (index == arr.length) {
//            return;
//        }
//        if (arr[index] == target) {
//            list.add(index);
//        }
//            findAllIndex(arr, target, index + 1);
//    }
static ArrayList<Integer> findAllIndex(int[]  arr, int target, int index,  ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

    static ArrayList<Integer> findAllIndex2(int[]  arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls =  findAllIndex2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);

        return list;
    }
}
