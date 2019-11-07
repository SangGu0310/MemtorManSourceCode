package adminboard.dao;

import java.util.List;

import adminboard.bean.AdminboardDTO;

public interface AdminboardDAO {

	public List<AdminboardDTO> getAdminboardList(int startNum, int endNum);

	public int getTotalA();

}
