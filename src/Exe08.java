

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Exe08")
public class Exe08 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String enunciado = "08) Um vendedor necessita de um algoritmo que calcule o preço total devido por um cliente. O algoritmo deve receber <BR />o código de um produto e a quantidade comprada e calcular o preço total, usando a tabela abaixo: <BR />Código do produto | Preço unitário <BR /> 1001 | R$ 5,32 <BR /> 1324 | R$ 6,45 <BR /> 6548 | R$ 2,37 <BR /> 0987 | R$ 5,32 <BR /> 7623 | R$ 6,45";
		String title = "Exercicio 08";
		String script = "";
		StringBuilder body = new StringBuilder();
		body.append("<form method=\"POST\">");
		body.append("  <div class=\"form-group\">");
		body.append("    <label for=\"codigo\">Digite o código do produto</label>");
		body.append("    <input type=\"number\" class=\"form-control\" name=\"codigo\">");
		body.append("  </div>");		
		body.append("  <div class=\"form-group\">");
		body.append("    <label for=\"qnt\">Digite a quantidade do produto</label>");
		body.append("    <input type=\"number\" class=\"form-control\" name=\"qnt\">");
		body.append("  </div>");			
		body.append("  <button type=\"submit\" class=\"btn btn-primary\">Enviar</button>");
		body.append("</form>");
		out.println(HelperHtml.html5(title, enunciado, script, body.toString()));
		
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int codigo = Integer.parseInt(request.getParameter("codigo"));
		int qnt = Integer.parseInt(request.getParameter("qnt"));
        Double tot,
        pr1 = 5.32,
        pr2 = 6.45,
        pr3 = 2.37,
        pr4 = 5.32,
        pr5 = 6.45;

        switch (prod)
        {
            case (1001):
        		body.append("<p>Valor desse produto: R$ 5.32 <BR />");
                tot = pr1 * qnt;
                body.append(qnt).append(" X 5.32 <BR />");
                body.append("O total da compra é: R$").append(tot).append("</p>");
            break;
            case (1324):
        		body.append("<p>Valor desse produto: R$ 6.45 <BR />");
                tot = pr2 * qnt;
                body.append(qnt).append(" X 6.45 <BR />");
                body.append("O total da compra é: R$").append(tot).append("</p>");
            break;
            case (6548):
        		body.append("<p>Valor desse produto: R$2.37 <BR />");
                tot = pr3 * qnt;
                body.append(qnt).append(" X 2.37 <BR />");
                body.append("O total da compra é: R$").append(tot).append("</p>");
            break;
            case (0987):
        		body.append("<p>Valor desse produto: R$ 5.32 <BR />");
                tot = pr4 * qnt;
                body.append(qnt).append(" X 5.32 <BR />");
                
                body.append("O total da compra é: R$").append(tot).append("</p>");
            break;
            case (7623):
        		body.append("<p>Valor desse produto: R$6.45 <BR />");
                tot = pr5 * qnt;
                body.append(qnt).append(" X 6.45 <BR />");
                body.append("O total da compra é: R$").append(tot).append("</p>");
            break;
            default:
                body.append("<p>Esta opcao de produto nao existe!</p>");
            break;
        }

		PrintWriter out = response.getWriter();
		String enunciado = "08) Um vendedor necessita de um algoritmo que calcule o preço total devido por um cliente. O algoritmo deve receber <BR />o código de um produto e a quantidade comprada e calcular o preço total, usando a tabela abaixo: <BR />Código do produto | Preço unitário <BR /> 1001 | R$ 5,32 <BR /> 1324 | R$ 6,45 <BR /> 6548 | R$ 2,37 <BR /> 0987 | R$ 5,32 <BR /> 7623 | R$ 6,45";
		String title = "Exercicio 08";
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
