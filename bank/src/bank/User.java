package bank;

import java.util.Scanner;
public class User {
	static Scanner scan =  new Scanner(System.in);
	private static int index; 
	private static int transferIndex;
	public static int getTransferIndex() {
		return transferIndex;
	}
	public static void setTransferIndex(int transferIndex) {
		User.transferIndex = transferIndex;
	}
	public static int getIndex() {
		return index;
	}
	public static void setIndex(int index) {
		User.index = index;
	}
	
	public static void newRegistaion() {
		Users users = new Users();
		String name,pwd;
		System.out.println(OutPut.NRR_NAME);
		name = scan.nextLine();
		System.out.println(OutPut.NRR_PW);
		pwd = scan.nextLine();
		users.setName(name);
		users.setPassword(pwd);
		users.setAccountNumber(CustomerCreation.setRandomAccount(4));
		users.setBalance(0);
		CustomerCreation.userList.add(users);
		System.out.println(OutPut.NRR_SUCCESE+"\n계좌번호는 "+users.getAccountNumber()+" 입니다");
	}
	public static boolean login() {
		String acc,pwd ;
		System.out.println(OutPut.LOGIN_INFO);
		System.out.println(OutPut.AC_LOGIN);
		acc = scan.nextLine().trim().replace("-","");
		System.out.println(OutPut.PW_LOGIN);
		pwd = scan.nextLine().trim();
		
		for (int i=0; i<CustomerCreation.userList.size(); i++) {
			if(CustomerCreation.userList.get(i).getAccountNumber().trim().replace("-","").equals(acc) && CustomerCreation.userList.get(i).getPassword().equals(pwd)) {
				System.out.println(CustomerCreation.userList.get(i).getName()+OutPut.LOGIN_SUCCESE);
				System.out.println(OutPut.LINE);
				setIndex(i);
				return true;

			} else if (i+1==CustomerCreation.userList.size()) {
				System.out.println(OutPut.LOGIN_FAIL);
			}
		}
		return false;
	}
	public static boolean adminLogin() {
		System.out.println(OutPut.ADMIN_ID_LOGIN);
		String id = scan.nextLine();
		System.out.println(OutPut.ADMIN_PW_LOGIN);
		String pwd = scan.nextLine();

		for(int i=0; i<BankManagement.adminList.size(); i++) {
			if(BankManagement.adminList.get(i).getAdminId().equals(id) && BankManagement.adminList.get(i).getAdpwd().equals(pwd)){
				System.out.println(OutPut.ADMIN_LOGIN_SUCCESE);
				return true;
			}
			else if (i+1==BankManagement.adminList.size()) {
				System.out.println(OutPut.ADMIN_LOGIN_FAIL);
			}
		}
		return false;
	}
	
	public static boolean accNumberCheck() {
		String acc= scan.next();
		for(int i = 0; i<CustomerCreation.userList.size(); i++) {
			if(CustomerCreation.userList.get(i).getAccountNumber().equals(acc)) {
				setTransferIndex(i);
				return true;
			}
			else if (i+1==CustomerCreation.userList.size()) {
				System.out.println(OutPut.AC_ERROR);
			}
		}
		return false;
	}
	public static int money() {
		try {
			int money = Integer.parseInt(scan.nextLine());
			return money;
		} catch(NumberFormatException e) {
			System.out.println(OutPut.NUMBER_ERROR);
			return 0;
		}
	}
	

	public static void deposit_Withdrawal(int num) {
		int money = money();
		int balance = (int) CustomerCreation.userList.get(getIndex()).getBalance();	
		if(num==3) {
			CustomerCreation.userList.get(getIndex()).setBalance(balance=+money);
			System.out.println(money+"원 입금");
		}
		if(num==4) {
			if(balance>=money) {
			CustomerCreation.userList.get(getIndex()).setBalance(balance=-money);
			System.out.println(money+"원 출금");
			} else {
				System.out.println(OutPut.WD_BL_INSUFFICIENT);
			}
		} 
		inquiries();		
	}
	
