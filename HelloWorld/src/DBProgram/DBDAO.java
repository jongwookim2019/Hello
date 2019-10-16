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
		String sql
	}

	public List<DB> getdepartmentName() {
		conn = DAO.getConnect();
		String sql = "select * from employees";
		List<DB> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				DB db = new DB();
				db.setEmployeeNo(rs.getInt("employee_no"));
				db.setName(rs.getString("name"));
				db.setDepartmentName(rs.getString("department_name"));
				db.setSalary(rs.getInt("salary"));
				db.setHareDate(rs.getDate("hare_date"));
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

	public DB getName(String name) {
		DB db = null;
		conn = DAO.getConnect();
		String sql = "select * from employees where name = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				db = new DB();
				db.setEmployeeNo(rs.getInt("employee_no"));
				db.setName(rs.getString("name"));
				db.setDepartmentName(rs.getString("department_name"));
				db.setSalary(rs.getInt("salary"));
				db.setHareDate(rs.getDate("hare_date"));
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

	public void deleteEmployee(DB db) {
		conn = DAO.getConnect();
		String sql = "delete employees where employee_no = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, db.getEmployeeNo());
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
		String sql = "insert into employees values(emp_seq.nextval,?,?,?,sysdate)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, db.getName());
			pstmt.setString(2, db.getDepartmentName());
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
