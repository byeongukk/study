package com.kh.io.part01_byteStream.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestByteStream {
   public void fileOpen() {
      //파일로부터 byte 단위로 데이터를 읽어올 수 있는 스트림
      FileInputStream fin = null;
      
      try {
         fin = new FileInputStream("sample.dat");
         
      /*   //파일의 길이는 long 으로 리턴하기 때문에 int로 형변환함
         int fileSize = (int)new File("sample.dat").length();
         System.out.println(fileSize);
         
         byte[] bar = new byte[fileSize];
         
         fin.read(bar);
         
         for(int i = 0; i < bar.length; i++) {
            System.out.print((char)bar[i] + " ");
         }*/
         
         //바이트 배열 사용하지 않고 한 바ㄷ이트씩 읽는 방법
         int value;
         while((value = fin.read()) != -1) {
            System.out.print((char)value + " ");
         }
         
      } catch (FileNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
         try {
            fin.close();
         } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
   }
   
   public void fileOpen2() {
      
      //try with resource 구문으로 작성
      try(FileInputStream fin = new FileInputStream("sample.dat")){
         int fileSize = (int) new File("sample.dat").length();
         byte[] bar = new byte[fileSize];
         
         fin.read(bar);
         
         for(int i = 0; i < bar.length; i++) {
            System.out.println(bar[i] + " ");
         }
         
         
         
      }catch (FileNotFoundException e) {
         e.printStackTrace();
      }catch (IOException e) {
         e.printStackTrace();
      
      }
      
   }
   
   public void fileSave() {
      FileOutputStream fout = null;
      
      try {
         //대상 파일이 존재하지 않으면 자동으로 파일을 만듦
         fout = new FileOutputStream("sample.dat");
         
         fout.write(97);

         byte[] bar = {98, 99, 100, 101, 102, 10};
         fout.write(bar);
         fout.write(bar, 1, 3);
         
         
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {
    	  try {
			fout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	  
      }
      
      
   }
   
}
