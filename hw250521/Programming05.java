package hw250521;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Programming05 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();

		Scanner in = new Scanner(System.in);

		while (true) {
			System.out.print("점수를 입력하세요: ");
			int num1 = in.nextInt();
			Integer num2;
			if (num1 > 0) {
				num2 = Integer.valueOf(num1);
				a.add(num2);
			} else
				break;
		}

		System.out.println("전체 학생은 " + a.size() + "명이다.");

		for (int b : a)
			System.out.print("학생들의 성적: " + b + " ");

		int max = Collections.max(a);
		Programming05 ch = new Programming05();
		Iterator<Integer> it = a.iterator();

		System.out.println();
		for (int i = 0; i < a.size(); i++)
			System.out.println(i + "번 학생의 성적은 " + a.get(i) + "점이며 등급은 " + ch.grade(a.get(i), max));

	}

	public char grade(int score, int max) {
		if (score >= max - 10)
			return 'A';
		else if (score >= max - 20)
			return 'B';
		else if (score >= max - 30)
			return 'C';
		else
			return 'F';

	}
}