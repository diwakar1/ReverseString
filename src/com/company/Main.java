package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
      /*  System.out.println("enter the string");
        String str = input.nextLine();
        String reverse ="";

        for (int i = str.length()-1; i>= 0; i--){
            reverse = reverse+str.charAt(i);




        }
        System.out.println(reverse);
*/

      /*System.out.println("Enter stringthing  to reverse:");

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();

        StringBuilder sb = new StringBuilder(str);

        System.out.println("Reversed stringthing is:");
        System.out.println(sb.reverse().toString());*/


        System.out.println("Enter somestring to reverse:");

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();

        StringBuilder sb = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i--)
        {
            sb.append(str.charAt(i));
        }

        System.out.println("Reversed somestring is:");
        System.out.println(sb.toString());

    }
}
