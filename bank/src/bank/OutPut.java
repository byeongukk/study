package bank;

import java.util.ArrayList;
import java.util.Arrays;

public class OutPut {
	final static String AC_LOGIN = "계좌번호를 입력해주세요";
	final static String PW_LOGIN = "비밀번호를 입력해주세요";
	final static String LOGIN_SUCCESE = "님 로그인이 성공했습니다";
	final static String LOGIN_FAIL = "로그인실패\n계좌번호 또는 비밀번호를 정확히 입력해주세요";
	final static String LOGIN_INFO = "로그인이 필요합니다";
	final static String AC_ERROR = "잘못된 계좌번호입니다";
	final static String LINE =       "=====================================";
	final static String MAINCHOICE = "1.고객용 2.관리자용 10.종료";
	final static String USERCHOICE = "1.신규가입 2.잔액조회 3.입금 4.출금 5.이체 6.개인정보수정  10.종료";
	final static String BANKCHOICE = "1.자산조회 2.정보수정 3.고객정보찾기 10.종료";
	
	final static String UC_INQUIRIES = "잔액조회 서비스입니다 ";
	final static String UC_DEPOSIT = "입금서비스입니다 입금하실 금액을 입력해주세요";
	final static String UC_WITHDRAWAL = "출금서비스입니다 출금하실 금액을 입력해주세요";
	final static String WD_BL_INSUFFICIENT = "계좌의 잔액이 부족합니다";
	final static String UC_TRANSFER = "이체서비스입니다 입금하실 계좌번호를 입력해주세요";
	final static String UC_TF_BALANCE = "이체하실 금액을 입력해주세요";
	final static String UC_MODIFICATION = "1.비밀번호변경 2.이름변경";
	final static String UC_NEW_REGISTRATION = "신규가입 메뉴입니다";
	final static String NRR_NAME = "신규가입을 위한 이름을 입력해주세요";
	final static String NRR_PW = "신규가입을 위한 비밀번호를 입력해주세요";
	final static String NRR_SUCCESE = "신규가입이 완료되었습니다";
	final static String PWD_CHAN = "변경하실 비밀번호를 입력해주세요";
	final static String NAME_CHAN = "변경하실 이름을 입력해주세요";
	final static String CHAN_SUC = "변경되었습니다";
	
	final static String BC_ASSETS = "자산조회";
	final static String BC_MODIFICATION = "1.비밀번호변경 2.이름변경";
	final static String BC_MC_ACC = "고객의 계좌번호를 입력하세요";
	
	final static String BC_USER_INFO = "1.이름으로찾기 2.계좌번호로찾기 3.전체출력";
	final static String ADMIN_ID_LOGIN = "아이디를 입력하세요";
	final static String ADMIN_PW_LOGIN = "비밀번호를 입력하세요";
	final static String ADMIN_LOGIN_SUCCESE = "로그인성공";
	final static String ADMIN_LOGIN_FAIL = "로그인실패";
	
	final static String CLOSE = "종료됩니다";
	final static String NUMBER_ERROR = "숫자로 입력해 주십시오";
	final static String MENU_ERROR = "목록에서 골라주십시오";
	
	static void mainDisplay() {
		System.out.println(LINE);
		System.out.println(MAINCHOICE);
		System.out.println(LINE);
	}


}