package agenda;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/loginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("username");
		String senha = request.getParameter("password");

		if (email.equals("amaro.com.br") && senha.equals("0099")) {
			request.setAttribute("login", email);
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");

			rd.forward(request, response);

		} else {
			request.setAttribute("mensagem", "Usuário ou senha incorretos!");
			RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
	        rd.forward(request, response);
		}
	}
}