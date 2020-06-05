package Example;

//경우의 수를 따져서 
public class Mabang {

	public static void main(String[] args) {
		int n = 5;
		int[][] mabang = new int[n][n]; // 5*5 행렬
		// x : 세로축, y : 가로축
		// 첫 좌표값
		int x = 0;
		int y = n / 2;
		mabang[x][y] = 1; // 1부터시작
		for (int i = 2; i <= n * n; i++) {
			// 다음 숫자를 찍을 좌표 (좌측 대각선)
			x = x - 1;
			y = y - 1; // 11시방향으로 이동 (행/열 둘다 -1;)

			if (x < 0) { // 세로축이 음수일때
				if (y < 0) {// 가로축 음수일때 //Ex>15 //한줄 내림
					x += 2;
					y += 1;
				} else {
					x = n - 1; // 제일 아래로 내림
				}
				// 가로축을 마방진 크기 가장 오른쪽 좌표로 지정
				// 가로축 세로축 정상일때
			} else {
				if (y < 0) {
					y = n - 1;
				} else {
					// 다 정상인데 숫자가 입력되어있는 경우 //제일 외곽인경우와 동일
					if (mabang[x][y] != 0) {
						x += 2;
						y += 1;
					}
				}
			}
			mabang[x][y] = i; // 계산된 x와 y 좌표에 맞춰 다음 숫자 입력
		}
		for (int i = 0; i < mabang.length; i++) {
			for (int j = 0; j < mabang[i].length; j++) {
				System.out.print(mabang[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
