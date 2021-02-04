package com.Mask.NWMSUMask.Controller;

import com.Mask.NWMSUMask.Repository.LocationRepository;
import com.Mask.NWMSUMask.Repository.SpridenRepository;
import com.Mask.NWMSUMask.Service.StudentService;
import com.Mask.NWMSUMask.model.Students;
import com.Mask.NWMSUMask.model.location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private LocationRepository locationRepository;
    @Autowired
    private SpridenRepository spridenRepository;
    @GetMapping ("/")
    public String index(@ModelAttribute ("students") Students students,ModelMap model) {
        List<location> locations = new ArrayList<>();
        locations = locationRepository.findAll();
        model.addAttribute("locations",locations);
        return "students";
    }

    @GetMapping("/students")

    public String students(@ModelAttribute ("students") Students students, ModelMap model){
        List<location> locations = new ArrayList<>();
        locations = locationRepository.findAll();
        model.addAttribute("locations",locations);
        return "students";
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(@Valid @ModelAttribute("students") Students student,
                             ModelMap  model,
                             BindingResult result) throws ParseException {
        if(result.hasErrors()){
            return "students";
        }
        if(spridenRepository.findBySpridenID(student.getID()) ==null){
            System.out.println("In if "+ spridenRepository.findBySpridenID(student.getID()));
            model.addAttribute("StudentID",student.getID());
            return "notfound";
        }
        else {
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date today = new Date();
            Date todayWithZeroTime = formatter.parse(formatter.format(today));
            //model.addAttribute("name",student.getName());
            System.out.println("In else "+ spridenRepository.findBySpridenID(student.getID()));
            if (studentService.getStudent(student.getID()) != null) {
                model.put("StudentID", student.getID());
                model.put("PickedUpPlace", studentService.getStudent(student.getID()).getPickedPlace());
                model.put("PickedUpDate", studentService.getStudent(student.getID()).getPickedDate());
                return "errpage";
            } else {
                model.addAttribute("pickedPlace", student.getPickedPlace());
                model.addAttribute("ID", student.getID());
                System.out.println(student.getID() + " " + student.getPickedPlace() + " " + todayWithZeroTime);
                student.setPickedDate(todayWithZeroTime);
                studentService.saveStudent(student);
                return "addSucess";
            }
        }
    }
}
