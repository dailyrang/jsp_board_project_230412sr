package com.dailyrang.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dailyrang.board.dao.BoardDao;

public class ContentConnand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		BoardDao dao = new BoardDao();
	}

}
