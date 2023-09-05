// Nested loop
// For loop we are use 

import java.util.*;

class Main {
    public static void main(String args []) {
        int n=4;
        int m=5;

        //outer loop 
        for( int i=1; i<=n; i++ ) {
            //Inner loop
            for(int j=1; j<=m; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}