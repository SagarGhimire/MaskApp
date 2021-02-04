package com.Mask.NWMSUMask.Service;

import com.Mask.NWMSUMask.Repository.StudentRepository;
import com.Mask.NWMSUMask.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Students saveStudent(Students student){
        return studentRepository.save(student);
    }
    public Students getStudent(String id){
        return studentRepository.findById(id).orElse(null);
    }

}
