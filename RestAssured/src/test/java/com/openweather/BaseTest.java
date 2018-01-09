package com.openweather;

import io.restassured.RestAssured;
import org.junit.After;
import org.junit.Before;

/**
 * Created by Raman_Patsiayuk
 */
public class BaseTest {

    @Before
    public void setUp(){
        RestAssured.baseURI = "http://api.openweathermap.org/data/2.5/weather";
        System.out.println("Method before run");
    }

    @After
    public void tearDown(){
        System.out.println("Method after run");
    }
}
