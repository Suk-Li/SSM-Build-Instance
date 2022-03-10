package site.whatsblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.whatsblog.dao.BookMapper;
import site.whatsblog.pojo.Books;

import java.util.List;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/3/9 17:18</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookMapper mapper;
    @Override
    public int addBook(Books books) {
        return mapper.addBook(books);
    }

    @Override
    public int deleteBookById(int bookID) {
        return mapper.deleteBookById(bookID);
    }

    @Override
    public int updateBook(Books books) {
        return mapper.updateBook(books);
    }

    @Override
    public Books findBookById(int bookID) {
        return mapper.findBookById(bookID);
    }

    @Override
    public List<Books> findAllBooks() {
        return mapper.findAllBooks();
    }

    @Override
    public List<Books> findBookByName(String bookName) {
        return mapper.findBookByName(bookName);
    }
}
