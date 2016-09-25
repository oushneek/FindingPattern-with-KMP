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
public class KMP_matcher {

    KMP_matcher(int m, char []p,int n,char[] s,int[] PI) {
        
        int q=0,i;
        for(i=1;i<=n;i++){
            while(q>0 && p[q+1]!=s[i]){
                q=PI[q];
                //System.out.println(i+" while");
            }
            if(p[q+1]==s[i]){
                q++;
                //System.out.println(i+" if");
            }
            if(q==m){
                System.out.println("Pattern occurs with shift "+(i-m));
                q=PI[q];
            }
        }
    }
}
