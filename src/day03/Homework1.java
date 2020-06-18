package day03;

import java.util.Arrays;

/**
 * date:2020/06/18
 * 猜字符游戏:
 * 随机生成5个不重复英文字母
 * 用户输入5个字母
 *提示猜对了几个，位置对了有几个
 */
public class Homework1 {
    public static void main(String[] args) {
        char [] input={'W','D','Y','P','K'};//预测的字符
        char [] a=creat();//随机生成的字符数组
        System.out.println("随机生成的数为："+ Arrays.toString(a));
        int [] result=check(input,a);//检查猜对了几个，位置对了几个
        System.out.println("字符猜中："+result[0]+"个");
        System.out.println("位置猜中："+result[1]+"个");
    }

    //随机生成5个字符
    private static char [] creat(){
        char [] a=new char[5];
        char [] letters={'A','B','C','D','E','F','G','H','I','J','K','L','M',
                'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        int index=0;//记录字符下标
        boolean [] flag=new boolean[letters.length];
        for(int i=0;i<a.length;i++){
            do{
                index=(int)(Math.random() * letters.length);//随机生成的字符下标
            }while(flag[index]);//生成的下标不会重复，字符不会重复
            a[i] = letters[index];
            flag[index]=true;
        }
        return a;
    }

    private static int [] check(char [] input,char [] a){
        int []result=new int[2];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<input.length;j++) {
                if (a[i] == input[j]) {//字符猜中
                    result[0]++;
                    if (i == j) {
                        result[1]++;//位置猜中
                    }
                    break;//猜中后跳出此次循环
                }
            }
        }
        return result;
    }
}
