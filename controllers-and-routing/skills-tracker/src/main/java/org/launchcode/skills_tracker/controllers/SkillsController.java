package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    // TODO 1: At localhost:8080, add text that states the three possible programming languages someone could be working on. You need to have an h1 with the title “Skills Tracker”, an h2, and an ol containing three programming languages of your choosing.
    @GetMapping("/")
    @ResponseBody
    public String skillsTracker () {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>HTML</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }


    // TODO 2: At localhost:8080/form, add a form that lets the user enter their name and choose their favorite, second favorite, and third favorite programming languages on your list. Use select elements for each of the rankings. Just as with the exercises, we will use @GetMapping().
    @GetMapping("/form")
    @ResponseBody
    public String skillsForm () {
        return "<html>" +
                "<body>" +
                "<form action='/form' method='post'>" +
                "<label for='name'>Name:</label><br>" +
                "<input type='text' id='name' name='name'><br><br>" +
                "<label for='favorite'>My favorite language:</label><br>" +
                "<select id='favorite' name='favorite'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='HTML'>HTML</option>" +
                "</select><br><br>" +
                "<label for='secondFavorite'>My second favorite language:</label><br>" +
                "<select id='secondFavorite' name='secondFavorite'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='HTML'>HTML</option>" +
                "</select><br><br>" +
                "<label for='thirdFavorite'>My third favorite language:</label><br>" +
                "<select id='thirdFavorite' name='thirdFavorite'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='HTML'>HTML</option>" +
                "</select><br><br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }


    // TODO 3: Also at localhost:8080/form, use @PostMapping and @RequestParam to update the HTML with an h1 stating the user’s name and an ol showing the three programming languages in the order they chose.
    @PostMapping("/form")
    @ResponseBody
    public String processForm(@RequestParam String name,
                              @RequestParam String favorite,
                              @RequestParam String secondFavorite,
                              @RequestParam String thirdFavorite) {

        return "<html>" +
                "<body>" +
                "<h1>Hello, " + name + "!</h1>" +
                "<h2>Your Programming Language Preferences:</h2>" +
                "<ol>" +
                "<li>" + favorite + "</li>" +
                "<li>" + secondFavorite + "</li>" +
                "<li>" + thirdFavorite + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }


}