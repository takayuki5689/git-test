package connectdb;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import connectdb.Status;
import connectdb.StatusRepository;

@Controller
public class MainController {
  @Autowired
  StatusRepository repository;
  @RequestMapping("/")
  private List<Status> getStatus() {
    return repository.findAll();
  }
}
