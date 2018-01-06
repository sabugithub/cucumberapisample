package com.test.java.steps;


import com.test.java.ResponseHolder;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.specification.RequestSpecification;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.*;

public class StepDef {

    @Given("^I have a new request$")
    public void i_have_a_new_request() throws Throwable {
        RequestSpecification request = RestAssured.given().contentType(ContentType.JSON).log().all();
        ResponseHolder.setResponse(
                request.get("http://www.mocky.io/v2/58db85110f00001524d66d8b"));
    }

    @When("^I get the request$")
    public void i_get_the_request() throws Throwable {
        System.out.println("The title is = " + ResponseHolder.getResponse().jsonPath().get("recommendations.episode.title[1]"));
    }

    @Given("^I have (\\d+) and (\\d+)$")
    public void i_have_and(int arg1, int arg2) throws Throwable {

    }

    @Then("^total should be (\\d+)$")
    public void total_should_be(int total) throws Throwable {
        System.out.println("total = " + total);
    }

    @Then("^a status code of (\\d+) is written$")
    public void a_status_code_of_is_written(int arg1) throws Throwable {

    }

    @Given("^I have the following details$")
    public void i_have_the_following_details(DataTable table) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)

//        Map<String,String> amap = table.asMap(String.class,String.class);
//        System.out.println(amap.entrySet());

        List<Student> astudent = table.asList(Student.class);
//        astudent.get(0).printStudent();

        for (Student s : astudent) {
            s.printStudent();
        }

    }

    @Given("^I have this$")
    public void i_have_this(DataTable table) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        List<Map<String, String>> amap = table.asMaps(String.class, String.class);
//        System.out.println(amap.entrySet());
        for (Map<String, String> readMap : amap) {
            System.out.println("username = " + readMap.get("Username"));
            System.out.println("Password = " + readMap.get("Password"));
        }
    }

    @Given("^i do some java stuff$")
    public void iDoSomeJavaStuff() throws Throwable {
        Map<String, String> exampleMap = new TreeMap<String, String>();
        exampleMap.put("firstvaluekey","firstvalue");
        exampleMap.put("secondvaluekey","secondvalue");
        exampleMap.put("thirdvaluekey","thirdvalue");

        System.out.println(exampleMap.entrySet());
    }


    public class Student {
        private String name;
        private String address;
        private int id;

        public Student(String name, int id, String address) {
            this.name = name;
            this.id = id;
            this.address = address;
        }

        public void printStudent() {
            System.out.println("\nStudent -> " + name + ", " + id + ", " + address);
        }
    }
}
