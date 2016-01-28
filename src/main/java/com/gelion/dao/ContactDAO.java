package com.gelion.dao;

import java.util.List;

import com.gelion.model.Contact;

public interface ContactDAO {

	public void save(Contact p);
	
	public List<Contact> list();
	
}
