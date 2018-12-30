package bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class CustomerCreation {
	static Map<String, Object> customerData = new HashMap<>();
	static List<Users> userList = new ArrayList<>();

	static void creation(int user,int accLength,int min,int max) {
		for (int i=0; i<user; i++) {
			Users users = new Users();
			users.setName(setRandomName());
			users.setPassword(setRandomPassword(10));
			users.setBalance(setRandomMoney(min,max));
			users.setAccountNumber(setRandomAccount(accLength));
			userList.add(i, users);
		}
	}

	//�ܾ� ���� ����
	static int setRandomMoney(int min, int max){
		int money = randomNumber(min,max);
		return money;
	}

	//�̸� ���� ����
	static String setRandomName(){
		Random random = new Random();
		String fullName = null;
		String[] firstName = {"��","��","��","��","��","��","��"};
		String[] secName   = {"��","��","��","��","��","��","��","��","��","��"};
		String[] thirdName = {"��","��","��","ī","Ÿ","��","��","��","��","��"};
		for(int i=0; i<5; i++) {
			fullName = (firstName[random.nextInt(firstName.length)]
					             + secName[random.nextInt(secName.length)] 
					             + thirdName[random.nextInt(thirdName.length)]);
		}
		return fullName;
	}
	
	//���� ���� ����
	static String setRandomAccount(int length) {
		final String hyphen = " ";
		String[] acNum = new String[length];
		String account = " ";
		for(int i =0; i<acNum.length; i++) { 
			acNum[i] = String.valueOf(randomNumber(1000,9000)); 
		}
		for(int i =0; i<acNum.length; i++) { 
			account += acNum[i]+hyphen; 
		}
		String fullAccount = account.trim().replace(" ","-");
		//�ߺ����� ��
		return fullAccount;
	}

	//��� ��ȣ ���� ����
	static String setRandomPassword(int length) {
		String psw = null;
		for(int i=0; i<length; i++) { psw += randomNumber(); }
		String psw1 = psw.substring(4);
		return psw1;
	}
	
	
	//���� ���� ����
	static int randomNumber(int min,int max) {
		Random rnd = new Random();
		int i = rnd.nextInt(max)+min;
		return i;
	}
	static String randomNumber() {
		Random rnd = new Random();
		String i =String.valueOf((char) ((int) (rnd.nextInt(93)) + 33));
		return i;
	}
}

