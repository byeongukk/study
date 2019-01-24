package com.kh.run;

import com.kh.controller.PlayManager;
import com.kh.weapons.model.vo.Gun;
import com.kh.weapons.model.vo.Nuclear;
import com.kh.weapons.model.vo.Player;
import com.kh.weapons.model.vo.Sword;
import com.kh.weapons.model.vo.Weapons;

public class Run {
	public static void main(String[] args) {
		PlayManager pm = new PlayManager();
		Player player = new Player(1000000);
		Weapons[] wpArr = new Weapons[3];
		//무기이름 , 종류 , 공격력증가폭, 기본강화비용, 기본강화확률 순으로 생성자에 기입한다
		wpArr[0] = new Sword("롱소드","Sword",100,5000,100);
		wpArr[1] = new Gun("탕탕이","Gun",300,15000,80);
		wpArr[2] = new Nuclear("한방","Nuclear",1000,50000,50);
		pm.menu(wpArr,player);

		
		
	}
}
