/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kezd02;

/**
 *
 * @author user11
 */
public class Kezd02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int[] tomb = {3,6,2,6,5,7,2,4,6};
        int n = 9;
        
        for (int i= n-1; i>0; i--) {
            for (int j = 0; j < i; j++) {
                if (tomb[j] > tomb[j+1]) {
                    int tmp = tomb[j];
                    tomb[j] = tomb[j+1];
                    tomb[j+1] = tmp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(tomb[i] + ", ");
        }
        */
        int[] t = {5,7,3,6,8,3,1,3,5,7};
        for (int i = 0; i < t.length; i++) {
            int x = t[i];
            int j = i - 1;
            while(j>=0 && t[j]>x) {
                t[j+1] = t[j];
                j = j - 1;
            }
            t[j+1] = x;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(t[i] + ", ");
        }
    }
    
}
