/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.throwskeyword;
import java.io.*;
/**
 *
 * @author USER
 */
public class ThrowsKeyword {

    public static void main(String[] args)throws IOException {//the throws keyword is used to handle the exception at the method signature itself
      BufferedReader br = null;  
       String input;
       try{
       br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter any data or press any key:");
       input = br.readLine();
       System.out.println("The data is : "+ input);
       }catch(Exception e){
       System.out.println(e);
       }finally {
       br.close();
       }
    }
}
//it is possible to use 'try' without the 'catch' block in a code using the 'try with resource'