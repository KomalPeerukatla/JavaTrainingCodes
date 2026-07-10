package Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.model.Student;

@Service
public class StudentService {

    private List<Student> list = new ArrayList<>();

    public void save(Student s) {
        list.add(s);
    }

    public List<Student> getAllStudents() {
        return list;
    }

}
