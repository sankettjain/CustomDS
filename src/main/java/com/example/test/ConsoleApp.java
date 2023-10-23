package com.example.test;

import com.example.test.entity.Console;
import com.example.test.entity.DataStructure;
import com.example.test.entity.QueueImpl;
import com.example.test.entity.StackImpl;

import java.util.Objects;
import java.util.Scanner;

public class ConsoleApp<T> implements Console {

    private DataStructure<T> DS;

    public ConsoleApp() {
        this.DS = null;
    }


    @Override
    public void addDS(StackImpl stack, QueueImpl queue) {
        if (Objects.nonNull(DS)) {
            DS.flush();
        }
        if (Objects.nonNull(stack)) {
            DS = stack;
        } else {
            DS = queue;
        }
    }

    @Override
    public void exit() {
        System.exit(0);
    }

    public static void main(String[] args) {

        ConsoleApp<Integer> consoleApp = new ConsoleApp<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command: ");
            String userInput = scanner.nextLine();

            switch (userInput) {
                case "STACK":
                    System.out.println("Implementing new Stack");
                    consoleApp.addDS(new StackImpl(), null);
                    break;
                case "QUEUE":
                    System.out.println("Implementing new Queue");
                    consoleApp.addDS(null, new QueueImpl());
                    break;
                case "PUSH":
                    System.out.println("Enter value: ");
                    String value = scanner.nextLine();
                    consoleApp.DS.pushData(Integer.parseInt(value));
                    break;
                case "POP":
                    System.out.println("popped value: " + consoleApp.DS.pop());
                    break;
                case "PRINT":
                    System.out.println("Values present: ");
                    consoleApp.DS.print();
                    break;
                case "FLUSH":
                    System.out.println("Flushing data: ");
                    consoleApp.DS.print();
                    break;
                case "EXIT":
                    System.out.println("Version 1.0");
                    consoleApp.exit();
                    break;
                default:
                    System.out.println("Unknown command. Use 'help' for available commands.");
            }
        }
    }

}
