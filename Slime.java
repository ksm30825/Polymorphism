package com.kh.model.vo;

import java.util.Random;

public class Slime implements Monster{
	private String kinds="슬라임";
	private int hp=30;
	private int power=5;
	
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
	
	public Slime() {}
	
	public Slime(String kinds, int hp, int power) {
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
	
	public void hitSlime(String name) {
		do {
			System.out.println("현재 "+getKinds()+"의 체력은 "+getHp()+"입니다.");
			int aPro =  new Random().nextInt(2);
			((Human) p1).setAPro(aPro);
			if(((Human) p1).getAPro()==0) {
				System.out.println("공격성공!!!!!!!!!!!\t("+((Human) p1).getPower()+"만큼 데미지를 입혔습니다.)");
				setHp(getHp()-((Human)p1).getPower());
				if(getHp()<=0) {
					System.out.println(getKinds()+"을(를) 처치 하였습니다~");
					System.out.println("-------------------------------");
					System.out.println("현재 "+name+"님의 체력은 "+((Human)p1).getHp()+"입니다.");
					System.out.println("-------------------------------");break;
				}
				System.out.println(getKinds()+"의 체력이 "+getHp()+"이 되었습니다.");
				System.out.println(getKinds()+"이(가) 반격합니다!!!");
				System.out.println(getPower()+"만큼 데미지를 입었습니다.");
				((Human) p1).setHp(((Human)p1).getHp()-getPower());
				if(((Human)p1).getHp()<=0) {
					System.out.println("사망하셨습니다.");
					System.out.println("G\tA\tM\tE\tO\tV\tE\tR");break;
				}
				System.out.println("-------------------------------");
				System.out.println("현재 "+name+"님의 체력은 "+((Human)p1).getHp()+"입니다.");
				System.out.println("-------------------------------");
				
			}else if(((Human) p1).getAPro()==1){
				System.out.println("공격실패...");
				System.out.println(getKinds()+"이(가) 반격합니다!!!");
				System.out.println(getPower()+"만큼 데미지를 입었습니다.");
				((Human) p1).setHp(((Human)p1).getHp()-getPower());
				System.out.println("-------------------------------");
				System.out.println("현재 "+name+"님의 체력은 "+((Human)p1).getHp()+"입니다.");
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
