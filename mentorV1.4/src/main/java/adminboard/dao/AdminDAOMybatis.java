package adminboard.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import adminboard.bean.AdminboardDTO;

@Repository("adminboardDAO")
@Transactional
public class AdminDAOMybatis implements AdminboardDAO{
	
	@Autowired
	SqlSession sqlsession;
	
	@Override
	public List<AdminboardDTO> getAdminboardList(int startNum, int endNum) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("startNum", startNum);
		map.put("endNum", endNum);
		return sqlsession.selectList("adminboardSQL.getAdminboardList", map);
	}

	@Override
	public int getTotalA() {
		return sqlsession.selectOne("adminboardSQL.getTotalA");
	}

}
