package site.whatsblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import site.whatsblog.pojo.Books;
import site.whatsblog.service.BookService;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>author : Suk-Lee</p>
 * <p>date : 2022/3/10 10:45</p>
 * <p>site : https://www.whatsblog.site/</p>
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model) {
        model.addAttribute("list", bookService.findAllBooks());
        return "allBook";
    }

    //跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddPager() {
        return "addbook";
    }

    @RequestMapping("/addBook")
    public String addBook(Books books) {
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/toUpdateBook/{bookId}")
    public String toUpdateBook(@PathVariable int bookId, Model model) {
        Books book = bookService.findBookById(bookId);
        model.addAttribute("book", book);
        return "updatebook";
    }
    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable int bookId) {
        bookService.deleteBookById(bookId);
        return "redirect:/book/allBook";
    }


    @RequestMapping("/updateBook")
    public String updateBook(Books books) {
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

}
