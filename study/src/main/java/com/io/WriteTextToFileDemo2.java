
package com.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTextToFileDemo2 {

	public static void main(String[] args) {
		// 將文字資料寫入到檔案
		String data1 = "Happy Birthday";
		String data2 = "新年快樂";
		try(FileWriter fw1 = new FileWriter("src/main/java/com/io/data/hello.txt")){
			fw1.write(data1);
			fw1.write("\r\n"); // 斷行
			fw1.write(data2);
			fw1.write("\r\n"); // 斷行
			System.out.println("寫入成功 !");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}