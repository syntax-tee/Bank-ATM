package com.ogunladetaiye.bank.bankatm;

import java.util.Scanner;

public class Keypad {
    private Scanner input; // reads data from the command line

          // no-argument constructor initializes the Scanner
          public Keypad() {
             input = new Scanner(System.in);
          }

          // return an integer value entered by user
          public int getInput() {
            return input.nextInt(); // we assume that user enters an integer
          }
   }