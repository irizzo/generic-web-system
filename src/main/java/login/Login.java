package login;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import users.*;
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public Login() {
        super();
    }

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		User savedUser = new User("username", "pass");
		String inputUsername = req.getParameter("username");
		String inputPassword = req.getParameter("password");
		
		if (inputUsername == "" || inputPassword =="") {
			throw new IOException();
		}
		
		res.setContentType("text/html");
		res.getWriter().println("dygydauydagdya");
		
		if(!inputUsername.equals(savedUser.getUsername())) {
			if (!res.isCommitted()) {
				res.sendError(400, "Nome de Usuário Inválido");
				return;
			}
		}
		
		if(!inputPassword.equals(savedUser.getPassword())) {
			if (!res.isCommitted()) {
				res.sendError(400, "Senha Inválida");
				return;
			}
		}
		
		if (!res.isCommitted()) {
			res.sendRedirect("loginSuccess.html");
			System.out.println("tudo ok");
		}
	}
}
