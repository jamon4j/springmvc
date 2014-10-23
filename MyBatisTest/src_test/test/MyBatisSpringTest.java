package test;

import java.util.ArrayList;
import java.util.List;

import inter.SqlMap;
import model.Article;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBatisSpringTest {
	private static ApplicationContext ctx;
	static{
		ctx = new ClassPathXmlApplicationContext("config/applicationContext.xml");
	}
	public static void main(String[] args) {
		SqlMap sqlMap = (SqlMap) ctx.getBean("userMapper");
		System.out.println("userid=1:");
		List<Article> list = new ArrayList();
		list = sqlMap.selectArticlesByUser(1);
		for(Article article:list)
		{
			System.out.println(article.getTitle()+":"+article.getContent()+":×÷ÕßÊÇ£º"+article.getUser().getName());
		}
	}
}
