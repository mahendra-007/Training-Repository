import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class News{
	int newsId;
	String postedByUser;
	String commentByUser;
	String comment;
	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "]";
	}
	
}
public class StreamNew2 {

	public static void main(String[] args) {
	 List<News> list=new ArrayList<>();
	 list.add(new News(100,"marketing","Mahendra","the budget details of this month is uloaded"));
	 list.add(new News(101,"Sales","Ram"," details of this month is uloaded"));
	 list.add(new News(102,"marketing","Sham","the budget details is uloaded"));
	 list.add(new News(103,"digital","Manu","the  details of this month is uloaded"));
	 list.add(new News(100,"IT","Revanth","Details given"));
	 
	List<News> bud= list.stream().filter(p->p.getComment().contains("budget")).collect(Collectors.toList());
	 bud.forEach(System.out::println);
	 
	 Optional<News> m=list.stream().max(Comparator.comparing(News::getComment));
	System.out.println(m);
	
	Map<String, List<News>> c=list.stream().collect(Collectors.groupingBy(News::getComment));
	c.forEach((commentByUser,p1)->{
		System.out.println(commentByUser);
		//p1.forEach(System.out::println);
	});
	}

}