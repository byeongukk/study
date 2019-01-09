package com.kh.array;

public class C_arrayCopy {
	public void shallowCopy() {
		//얕은복사
		//얕은복사는 배열의 주소만 복사한다.
		
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = originArr;
		
		String str = "";
		//originArr 의 값확인
		for(int i = 0; i < originArr.length; i++) {
			if(i != originArr.length - 1) {
				str += originArr[i] + ", ";
			} else {
				str += originArr[i];
			}
		}
		
		System.out.println("originArr : " + str);
		
		str= "";
		//copyArr 의 값확인
		for(int i = 0; i < copyArr.length; i++) {
			if(i != copyArr.length - 1) {
				str += copyArr[i] + ", ";
			} else {
				str += copyArr[i];
			}
		}
		System.out.println("copyArr : " + str);
		
		//원본 배열의 0번째 인덱스를 99로 변경
		originArr[0] = 99;
		
		//변경후 원본배열 값 확인
		System.out.println("변경 후");
		str="";
		for(int i=0; i < originArr.length; i++) {
			if(i != originArr.length - 1) {
				str += originArr[i] + ", ";
			} else {
				str += originArr[i];
			}
		}
		System.out.println("originArr : " + str);
		str ="";
		
		//변경후 복사배열 값 확인
		for(int i=0; i <copyArr.length; i++) {
			if(i != copyArr.length - 1) {
				str += copyArr[i] + ", ";
			} else {
				str += copyArr[i];
			}
		}
		System.out.println("copyArr : " + str);
		
		System.out.println("originArr의 hashCode : " + originArr.hashCode());
		System.out.println("copyArr 의 hashCode  : " + copyArr.hashCode());
	}
	public void deepCopy() {
		//깊은복사
		//깊은복사는 동일한 배열을 하나 생성하고 값을 복사하는 것이다
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[originArr.length];
		
		//for문을 이용한 값 1:1복사
		for(int i = 0; i < originArr.length; i++) {
			copyArr[i] = originArr[i];
		}
		
		//원본 배열 출력
		String str = "";
		for(int i = 0; i < originArr.length; i++) {
			if(i != originArr.length-1) {
				str += originArr[i] + ", ";
			} else {
				str += originArr[i];
			}
		}
		System.out.println("originArr : " + str);
		
		//복사 배열 출력
		str = "";
		for(int i=0; i < copyArr.length; i++) {
			if(i != copyArr.length-1) {
				str += copyArr[i] + ", ";
			} else {
				str += copyArr[i];
			}
		}
		System.out.println("copyArr : " + str);
		
		//원본 배열 0번째 인덱스에 값을 99로 변경
		originArr[0] = 99;
		System.out.println("변경후");
		//변경후 원본 배열 출력
		str = "";
		for(int i = 0; i < originArr.length; i++) {
			if(i != originArr.length-1) {
				str += originArr[i] + ", ";
			} else {
				str += originArr[i];
			}
		}
		System.out.println("originArr : " + str);
		
		//변경후 복사 배열 출력
		str = "";
		for(int i=0; i <copyArr.length; i++) {
			if(i != copyArr.length-1) {
				str += copyArr[i] + ", ";
			} else {
				str += copyArr[i];
			}
		}
		System.out.println("copyArr : " + str);
		
		System.out.println("originArr의 hashCode : " + originArr.hashCode());
		System.out.println("copyArr의 hashCode : " + copyArr.hashCode());
		
	}
	public void deepCopy2() {
		//arraycopy()를 이용한 배열 복사
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		//arraycopy(원본배열명, 복사를시작할인덱스, 복사할배열명,복사를시작할인덱스, 복사할길이);
		System.arraycopy(originArr, 0, copyArr, 3, originArr.length);
	
		//배열값 출력
		
		//원본 배열값 출력
		String str = "";
		
		for(int i = 0; i < originArr.length; i++) {
			if(i != originArr.length - 1) {
				str += originArr[i] + ", ";
			} else {
				str += originArr[i];
			}
		}
		System.out.println("originArr : " + str );
		
		//복사 배열값 출력
		str = "";
		
		for(int i = 0; i < copyArr.length; i++) {
			if(i != copyArr.length - 1) {
				str += copyArr[i] + ", ";
			} else {
				str += copyArr[i];
			}
		}
		System.out.println("copyArr : " + str);
		
		System.out.println("originArr의 hashCode : " + originArr.hashCode());
		System.out.println("copyArr 의 hashCode : " + copyArr.hashCode());
	}
	public void deepCopy3() {
		//clone()을 이용한 복사
		//시작 인덱스를 지정할 수 없음, 원본 배열을 통째로 복사를 해서 새로운 배열을 만듦;
		
		int[] originArr = {1,2,3,4,5};
		int[] copyArr = new int[10];
		
		System.out.println("준비된 복사본 배열의 주소 : " + copyArr.hashCode());
		
		copyArr = originArr.clone();
		
		System.out.println("복사된 배열의 주소 : " + copyArr.hashCode());
		//배열값 출력
		String str = "";
		
		for(int i = 0; i < originArr.length; i++) {
			if(i != originArr.length - 1) {
				str += originArr[i] + ", ";
			} else {
				str += originArr[i];
			}
		}
		System.out.println("originArr : "+ str);
		
		str ="";
		for(int i = 0; i < copyArr.length; i++) {
			if(i != copyArr.length - 1 ) {
				str += copyArr[i] + ", ";
			} else {
				str += copyArr[i];
			}
		}
		System.out.println("copyArr : " + str );
	}


}
