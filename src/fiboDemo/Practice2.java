package fiboDemo;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int []fibo=new int[10]; //int[]fibo =new int [10];
        for(int i=0;i>10;i++){      //for(int i=0;i<10;i++){
           if(i>2) {   //if(i<2){
               fibo[i]=i;  //fibo[i]=i;
           }else{
               fibo[i]=fibo[i-1]+fibo[i-2]; //fibo[i]=fibo[i-1]+fibo[i-2];
           }
        }//closing loop
        System.out.println(Arrays.toString(fibo));
    }//closing of main
}
