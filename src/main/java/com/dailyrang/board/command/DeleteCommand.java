package com.dailyrang.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dailyrang.board.dao.BoardDao;

public class DeleteCommand {
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String bnum = request.getParameter("bnum");	
		BoardDao dao = new BoardDao();
		dao.delete(bnum);
	}

	
}
