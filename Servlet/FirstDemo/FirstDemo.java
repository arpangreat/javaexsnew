import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


public class FirstDemo extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
		int i = Integer.parseInt(res.getParameter("num1"));
		int j = Integer.parseInt(res.getParameter("num2"));
		int k = i + j;

		PrintWriter out = res.getWriter();
		out.println("Result is " + k);
	}

}

