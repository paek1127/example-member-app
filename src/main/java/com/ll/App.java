package com.ll;

import java.util.Scanner;

public class App {
    private final Scanner scanner;
    private int lastId;


    public App() {
        this.scanner = new Scanner(System.in);
        this.lastId = 0;
    }

    public void run() {
        System.out.println("=== 회원 앱 ===");

        while (true) {
            System.out.print("명령) ");
            String cmd = scanner.nextLine();

            if (cmd.equals("종료")) {
                break;
            } else if (cmd.equals("등록")) {
                actionAdd();
            }
        }
        scanner.close();
    }

    private void actionAdd() {
        System.out.print("이름 : ");
        String name = scanner.nextLine();
        System.out.print("나이 : ");
        String age = scanner.nextLine();

        int id = ++lastId;

        System.out.println(id +"번 회원이 등록되었습니다.");
    }
}

