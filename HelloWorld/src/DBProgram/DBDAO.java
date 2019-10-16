package DBProgram;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBDAO {
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;

	public void updateDepartment(DB db) {
		conn = DAO.getConnect();
		String sql = "update emp set dept_name=? where emp_id = ?";
		int n = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			if (db.getDeptName() != null && !db.getDeptName().equals("")) {
				pstmt.setString(++n, db.getDeptName());
			}
			pstmt.setInt(++n, db.getEmpId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public List<DB> getEmpList() {
		conn = DAO.getConnect();
		String sql = "select * from emp";
		List<DB> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				DB db = new DB();
				db.setEmpId(rs.getInt("emp_id"));
				db.setName(rs.getString("name"));
				db.setDeptName(rs.getString("dept_name"));
				db.setSalary(rs.getInt("salary"));
				db.setHireDate(rs.getDate("hire_date"));
				list.add(db);

			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public DB getDeptName(String deptName) {
		DB db = null;
		conn = DAO.getConnect();
		String sql = "select * from emp where dept_name = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, deptName);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				db = new DB();
				db.setEmpId(rs.getInt("emp_id"));
				db.setName(rs.getString("name"));
				db.setDeptName(rs.getString("dept_name"));
				db.setSalary(rs.getInt("salary"));
				db.setHireDate(rs.getDate("hire_date"));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return db;

	}

	public List<DB> getName(String name) {
		List<DB> list = new ArrayList<>();
		DB db = null;
		conn = DAO.getConnect();
		String sql = "select * from emp where name = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				db = new DB();
				db.setEmpId(rs.getInt("emp_id"));
				db.setName(rs.getString("name"));
				db.setDeptName(rs.getString("dept_name"));
				db.setSalary(rs.getInt("salary"));
				db.setHireDate(rs.getDate("hire_date"));
				list.add(db);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;

	}

	public void deleteEmp(DB db) {
		conn = DAO.getConnect();
		String sql = "delete emp where emp_id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, db.getEmpId());
			int r = pstmt.executeUpdate();
			System.out.println(r + " 건이 삭제되었습니다.");

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public void insertEmployee(DB db) {
		conn = DAO.getConnect();
		String sql = "insert into emp values(emp_seq.nextval,?,?,?,sysdate)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, db.getName());
			pstmt.setString(2, db.getDeptName());
			pstmt.setInt(3, db.getSalary());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
