package com.dhanjyothi.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.dhanjyothi.Person;
import com.dhanjyothi.PersonService;
/**
 * @author senthil.kumart
 *
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
//@ComponentScan(basePackages = "com.dhanjyothi")
@ContextConfiguration(classes = { TestBeanConfig.class })
//@SpringBootTest
public class ServiceTest {

	@Autowired
	PersonService ser;
	private Person p;
	@Before
	public void setup() {
		System.out.println(" Before method..");
		p=new Person();
	}
	/* @Test
	   public void testGet() {
		 //p.setId(1);
		 p.setName("Ram");
		 p.setPhone("120");
		 p.setCity("chennai");
		 ser.savePerson(p);
		List<Person> p=ser.FetchPerson();
		for (Person personObj : p) {
		       assertEquals("Ram",personObj.getName() );
	    }

	 }*/
	 
	 @Test
	   public void testUpdate() {
		 Person pers=ser.getPersonById(12);
		 pers.setName("Ramu");
		 ser.updatePerson(pers);
		  pers=ser.getPersonById(12);
		  assertEquals("Ramu",pers.getName() );
	 }
	 
	
}
