/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task7;

import java.util.Scanner;

/**
 *
 * @author Tazbeea Tazakka
 */
public class Task7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the pattern : (after finishing press enter)");
        String pattern =input.nextLine();
        
        System.out.println("Enter the string :");
        String str=input.nextLine();
        
        char []patternArr=pattern.toCharArray();
        char []strArr=str.toCharArray();
        int m=patternArr.length;
        int n=strArr.length;
        char []p=new char[m+1];
        char []s=new char[n+1];
        int i;
        for(i=0;i<m;i++){
            p[i+1]=patternArr[i];
        }
        for(i=0;i<n;i++){
            s[i+1]=strArr[i];
        }
        prefixFunction calculate=new prefixFunction(m,p,n,s);
    }
    
}
