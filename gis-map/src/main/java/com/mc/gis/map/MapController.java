/**
 * 
 */
package com.mc.gis.map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mc.gis.common.spec.GeoPonRepository;

/**
 *
 */
@Controller
public class MapController {
	
	@Autowired
	GeoPonRepository geoPonRepository;
	
	@RequestMapping("/")
	public String home(){
		return "index";
	}
	@RequestMapping("/ponList")
	public String ponList(Model model) {
		model.addAttribute("pons", geoPonRepository.getAllGeoPons());
		return "ponList";
	}
	
	@RequestMapping("/ponDetails")
	public String ponDetails(@RequestParam("ponAddress") String ponAddress, Model model) {
		model.addAttribute("pon", geoPonRepository.getGeoPon(ponAddress));
		return "ponDetails";
	}
}
