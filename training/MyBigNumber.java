/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author User
 */
public class MyBigNumber {

    /**
     * @param s_1
     * @param s_2
     * @return 
     */
    public static String sum(String s_1, String s_2){
        String result = "";
        int str_1 = s_1.length(); //l?y d? d�i chu?i 1.
        int str_2 = s_2.length(); //l?y d? d�i chu?i 2.
        
        int max = str_1; //d?t gi?i h?n chu?n c?a 2 chu?i
        
        
        if(str_1 > str_2 ){//so s�nh d� d�i 2 chu?i d? ti?p t?c ch?y v�ng l?p
            max = str_1;
        }else{
            max = str_2;
        }
        
        int flag = 0; // t?o 1 bi?n c? d? luu l?i gi� tr? du
        
        for (int i=0; i<max ; i++){
            int num_1 = str_1 - i - 1 ; //gi� tr? cu?i c�ng c?a chu?i 1;
            int num_2 = str_2 - i - 1 ; //gi� tr? cu?i c�ng c?a chu?i 2;
            
            char dig_1 = '0', dig_2 = '0'; //bi?n luu k� t? khi xu?t k?t qu? ra.
            if(num_1 >=0 ){
                dig_1 = s_1.charAt(num_1); //cho ph�p l?y k� t? v? tr� num_1 ra.
            }
            if(num_2 >=0 ){
                dig_2 = s_2.charAt(num_2); // cho ph�p l?y k� t? v? tr� num_2 ra.
            }
            
            int temp_1 = dig_1 -'0'; // t?o 1 bi?n d? luu k?t qu? dig_1, do dig_1 l� k� t? n�n - cho '0' s? l?y du?c s?.
            int temp_2 = dig_2 -'0'; // t?o 1 bi?n d? luu k?t qu? dig_2, do dig_2 l� k� t? n�n - cho '0' s? l?y du?c s?.
            
            int sumAll = temp_1 + temp_2 + flag; // bi?n t�nh t?ng gi� tr?.
            
            if(num_1 > 0){
                result += (sumAll % 10);
            }else {
                result += sumAll;
            }
            flag = sumAll/10 ; //c?ng s? du.
        }
        
        return result;
        
    }

}
