package DBProgram;

import java.util.List;

public class DBServiceImpl implements DBService {
	DBDAO dao = new DBDAO();

	@Override
	public void insertEmp(DB db) {
		dao.insertEmployee(db);

	}

	@Override
	public List<DB> getName(String name) {
		dao.getName(name);
		return dao.getName(name);
	}

	@Override
	public List<DB> getEmpList() {
		List<DB> list = dao.getEmpList();
		return list;

	}

	@Override
	public void updateDept(DB db) {
		dao.updateDepartment(db);
		System.out.println("변경되었습니다.");
	}

	@Override
	public void deleteEmp(DB db) {
		dao.deleteEmp(db);

	}

	@Override
	public DB getDeptName(String DeptName) {
		return dao.getDeptName(DeptName);
	}
}
