package btsession04.bt03;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] array = new double[100000];
        for(int i =0;i<array.length;i++){
            double randomDouble = Math.random();
            randomDouble = randomDouble * 100000 +1;
            array[i] = randomDouble;
        }
        StopWatch stopWatch = new StopWatch();
        for(int i =0;i<array.length-1;i++){
            int min = i;
            for(int j =i+1;j<array.length;j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            double temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        stopWatch.stop();
        System.out.println("Thời gian thực hiện: "+stopWatch.getElapsedTime());
    }
}
