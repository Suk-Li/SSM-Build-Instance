package site.whatsblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import site.whatsblog.dao.BookMapper;
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

    public String list(Model model){
        model.addAttribute("list",bookService.findAllBooks());
        return "allBook";
    }

}
