package com.sendmylove.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.sendmylove.demo.model.dao.BoardRepository;

import model.domain.Board;
import model.domain.Message;

@RestController
public class PostsController {

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	private BoardRepository boardRepo;

	@GetMapping("selectAllPosts")
	public List<Board> selectAllPosts() {
		return entityManager.createQuery("SELECT b FROM Board b order by writedate desc", Board.class).getResultList();
		//return boardRepo.findAll();
	}
}
