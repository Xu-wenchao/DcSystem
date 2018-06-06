package com.dcits.base.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcits.base.pojo.Keycode;
import com.dcits.base.service.KeyCodeServices;

@RestController
public class KeyCodeController {

	@Autowired
	private KeyCodeServices services;

	@RequestMapping("/getTaskTypes")
	public HashMap<String, List<Keycode>> getTaskTypes() {
		return new HashMap<String, List<Keycode>>() {
			{
				put("tasks", services.getTaskTypes());
			}
		};
	}
	
	@RequestMapping("/getProposerDeparts")
	public HashMap<String, List<Keycode>> getProposerDeparts() {
		return new HashMap<String, List<Keycode>>() {
			{
				put("departs", services.getProposerDeparts());
			}
		};
	}
	@RequestMapping("/getResultTypes")
	public HashMap<String, List<Keycode>> getResult() {
		return new HashMap<String, List<Keycode>>() {
			{
				put("results", services.getResultTypes());
			}
		};
	}
}
