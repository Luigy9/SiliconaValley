package controladores;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
public class securityConfiguration extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests().antMatchers("/").permitAll();
		http.authorizeRequests().antMatchers("/index").permitAll();

		http.authorizeRequests().antMatchers("bootstrap.min").permitAll();
		http.authorizeRequests().antMatchers("style").permitAll();
		
		http.authorizeRequests().antMatchers("/controladorLogin").authenticated();
		http.authorizeRequests().antMatchers("/carritoDetalles").authenticated();
		http.authorizeRequests().anyRequest().permitAll();
	}
	//@Override
	/*protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication().withUser("user").password("pass").roles("USER");
	}*/
}
