package com.kh.model.vo;

import java.util.Random;

public class Human implements Player{
	
	private String name;
	private int hp=200;
	private int aPro=50;
	private int power=50;
	
	public Human() {}
	
	public Human(String name) {
		this.name = name;
	}
	public Human(int hp, int attackPro, int power) {
		this.hp = hp;
		this.aPro = attackPro;
		this.power = power;
	}
	//getter, setter
	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}
	public int getAPro() {
		return aPro;
	}
	public int getPower() {
		return power;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setAPro(int aPro) {
		this.aPro = aPro;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	//부모클래스 오버라이딩
	@Override
	public int Hp() {
		return hp;
	}
	@Override
	public int attackPro() {
		return aPro;
	}
	@Override
	public int power() {
		return power;
	}
	@Override
	public String toString() {
		return "현재 "+name+"님의 종족은 Human입니다.\n [체력=" + hp + ", 공격성공확률=" + aPro + "%, 공격력=" + power + "]";
	}
	
	

}