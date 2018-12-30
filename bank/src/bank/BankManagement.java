package bank;

import java.util.ArrayList;
import java.util.List;

public class BankManagement {
	static List<BankManagement> adminList= new ArrayList<>();
	private String adminId;
	private String adPwd;
	private int bankBalance;
	
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String admin) {
		this.adminId = admin;
	}
	public String getAdpwd() {
		return adPwd;
	}
	public void setAdpwd(String adpwd) {
		this.adPwd = adpwd;
	}
	public int getBankBalance() {
		return bankBalance;
	}
	public void setBankBalance(int bankBalance) {
		this.bankBalance = bankBalance;
	}
	
	public static void adCreation() {
		BankManagement admin = new BankManagement();
		admin.setAdminId("uukk");
		admin.setAdpwd("0907");
		adminList.add(0,admin);

	}
	

	
	
	
}
