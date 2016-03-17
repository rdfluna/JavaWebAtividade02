
public class HelperHtml {
	public static String html5(String title, String enunciado, String script, String body)
	{
		StringBuilder html5 = new StringBuilder();
		html5.append("<!DOCTYPE html>");
		html5.append("<html lang=\"pt-br\">");
		html5.append("<head>");
		html5.append("  <meta charset=\"ISO-8859-1\">");
		html5.append("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" charset=\"ISO-8859-1\">");
		html5.append("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
		html5.append("  <title>").append(title).append("</title>");
		html5.append("  <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" rel=\"stylesheet\">");
		html5.append("  <script src=\"http://code.jquery.com/jquery-2.2.1.min.js\" integrity=\"sha256-gvQgAFzTH6trSrAWoH1iPo9Xc96QxSZ3feW6kem+O00=\" crossorigin=\"anonymous\"></script>");
		html5.append("  <style type=\"text/css\">");
		html5.append("	div {");
		html5.append("		padding-top: 5px;");
		html5.append("		padding-bottom: 5px;");
		html5.append("	}");
		html5.append("  </style>");
		html5.append("  <script type=\"text/javascript\">").append(script).append("</script>");
		html5.append("  <script type=\"text/javascript\">");
		html5.append("    $(document).ready(function() {");
		html5.append("      $(\".nav-tabs a\").each(function() {");
		html5.append("        if($(this).attr(\"href\") == window.location.pathname){");
		html5.append("          $(this).parent().addClass(\"active\");");
		html5.append("        }");
		html5.append("      });");
		html5.append("    });");
		html5.append("  </script>");
		html5.append("</head>");
		html5.append("<body>");
		html5.append("    <!-- Container -->");
		html5.append("    <div class=\"container\">");
		html5.append("      <div class=\"row clearfix c\">");
		html5.append("        <div class=\"col-md-12\">");
		html5.append("			<ul class=\"nav nav-tabs\">");
		html5.append("				<li role=\"presentation\"><a href=\"/Revisao01/Exe01\">Exercicio 01</a></li>");
		html5.append("				<li role=\"presentation\"><a href=\"/Revisao01/Exe02\">Exercicio 02</a></li>");
		html5.append("				<li role=\"presentation\"><a href=\"/Revisao01/Exe03\">Exercicio 03</a></li>");
		html5.append("				<li role=\"presentation\"><a href=\"/Revisao01/Exe04\">Exercicio 04</a></li>");
		html5.append("				<li role=\"presentation\"><a href=\"/Revisao01/Exe05\">Exercicio 05</a></li>");
		html5.append("				<li role=\"presentation\"><a href=\"/Revisao01/Exe06\">Exercicio 06</a></li>");
		html5.append("				<li role=\"presentation\"><a href=\"/Revisao01/Exe07\">Exercicio 07</a></li>");
		html5.append("				<li role=\"presentation\"><a href=\"/Revisao01/Exe08\">Exercicio 08</a></li>");
		html5.append("				<li role=\"presentation\"><a href=\"/Revisao01/Exe09\">Exercicio 09</a></li>");
		html5.append("				<li role=\"presentation\"><a href=\"/Revisao01/Exe10\">Exercicio 10</a></li>");
		html5.append("			</ul>");
		html5.append("        </div>");
		html5.append("      </div>");
		html5.append("      <div class=\"row clearfix c\">");
		html5.append("        <div class=\"col-md-12\">");
		html5.append("          <p class=\"bg-primary\">").append(enunciado).append("</p>");
		html5.append(body);
		html5.append("        </div>");
		html5.append("      </div>");
		html5.append("    </div>");
		html5.append("    <!-- /Container -->");
		html5.append("</body>");
		html5.append("</html>");
		
		return html5.toString();
	}
}
