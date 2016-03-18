

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Exe07")
public class Exe07 extends HttpServlet {
	private String enunciado = "07) Criar um programa que leia um vetor de 10 elementos inteiros. Apresente na tela apenas os números PARES.";
	private String title = "Exercicio 07";
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String script = "";
		StringBuilder body = new StringBuilder();
		body.append("<form method=\"POST\">");
		body.append("  <div class=\"form-group\">");
		body.append("    <label for=\"n[]\">Digite o 1 número</label>");
		body.append("    <input type=\"number\" class=\"form-control\" name=\"n[]\">");
		body.append("  </div>");		
		body.append("  <div class=\"form-group\">");
		body.append("    <label for=\"n[]\">Digite o 2 número</label>");
		body.append("    <input type=\"number\" class=\"form-control\" name=\"n[]\">");
		body.append("  </div>");		
		body.append("  <div class=\"form-group\">");
		body.append("    <label for=\"n[]\">Digite o 3 número</label>");
		body.append("    <input type=\"number\" class=\"form-control\" name=\"n[]\">");
		body.append("  </div>");		
		body.append("  <div class=\"form-group\">");
		body.append("    <label for=\"n[]\">Digite o 4 número</label>");
		body.append("    <input type=\"number\" class=\"form-control\" name=\"n[]\">");
		body.append("  </div>");		
		body.append("  <div class=\"form-group\">");
		body.append("    <label for=\"n[]\">Digite o 5 número</label>");
		body.append("    <input type=\"number\" class=\"form-control\" name=\"n[]\">");
		body.append("  </div>");		
		body.append("  <div class=\"form-group\">");
		body.append("    <label for=\"n[]\">Digite o 6 número</label>");
		body.append("    <input type=\"number\" class=\"form-control\" name=\"n[]\">");
		body.append("  </div>");		
		body.append("  <div class=\"form-group\">");
		body.append("    <label for=\"n[]\">Digite o 7 número</label>");
		body.append("    <input type=\"number\" class=\"form-control\" name=\"n[]\">");
		body.append("  </div>");		
		body.append("  <div class=\"form-group\">");
		body.append("    <label for=\"n[]\">Digite o 8 número</label>");
		body.append("    <input type=\"number\" class=\"form-control\" name=\"n[]\">");
		body.append("  </div>");		
		body.append("  <div class=\"form-group\">");
		body.append("    <label for=\"n[]\">Digite o 9 número</label>");
		body.append("    <input type=\"number\" class=\"form-control\" name=\"n[]\">");
		body.append("  </div>");		
		body.append("  <div class=\"form-group\">");
		body.append("    <label for=\"n[]\">Digite o 10 número</label>");
		body.append("    <input type=\"number\" class=\"form-control\" name=\"n[]\">");
		body.append("  </div>");		
		body.append("  <button type=\"submit\" class=\"btn btn-primary\">Enviar</button>");
		body.append("</form>");
		out.println(HelperHtml.html5(title, enunciado, script, body.toString()));
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num[] = request.getParameterValues("n[]");
		
		PrintWriter out = response.getWriter();
		String script = "";
		StringBuilder body = new StringBuilder();
		body.append("<div class=\"jumbotron\">");
		
        body.append("<p>Os números pares são: </p>");
        for (int i = 0; i < num.length; i++)
        {
            if (Integer.parseInt(num[i]) % 2 == 0)
            {
				body.append("<div>").append(num[i]).append("</div>");
            }
        }

		body.append("</div>");
		out.println(HelperHtml.html5(title, enunciado, script, body.toString()));
		out.close();
	}

}
