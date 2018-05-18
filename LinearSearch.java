/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bashar
 */
public class LinearSearch {
    public static void main(String[] args){
        int[] A = {4, 5, 1, 2, 6, 23, 8, 6};
        int target = 6;
        int i = 0;   //step 1
        
        while(i < A.length){
            if(A[i] == target){  //step 3
                System.out.println(target+" found at the position "+i);  //step 7
                break;
            }
            i++;  //step 4
        }
        
        if(i > A.length - 1){ //step 2
            System.out.println("Not found"); //step 6
        }
    }
    
}
