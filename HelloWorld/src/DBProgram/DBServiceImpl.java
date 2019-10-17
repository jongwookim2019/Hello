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
		 List<DB> list = dao.getName(name);
		 return list;
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
	public List<DB> getDeptName(String DeptName) {
		 List<DB> list = dao.getDeptName(DeptName);
		 return list;
	}
}
