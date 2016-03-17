

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Exe03")
public class Exe03 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String enunciado = "03) Fa�a um programa que solicite ao usu�rio o ano e imprima \"Ano Bissexto\" ou \"Ano N�o-Bissexto\". Um ano � <BR />bissexto se for divis�vel por 4, mas n�o por 100. Um ano tamb�m � bissexto se for divis�vel por 400.";
		String title = "Exercicio 03";
		String script = "";
		StringBuilder body = new StringBuilder();
		
		body.append("<form method=\"POST\">");
		body.append("  <div class=\"form-group\">");
		body.append("    <label for=\"n\">Digite um ano valido</label>");
		body.append("    <input type=\"number\" class=\"form-control\" name=\"n\" min=\"1000\" max=\"9999\">");
		body.append("  </div>");		
		body.append("  <button type=\"submit\" class=\"btn btn-primary\">Enviar</button>");
		body.append("</form>");
		
		out.println(HelperHtml.html5(title, enunciado, script, body.toString()));
		
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n = Integer.parseInt(request.getParameter("n"));

		PrintWriter out = response.getWriter();
		String enunciado = "03) Fa�a um programa que solicite ao usu�rio o ano e imprima \"Ano Bissexto\" ou \"Ano N�o-Bissexto\". Um ano � <BR />bissexto se for divis�vel por 4, mas n�o por 100. Um ano tamb�m � bissexto se for divis�vel por 400.";
		String title = "Exercicio 03";
		String script = "";
		StringBuilder body = new StringBuilder();
		body.append("<div class=\"jumbotron\">");
		if((n % 4 == 0 && n % 100 != 0) || n % 400 == 0) {
			body.append("<p>O ano � bissexto!</p>");
		}
		else {
			body.append("<p>O ano N�O � bissexto!</p>");
		}
		body.append("</div>");
		out.println(HelperHtml.html5(title, enunciado, script, body.toString()));
		out.close();
	}

}
