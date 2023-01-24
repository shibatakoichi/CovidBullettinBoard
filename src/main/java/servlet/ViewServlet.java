package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GetPostLogic;
import model.PostBean;


@WebServlet("/home")
public class ViewServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	 throws ServletException, IOException {
		GetPostLogic getPostLogic = new GetPostLogic();
		List<PostBean> postList = getPostLogic.execute();
		request.setAttribute("postList", postList);
	}
}

