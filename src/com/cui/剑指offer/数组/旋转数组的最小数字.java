package com.cui.剑指offer.数组;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class 旋转数组的最小数字 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        while (in.hasNextLine()){
            String str = in.nextLine();
            if (str.equals("end"))
                break;

            list.add(Integer.parseInt(str));
        }

        Integer[] arr= (Integer[]) list.toArray(new Integer[list.size()]);
        System.out.println(leftRotateArray(arr));
    }

    public static int leftRotateArray(Integer[] array) {
        int front = 0;
        int rear = array.length-1;
        int mid = (front + rear)/2;
        while(front < rear){
            if(rear - front == 1){
                break;
            }
            mid = (front + rear)/2;
            if(array[mid] >= array[front]){
                front = mid;
            }
            else{
                rear = mid;
            }
        }
        return array[rear];


    }
}
