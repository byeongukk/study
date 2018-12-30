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

	//잔액 랜덤 생성
	static int setRandomMoney(int min, int max){
		int money = randomNumber(min,max);
		return money;
	}

	//이름 랜덤 생성
	static String setRandomName(){
		Random random = new Random();
		String fullName = null;
		String[] firstName = {"김","이","박","최","조","윤","권"};
		String[] secName   = {"가","나","다","라","마","바","사","민","대","병"};
		String[] thirdName = {"아","자","차","카","타","파","하","우","욱","대"};
		for(int i=0; i<5; i++) {
			fullName = (firstName[random.nextInt(firstName.length)]
					             + secName[random.nextInt(secName.length)] 
					             + thirdName[random.nextInt(thirdName.length)]);
		}
		return fullName;
	}
	
	//계좌 랜덤 생성
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
		//중복계좌 비교
		return fullAccount;
	}

	//비밀 번호 랜덤 생성
	static String setRandomPassword(int length) {
		String psw = null;
		for(int i=0; i<length; i++) { psw += randomNumber(); }
		String psw1 = psw.substring(4);
		return psw1;
	}
	
	
	//랜덤 숫자 생성
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

