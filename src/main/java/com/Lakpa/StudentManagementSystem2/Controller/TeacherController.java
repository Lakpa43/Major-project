package com.Lakpa.StudentManagementSystem2.Controller;

import com.Lakpa.StudentManagementSystem2.Model.Teacher;
import com.Lakpa.StudentManagementSystem2.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/teacher")
    public String teacherPage(Model model) {
        model.addAttribute("listTeachers", teacherService.getAllTeachers());
        return "teacher";
    }

    @GetMapping("/newTeacherForm")
    public String newTeacherForm(Model model) {
        Teacher teacher = new Teacher();
        model.addAttribute("teacher", teacher);
        return "new_teacher";
    }

    @PostMapping("/saveTeacher")
    public String saveTeacher(@ModelAttribute("teacher") Teacher teacher) {
        teacherService.saveTeacher(teacher);
        return "redirect:teacher";
    }

    @GetMapping("/editTeacherForm/{id}")
    public String editTeacherForm(@PathVariable(value = "id") int id, Model model) {
        Teacher teacher = teacherService.getTeacherById(id);
        model.addAttribute("teacher", teacher);
        return "edit_teacher";
    }

    @GetMapping("/deleteTeacher/{id}")
    public String deleteTeacher(@PathVariable(value = "id") int id) {
        this.teacherService.deleteTeacherById(id);
        return "redirect:teacher";
    }
}
