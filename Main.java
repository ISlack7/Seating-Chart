import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //Declaring the seat numbers and the array
    int [] seatNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
   //Declaring the string array of student names 1-15
    String[] names = new String[15];
    Scanner scan = new Scanner(System.in);
    
    
    for (int i = 0; i < seatNumber.length; i++){
      System.out.println("What is your name?");
      names[i] = scan.next();
    }
    int i = 0;
    while (i < 15){
      System.out.println(names[i] + " Sits here " + seatNumber[i]);
     i++;
    }

    

  }
}