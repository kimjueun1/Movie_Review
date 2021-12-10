package com.myspring.myspring;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myspring.myspring.BoardVO;
import com.myspring.myspring.BoardDAO;

@Controller
public class BoardController {
	BoardDAO boardDAO = new BoardDAO();
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String boardlist(Model model) {
		model.addAttribute("list",boardDAO.getBoardList());
		return "board/posts";
	}
	
	@RequestMapping(value="/add",method = RequestMethod.GET)
	public String addPost() {
		return "board/addpostform";
	}

	@RequestMapping(value="/addok",method = RequestMethod.POST)
	public String addPostOK(BoardVO vo) {
		int i= boardDAO.insertBoard(vo);
		if(i==0)
			System.out.println("데이터 추가 실패 ");
		else
			System.out.println("데이터 추가 성공!!!");
		return "redirect:board/list";
	}

	@RequestMapping(value="/editpost/{id}", method = RequestMethod.GET)
	public String editPost(@PathVariable("id") int id,Model model) {
		BoardVO boardVO = boardDAO.getBoard(id);
		model.addAttribute("boardVO",boardVO);
		return "board/editform";
	}

	@RequestMapping(value = "/editok", method = RequestMethod.POST)
	public String editPostOK(BoardVO vo) {
		int i= boardDAO.updateBoard(vo);
		if(i==0)
			System.out.println("데이터 수정 실패 ");
		else
			System.out.println("데이터 수정 성공!!!");
		return "redirect:board/list";
	}

	@RequestMapping(value="/deleteok/{id}", method = RequestMethod.GET)
	public String deletePost(@PathVariable("id") int id) {
		int i= boardDAO.deleteBoard(id);
		if(i==0)
			System.out.println("데이터 삭제 실패 ");
		else
			System.out.println("데이터 삭제 성공!!!");
		return "redirect:..board/list";
	}
	@RequestMapping(value = "/boardlist", method = RequestMethod.GET)
	public String boardList(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		List<String> posts = new ArrayList<>();
		posts.add("hello ");
		model.addAttribute("list", posts);
		
		return "board/list";
	}
	
}
