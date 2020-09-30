/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Logan
 */
public class ULEcho {
    public static void main(String[] args)
    {
        String action = args[0]; 
        String userString = "";
        for (int i = 1; i < args.length; i++) {
            userString += (args[i] + " ");
        }
        String echo = "";
        
        switch (action)
        {
            case "U":
                echo = userString.toUpperCase();
                break;
            case "L":
                echo = userString.toLowerCase();
                break;
            default:
                System.out.println(action + ": Incorrect command.");
                System.out.println("Usage: ULEcho U|L userString");
                break;

        }

        System.out.println(echo);


    }
}
