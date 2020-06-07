package com.topscit.ssm.service;

import java.util.List;

import com.topscit.ssm.bean.Address;

public interface AddressService {
	
	public List<Address> getAddressList();
	
	void addAddress(Address address);

}
