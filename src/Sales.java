/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kaylee
 */

import java.util.Scanner;
public class Sales {
    
    
    // Sales.java
//
// Reads in and stores sales for each of 5 salespeople. Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************



 public static void main(String[] args){
     
     Scanner scan = new Scanner(System.in);
     
     System.out.println("Please enter the number of sales people ");
     int userAnswer= scan.nextInt();
     
     
    final int SALESPEOPLE = userAnswer;
    int[] sales = new int[SALESPEOPLE];
    int sum;
    int maximumSale= Integer.MIN_VALUE;
    int salesPersonMaxID=  -1;
    int minimumSale = Integer.MAX_VALUE;
    int salesPersonMin=-1;
            
    
    
    for (int i=0; i<sales.length; i++){
        System.out.print("Enter sales for salesperson " + (i +1) + ": ");
        sales[i] = scan.nextInt();
        
        
            if (sales[i] > maximumSale) {
                maximumSale = sales[i];
                salesPersonMaxID=i;
        }
            if (sales[i]<minimumSale){
                minimumSale = sales[i];
                salesPersonMin=i;
            }
    }
    
        System.out.println("\nSalesperson Sales");
        
        System.out.println("--------------------");
        
        sum = 0;
        
        for (int i=0; i<sales.length; i++){
        System.out.println(" " + i + " " + sales[i]);
        sum += sales[i];
        }
        
        System.out.println("\nTotal sales: " + sum);
        
        double average= sum/SALESPEOPLE ;
             System.out.println("The average of the sales is" + average);
             
        System.out.println("Sales person" +" "+ salesPersonMaxID +" " + "had the highest sale amount of R" + maximumSale );  
        System.out.println("Sales person" +" "+ salesPersonMin +" "+ "had the lowest sales amount of R" + minimumSale);
        
        System.out.println("Please enter a value");
        int answer= scan.nextInt();
        
        for (int i=0; i<sales.length; i++){
            if (sales[i]>answer ){
                System.out.println("Sales Person" + " " + i + " "+ "exceeded that amount and had a sales amount of R" + sales[i]);
            }
        }
        
        
             
    }
 
 

}

