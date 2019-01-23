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
		//�θ�Ŭ���� Player������ �ڽ�Ŭ���� ��ü ����
		Player p1 = new Human();
		Player p2 = new Elf();
		Player p3 = new Giant();
		
		//�θ�Ŭ���� Monster������ �ڽ�Ŭ���� ��ü ����
		Monster m1 = new Troll();
		Monster m2 = new Ghost();
		Monster m3 = new Slime();
		
		//��������
		do {
			System.out.println("===���� ����===");
			System.out.println("1. �ΰ�");
			System.out.println("2. ����");
			System.out.println("3. ���̾�Ʈ");
			System.out.print("������ �������ּ��� : ");
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
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			
		}while(true);
		
		//���� ����
		System.out.println("=====���͸� �������ϴ�.=====");
		
		int Kom = new Random().nextInt(3);
		//ù��° ���Ͱ� Ʈ���϶�
		if(Kom==0) {
			System.out.println(((Troll)m1).getKinds()+"�Դϴ�.");
			//���� ����
			System.out.println("=====������ �����մϴ�.=====");
			if(m1 instanceof Troll) {
				//player��  human�϶�
				if(p1 instanceof Human) {
					//�� �� �Ѹ��� ����Ҷ����� �ݺ�
					((Troll) m1).hitTroll(name);
					
				}
				else if(p2 instanceof Elf) {
					System.out.println("����������...");
					
				}
				
			}
		}else if(Kom==1) {
			System.out.println(((Ghost)m2).getKinds()+"�Դϴ�.");
			if(p1 instanceof Human) {
				((Ghost)m2).hitGhost(name);
			}
			
		}else if(Kom==2) {
			System.out.println(((Slime)m3).getKinds()+"�Դϴ�.");
			if(p1 instanceof Human) {
				((Slime)m3).hitSlime(name);
			}
		}
		
		
		
		
	}
}
