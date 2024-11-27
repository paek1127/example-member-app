package com.ll;

import java.util.Scanner;

public class App {
    private final Scanner scanner;

    public App() {
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        System.out.println("== 회원 앱 ==");

        System.out.print("명령) ");
        String cmd = scanner.nextLine();
    }
}
