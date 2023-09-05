// import java.util.*;

// class main {
//     public static void main(String args []) {
//         int age;
//         Scanner sc = new Scanner (System.in);
//         System.out.println("ENETER YOUR AGE ");
//        age  = sc.nextInt();
//         if(age>56){
// System.out.println("YOUR ARE EXPERIENCED  ");
//         }
//         else if (age >48){
// System.out.println("YOU ARE SEMI EXPERIENCED ");
//         }
//         else if(age > 18){
//             System.out.println("YOU ARE  ADULT ");
//         }
//         else{
//             System.out.println("YOU ARE NOT ADULT");
//         }
// }
// }



// import java.util.*;

// class Main {
//     public static void main (String args[]) {
//         int age ;
//         Scanner sc = new Scanner(System.in);
//          System.out.println("ENTER YOUR AGE ");
//         age = sc.nextInt();
//         if (age > 50){
//             System.out.println("you are experienced ");
//          } else if (age>40){
//             System.out.println("you are below experienced ");
//          }else{
//         System.out.println("you are not experienced ");
//     }

            
//         }
        
        
//     }  


// import java.util.Scanner;

// class Main {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         byte m1,m2,m3;
//         System.out.println("ENTER YOUR MARKS OF PHYSICS: ");
//         m1 = sc.nextByte();
//         System.out.println("ENTER YOUR MARKS OF MATH: ");
//         m2 = sc.nextByte();
//         System.out.println("ENTER YOUR MARKS OF CHEMISTRY: ");
//         m3 = sc.nextByte();
//         float avg =(m1+m2+m3/3.0f);
//         System.out.println("YOUR PERCENTAGE IS: "+avg);
//         if(avg>35){
//             System.out.println("YOU ARE PASS:");


//         }
//         else{
//             System.out.println("YOU ARE FAIL,TRY AGAIN:");
//         }

//     }

// }





//random numbers numbers gerating 

import java.util.Random;

class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(10); // Generates a random number between 0 (inclusive) and 10 (exclusive)
        System.out.println("Random Number: " + randomNumber);
    }
}
