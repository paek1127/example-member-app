package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private final Scanner scanner;
    private int lastId;
    private final List<MemberList> memberLists;


    public App() {
        this.scanner = new Scanner(System.in);
        this.lastId = 0;
        this.memberLists = new ArrayList<>();
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
            } else if (cmd.equals("목록")) {
                actionList();
            }
        }
        scanner.close();
    }

    private void actionList() {
        System.out.println("번호 / 이름 / 나이");
        System.out.println("===============");

        for (MemberList memberList : memberLists.reversed()) {
            System.out.println(memberList.getId() + " / " + memberList.getName() + " / " + memberList.getAge());
        }
    }

    private void actionAdd() {
        System.out.print("이름 : ");
        String name = scanner.nextLine();
        System.out.print("나이 : ");
        String age = scanner.nextLine();

        int id = ++lastId;

        MemberList memberList = new MemberList(id, name, age);
        memberLists.add(memberList);

        System.out.println(id +"번 회원이 등록되었습니다.");
    }
}

