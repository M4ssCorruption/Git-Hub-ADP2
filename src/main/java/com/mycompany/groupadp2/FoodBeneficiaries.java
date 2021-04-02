/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.groupadp2;

import java.util.Scanner;

/**
 *
 * @author Sandile Mantshi 213121069
 */

public class FoodBeneficiaries {
    
        public static void main(String[] args){
        
       
        int nums[] = {22,12,15};
        int i,size;
        int VoucherNumber;
        boolean registerd = false;
        
        size = nums.length;
        Scanner sc = new Scanner(System.in);
        //a registered benficiary will input vaucher digit(s) assigned 
        System.out.println("Please enter your voucher number");
        VoucherNumber = sc.nextInt();
        
        //find it and if it's there the user is registred
        for(i = 0; i < size; i++){
            if (nums[i] == VoucherNumber){
                registerd = true;
                break;
                
            }
        }
        if(registerd)
            //the user collects goods 
            System.out.println(VoucherNumber + " This is what is dued to Lebo");
            
            else
                 System.out.println(VoucherNumber + " Unknown User ");
    }
}