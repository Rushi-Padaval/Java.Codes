// class Main {
//     public static void main(String[] args) {
//         int age = 25;
//         if(age>=18){
//             System.out.println("YOU cAN DRIVE CAR ");
//         }
//         else {
//             System.out.println("YOU CANNOT DRIVE ");
//         }

//     }
// }





import java.util.Scanner;

class main{
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("you can drive");
        }
        else{
            System.out.println("you cannot drive");
        }

        }

    }
