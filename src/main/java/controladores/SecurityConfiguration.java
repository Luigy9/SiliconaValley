package controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true)

public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Autowired
	 public UserRepositoryAuthenticationProvider authenticationProvider;

	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests().antMatchers("/").permitAll();
		http.authorizeRequests().antMatchers("/index").permitAll();
		http.authorizeRequests().antMatchers("/login").authenticated();
		http.authorizeRequests().antMatchers("/carritoDetalles").hasAnyRole("USER","ADMIN");
		http.authorizeRequests().antMatchers("/modificarProducto").hasAnyRole("ADMIN");
		http.authorizeRequests().anyRequest().permitAll();
		
        http.formLogin().loginPage("/controladorLogin");
        http.formLogin().usernameParameter("username");
        http.formLogin().passwordParameter("pass");
        http.formLogin().defaultSuccessUrl("/login");
        http.formLogin().failureUrl("/controladorRegistro");
        
        http.logout().logoutUrl("/logout");
        http.logout().logoutSuccessUrl("/logout");
        
        http.csrf().disable();
	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//		auth.inMemoryAuthentication().withUser("user").password("pass").roles("USER");
//		
//		auth.inMemoryAuthentication().withUser("admin").password("adminpass").roles("USER", "ADMIN");
		
		auth.authenticationProvider(authenticationProvider);
	}
}
