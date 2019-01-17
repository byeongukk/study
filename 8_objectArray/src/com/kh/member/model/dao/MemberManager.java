package com.kh.member.model.dao;

import java.util.Scanner;

import com.kh.member.model.vo.Member;

public class MemberManager {
	private static Member[] m = new Member[10];
	private static int ctn = 0; //회원 수 체크용 변수
	private Scanner sc = new Scanner(System.in);
	
	public MemberManager() {}
	public void insertMember() {
		System.out.print("id 입력 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 입력 : ");
		String pwd = sc.nextLine();
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("성별 입력 : ");
		char gender = sc.next().charAt(0);
		sc.nextLine();
		System.out.print("이메일 입력 : ");
		String email = sc.nextLine();
		m[ctn] = new Member(id,pwd,name,age,gender,email);
		ctn ++;
		System.out.println("입력이 완료되었습니다. 메인 메뉴로 돌아갑니다");
		System.out.println("현재 회원수 : " + ctn);
		
	}
	public void searchId() {
		System.out.print("검색할 아이디를 입력하세요 : ");
		String id = sc.nextLine();
		for(int i=0; i < ctn; i++) {
			if(id.equals(m[i].getUserId())) {
				printOne(m[i]);
				return;
			}
		}
		System.out.println("검색한 회원 정보가 존재하지 않습니다");
	}
	public void searchName() {
		System.out.print("검색할 이름를 입력하세요 : ");
		String name = sc.nextLine();
		for(int i=0; i < ctn; i++) {
			if(name.equals(m[i].getUserName())) {
				printOne(m[i]);
				return;
			}
		}
		System.out.println("검색한 회원 정보가 존재하지 않습니다");
	}
	public void searchEmail() {
		System.out.print("검색할 이메일을 입력하세요 : ");
		String email = sc.nextLine();
		for(int i=0; i < ctn; i++) {
			if(email.equals(m[i].getEmail())) {
				printOne(m[i]);
				return;
			}
		}
		System.out.println("검색한 회원 정보가 존재하지 않습니다");
	}
	public void updatePwd() {
		System.out.println("수정할 회원의 아이디를 입력하세요 : ");
		String id = sc.nextLine();
		
		for(int i=0; i < ctn; i++) {
			if(id.equals(m[i].getUserId())) {
				System.out.println("변경하실 비밀번호를 입력하세요");
				String pwd = sc.nextLine();
				m[i].setUserPwd(pwd);
				System.out.println("성공적으로 변경되었습니다");
				return;
			}
		}
		System.out.println("수정할 회원이 존재하지 않습니다");
	}
	public void updateName() {
		System.out.println("수정할 회원의 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		for(int i=0; i < ctn; i++) {
			if(name.equals(m[i].getUserName())) {
				System.out.println("변경하실 이름을 입력하세요");
				name = sc.nextLine();
				m[i].setUserName(name);
				System.out.println("성공적으로 변경되었습니다");
				return;
			} 
		}
		System.out.println("수정할 회원이 존재하지 않습니다");
	}
	public void updateEmail() {
		System.out.println("수정할 회원의 이메일을 입력하세요 : ");
		String email = sc.nextLine();
		
		for(int i=0; i < ctn; i++) {
			if(email.equals(m[i].getEmail())) {
				System.out.println("변경하실 이메일을 입력하세요");
				email = sc.nextLine();
				m[i].setEmail(email);
				System.out.println("성공적으로 변경되었습니다");
				return;
			}
		}
		System.out.println("수정할 회원이 존재하지 않습니다");
	}
	public void deleteOne() {
		System.out.println("탈퇴할 회원의 아이디를 입력하세요 : ");
		String id = sc.nextLine();
		for(int i=0; i < m.length; i++) {
			if(id.equals(m[i].getUserId())) {
				for(int j=i; j <= m.length-2; j++) {
					if(i==m.length-1) { // 마지막 번째 인덱스는 초기화 
						m[i] = new Member();
					} else {
						m[j] = m[j+1];
					}
				}
			}
				System.out.println("성공적으로 탈퇴 되었습니다");
				ctn--;
				return;
			}
		System.out.println("탈퇴할 유저의 정보가 없습니다");
	}
	public void deleteAll() {
		for(int i = 0; i < ctn; i++) {
			m[i] = new Member();
			ctn = 0;
		}
		System.out.println("처리 완료");
	}
	public void printAllMember() {
		for(int i=0; i < ctn; i++) {
			System.out.println("이름 : " + m[i].getUserName());
			System.out.println("아이디 : " + m[i].getUserId());
			System.out.println("나이 : " + m[i].getAge());
			System.out.println("성별 : " + m[i].getGender());
			System.out.println("이메일 : " + m[i].getEmail());
			System.out.println();
		}
	}
	public void printOne(Member m) {
		System.out.println("이름 : " + m.getUserName());
		System.out.println("나이 : " + m.getAge());
		System.out.println("id : " + m.getUserId());
		System.out.println("성별 : " + m.getGender());
		System.out.println("이메일 : " + m.getEmail());
		System.out.println();
		
	}
}













