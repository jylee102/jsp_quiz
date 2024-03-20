package ch07;

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
		String result = "유효성 검사에 통과하지 못했습니다.";
		if (email.matches(pattern1) && tel.matches(pattern2)) {
			result = "환영합니다!";
		}
		return result;
	}
}
