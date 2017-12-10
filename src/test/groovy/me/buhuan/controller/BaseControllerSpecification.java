package me.buhuan.controller;

import me.buhuan.springbootspock.SpringbootSpockApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;
import spock.lang.Specification;

/**
 * @author hbh
 * @version 1.0.0
 * @since 2017/12/10
 */
@ContextConfiguration
@WebAppConfiguration
@SpringBootTest(classes = SpringbootSpockApplication.class,webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@Transactional
public class BaseControllerSpecification extends Specification {
}
