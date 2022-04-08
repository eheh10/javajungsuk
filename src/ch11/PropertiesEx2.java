package ch11;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Properties;

class PropertiesEx2 {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("USAGE: java PropertiesEx2 INPUTFILENAME");
			System.exit(0);
		}

		Properties prop = new Properties();

		String inputFile = args[0];

		try {
			prop.load(new FileInputStream(Paths.get("src","ch11",inputFile).toString())); //InputStream 으로부터 목록을 읽어서 저장
		} catch(IOException e) {
			System.out.println("지정된 파일을 찾을 수 없습니다.");
			System.exit(0);
		}

		String name = prop.getProperty("name");
		try{
			// 파일의 데이터 인코딩이 라틴문자집합 8859_1
			name = new String(name.getBytes("8859_1"), StandardCharsets.UTF_8);
		}catch (Exception e){
			e.printStackTrace();
		}
		String[] data = prop.getProperty("data").split(",");
		int max = 0;
		int min = 0;
		int sum = 0;

		for(int i=0; i < data.length; i++) {
			int intValue = Integer.parseInt(data[i]);
			if (i==0) {
				max = min = intValue;
			}

			if (max < intValue) {
				max = intValue;
			} else if (min > intValue) {
				min = intValue;
			}

			sum += intValue;
		}

		System.out.println("이름 :"  + name);
		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);
		System.out.println("합계 :"  + sum);
		System.out.println("평균 :"  + (sum*100.0/data.length)/100);
	}
}