	public static void inquiries() {
		System.out.println("현재잔액"+CustomerCreation.userList.get(index).getBalance()+ "원 입니다");
	}


	public static void transfer() {
		boolean chek = accNumberCheck();
		if(chek) {
			if(getIndex()!=getTransferIndex()){
				System.out.println(OutPut.UC_TF_BALANCE);
				int giveMoney = scan.nextInt();
				int giveBalance = CustomerCreation.userList.get(getIndex()).getBalance();
				int takeBalance = CustomerCreation.userList.get(getTransferIndex()).getBalance();
				
				if(giveBalance>=giveMoney) {
					System.out.println(CustomerCreation.userList.get(getTransferIndex()).getName()+"님에게");
					System.out.println(giveMoney+"원이 이체됩니다");
					CustomerCreation.userList.get(getIndex()).setBalance(giveBalance-=giveMoney);
					CustomerCreation.userList.get(getTransferIndex()).setBalance(takeBalance+=giveMoney);
					System.out.println("남은잔액"+CustomerCreation.userList.get(getIndex()).getBalance());
				}
				if(giveBalance<giveMoney) {
					System.out.println(OutPut.WD_BL_INSUFFICIENT);
				}
			} else {
				System.out.println("자신의 계좌로는 이체 할 수 없습니다");
			}
		} else {
			return;
		}
	}
	
	public static void pwdChange() {
		System.out.println(OutPut.PWD_CHAN);
		String pwd = scan.nextLine();
		CustomerCreation.userList.get(getIndex()).setPassword(pwd);	
		System.out.println(OutPut.CHAN_SUC);
	}
	public static void nameChange() {
		System.out.println(OutPut.NAME_CHAN);
		String name = scan.nextLine();
		CustomerCreation.userList.get(getIndex()).setName(name);
		System.out.println(OutPut.CHAN_SUC);
	}

	static boolean nameSearch() {
		String name ;
		System.out.println("이름을 입력하세요");
		name = scan.nextLine().trim();

		for (int i=0; i<CustomerCreation.userList.size(); i++) {
			if(CustomerCreation.userList.get(i).getName().trim().equals(name)) {
				System.out.println(CustomerCreation.userList.get(i).getName()+"님의 정보");
				System.out.println("계좌번호 : "+CustomerCreation.userList.get(i).getAccountNumber());
				System.err.println("계좌잔액 : "+CustomerCreation.userList.get(i).getBalance());
				System.out.println();
				setIndex(i);
				return true;

			} else if (i+1==CustomerCreation.userList.size()) {
				System.out.println("잘못된 데이터입니다");
			}
		}
		return false;
	}
	
	static boolean accSearch() {
		String acc ;
		System.out.println("계좌번호를 입력하세요");
		acc = scan.nextLine().trim().replace("-","");
		for (int i=0; i<CustomerCreation.userList.size(); i++) {
			if(CustomerCreation.userList.get(i).getAccountNumber().trim().replace("-","").equals(acc)) {
				System.out.println(CustomerCreation.userList.get(i).getName()+"님의 정보");
				System.out.println("계좌번호 : "+CustomerCreation.userList.get(i).getAccountNumber());
				System.err.println("계좌잔액 : "+CustomerCreation.userList.get(i).getBalance());
				System.out.println();
				setIndex(i);
				return true;

			} else if (i+1==CustomerCreation.userList.size()) {
				System.out.println("잘못된 데이터입니다");
			}
		}
		return false;
	}
	
	static void allSearch() {
		for (int i = 0; i < CustomerCreation.userList.size(); i++) {
				System.out.println("이름 : "+CustomerCreation.userList.get(i).getName()
								  +"| 계좌번호 : "+CustomerCreation.userList.get(i).getAccountNumber()
								  +"| 잔액 : "+CustomerCreation.userList.get(i).getBalance());
		}
	}
	
	
	
}
