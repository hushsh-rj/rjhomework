package day02;
/**
 * date:2020/6/17
 * 打印等腰三角形
 */
public class Homework1 {
    public static void main(String[] args) {
       int n=5;//设定三角形的高度
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){//输入空格
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){//输入*，数量为2*i-1
                System.out.print("*");
            }
            //每行输入后进行换行操作
            System.out.println();
        }


    }
}
