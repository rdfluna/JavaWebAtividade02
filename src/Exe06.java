

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Exe06")
public class Exe06 extends HttpServlet {
	private String enunciado = "06) Fa�a um programa em Java que preencha um vetor de 10 posi��es com os 10 primeiros n�meros �mpares. <BR />OBS.: <BR />- Deve-se utilizar a estrutura de repeti��o FOR <BR />- N�o deve-se dobrar as itera��es do La�o FOR, ou seja, s�o apenas 10 itera��es, uma para cada n�mero �mpar.";
	private String title = "Exercicio 06";
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cont = 1;

		PrintWriter out = response.getWriter();
		String script = "";
		StringBuilder body = new StringBuilder();
		body.append("<div class=\"jumbotron\">");

		for (int i = 1; cont <= 10; i += 2) {
			body.append("<p>O ").append(cont).append("� n�mero impar = ").append(i).append("</p>");
			cont++;
		} 
		
		body.append("</div>");
		out.println(HelperHtml.html5(title, enunciado, script, body.toString()));
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
