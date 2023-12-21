package webbroker.config;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception{
        return httpSecurity
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(
                        authorizeRequests -> authorizeRequests
                                .requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
                                .requestMatchers("/", "/login", "/login-error").permitAll()
                                .requestMatchers("/images/**").permitAll()
                                .requestMatchers("/error").permitAll()
                                .anyRequest().authenticated()
                ).formLogin(
                       formLogin -> formLogin
                                .loginPage("/login")
                               .usernameParameter("username")
                               .passwordParameter("password")
                               .defaultSuccessUrl("/home")
                               .failureForwardUrl("/login-error")
                ).logout(
                        logout ->   logout
                                .logoutUrl("/logout")
                                .logoutSuccessUrl("/")
                                .invalidateHttpSession(true)
                ).build();
    }
}
