package com.example.service.impl;
import java.util.*;
import org.springframework.stereotype.Service;
import com.example.demo.entity.StudentValidation;
import com.example.demo.service.StudentService;
@Service
public class newfileserviceimpl implements newfileservice{
    private final NewfileRepo rep;
    @Override
    public StudentValidation savedata(StudentValidation st){
      return rep.save(newfile);
    }
    @Override
    public StudentValidation getidval(Long id){
     return rep.get(id);
    }
    @Override
    public List<StudentValidation> getall(){
      retrun rep.get();
    }
    @Override
    public StudentValidatin update(Long id,StudentValidation st){
      return rep.update(id,st);
    }
    @Override
    public void delete(Long id){
        return rep.remove(id)
    }
}