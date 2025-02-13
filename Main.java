
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  
  public static void main(String[] args) {
    

      System.out.println("This is a library");

      Scanner sc = new Scanner(System.in);
      ArrayList<String> inputs = new ArrayList<>();

      System.out.println("What would you like to do?");
      System.out.println("1. Add a book");
      System.out.println("2. write a review");
      System.out.println("3. read an old review");


      int userschoice = sc.nextInt();
      sc.nextLine();
      

      switch(userschoice) {

        case 1:
          System.out.println("What book to you want to enter");
          String name = sc.nextLine();
            
              inputs.add(name);

          System.out.println("your book" + "  " + name + " " + "has been saved!");

          System.out.println("Do you wish to see what books you have?");

          String toseehowmany = sc.nextLine().toLowerCase();


            if (toseehowmany.equals("yes")) {
              System.out.println("Books you have:");

              for(String book : inputs) {
                System.out.println(book);
              }

            } else {
              System.out.println("goodbye");
            }

            break;

            

        case 2:
          //System.out.println("for which book?"); // inputs should print all books in the library.

          System.out.println(inputs); // displays all books stored in the array.


          System.out.println("For which book?"); // asks user which book they want to read the review Of

          String c = sc.nextLine();// takes their input

          if(answer.equals(inputs[i])) {
            System.out.println(inputs.get(i));


          }

          break; 

          //for (int = 0; i < inputs; i++) {
           // if (answer.equals(inputs[i])) {
              //System.out.println("you want to read the review on" + answer +);
            //}


          //}
          
          
        case 3: 
          System.out.println("read an old review");
          String e = sc.nextLine();
          System.out.println("Which book Review would you like to read?");
          String f = sc.nextLine(); 
          break;

        default:

            assert false :  "pick a right choice";
          
      }

      sc.close();

  }

  }
