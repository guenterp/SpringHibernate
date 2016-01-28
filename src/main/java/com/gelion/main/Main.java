package com.gelion.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gelion.model.Contact;
import com.gelion.dao.ContactDAO;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ContactDAO personDAO = context.getBean(ContactDAO.class);

        Contact person = new Contact();
        person.setName("Günter");
        person.setCountry("Austria");

        personDAO.save(person);

        System.out.println("Person::" + person);

        List<Contact> list = personDAO.list();

        for (Contact p : list) {
            System.out.println("Person List::" + p);
        }

        context.close();

    }

}
