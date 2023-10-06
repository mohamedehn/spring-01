package com.wildcodeschool.myProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String doctor1() {
        return "William Hartnell";
    };

    @GetMapping("/doctor/10")
    @ResponseBody
    public String doctor10() {
        return "David Tennant";
    };

    @GetMapping ("/doctor/13")
    @ResponseBody
    public String doctor13 () {
        return "Jodie Whittaker";
    };

    @GetMapping("/")
    @ResponseBody
    public String index () {
        return "<div>\n" +
                "    <p>Doctor's List</p>\n" +
                "    <ul>\n" +
                "        <li>\n" +
                "            <a href=\"http://localhost:8080/doctor/1\">Doctor 1 - William</a>\n" +
                "        </li>\n" +
                "        <li>\n" +
                "            <a href=\"http://localhost:8080/doctor/10\">Doctor 10 - David</a>\n" +
                "        </li>\n" +
                "        <li>\n" +
                "            <a href=\"http://localhost:8080/doctor/13\">Doctor 13 - Jodie</a>\n" +
                "        </li>\n" +
                "    </ul>\n" +
                "</div>";
    }
}
