package com.topscit.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.topscit.ssm.bean.Address;
import com.topscit.ssm.mapper.AddressMapper;

@Service("addressService")
public class AddressServiceImpl implements AddressService{
	
	@Resource
	private AddressMapper addressMapper;

	@Override
	public List<Address> getAddressList() {
		List<Address> selectAddressList = addressMapper.selectAddressList();
		return selectAddressList;
	}

	@Override
	public void addAddress(Address address) {
		addressMapper.insertSelective(address);
	}
	
	

}
