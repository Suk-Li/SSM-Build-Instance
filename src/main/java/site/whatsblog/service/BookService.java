package site.whatsblog.service;

import org.apache.ibatis.annotations.Param;
import site.whatsblog.pojo.Books;

import java.util.List;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/3/9 17:17</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
public interface BookService {
    // 增加一本书
    int addBook(Books books);

    // 删除一本书
    int deleteBookById(int bookID);

    // 修改一本书
    int updateBook(Books books);

    // 查询一本书
    Books findBookById(int bookID);

    // 查询所有书
    List<Books> findAllBooks();

    List<Books> findBookByName(String bookName);
}
