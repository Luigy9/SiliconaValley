package controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true)

public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Autowired
	 public UserRepositoryAuthenticationProvider authenticationProvider;

	@Override
	protected void configure(HttpSecurity http) throws Exception{
		
		
		//Paginas publicas
		http.authorizeRequests().antMatchers("/").permitAll();
		http.authorizeRequests().antMatchers("/index").permitAll();
		http.authorizeRequests().antMatchers("/login").permitAll();
		
		
		//Paginas privadas
		//http.authorizeRequests().anyRequest().authenticated();
		
		http.authorizeRequests().antMatchers("/carritoDetalles").hasAnyRole("USER","ADMIN");
		http.authorizeRequests().antMatchers("/indexLogado").hasAnyRole("USER","ADMIN");
		http.authorizeRequests().antMatchers("/shop logado").hasAnyRole("USER","ADMIN");
		http.authorizeRequests().antMatchers("/product logado").hasAnyRole("USER","ADMIN");
		http.authorizeRequests().antMatchers("/controladorLogin").permitAll();
		
		http.authorizeRequests().antMatchers("/modificarProducto").hasRole("ADMIN");
		http.authorizeRequests().antMatchers("/eliminarProducto").hasRole("ADMIN");
		http.authorizeRequests().antMatchers("/agregarProducto").hasRole("ADMIN");
		http.authorizeRequests().antMatchers("/modificarProducto").hasRole("ADMIN");
		http.authorizeRequests().antMatchers("/modificarUsuario").hasRole("ADMIN");
		http.authorizeRequests().antMatchers("/eliminarUsuario").hasRole("ADMIN");
		http.authorizeRequests().antMatchers("/adminProducto").hasRole("ADMIN");
		http.authorizeRequests().antMatchers("/adminUsuario").hasRole("ADMIN");
		//http.authorizeRequests().anyRequest().permitAll();
		
		http.authorizeRequests().antMatchers("/carritoPagar").hasRole("USER");
		
		
		//Login
        http.formLogin().loginPage("/controladorLogin");
        http.formLogin().usernameParameter("username");
        http.formLogin().passwordParameter("pass");
        http.formLogin().defaultSuccessUrl("/indexLogado");
        http.formLogin().failureUrl("/controladorRegistro");        
        
        //Logout
        http.logout().logoutUrl("/index");
        http.logout().logoutSuccessUrl("/index");
        
        //CSRF
        //http.csrf().disable();
	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{	
		auth.authenticationProvider(authenticationProvider);
	}
}
