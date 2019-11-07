package adminboard.service;

import java.util.List;

import adminboard.bean.AdminboardDTO;

public interface AdminboardService {

	public List<AdminboardDTO> getAdminboardList(int startNum, int endNum);

	public int getTotalA();
	
}
