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
	
	//�θ�Ŭ���� �������̵�
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
		return "���� "+name+"���� ������ Human�Դϴ�.\n [ü��=" + hp + ", ���ݼ���Ȯ��=" + aPro + "%, ���ݷ�=" + power + "]";
	}
	
	

}