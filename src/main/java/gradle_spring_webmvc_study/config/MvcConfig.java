package gradle_spring_webmvc_study.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc //스프링 MVC설정 활성화
public class MvcConfig implements WebMvcConfigurer {

	
	//DispatcherServlet의 매핑경로를 '/' 주었을 때, JSP/HTML/CSS등을 올바르게 처리하기 위한 설정 추가 
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	// JSP(view)를 통해서 컨트롤러의 실행결과를 보여주기 위한 설정*/
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/view/", ".jsp");
		//.do 나.jsp 같은 확장명을 안붙여도 파일명만으로 찾아준다. 
	}
	
}
