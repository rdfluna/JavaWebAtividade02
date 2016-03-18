

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Exe10")
public class Exe10 extends HttpServlet {
	private String enunciado = "10) Criar um programa em Java que receba pelo teclado uma string qualquer. O programa deverá imprimir o código <BR />ASCII de cada caractere da string digitada, por exemplo: <BR />Entrada : ALMIR <BR />Saída : 65 76 77 73 82 <BR />Pois: <BR />A = 65, L = 76, M = 77, I = 73, R = 82";
	private String title = "Exercicio 10";
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

		PrintWriter out = response.getWriter();
		String script = "";
		StringBuilder body = new StringBuilder();
		body.append("<div class=\"jumbotron\">");
		
		body.append("<p>");
		for(char c: phase.toCharArray()) {
			for (int i = 32; i <= 126; i++) {
				if(c == (char)i)
					body.append(i).append(" ");
        	}
		}
		body.append("<p>");

		body.append("</div>");
		out.println(HelperHtml.html5(title, enunciado, script, body.toString()));
		out.close();
	}

}
