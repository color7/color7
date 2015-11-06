package com.color.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.color.domain.PlayGroup;
import com.color.service.PlayService;
import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private PlayService playService;

	public String world() {
		System.out.println("-------world-------------");
		PlayGroup playGroup = new PlayGroup();
		int index = 10;
		playGroup.setPlayGroupId(index);
		playGroup.setPlayGroupName("玩法组" + index);
		playGroup.setPlayGroupEnabled((short) index);
		playGroup.setPlays(null);
		playService.save(playGroup);

		return "world";
	}

}
