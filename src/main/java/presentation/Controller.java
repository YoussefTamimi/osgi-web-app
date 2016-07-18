package presentation;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Controller extends HttpServlet {

	public Controller() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1- creer un bean
		
		
		String projectName = request.getParameter("project");
		HttpSession session = request.getSession(true);
		ProjectBean pb = new ProjectBean();
		pb.setName(projectName);
		session.setAttribute("pb", pb);
		
		//2- Declanche une action
		ConfigAdminAction task = new ConfigAdminAction();
		ExecutorService service =  Executors.newSingleThreadExecutor();
		Future<String> future = service.submit(task);
		service.shutdown();
		try {
			pb.setInfo(future.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		//3- Designe une page de reponse
		
	ServletContext context = this.getServletContext();
	RequestDispatcher rd = context.getRequestDispatcher("/pages/response.jsp");
	rd.forward(request, response);
		
	
	}
	
	

}
