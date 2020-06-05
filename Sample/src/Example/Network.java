package Example;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JFrame;
//1. 클래스 설계     <<객체지향 ppt 설명 순서>>

class Network {
	public static void main(String[] args) {
		JFrame j = new JFrame();
		j.setSize(1000,1000);//객체이용
		j.setVisible(true);
		JFrame j2 = new JFrame();
		j2.setSize(200,200);//객체이용
		j2.setVisible(true);
		
		
		//2. 제품(객체)생성
		Network n = new Network();
		
		//3. 객체 이용
		String result = n.get(); // 아래 있는 get을 String으로 받음 변수 result에 적용
		System.out.println(result);
//Q.로또 번호만 찾고 싶다  ----------- <span>"로또번호"</span> 
		int s_idx = 0; // 시작위치
		int e_idx = 0; // 마지막 위치
		while (true) {
			s_idx = result.indexOf("<span>", ++s_idx);// 각자 자기 위치보다 하나 다음부터 찾아라 (++ 추가)
			e_idx = result.indexOf("</span>", ++s_idx);// 찾은 위치가 다시 시작위치로 지정
			if (e_idx == -1) {
				break;
			}
		}
		System.out.println(result.substring(s_idx + 6, e_idx));
	}

	public String get() {
		int number = 0;
		StringBuffer response = new StringBuffer();
		try {
			URL url = new URL("http://ggoreb.com/python/html/number.html");
			URLConnection urlConnection = url.openConnection();
			InputStream in = urlConnection.getInputStream();
			InputStreamReader isr = new InputStreamReader(in, "utf-8");
			BufferedReader reader = new BufferedReader(isr);
			String data = null;
			while ((data = reader.readLine()) != null) {
				response.append(data);
			}
			// number = Integer.parseInt(response.toString());
			reader.close();
			isr.close();
			in.close();
		} catch (Exception e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}
		return response.toString();
	}
}