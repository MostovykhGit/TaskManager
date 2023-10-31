package testgroup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import testgroup.model.Task;
import testgroup.model.User;
import testgroup.service.TaskService;
import testgroup.service.UserService;
import testgroup.service.UserServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;

    private UserService userService = new UserServiceImpl();


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView enterManager() {
        Map<String, User> users = userService.allUsers();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("enterPage");
        modelAndView.addObject("usersList", users);
        return modelAndView;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView enterManagerRequest(String login1, String password1) {
        Map<String, User> users = userService.allUsers();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("usersList", users);
        if ((users.containsKey(login1)) && (users.get(login1).password == password1)) {
            modelAndView.setViewName("redirect:/manager1");
        } else {
            modelAndView.setViewName("redirect:/manager1");
        }
        return modelAndView;
    }


    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public ModelAndView userRegistrationPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("registrationPage");
        return modelAndView;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ModelAndView userRegistrationRequest(@ModelAttribute("user") User user) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/");
        modelAndView.addObject(user);
        userService.add(user);
        return modelAndView;
    }

    @RequestMapping(value = "/manager1", method = RequestMethod.GET)
    public ModelAndView allTasks() {
        List<Task> tasks = taskService.allTasks();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("tasks");
        modelAndView.addObject("tasksList", tasks);
        return modelAndView;
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editPage(@PathVariable("id") int id) {
        Task task = taskService.getById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        modelAndView.addObject("task", task);
        return modelAndView;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ModelAndView editTask(@ModelAttribute("task") Task task) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/manager1");
        taskService.edit(task);
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView addPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addTask(@ModelAttribute("task") Task task) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/manager1");
        taskService.add(task);
        return modelAndView;
    }

    @RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteTask(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/manager1");
        Task task = taskService.getById(id);
        taskService.delete(task);
        return modelAndView;
    }
}