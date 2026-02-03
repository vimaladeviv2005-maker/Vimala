/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.Scanner;

/**
 *
 * @author Vimaladevi
 */
public class AstrickCount 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input:");
        String s=sc.next();
        int count=0;
        int count1=0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='*')
            {
                count++;
            }
            else
            {
                count1++;
            }
        }
        int sum=count-count1;
        if(sum==0)
        {
            System.out.println("0");
        }
        else if(count>count1)
        {
            System.out.println("Positive number");
        }
        else
        {
            System.out.println("Negative number");
        }
        }   
    
}
