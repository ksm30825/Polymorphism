package com.kh.run;

import java.util.Scanner;

import com.kh.controller.PlayerManager;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PlayerManager pm = new PlayerManager();
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.nextLine();
		pm.startPlay(name);
		

	}

}
