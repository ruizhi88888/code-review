package org.dbappsecurity.sdk;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author CaiRuiZhi
 * @description
 * @create 2025/10/22 17:11
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiTest {
    @Test
    public void test() {
        System.out.println(Integer.parseInt("aaa"));
    }
}
