package io.weeks.webapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(HttpSession session, HttpServletRequest request) throws Exception{
    	
        return "redirect:https://www.notion.so/2weeks-io-ff510dd8935b407ba33c2b87beb36077";
    }
	
}
