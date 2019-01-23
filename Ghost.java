package com.kh.model.vo;

import java.util.Random;

public class Ghost implements Monster{
	private String kinds="��Ʈ";
	private int hp=50;
	private int power=10;
	
	@Override
	public String Kinds() {
		return kinds;
	}
	@Override
	public int Hp() {
		return hp;
	}
	@Override
	public int Power() {
		return power;
	}
	
	public Ghost() {}
	
	public Ghost(String kinds, int hp, int power) {
		super();
		this.kinds=kinds;
		this.hp = hp;
		this.power = power;
	}
	public String getKinds() {
		return kinds;
	}
	public int getHp() {
		return hp;
	}
	public int getPower() {
		return power;
	}
	public void setKinds(String kinds) {
		this.kinds=kinds;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	Player p1 = new Human();
	
	public void hitGhost(String name) {
		do {
			System.out.println("���� "+getKinds()+"�� ü���� "+getHp()+"�Դϴ�.");
			int aPro =  new Random().nextInt(2);
			((Human) p1).setAPro(aPro);
			if(((Human) p1).getAPro()==0) {
				System.out.println("���ݼ���!!!!!!!!!!!\t("+((Human) p1).getPower()+"��ŭ �������� �������ϴ�.)");
				setHp(getHp()-((Human)p1).getPower());
				if(getHp()<=0) {
					System.out.println(getKinds()+"��(��) óġ �Ͽ����ϴ�~");
					System.out.println("-------------------------------");
					System.out.println("���� "+name+"���� ü���� "+((Human)p1).getHp()+"�Դϴ�.");
					System.out.println("-------------------------------");break;
				}
				System.out.println(getKinds()+"�� ü���� "+getHp()+"�� �Ǿ����ϴ�.");
				System.out.println(getKinds()+"��(��) �ݰ��մϴ�!!!");
				System.out.println(getPower()+"��ŭ �������� �Ծ����ϴ�.");
				((Human) p1).setHp(((Human)p1).getHp()-getPower());
				if(((Human)p1).getHp()<=0) {
					System.out.println("����ϼ̽��ϴ�.");
					System.out.println("G\tA\tM\tE\tO\tV\tE\tR");break;
				}
				System.out.println("-------------------------------");
				System.out.println("���� "+name+"���� ü���� "+((Human)p1).getHp()+"�Դϴ�.");
				System.out.println("-------------------------------");
				
			}else if(((Human) p1).getAPro()==1){
				System.out.println("���ݽ���...");
				System.out.println(getKinds()+"��(��) �ݰ��մϴ�!!!");
				System.out.println(getPower()+"��ŭ �������� �Ծ����ϴ�.");
				((Human) p1).setHp(((Human)p1).getHp()-getPower());
				System.out.println("-------------------------------");
				System.out.println("���� "+name+"���� ü���� "+((Human)p1).getHp()+"�Դϴ�.");
				System.out.println("-------------------------------");
				if(((Human)p1).getHp()<=0||getHp()<=0)break;
			}					
		}while(true);
	}
	
	@Override
	public String toString() {
		return kinds+": [hp=" + hp + ", power=" + power + "]";
	}

}
