package me.buhuan.controller.user;

import me.buhuan.controller.BaseControllerSpecification
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status


/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/12/10
 */
class UserControllerSpecification extends BaseControllerSpecification {

	void setup() {
		ResourceDatabasePopulator populate =
				new ResourceDatabasePopulator(context.getResources("classpath*:sql/user/*.sql"))
		DatabasePopulatorUtils.execute(populate, dataSource)
	}

	void cleanup() {

	}

	def "Test REST Find By User Id" () {
		given:
		def userId = 1001

		when:
		def result = get("user/${userId}")


		then:
		result.andExpect(status().isOk())

		and:
		def res = result2Res(result.andReturn())

		then:
		res.name == 'hbh'
	}
}
