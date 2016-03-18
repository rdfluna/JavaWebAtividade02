

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Exe09")
public class Exe09 extends HttpServlet {
	private String enunciado = "09) Criar um programa em Java que receba pelo teclado uma string qualquer. O programa deverá verificar e imprimir os <BR />caracteres que representam as vogais sem acento (a, e, i, o, u) da string digitada, exemplo: <BR />Entrada : Minha mãe é linda. <BR />Saída : i a e i a";
	private String title = "Exercicio 09";
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String script = "";
		StringBuilder body = new StringBuilder();
		body.append("<form method=\"POST\">");
		body.append("  <div class=\"form-group\">");
		body.append("    <label for=\"f\">Digite uma frase</label>");
		body.append("    <input type=\"text\" class=\"form-control\" name=\"f\">");
		body.append("  </div>");		
		body.append("  <button type=\"submit\" class=\"btn btn-primary\">Enviar</button>");
		body.append("</form>");
		out.println(HelperHtml.html5(title, enunciado, script, body.toString()));
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String phase = request.getParameter("f");
		String vowels = "aeiouAEIOU";

		PrintWriter out = response.getWriter();
		String script = "";
		StringBuilder body = new StringBuilder();
		body.append("<div class=\"jumbotron\">");
		
		body.append("<p>");
		for(char c: phase.toCharArray()) {
			for(char v: vowels.toCharArray()) {
				if(c == v)
					body.append(c).append(" ");
			}
		}
		body.append("<p>");

		body.append("</div>");
		out.println(HelperHtml.html5(title, enunciado, script, body.toString()));
		out.close();
	}

}
