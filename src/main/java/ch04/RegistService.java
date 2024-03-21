package ch04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegistService {
	Map<String, Regist> customers = new HashMap<>();

	public RegistService() {
		Regist customer = new Regist("101", "김지우", "서울시", "silver", "010-1111-1111");
		customers.put(customer.getId(), customer);
		customer = new Regist("102", "홍길동", "인천시", "gold", "010-2222-2222");
		customers.put(customer.getId(), customer);
		customer = new Regist("103", "율곡", "김포시", "vip", "010-3333-3333");
		customers.put(customer.getId(), customer);
	}

	public List<Regist> findAll() {
		return new ArrayList<>(customers.values());
	}

	public Regist find(String id) {
		return customers.get(id);
	}
}
