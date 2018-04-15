package myTest.mytest;

import bsh.This;

/**
 * Hello world!
 *
 */
public class App {
	protected int i = 1;

	public App(){
		this(2);
	}
	public App(int i) {
		this.i=i;
	}
	public void printValues() {
		System.out.println(i);
	}
	public static void main(String[] args) {
		new subAPP().printValues();
	}
}

class subAPP extends App{
	public subAPP(){
	}
	public subAPP(int i){
		super(i+3);
	}
}
