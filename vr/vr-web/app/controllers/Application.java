package controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Article;
import play.mvc.Controller;

public class Application extends Controller {
	private static final String FORM = "/Application/form.html";
	private static final String INDEX = "/Application/index.html";
	
    public static void index() {
    	String title = "首页!";
        render(INDEX,title);
    }
    
    public static void list() {
    	List<Article> articles = Article.findAll();
    	Map map = new HashMap<String,Object>();
    	map.put("articles", articles);
    	renderJSON(map);
    }

    public static void form() {
        render(FORM);
    }
}