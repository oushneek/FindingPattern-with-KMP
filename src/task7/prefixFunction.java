/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package task7;

/**
 *
 * @author Tazbeea Tazakka
 */
public class prefixFunction {

    prefixFunction(int m,char[] p,int n,char[] s) {
        
        int []PI = new int[m+1];
        PI[1]=0;
        int k=0,q;
        
        for (q=2;q<=m;q++){
            while(k>0 && p[k+1]!=p[q])
                k=PI[k];
          
            if(p[k+1]==p[q])
                k++;           
            PI[q]=k;
            //System.out.println(PI[q]);
        }
//        for(int i=1;i<=m;i++)
//            System.out.println(PI[i]);
        KMP_matcher kmp=new KMP_matcher(m,p,n,s,PI);
    }
}