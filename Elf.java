package com.kh.model.vo;

public class Elf implements Player {

	private String name;
	private int hp=300;
	private int attackPro=80;
	private int power=40;
	
	public Elf() {}
	
	public Elf(String name) {
		this.name = name;
		
	}
	public Elf(int hp, int attackPro, int power) {
		this.hp = hp;
		this.attackPro = attackPro;
		this.power = power;
	}

	public String getName() {
		return name;
	}
	public int getHp() {
		return hp;
	}
	public int getAPro() {
		return attackPro;
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
	public void setAPro(int attackPro) {
		this.attackPro = attackPro;
	}
	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public int Hp() {
		return hp;
	}

	@Override
	public int attackPro() {
		
		return attackPro;
		
	}

	@Override
	public int power() {
		return power;
		
	}
	
	
	@Override
	public String toString() {
		return "현재 "+name+"님의 종족은 Elf입니다.\n [체력=" + hp + ", 공격성공확률=" + attackPro + "%, 공격력=" + power + "]";
	}
	
}
