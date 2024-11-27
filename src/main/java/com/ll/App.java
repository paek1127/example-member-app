package com.ll;

import java.util.Scanner;

public class App {
    private final Scanner scanner;

    public App() {
        this.scanner = new Scanner(System.in);
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
    }

    private void actionAdd() {
        System.out.print("이름 : ");
        String name = scanner.nextLine();
        System.out.print("나이 : ");
        String age = scanner.nextLine();

        System.out.println("1번 회원이 등록되었습니다.");
    }
}

