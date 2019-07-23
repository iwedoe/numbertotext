package numbertotext;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberToTextController {

    @RequestMapping("/number")
    public String getText(@RequestParam(value = "number", defaultValue = "0") String number) {
        int i;
        try {
            i = Integer.parseInt(number);
        } catch (NumberFormatException nfe) {
            return "Hvad fanden, mand! Jeg kender ikke det satans nummer!";
        }


        return "Tallet er: " + i;
    }
}
