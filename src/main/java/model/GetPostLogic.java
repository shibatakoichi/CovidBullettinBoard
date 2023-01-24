package model;

import java.util.List;

import dao.postlistDAO;

public class GetPostLogic {
	public List<PostBean> execute() {
		postlistDAO dao = new postlistDAO();
		List<PostBean> postList = dao.findAll();
		return postList;
	}
}
