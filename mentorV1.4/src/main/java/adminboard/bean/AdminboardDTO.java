package adminboard.bean;


import java.text.SimpleDateFormat;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class AdminboardDTO {
	private int seq;
	private String manager_email;
	private String title;
	private String content;
	private int hit;
	private String logtime;
}
