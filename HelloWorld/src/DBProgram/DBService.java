package DBProgram;

import java.util.List;

public interface DBService {

	public void insertEmp(DB db);

	public List<DB> getName(String name);

	public DB getDeptName(String DeptName);

	public List<DB> getEmpList();

	public void updateDept(DB db);

	public void deleteEmp(DB db);
}
