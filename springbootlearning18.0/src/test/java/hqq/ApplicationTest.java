package hqq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ApplicationTest
 * Created by heqianqian on 2017/7/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTest {
    private Logger logger = LoggerFactory.getLogger(ApplicationTest.class);

    @Test
    public void test() throws Exception {
        logger.info("info");
        logger.debug("debug");
        logger.error("error");
    }
}