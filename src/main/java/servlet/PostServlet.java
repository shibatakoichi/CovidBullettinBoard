package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DoPostLogic;
import model.PostBean;


@WebServlet("/postcomplete")
public class PostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
	 	throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			
			String age = request.getParameter("age");
			String gender = request.getParameter("gender");
			String prefId = request.getParameter("prefId");
			String vaccineCount = request.getParameter("vaccineCount");
			String infectionRoute = request.getParameter("infectionRoute");
			String recuperationForm = request.getParameter("recuperationForm");
			String recuperationDays = request.getParameter("recuperationDays");
			String situation = request.getParameter("situation");
			String contactperson = request.getParameter("contactperson");
			String symptoms = request.getParameter("symptoms");
			String service = request.getParameter("service");
			String tocure = request.getParameter("tocure");
			String other = request.getParameter("other");
			
			PostBean p = new PostBean();
			p.setAge(age);
			p.setGender(gender);
			p.setPrefId(prefId);
			p.setVaccineCount(vaccineCount);
			p.setInfectionRoute(infectionRoute);
			p.setRecuperationForm(recuperationForm);
			p.setRecuperationDays(recuperationDays);
			p.setSituation(situation);
			p.setContactperson(contactperson);
			p.setSymptoms(symptoms);
			p.setService(service);
			p.setTocure(tocure);
			p.setOther(other);
			
			request.setAttribute("p", p);
			
			DoPostLogic doPostLogic = new DoPostLogic();
			doPostLogic.execute(p);
			
			RequestDispatcher dispatcher =
					 request.getRequestDispatcher("/jsp/postComplete.jsp");
			 dispatcher.forward(request, response);
		}
}
