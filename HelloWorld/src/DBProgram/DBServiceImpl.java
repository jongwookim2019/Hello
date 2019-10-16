package DBProgram;

import java.util.List;

public class DBServiceImpl implements DBService {
	DBDAO dao = new DBDAO();

	@Override
	public void insertEmployee(DB db) {
		dao.insertEmployee(db);

	}

	@Override
	public DB getName(String name) {
		dao.getName(name);
		return dao.getName(name);
	}

	@Override
	public List<DB> getdepartmentName() {
		List<DB> list = dao.getdepartmentName();
		return list;
		
	}

	@Override
	public void updateDepartment(DB db) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmployee(DB db) {
		dao.deleteEmployee(db);

	}
}
