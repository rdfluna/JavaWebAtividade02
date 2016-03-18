

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Exe04")
public class Exe04 extends HttpServlet {
	private String enunciado = "04) A importância de 780.000,00 será dividida entre os três primeiros colocados de um concurso, em partes <BR />diretamente proporcionais aos pontos conseguidos por eles. Construa um programa que solicite o número de pontos <BR />dos três primeiros colocados e imprima a importância que caberá a cada um.";
	private String title = "Exercicio 04";
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String script = "";
		StringBuilder body = new StringBuilder();
		
		body.append("<form method=\"POST\">");
		body.append("  <div class=\"form-group\">");
		body.append("    <label for=\"p\">Qual a pontuação do primeiro</label>");
		body.append("    <input type=\"number\" class=\"form-control\" name=\"p\">");
		body.append("    <label for=\"s\">Qual a pontuação do segundo</label>");
		body.append("    <input type=\"number\" class=\"form-control\" name=\"s\">");
		body.append("    <label for=\"t\">Qual a pontuação do terceiro</label>");
		body.append("    <input type=\"number\" class=\"form-control\" name=\"t\">");
		body.append("  </div>");		
		body.append("  <button type=\"submit\" class=\"btn btn-primary\">Enviar</button>");
		body.append("</form>");
		
		out.println(HelperHtml.html5(title, enunciado, script, body.toString()));
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double valor = 780.000;
		double p, s, t, pont, sum, tot;

		p = Double.parseDouble(request.getParameter("p"));
		s = Double.parseDouble(request.getParameter("s"));
		t = Double.parseDouble(request.getParameter("t"));
		
		pont = p + s + t;
		sum = valor/pont;
		
		p =  sum*p;
		s = sum*s;
		t = sum*t;
		
		tot = p + s + t;

		PrintWriter out = response.getWriter();
		String script = "";
		StringBuilder body = new StringBuilder();
		body.append("<div class=\"jumbotron\">");
		
		body.append("  <p>A importância do primeiro colocado foi de ").append(p).append("</p>");
		body.append("  <p>A importância do segundo colocado foi de ").append(s).append("</p>");
		body.append("  <p>A importância do terceiro colocado foi de ").append(t).append("</p>");
		body.append("  <p>Total ").append(tot).append("</p>");
		
		body.append("</div>");
		out.println(HelperHtml.html5(title, enunciado, script, body.toString()));
		out.close();
	}

}
