package DBProgram;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.board.common.DAO;
import com.board.model.BoardDB;

public class DBDAO {
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;

	public List<DB> getdepartmentName(String departmentName) {
		conn = DAO.getConnect();
		DB db = null;
		String sql = "select * from employees where department_name = ?";
		List<DB> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, departmentName);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				db = new DB();
				db.setEmployeeNo(rs.getInt("employee_no"));
				db.setName(rs.getString("name"));
				db.setDepartmentName(rs.getString("department_name"));
				db.setSalary(rs.getInt("salary"));
				db.setHareDate(rs.getDate("hare_date"));
			} else {
				DB db1 = new DB();
				db1.setEmployeeNo(rs.getInt("employee_no"));
				db1.setName(rs.getString("name"));
				db1.setDepartmentName(rs.getString("department_name"));
				db1.setSalary(rs.getInt("salary"));
				db1.setHareDate(rs.getDate("hare_date"));
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
		return null;
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
