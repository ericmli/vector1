package application;

import java.util.Scanner;


public class Main {
    
    public static void main (String [] args){
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X[] = new int [N];
        int min = 0, position = 0; 
        
        for(int i = 0 ; i < N ; i++){
            
            X[i] = sc.nextInt();
            if(X[i] < min){
                min = X[i];
                position = i;
            }else if(min == 0){
                min = X[i];
                position = i;
            }
        }
        System.out.println("Minor value: " + min);
        System.out.println("Position: " + position);
    }
 }
