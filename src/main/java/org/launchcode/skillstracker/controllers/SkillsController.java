package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String skillTracker() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is a list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
    @GetMapping("form")
    public String skillForm() {
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" +
                "<label>Name:</label><br>" +
                "<input type='text' name='name'><br>" +
                "<label for='fav-lang'>My favourite language:</label><br>" +
                "<select name='lang1' id='fav-lang'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select><br>" +
                "<label for='second-fav'>My second favourite language:</label><br>" +
                "<select name='lang2' id='second-fav'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select><br>" +
                "<label for='third-fav'>My third favourite language:</label><br>" +
                "<select name='lang3' id='third-fav'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select><br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }


    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    public String helloPost(@RequestParam String name, @RequestParam String lang1, @RequestParam String lang2, @RequestParam String lang3) {
        if (name.isBlank()) {
            name = "Blank name";
        }
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + lang1 + "</li>" +
                "<li>" + lang2 + "</li>" +
                "<li>" + lang3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
}
