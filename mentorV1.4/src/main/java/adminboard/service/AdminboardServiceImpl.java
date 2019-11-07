package adminboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import adminboard.bean.AdminboardDTO;
import adminboard.dao.AdminboardDAO;

@Service
public class AdminboardServiceImpl implements AdminboardService{
	@Autowired
	private AdminboardDAO adminboardDAO;
	
	@Override
	public List<AdminboardDTO> getAdminboardList(int startNum, int endNum) {
		return adminboardDAO.getAdminboardList(startNum,endNum);
	}

	@Override
	public int getTotalA() {
		return adminboardDAO.getTotalA();
	}

}
