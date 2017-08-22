package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));

	    while (true) try {
	        /*
	        read the input
	         */
            System.out.print("lol k: ");
            String i = bb.readLine();

            /*
            quit in emergency
             */
            if (i.equals("quit")) {
                return;
            }

            /*
            iksde
             */
            System.out.println("iksde " + i + "\n" + i.hashCode());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
