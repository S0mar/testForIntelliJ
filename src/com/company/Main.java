package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader bb = new BufferedReader(new InputStreamReader(System.in));

        Controller controller = new Controller(3);

        Command command = Command.NULL;
        // start the while loop for the program
        do {
            try {
                // execute the first command that matches the input
                command = Command.excecuteFirstMatching(bb.readLine(), controller);
            } catch (RetardException e) {
                System.out.print(e.getMessage());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (command == null || command.isRunning());
    }
}
