package day02;
/**
 * date:2020/6/17
 * 100以内的质数和
 * 质数是指在大于1的自然数中，除了1和它本身不再有其他因数的自然数
 */
public class Homework2 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=2;i<=100;i++){//循环100以内的数
            boolean n=true;
            for(int j=2;j<i;j++){//判断是否有其他因数存在
                if(i%j==0){
                    n=false;
                    break;//出现其他因数跳出该循环
                }
            }
            if(n) {//如果n存在，说明该数为质数
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
