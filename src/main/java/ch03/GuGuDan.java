package ch03;

public class GuGuDan {
	public String process(int num) {
		String result = "";
		for (int i = 1; i < 10; i++) {
			result += num + " * " + i + " = " + num * i + "<br>";
		}

		return result;
	}
}
