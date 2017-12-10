package me.buhuan.springbootspock.bean;

import lombok.Data;

import javax.persistence.*;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/12/10
 */
@Data
@Entity
@Table(name = "t01_user")
public class UserInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long userId;
	
	private String name;
	
	private Integer sex;
	
	private String address;
}
