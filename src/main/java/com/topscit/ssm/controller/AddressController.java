package com.topscit.ssm.controller;

import java.util.HashMap;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.topscit.ssm.bean.Address;
import com.topscit.ssm.service.AddressService;

@Controller
@RequestMapping("/address")
public class AddressController {
	
	@Resource
	private AddressService addressService;

	@RequestMapping("/getAddressList")
	@ResponseBody
	public List<Address> getAddressList()
	{
		List<Address> addressList = addressService.getAddressList();
		return addressList;
	}
	
	@RequestMapping("/addAddress")
	@ResponseBody
	public HashMap<Object,Object>  addAddress(@RequestBody Address address)
	{
		addressService.addAddress(address);
		HashMap<Object,Object> hashMap = new HashMap<>();
		hashMap.put("state", true);
		return hashMap;
	}
	
}
