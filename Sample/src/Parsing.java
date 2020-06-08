//import java.io.IOException;
//import java.util.Scanner;
//
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//
//public class Parsing {
//	public static void main(String[] args) throws IOException {
//		Document doc = 
//				Jsoup.connect("https://comic.naver.com/webtoon/list.nhn?titleId=651673&weekday=sat").get(); 
//		String title = doc.title();
//		System.out.println(title);
//		
//		Elements es = doc.select("td.title > a");
//		for(int i = 0; i < es.size(); i++) {
//			Element e = es.get(i);
//			String s = e.text();
//			System.out.println(s);
//			
//			String href = e.attr("href");
//			System.out.println(href);
//		}
//	}
//}
//
//
//
//
