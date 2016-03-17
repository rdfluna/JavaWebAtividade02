

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Exe02")
public class Exe02 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String enunciado = "02) Dizemos que um inteiro positivo N é perfeito se for igual à soma de seus divisores positivos diferentes de N, por <BR />exemplo: 6 é perfeito, pois 1 + 2 + 3 = 6. <BR />Criar um programa que dado um inteiro positivo N, verificar se N é perfeito.";
		String title = "Exercicio 02";
		String script = "";
		StringBuilder body = new StringBuilder();
		
		body.append("<form method=\"POST\">");
		body.append("  <div class=\"form-group\">");
		body.append("    <label for=\"n\">Digite um número inteiro positivo</label>");
		body.append("    <input type=\"number\" class=\"form-control\" name=\"n\">");
		body.append("  </div>");		
		body.append("  <button type=\"submit\" class=\"btn btn-primary\">Enviar</button>");
		body.append("</form>");
		
		out.println(HelperHtml.html5(title, enunciado, script, body.toString()));
		
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String n = request.getParameter("n");
		int a = Integer.parseInt(n);
		int b = 0;

		for(int i = a - 1; i > 0; i--) {
			if(a % i == 0)
				b = b + i;
		}

		PrintWriter out = response.getWriter();
		String enunciado = "02) Dizemos que um inteiro positivo N é perfeito se for igual à soma de seus divisores positivos diferentes de N, por <BR />exemplo: 6 é perfeito, pois 1 + 2 + 3 = 6. <BR />Criar um programa que dado um inteiro positivo N, verificar se N é perfeito.";
		String title = "Exercicio 02";
		String script = "";
		StringBuilder body = new StringBuilder();
		body.append("<div class=\"jumbotron\">");
		if(a == b) {
			body.append("<p>Número é perfeito!</p>");
		}
		else {
			body.append("<p>Número NÃO é perfeito!</p>");
		}
		body.append("</div>");
		out.println(HelperHtml.html5(title, enunciado, script, body.toString()));
		out.close();
	}

}
