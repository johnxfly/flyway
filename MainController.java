package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/demo")
public class MainController {

	@Autowired
    private RepRepository repRepo;
	
	@GetMapping(path="/add")
	public @ResponseBody String addRep(@RequestParam String name) {
        Rep rep = new Rep(name);
        rep.setOther("something");
		repRepo.save(rep);
		return "Saved";
	}

    @GetMapping(path="/all")
	public @ResponseBody Iterable<Rep> getReps() {
	    return repRepo.findAll();
    }
}
