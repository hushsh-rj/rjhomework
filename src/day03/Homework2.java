package day03;

import java.util.Scanner;

/**
 * date:2020/06/18
 * 1.从键盘输入8个整数存放到一个数组里
 * 2.按奇数偶数分别存放到两个数组里
 * 3.先交替输出，如果奇数多，则输出剩下的奇数，反之则亦然；
 * 要求：1.先判断8个整数中的奇数偶数个数，才能存入数组
 *      2.第2,3步的过程定义为方法
 */
public class Homework2 {
    public static void main(String[] args) {
        int[] num = Input();
        div(num);
    }
    //从键盘输入整数到数组
    private static int[] Input() {
        int[] num = new int[8];//定义num的数组长度
        System.out.println("请输入8个整数：");
        for (int i = 0; i < 8; i++) {
            Scanner sc = new Scanner(System.in);
            num[i] = sc.nextInt();
        }
        return num;
    }

    //对偶数奇数分别进行分类，并交替输出
    private static void div(int [] num) {
        int count1=0;//奇数数组长度
        int count2=0;//偶数数组长度
        for(int i=0;i<num.length;i++){//判断奇数、偶数数组长度
            if(num[i]%2==0){
                count2++;
            }else{
                count1++;
            }
        }
        int [] num1=new int[count1];//奇数数组
        int [] num2=new int[count2];//偶数数组
        int j=0;
        int k=0;
        for(int i=0;i<num.length;i++){//对num数组按奇数偶数分类
            if(num[i]%2==0){
                num2[j]=num[i];
                j++;
            }else{
                num1[k]=num[i];
                k++;
            }
        }

        if(num2.length>num1.length){//偶数数组长度大于奇数数组
            for(int i=0;i<num1.length;i++){//先按照奇数数组的长度来输出
                System.out.print(num1[i]+" ");
                System.out.print(num2[i]+" ");
            }
            for(int i=num1.length;i<num2.length;i++){//输出剩下的偶数数组
                System.out.print(num2[i]+" ");
            }
        }else if(num1.length==num2.length){
            for(int i=0;i<num1.length;i++){
                System.out.print(num1[i]+" ");
                System.out.print(num2[i]+" ");
            }
        }else{
            for(int i=0;i<num2.length;i++){
                System.out.print(num1[i]+" ");
                System.out.print(num2[i]+" ");
            }
            for(int i=num2.length;i<num1.length;i++){
                System.out.print(num1[i]+" ");
            }
        }
    }
}
