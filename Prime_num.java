package java_questions;
import java.util.Scanner;
import java.lang.Math;

public class Prime_num {
        static int nprime(int a){
            int flag=0;
            int i;
            if(a<=0||a==1){
                return 0;
            }
            else{
                for(i=2;i<=(int)Math.sqrt(a);i++){
                    if(a%i==0){
                        flag=1;
                        return 0;
                    }
                }
                if(flag!=1){
                    System.out.print(a+"\n");
                }
                return 0;

            }
        }
        public static void main(String[] args) {
            Scanner obj1=new Scanner(System.in);
            System.out.println("enter the first num:");
            int n1=obj1.nextInt();
            System.out.println("enter the second num:");
            int n2=obj1.nextInt();
            System.out.println("Prime numbers between "+n1+" and "+n2+" are:");
            for(int j=n1;j<=n2;j++){
                nprime(j);
            }

        }
    }
