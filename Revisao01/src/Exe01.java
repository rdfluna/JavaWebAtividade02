

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Exe01")
public class Exe01 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String enunciado = "01) Utilizando vetor, faça um programa em Java que leia um conjunto de números. Exiba este conjunto acompanhado do seu elemento simétrico em relação a sua posição no conjunto.";
		String title = "Exercicio 01";
		StringBuilder script = new StringBuilder();
		script.append("  $(document).ready(function() {");
		script.append("	    var max_fields      = 10;");
		script.append("	    var x = 1;");
		script.append("	    $(\".addInput\").click(function(e){");
		script.append("	        e.preventDefault();");
		script.append("	        if(x < max_fields){");
		script.append("	            x++;");
		script.append("	            $(\".multiple-input\").append('<div><input type=\"number\" class=\"form-control\" name=\"n[]\"/><a href=\"#\" class=\"remove_field\">Remove</a></div>');");
		script.append("	        }");
		script.append("	    });");
		script.append("	    ");
		script.append("	    $(\".multiple-input\").on(\"click\",\".remove_field\", function(e){");
		script.append("	        e.preventDefault(); $(this).parent('div').remove(); ");
		script.append("	        x--;");
		script.append("	    })");
		script.append("	});");
		StringBuilder body = new StringBuilder();
		body.append("<form method=\"POST\">");
		body.append("<div class=\"multiple-input\">");
		body.append("    <button type=\"button\" class=\"addInput btn btn-success\">Adicionar mais um campo</button>");
		body.append("    <div><input type=\"number\" class=\"form-control\" name=\"n[]\"></div>");
		body.append("</div>");
		body.append("<button type=\"submit\" class=\"btn btn-primary\">Enviar</button>");
		body.append("</form>");
		out.println(HelperHtml.html5(title, enunciado, script.toString(), body.toString()));
		
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String numero[] = request.getParameterValues("n[]");
		int a = numero.length;
		int j = numero.length - 1;
		PrintWriter out = response.getWriter();
		String enunciado = "01) Utilizando vetor, faça um programa em Java que leia um conjunto de números. Exiba este conjunto acompanhado do seu elemento simétrico em relação a sua posição no conjunto.";
		String title = "Exercicio 01";
		String script = "";
		StringBuilder body = new StringBuilder();
		body.append("<div class=\"jumbotron\">");
		
		for(int i = 0; i < a; i++) {
			body.append("<div>").append(numero[i]).append("-").append(numero[j]).append("</div>");
			j--;
		} 
		body.append("</div>");
		out.println(HelperHtml.html5(title, enunciado, script, body.toString()));
		out.close();
	}

}
