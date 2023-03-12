package com.graphql.queries;

import com.graphql.schema.College;
import com.graphql.schema.Student;
import com.graphql.service.CollegeService;
import com.graphql.service.StudentService;
import io.leangen.graphql.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class CollegeQuery {

  @Autowired CollegeService collegeService;

  @Autowired StudentService studentService;

  @GraphQLQuery(name = "getcollege")
  @GraphQLNonNull
  public College getCollegeById(@GraphQLNonNull @GraphQLArgument(name = "id") int id) {

    return collegeService.getCollegeById(id);
  }

  @GraphQLQuery(name = "students")
  public List<Student> getStudents(@GraphQLRootContext College college) {

    return studentService.getStudentsByCollegeId(college.getId());
  }

  @GraphQLQuery(name = "get")
  @GraphQLNonNull
  public List<Student> getArray(Student c) {
    List<Student> integers = new ArrayList<Student>();
    integers.add(c);
/*    integers.add(new Student(1,"hamzi"));
    integers.add(new Student(1,"mouna"));*/
    /*integers.add(3);
    integers.add(3);
    integers.add(3);
    integers.add(3);*/
    return integers;
  }
}
