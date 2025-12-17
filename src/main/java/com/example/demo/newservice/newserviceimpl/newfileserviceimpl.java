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
     return rep.findById(id);
    }
    @Override
    public List<StudentValidation> getall(){
      retur]=n rep.findAll();
    }
    @Override
    public StudentValidatin update(Long id,StudentValidation st){
        NewFileEntity existing=getValId(id);
        existing.setName(Newfile.getName())
        existing.setEmail(Newfile.getEmail());
        
      return rep.save(existing);
    }
    @Override
    public void delete(Long id){
         rep.deleteById(id)
    }
}