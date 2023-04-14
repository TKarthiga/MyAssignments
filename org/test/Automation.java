package org.test;

public class Automation extends MultipleLangauge implements Language,TestTool {

	public void selenium() {
		System.out.println("Selenium");
	}

	public void java() {
		System.out.println("Java");
		
	}
	public static void main(String[] args) {
		Automation a = new Automation();
		a.java();
		a.selenium();
		a.python();
		a.ruby();
	}

	@Override
	public void ruby() {
		System.out.println("Ruby");
	}

}
