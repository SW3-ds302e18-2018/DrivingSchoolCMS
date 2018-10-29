package dk.aau.cs.ds302e18.app;

import dk.aau.cs.ds302e18.app.service.LessonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class LessonController
{

    private final LessonService lessonService;

    public LessonController(LessonService lessonService){
        super();
        this.lessonService = lessonService;
    }

    @GetMapping(value={"/", "/index"})
    public String getHomePage(Model model){

        return "index";
    }

    @GetMapping(value="/login")
    public String getLoginPage(Model model){
        return "login";
    }

    @GetMapping(value="/logout-success")
    public String getLogoutPage(Model model){
        return "logout";
    }


}
