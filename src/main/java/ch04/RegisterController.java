package ch04;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/rcontrol")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	RegistService service;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		service = new RegistService();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action"); // 두 번째 페이지 request 할 때에는 action값이 존재
		String view = "";

		if (action == null) { // 최초로 페이지 request 할 때 실행되는 부분
			getServletContext().getRequestDispatcher("/rcontrol?action=list").forward(req, resp);
		} else {
			switch (action) {
			case "list":
				view = list(req, resp);
				break;
			case "info":
				view = info(req, resp);
				break;
			}
			getServletContext().getRequestDispatcher("/ch04/" + view).forward(req, resp);
		}
	}

	private String list(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("customers", service.findAll());
		return "registList.jsp";
	}

	private String info(HttpServletRequest req, HttpServletResponse resp) {
		String id = req.getParameter("id");
		req.setAttribute("c", service.find(id));
		return "registInfo.jsp";
	}
}
