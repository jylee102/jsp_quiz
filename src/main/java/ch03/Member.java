package ch03;

import java.util.regex.Pattern;

public class Member {
	// 이메일 정규식
	public static final String pattern1 = "\\w+@\\w+\\.\\w+(\\.\\w+)?";

	// 전화번호 정규식
	public static final String pattern2 = "(02|010)-\\d{3,4}-\\d{4}";

	private String email;
	private String tel;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String result() {
		boolean checkEmail = Pattern.matches(pattern1, email);
		boolean checkPhone = Pattern.matches(pattern2, tel);

		if (checkEmail && checkPhone)
			return "환영합니다!";
		else
			return "유효성 검사에 통과하지 못했습니다.";
	}
}
