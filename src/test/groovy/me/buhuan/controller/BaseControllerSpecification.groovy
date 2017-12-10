package me.buhuan.controller;

import me.buhuan.springbootspock.SpringbootSpockApplication
import org.junit.Before
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.web.WebAppConfiguration
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.context.WebApplicationContext
import spock.lang.Shared
import spock.lang.Specification

import javax.sql.DataSource

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/12/10
 */
@ContextConfiguration
@WebAppConfiguration
@SpringBootTest(classes = SpringbootSpockApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@Transactional
class BaseControllerSpecification extends Specification {

	@Shared
	protected MockMvc mockMvc

	@Autowired
	protected WebApplicationContext context

	@Autowired
	protected DataSource dataSource

	@Before
	void setupMockMvc() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build()
	}
}
