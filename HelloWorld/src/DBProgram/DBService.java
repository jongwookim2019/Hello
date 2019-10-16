package DBProgram;

import java.util.List;

public interface DBService {

	public void insertEmployee(DB db);

	public DB getName(String name);

	public List<DB> getdepartmentName();

	public void updateDepartment(DB db);

	public void deleteEmployee(DB db);
}
