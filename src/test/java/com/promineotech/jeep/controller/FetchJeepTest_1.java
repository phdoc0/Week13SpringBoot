package com.promineotech.jeep.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT) 
@ActiveProfiles("test") 
@Sql(scripts = {
		"classpath: flyway/migrations/V1.0_Jeep_Schema.sql",
		"Classpath: flyway/migrations/V1.1_Jeep_Data.sql"},
		config = @SqlConfig(encoding = "utf-8"))
class FetchJeepTest_1 {

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
