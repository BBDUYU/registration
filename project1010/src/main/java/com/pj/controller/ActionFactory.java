package com.pj.controller;

import com.pj.controller.action.Action;
import com.pj.controller.action.AddAnswerAction;
import com.pj.controller.action.AddClassAction;
import com.pj.controller.action.AddClassFormAction;
import com.pj.controller.action.AddPlanAction;
import com.pj.controller.action.AddPlanFormAction;
import com.pj.controller.action.AddQnaAction;
import com.pj.controller.action.AddQnaFormAction;
import com.pj.controller.action.AdminClassListAction;
import com.pj.controller.action.AdminConfirmAction;
import com.pj.controller.action.AdminStuListAction;
import com.pj.controller.action.AllQnaListAction;
import com.pj.controller.action.AllSelectQnaAction;
import com.pj.controller.action.BoardDeleteAction;
import com.pj.controller.action.BoardListAction;
import com.pj.controller.action.BoardUpdateAction;
import com.pj.controller.action.BoardUpdateFormAction;
import com.pj.controller.action.BoardViewAction;
import com.pj.controller.action.BoardWriteAction;
import com.pj.controller.action.BoardWriteFormAction;
import com.pj.controller.action.ClassListAction;
import com.pj.controller.action.ClassNoticeForm;
import com.pj.controller.action.ClassRegiList;
import com.pj.controller.action.ClassRegistration;
import com.pj.controller.action.LoginAdminAction;
import com.pj.controller.action.LoginFormAction;
import com.pj.controller.action.LoginProfessorAction;
import com.pj.controller.action.LoginStudentAction;
import com.pj.controller.action.Main;
import com.pj.controller.action.ProBoardListAction;
import com.pj.controller.action.ProBoardViewAction;
import com.pj.controller.action.ProfessorInfo;
import com.pj.controller.action.QnaListAction;
import com.pj.controller.action.SearchClass;
import com.pj.controller.action.SelectAdminPlanAction;
import com.pj.controller.action.SelectPlanAction;
import com.pj.controller.action.SelectQnaAction;
import com.pj.controller.action.StudentAddClass;
import com.pj.controller.action.StudentCancelClass;
import com.pj.controller.action.StudentTopInfo;
import com.pj.controller.action.UpdatePlanAction;
import com.pj.controller.action.UpdatePlanFormAction;
import com.pj.controller.action.UpdateStuStateAction;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();

	private ActionFactory() {
		super();
	}

	public static ActionFactory getInstance() {
		return instance;
	}

	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActionFactory :" + command);
//		if (command.equals("board_list")) {
//			action = new BoardListAction();
//		} 
		if (command.equals("home")) {
			action = new LoginFormAction();
		} else if(command.equals("loginStudent")) {
			action = new LoginStudentAction();
		} else if(command.equals("loginProfessor")) {
			action = new LoginProfessorAction();
		} else if (command.equals("studentTopInfo")) {
			action = new StudentTopInfo();
		} else if (command.equals("professorInfo")) {
			action = new ProfessorInfo();
		} else if (command.equals("loginAdmin")) {
			action = new LoginAdminAction();
		} else if (command.equals("add_class")) {
			action = new AddClassFormAction();
		} else if (command.equals("add_class_write")) {
			action = new AddClassAction();
		} else if (command.equals("class_list")) {
			action = new ClassListAction();
		} else if (command.equals("board_list")) {
			action = new BoardListAction();
		} else if (command.equals("pro_board_list")) {
			action = new ProBoardListAction();
		} else if (command.equals("board_view")) {
			action = new BoardViewAction();
		} else if (command.equals("pro_board_view")) {
			action = new ProBoardViewAction();
		} else if (command.equals("board_write_form")) {
			action = new BoardWriteFormAction();
		} else if (command.equals("board_write")) {
			action = new BoardWriteAction();
		} else if (command.equals("board_update_form")) {
			action = new BoardUpdateFormAction();
		} else if (command.equals("board_update")) {
			action = new BoardUpdateAction();
		} else if (command.equals("board_delete")) {
			action = new BoardDeleteAction();
		} else if (command.equals("add_plan_write")) {
			action = new AddPlanFormAction();
		} else if (command.equals("add_plan")) {
			action = new AddPlanAction();
		} else if (command.equals("select_plan")) {
			action = new SelectPlanAction();
		} else if (command.equals("update_plan_form")) {
			action = new UpdatePlanFormAction();
		} else if (command.equals("update_plan")) {
			action = new UpdatePlanAction();
		} else if (command.equals("add_qna")) {
			action = new AddQnaFormAction();
		} else if (command.equals("add_qna_write")) {
			action = new AddQnaAction();
		} else if (command.equals("qna_list")) {
			action = new QnaListAction();
		}  else if (command.equals("select_qna")) {
			action = new SelectQnaAction();
		}  else if (command.equals("admin_class_list")) {
			action = new AdminClassListAction();
		}  else if (command.equals("admin_select_plan")) {
			action = new SelectAdminPlanAction();
		} else if (command.equals("admin_confirm")) {
			action = new AdminConfirmAction();
		} else if (command.equals("admin_stu_list")) {
			action = new AdminStuListAction();
		} else if (command.equals("update_stu_state")) {
			action = new UpdateStuStateAction();
		} else if (command.equals("all_qna_list")) {
			action = new AllQnaListAction();
		} else if (command.equals("all_select_qna")) {
			action = new AllSelectQnaAction();
		} else if (command.equals("add_answer")) {
			action = new AddAnswerAction();
		} else if (command.equals("class_registration")) {
			action = new ClassRegistration();
		} else if (command.equals("search_class")) {
			action = new SearchClass();
		} else if (command.equals("main")) {
			action = new Main();
		} else if (command.equals("class_regiList")) {
			action = new ClassRegiList();
		} else if (command.equals("stu_add_class")) {
			action = new StudentAddClass();
		} else if (command.equals("stu_class_cancel")) {
			action = new StudentCancelClass();
		} else if (command.equals("class_notice")) {
			action = new ClassNoticeForm();
		}
		
		return action;
}
}

