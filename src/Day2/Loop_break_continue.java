package Day2;

import java.util.Scanner;

public class Loop_break_continue {
    public static void main(String[] args) {
        //Example 1:
        int sum = 0;
        for(int i = 1; i <= 10; i++ ){
            if(i % 3 == 0){
                //break;   //stops the entire loop when i is divisible by 3
                continue;   //3,6 and 9 skipped because they are divisible by 3
            }
            System.out.printf("adding %d to %d to get to %d. \n", i , sum , sum + i);
            sum += i;
        }
        System.out.println("Sum = " + sum);

        //Example 2:
        int [] prices = {11, 33, 22, 66, 333, 44};
        int limit = 50;
        for(int p: prices){
            if(p>=limit){
                //break;
                continue;
            }
            System.out.println(p);
        }
        //FullNameParser
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Full Name as Either First Last, or First Middle Last :");
        String fullName = in.nextLine();

        //Make sure to trim the name before proceeding in Case the user entered leading or trailing spaces.
        fullName = fullName.trim();

        //Parse the name and process it so that you can display the individual pieces of the name.
        String[] parts = fullName.split(" ");

        String first = "";
        String middle = "";
        String last = "";

        if(parts.length > 0){
            first = parts[0];
        }
        if(parts.length == 3){
            middle = parts[1];
        }
        if(parts.length > 1){
            last = parts[parts.length -1];
        }
        System.out.println(first);

        if(!middle.isEmpty()){
            System.out.println(" " + middle);
        }

        if(!last.isEmpty()){
            System.out.println(" " + last);
        }
        System.out.println('\n');
    }


}
