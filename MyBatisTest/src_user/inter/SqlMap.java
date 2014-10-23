package inter;

import java.util.*;

import model.Article;
import model.User;

public interface SqlMap {
	public User selectUser(int id);
	public void insertUser(User user);
	public void updateUser(User user);
	public void deleteUser(int id);
	public List<User> selectUsersByName(String name);
	public List<Article> selectArticlesByUser(int id);
}
