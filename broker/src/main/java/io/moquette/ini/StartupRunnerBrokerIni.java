package io.moquette.ini;

import io.moquette.EmbeddedLauncher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value=2)
public class StartupRunnerBrokerIni implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());




    @Autowired
    EmbeddedLauncher embeddedLauncher;



    @Override
    public void run(String... args) throws Exception {

        logger.info(">>>>>>>>>>>>>>>初始化broker<<<<<<<<<<<<<");
        embeddedLauncher.inibroker();

    }




















}
