package ch04;

public class Game {
	public static void main(String[] args) {
		String text = "g fmnc wms bgblr rpylqjyrc gr zw" + " fylb.	rfyrq ufyr amknsrcpq ypc dmp. bmgle"
				+ " gr glzw fylb gq glcddgagclr ylb rfyr' q ufw rfgq"
				+ " rcvr gq qm jmle.sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj.";
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (c >= 'y') {
				System.out.print((char) (c + 2 - 26)); // y,z�� 2���ϸ� �ٽ� a�� ���ư��� �����ߵ�
			} else if (c != ' ') {
				System.out.print((char) (c + 2));
			} else {
				System.out.print(c);
			}

		}

	}
}