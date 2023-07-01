package module5_studentexample;

import java.util.Scanner;

public class temp
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double febTemp[][] = new double[4][7];
        
        System.out.println("Enter Feb daily temperatures:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                febTemp[i][j] = in.nextDouble();
            }
        }
        
        double sum = 0.0;
        int lx = 0, ly = 0, hx = 0, hy = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if (febTemp[i][j] < febTemp[lx][ly]) {
                    lx = i;
                    ly = j;
                }
                
                if (febTemp[i][j] > febTemp[hx][hy]) {
                    hx = i;
                    hy = j;
                }
            
                sum += febTemp[i][j];

            }
        }
        
        double avg = sum / 28;
        
        System.out.println("Hottest day = " + (hx * 7 + hy + 1));
        System.out.println("Coldest day = " + (lx * 7 + ly + 1));
        System.out.println("Average Temperature = " + avg);
    }
}
