package org.koreait.exam01;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(value="org.koreait",  excludeFilters=@Filter(type=FilterType.ASSIGNABLE_TYPE, classes= {MemberDao.class)) // = (value="org.koreait") = ("org.koreait")
//@ComponentScan(value="org.koreait", excludeFilters=@Filter(type=FilterType.ANNOTATION, classes= {ManualBean.class}))
//@ComponentScan(value="org.koreait", excludeFilters= @Filter(type=FilterType.ASPECTJ, pattern="org.koreait..*.*Dao"))
@ComponentScan("org.koreait")
public class AppCtx {
	
}
