package com.kh.view;

import java.util.Scanner;
import com.kh.controller.MusicController;
import com.kh.model.vo.Music;

public class MusicMenu {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void musicMenu() {
		System.out.println("=== 노래 메뉴 ===");
		System.out.println("1. 노래추가");
		System.out.println("2. 노래선택");
		System.out.println("3. 노래삭제");
		System.out.println("9. 시스템종료");
		
		System.out.println("메뉴 선택");
		int menu = sc.nextInt();
		sc.nextLine();
		
		switch(menu) {
			case 1 :
				inputMusic();
			case 2 :
				
			case 3 :
				
			case 9 :

			default :
		}
	}
	
public void inputMusic() {
	System.out.println("\n===노래추가===");
	
	System.out.println("1. 노래이름 : ");
	String musicTitle = sc.nextLine();
	
	System.out.println("2. 뮤지션 : ");
	String musician = sc.nextLine();
	
	System.out.println("3. 장르 : ");
	String genre = sc.nextLine();
	
	mc.insertMusic(musicTitle, musician, genre);
 }
}
