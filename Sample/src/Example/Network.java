package Example;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JFrame;
//1. Ŭ���� ����     <<��ü���� ppt ���� ����>>

class Network {
	public static void main(String[] args) {
		JFrame j = new JFrame();
		j.setSize(1000,1000);//��ü�̿�
		j.setVisible(true);
		JFrame j2 = new JFrame();
		j2.setSize(200,200);//��ü�̿�
		j2.setVisible(true);
		
		
		//2. ��ǰ(��ü)����
		Network n = new Network();
		
		//3. ��ü �̿�
		String result = n.get(); // �Ʒ� �ִ� get�� String���� ���� ���� result�� ����
		System.out.println(result);
//Q.�ζ� ��ȣ�� ã�� �ʹ�  ----------- <span>"�ζǹ�ȣ"</span> 
		int s_idx = 0; // ������ġ
		int e_idx = 0; // ������ ��ġ
		while (true) {
			s_idx = result.indexOf("<span>", ++s_idx);// ���� �ڱ� ��ġ���� �ϳ� �������� ã�ƶ� (++ �߰�)
			e_idx = result.indexOf("</span>", ++s_idx);// ã�� ��ġ�� �ٽ� ������ġ�� ����
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
			System.out.println("�����߻�");
			e.printStackTrace();
		}
		return response.toString();
	}
}