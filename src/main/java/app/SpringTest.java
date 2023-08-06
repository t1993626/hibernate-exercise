package app;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import web.member.dao.MemberDao;
import web.member.entity.Member;

public class SpringTest {

	public static void main(String[] args) {
		//container
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		MemberDao memberDao = applicationContext.getBean(MemberDao.class);
			
		for(Member member: memberDao.selectAll()) {
			System.out.println(member.getNickname());
		}

	}

}
