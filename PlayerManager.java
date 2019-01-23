package com.kh.controller;

import java.util.Random;
import java.util.Scanner;

import com.kh.model.vo.Elf;
import com.kh.model.vo.Ghost;
import com.kh.model.vo.Giant;
import com.kh.model.vo.Human;
import com.kh.model.vo.Monster;
import com.kh.model.vo.Player;
import com.kh.model.vo.Slime;
import com.kh.model.vo.Troll;

public class PlayerManager {
	public void startPlay(String name) {
		Scanner sc = new Scanner(System.in);
		//부모클래스 Player형태의 자식클래스 객체 생성
		Player p1 = new Human();
		Player p2 = new Elf();
		Player p3 = new Giant();
		
		//부모클래스 Monster형태의 자식클래스 객체 생성
		Monster m1 = new Troll();
		Monster m2 = new Ghost();
		Monster m3 = new Slime();
		
		//직업선택
		do {
			System.out.println("===직업 종류===");
			System.out.println("1. 인간");
			System.out.println("2. 엘프");
			System.out.println("3. 자이언트");
			System.out.print("직업을 선택해주세요 : ");
			int job = sc.nextInt();
			
			if(job==1) {
				
				((Human)p1).setName(name);
				System.out.println(p1);break;
			}else if(job==2) {
				
				((Elf)p2).setName(name);
				System.out.println(p2);break;
			}else if(job==3) {
				
				((Giant)p3).setName(name);
				System.out.println(p3);break;
			}
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			
		}while(true);
		
		//몬스터 조우
		System.out.println("=====몬스터를 만났습니다.=====");
		
		int Kom = new Random().nextInt(3);
		//첫번째 몬스터가 트롤일때
		if(Kom==0) {
			System.out.println(((Troll)m1).getKinds()+"입니다.");
			//전투 시작
			System.out.println("=====공격을 진행합니다.=====");
			if(m1 instanceof Troll) {
				//player가  human일때
				if(p1 instanceof Human) {
					//둘 중 한명이 사망할때까지 반복
					((Troll) m1).hitTroll(name);
					
				}
				else if(p2 instanceof Elf) {
					System.out.println("엘프나와줘...");
					
				}
				
			}
		}else if(Kom==1) {
			System.out.println(((Ghost)m2).getKinds()+"입니다.");
			if(p1 instanceof Human) {
				((Ghost)m2).hitGhost(name);
			}
			
		}else if(Kom==2) {
			System.out.println(((Slime)m3).getKinds()+"입니다.");
			if(p1 instanceof Human) {
				((Slime)m3).hitSlime(name);
			}
		}
		
		
		
		
	}
}
