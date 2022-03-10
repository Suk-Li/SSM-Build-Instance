package site.whatsblog.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import site.whatsblog.pojo.Books;
import site.whatsblog.service.BookServiceImpl;

import java.util.List;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/3/10 10:56</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
public class MyTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl service = applicationContext.getBean(BookServiceImpl.class);
        List<Books> books = service.findAllBooks();
        System.out.println(books);
    }
}
