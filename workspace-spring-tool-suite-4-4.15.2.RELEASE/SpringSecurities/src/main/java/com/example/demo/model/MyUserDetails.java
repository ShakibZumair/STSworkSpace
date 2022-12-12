//package com.example.demo.model;
//
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//public class MyUserDetails implements UserDetails {
//private String userName;
//private String password;
//private List<GrantedAuthority> authorities;
//private boolean active;
//
//public MyUserDetails() {
//	
//}
//
//
//
//public MyUserDetails(User user) {
//	super();
//	this.userName =user.getUserName();
//	this.password = user.getPassword();
//	this.active = user.isActive();
//	//this.authorities=Arrays.asList(user.getRoles().split(",")).stream().map(r->new SimpleGrantedAuthority(r)).collect(Collectors.toList());
//}
//
//@Override
//public Collection<? extends GrantedAuthority> getAuthorities() {
//	// TODO Auto-generated method stub
//	return authorities;
//}
//@Override
//public String getPassword() {
//	// TODO Auto-generated method stub
//	return password;
//}
//@Override
//public String getUsername() {
//	// TODO Auto-generated method stub
//	return null;
//}
//@Override
//public boolean isAccountNonExpired() {
//	// TODO Auto-generated method stub
//	return false;
//}
//@Override
//public boolean isAccountNonLocked() {
//	// TODO Auto-generated method stub
//	return false;
//}
//@Override
//public boolean isCredentialsNonExpired() {
//	// TODO Auto-generated method stub
//	return false;
//}
//@Override
//public boolean isEnabled() {
//	// TODO Auto-generated method stub
//	return false;
//}
//}
