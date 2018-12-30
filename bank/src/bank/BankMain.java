package bank;


import java.util.Scanner;

public class BankMain {
	static Scanner scan =  new Scanner(System.in);
	static String str;
	static boolean run = true;
	
	

	public static void main(String[] args) {
		CustomerCreation.creation(100,4,100,2000000);
		BankManagement.adCreation();

		while(run) {
			
			OutPut.mainDisplay();
			int menu1 = menuNumber(scan);
			switch(menu1) {
			case 1:
				System.out.println(OutPut.USERCHOICE);
				int menu2 = menuNumber(scan);
				if(menu2==1) {
					System.out.println(OutPut.UC_NEW_REGISTRATION);
					User.newRegistaion();
				}
				if(menu2==2||menu2==3||menu2==4||menu2==5||menu2==6) {
					if(User.login()) {
						if(menu2==2) {
							System.out.println(OutPut.UC_INQUIRIES);
							User.inquiries();
						}
						if(menu2==3||menu2==4) {
							if(menu2==3) {
							System.out.println(OutPut.UC_DEPOSIT);
							if(menu2==4) {
							System.out.println(OutPut.UC_WITHDRAWAL);
							}
							User.deposit_Withdrawal(menu2);
							}
						}
						if(menu2==5) {
							System.out.println(OutPut.UC_TRANSFER);
							User.transfer();
						}
						if(menu2==6) {
							System.out.println(OutPut.UC_MODIFICATION);
							int modificationMenu = menuNumber(scan);
							switch(modificationMenu) {
								case 1 :
									User.pwdChange();
									break;
								case 2 :
									User.nameChange();
									break;
								default : break;
							}
						}
					}
				}
				if(menu2==10) {
					break;
				} else {
					System.out.println(OutPut.MENU_ERROR);
					continue;
				   }
				
			case 2:
				
				if(User.adminLogin()) {
					System.out.println(OutPut.BANKCHOICE);
					int adminMenu = menuNumber(scan);
					if(adminMenu==1) {
						System.out.println();
					}
					if(adminMenu==2) {
						System.out.println(OutPut.BC_MODIFICATION);
						int adMenuModification = menuNumber(scan);
						if(adMenuModification==1) {
							System.out.println(OutPut.BC_MC_ACC);
							if(User.accSearch()) {
							User.pwdChange();
							}
						}
						if(adMenuModification==2) {
							System.out.println(OutPut.BC_MC_ACC);
							if(User.accSearch()) {
							User.nameChange();
							}
						}
					}
					if(adminMenu==3) {
						System.out.println(OutPut.BC_USER_INFO);
						int adMenuCusInfo = menuNumber(scan);
						switch(adMenuCusInfo) {
						case 1:
							User.nameSearch();
							break;
						case 2:
							User.accSearch();
							break;
						case 3:
							User.allSearch();
							break;
						default : break;
						}
					}
					if(adminMenu==10) {
						break;
					}
				} else {
					System.out.println(OutPut.MENU_ERROR);
					continue;
					
				}
			case 10:
				break;
			}
		}
	}
	
	static int menuNumber(Scanner scan){
		try {
			int num = Integer.parseInt(scan.nextLine());
			if(num==10) {
				System.out.println(OutPut.CLOSE);
				run =false;
			}
			return num;
		} catch(NumberFormatException e) {
			System.out.println(OutPut.NUMBER_ERROR);
			return 0;
		}
	}

	
}
