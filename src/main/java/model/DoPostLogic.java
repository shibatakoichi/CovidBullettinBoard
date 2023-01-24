package model;

import dao.postlistDAO;

public class DoPostLogic {
	public void execute(PostBean p) {
		postlistDAO dao = new postlistDAO();
		dao.create(p);
	}
}
