package covServ;

import java.util.List;

public class GetPostLogic {
	public List<PostBean> execute() {
		postlistDAO dao = new postlistDAO();
		List<PostBean> postList = dao.findAll();
		return postList;
	}
}
