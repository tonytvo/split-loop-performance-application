package org.splitloopperf.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import org.splitloopperf.IntegrationTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
