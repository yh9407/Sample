import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class ���ϴٿ�ε�2 {
	public static void main(String[] args) throws IOException {
		���ϴٿ�ε�2 f = new ���ϴٿ�ε�2();
		f.saveImage(
				"https://shared-comic.pstatic.net/thumb/webtoon/651673/490/thumbnail_202x120_3634b542-b593-43e2-a51c-e1d29b845db8.jpg", 
				"1.jpg");			
	}

	private void saveImage(String strUrl, String savePath) throws IOException {

		URL url = null;
		InputStream in = null;
		OutputStream out = null;

		try {

			url = new URL(strUrl);

			in = url.openStream();

			out = new FileOutputStream(savePath); // ������

			while (true) {
				// �̹����� �о�´�.
				int data = in.read();
				if (data == -1) {
					break;
				}
				// �̹����� ����.
				out.write(data);

			}

			in.close();
			out.close();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}

		}
	}
}
