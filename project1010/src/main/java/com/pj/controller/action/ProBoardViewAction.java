package com.pj.controller.action;

import java.io.IOException;
import java.util.List;

import com.pj.dao.BoardDAO;
import com.pj.dao.StuDAO;
import com.pj.dto.BoardVO;
import com.pj.dto.StuDTO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ProBoardViewAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = "10_2_view.jsp";
		String NoticeNum = request.getParameter("NoticeNum");

		BoardDAO bDao = BoardDAO.getInstance();
		BoardVO bVo = bDao.selectOneBoardByNum(NoticeNum);
		request.setAttribute("board", bVo);
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}