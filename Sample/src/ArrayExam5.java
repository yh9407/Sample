public class ArrayExam5 {
	public static void main(String[] args) {
		int[][] arr1 = new int[][] {
			{ 1, 2, 3 },
			{ 4, 5, 6 ,66,64,12},
			{ 7, 8, 9 },
			{ 10, 11, 12 }
			
		};
		for(int i = 0; i < arr1.length; i++ ) {
		//	int[] arr2 = arr1[i];  //ù��° ���ȣ�� �迭 i�� ���� arr1[1] �̸� arr2�� {1,2,3}
		//Q�ٿ��� ��� 
		//int value = arr1[i][1]; //������ ����ϴ� �ϵ��ڵ�
			for(int j =0; j< arr1[i].length; j++) { //������ �迭�̱⿡ arr1 '[i]' �� �߰�
				System.out.println(arr1[i][j]); //[i]�� �� ,[j]�� ���� �ǹ�.
				//�ڷ����� ���ǰ����� ��� ���� ���� �ƴϾ length�� �Ἥ ��� ����.
			}
		}
		
	}
	
}