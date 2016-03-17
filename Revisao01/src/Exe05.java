

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Exe05")
public class Exe05 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String enunciado = "05) Utilizando vetor, faça um programa em Java que leia dois vetores (podem ter o tamanho diferente) já ordenados de <BR />forma crescente. Crie um outro vetor para armazenar os dois conjuntos unidos, sendo que os números devem <BR />permanecer ordenados. Finalmente, exiba este vetor resultante.";
		String title = "Exercicio 05";
		StringBuilder script = new StringBuilder();
		script.append("  $(document).ready(function() {");
		script.append("	    $(\".addInput1\").click(function(e){");
		script.append("	        e.preventDefault();");
		script.append("	        $(this).parent().append('<div><input type=\"number\" class=\"form-control\" name=\"n1[]\"/><a href=\"#\" class=\"remove_field\">Remove</a></div>');");
		script.append("	    });");
		script.append("	    ");
		script.append("	    $(\".addInput2\").click(function(e){");
		script.append("	        e.preventDefault();");
		script.append("	        $(this).parent().append('<div><input type=\"number\" class=\"form-control\" name=\"n2[]\"/><a href=\"#\" class=\"remove_field\">Remove</a></div>');");
		script.append("	    });");
		script.append("	    ");
		script.append("	    $(\".form-group\").on(\"click\",\".remove_field\", function(e){");
		script.append("	        e.preventDefault(); $(this).parent('div').remove(); ");
		script.append("	        x--;");
		script.append("	    })");
		script.append("	});");
		StringBuilder body = new StringBuilder();
		body.append("<form method=\"POST\">");
		body.append("  <div class=\"form-group\">");
		body.append("    <label>Digite so números de forma crescente do vetor 1</label>");
		body.append("    <button type=\"button\" class=\"addInput1 btn btn-success\">Adicionar mais um campo para o vetor 1</button>");
		body.append("    <div><input type=\"number\" class=\"form-control\" name=\"n1[]\"></div>");
		body.append("  </div>");
		body.append("  <div class=\"form-group\">");
		body.append("    <label>Digite so números de forma crescente do vetor 2</label>");
		body.append("    <button type=\"button\" class=\"addInput2 btn btn-success\">Adicionar mais um campo para o vetor 2</button>");
		body.append("    <div><input type=\"number\" class=\"form-control\" name=\"n2[]\"></div>");
		body.append("  </div>");
		body.append("<button type=\"submit\" class=\"btn btn-primary\">Enviar</button>");
		body.append("</form>");
		out.println(HelperHtml.html5(title, enunciado, script.toString(), body.toString()));
		
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String vet1[] = request.getParameterValues("n1[]");
		String vet2[] = request.getParameterValues("n2[]");
		int vet3 = vet1.length + vet2.length;
		int resultado[] = new int[vet3];
		
		for(int i = 0; i < vet1.length; i++){
			resultado[i] = Integer.parseInt(vet1[i]);
		}
		
		for(int i = 0; i < vet2.length; i++){
			resultado[i + vet1.length] = Integer.parseInt(vet2[i]);
		}
		
		Arrays.sort(resultado);

		PrintWriter out = response.getWriter();
		String enunciado = "05) Utilizando vetor, faça um programa em Java que leia dois vetores (podem ter o tamanho diferente) já ordenados de <BR />forma crescente. Crie um outro vetor para armazenar os dois conjuntos unidos, sendo que os números devem <BR />permanecer ordenados. Finalmente, exiba este vetor resultante.";
		String title = "Exercicio 05";
		String script = "";
		StringBuilder body = new StringBuilder();
		body.append("<div class=\"jumbotron\">");
		body.append("  <p>Terceiro vetor ordenado: </p>");

		for (int i = 0; i < vet3; i++) {
			body.append("<div>").append(resultado[i]).append("</div>");
		} 
		body.append("</div>");

		out.println(HelperHtml.html5(title, enunciado, script, body.toString()));
		out.close();
	}

}
