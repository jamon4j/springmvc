package test;

import inter.SqlMap;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import model.Article;
import model.User;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

public class MyBatisTest {
	
	private static SqlSessionFactory ssf;
	private static SqlSession session;
	public static void main(String[] args) throws IOException{	
		MyBatisTest mbt = new MyBatisTest();
		mbt.init();
		//mbt.getUserList("%");
		mbt.getUserArticles(1);
/*		SqlMap ivo = (SqlMap) session.getMapper(SqlMap.class);
		User user = ivo.selectUser(1);
		System.out.println(user);
*/
		/*session = ssf.openSession();
		User u = (User) session.selectOne("selectUser", "2");
		System.out.println(u);
		
		session.delete("deleteUser", "3");

		session.insert("insertUser", new User(3,"lj","000"));
		//session.commit();//提交数据进入数据库
		u = (User) session.selectOne("selectUser", "3");
		System.out.println(u);
		
		u = new User(3,"ljj","111");
		session.update("updateUser", u);
		//session.commit();//提交数据进入数据库
		u = (User) session.selectOne("selectUser", "3");
		System.out.println(u);
		session.close();*/
	}
	
	public void init()
	{
		String resource = "Configuration.xml";
		ssf = MyBatisTest.getSqlSessionFactory(resource);
	}
	
	public static SqlSessionFactory getSqlSessionFactory(String resource)
	{
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
		return ssf;
	}
	
	public void getUserList(String userName)
	{
		session = ssf.openSession();
		SqlMap sqlMap = (SqlMap) session.getMapper(SqlMap.class);
		List<User> users = new ArrayList(); 
		users = sqlMap.selectUsersByName(userName);
		for(User user:users)
		{
			System.out.println(user.getId()+":"+user.getName()+":"+user.getPassword());
		}
		session.close();
	}
	
	public void getUserArticles(int userid)
	{
		session = ssf.openSession();
		SqlMap sqlMap = session.getMapper(SqlMap.class);
		List<Article> articles = new ArrayList();
		articles = sqlMap.selectArticlesByUser(1);
		for(Article article:articles){
			System.out.println(article.getTitle()+":"+article.getContent()+":作者是："+article.getUser().getName());
		}
	}
}
