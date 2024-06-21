package com.QuadGodFitness;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = QuadGodFitnessApplication.class)
public class QuadGodFitnessApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(QuadGodFitnessApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("Loading application context for QuadGodFitnessApplicationTests...");
        // This test will fail if the application context cannot be loaded
    }
}

