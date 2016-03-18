

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Exe06")
public class Exe06 extends HttpServlet {
	private String enunciado = "06) Faça um programa em Java que preencha um vetor de 10 posições com os 10 primeiros números ímpares. <BR />OBS.: <BR />- Deve-se utilizar a estrutura de repetição FOR <BR />- Não deve-se dobrar as iterações do Laço FOR, ou seja, são apenas 10 iterações, uma para cada número ímpar.";
	private String title = "Exercicio 06";
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cont = 1;

		PrintWriter out = response.getWriter();
		String script = "";
		StringBuilder body = new StringBuilder();
		body.append("<div class=\"jumbotron\">");

		for (int i = 1; cont <= 10; i += 2) {
			body.append("<p>O ").append(cont).append("º número impar = ").append(i).append("</p>");
			cont++;
		} 
		
		body.append("</div>");
		out.println(HelperHtml.html5(title, enunciado, script, body.toString()));
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
