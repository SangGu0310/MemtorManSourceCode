package adminboard.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import adminboard.bean.AdminboardDTO;
import adminboard.bean.AdminboardPaging;
import adminboard.service.AdminboardService;

/** 
 * @Title : 관리자페이지 게시판관리 컨트롤러입니다
 * @author : 안상구
 * @date : 2019. 11. 5.
 * 이해 안가시는 부분이있으면 연락주세요
 */

@Controller
@RequestMapping(value="adminboard")
public class AdminBoardController {
	
	@Autowired
	private AdminboardService adminboardService;
	@Autowired
	private AdminboardPaging adminboardPaging;
	
	@RequestMapping(value="admincommuList",method = RequestMethod.GET)
	public String admincommuList(Model model) {
		model.addAttribute("display", "/adminboard/admincommuList.jsp");
		return "/admin/adminMain";
	}
	
	@RequestMapping(value="adminessayList",method = RequestMethod.GET)
	public String adminessayList(Model model) {
		model.addAttribute("display", "/adminboard/adminessayList.jsp");
		return "/admin/adminMain";
	}
	
	@RequestMapping(value="admingroupList",method = RequestMethod.GET)
	public String admingroupList(Model model) {
		model.addAttribute("display", "/adminboard/admingroupList.jsp");
		return "/admin/adminMain";
	}
	
	@RequestMapping(value="adminnoticeboardList",method = RequestMethod.GET)
	public String admninnoticeboardList(@RequestParam (required=false,defaultValue="1") String pg, 
										Model model, 
										HttpSession session ) {
		int endNum = Integer.parseInt(pg)*10;
		int startNum = endNum-9;
		List<AdminboardDTO> list = adminboardService.getAdminboardList(startNum,endNum);
		
		//페이징처리
		int totalA = adminboardService.getTotalA();
		adminboardPaging.setCurrentPage(Integer.parseInt(pg));
		adminboardPaging.setPageBlock(3);
		adminboardPaging.setPageSize(10);
		adminboardPaging.setTotalA(totalA);
		adminboardPaging.makePagingHTML();
		
		model.addAttribute("list", list);
		model.addAttribute("adminboardPaging)", adminboardPaging);
		model.addAttribute("display", "/adminboard/adminnoticeboardList.jsp");
		return "/admin/adminMain";
	}
	
	
}
