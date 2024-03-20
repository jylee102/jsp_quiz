package ch03;

public class GuGuDan {
	public int[] process(int n) {
		int arr[] = new int[9];

		for (int i = 1; i <= 9; i++) {
			arr[i - 1] = n * i; // 결과값들을 배열에 저장
		}

		return arr;
	}
}
