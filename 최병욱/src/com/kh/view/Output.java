package com.kh.view;

import com.kh.weapons.model.vo.Player;
import com.kh.weapons.model.vo.Weapons;

public interface Output {
	String LINE = "**********************************************************************************************";

	void outMenu();
	void printWeaponsInfo(Weapons[] wpArr);
	void printWeaponsInfo(Weapons wp);
	void selectWeapon(Weapons[] wpArr);
	void printPlayerInfo(Player player);
}
