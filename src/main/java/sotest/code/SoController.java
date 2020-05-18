package sotest.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SoController {
    @Autowired
    SoService soService;
    @GetMapping(value = "/sotest")
    public int incUsernum(){
        int i = soService.incincUsernum();
        return i;
    }
}
