package com.bloghub.config;


import com.bloghub.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.autoconfigure.security.ConditionalOnDefaultWebSecurity;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@RequiredArgsConstructor
@Configuration(proxyBeanMethods = false)
@ConditionalOnDefaultWebSecurity
@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
public class WebSecurityConfig {

  private final UserService userService;

  @Bean
  @Order(SecurityProperties.BASIC_AUTH_ORDER)
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
      http
      .authorizeRequests() // 6
        .antMatchers("/login", "/signup", "/user").permitAll() // 누구나 접근 허용
        .antMatchers("/").hasRole("USER") // USER, ADMIN만 접근 가능
        .antMatchers("/admin").hasRole("ADMIN") // ADMIN만 접근 가능
        .anyRequest().authenticated() // 나머지 요청들은 권한의 종류에 상관 없이 권한이 있어야 접근 가능
    .and() 
      .formLogin() // 7
        .loginPage("/login") // 로그인 페이지 링크
        .defaultSuccessUrl("/") // 로그인 성공 후 리다이렉트 주소
    .and()
      .logout() // 8
        .logoutSuccessUrl("/login") // 로그아웃 성공시 리다이렉트 주소
    .invalidateHttpSession(true); // 세션 날리기

   return http.build();
  }
}