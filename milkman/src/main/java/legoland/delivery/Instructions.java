package legoland.delivery;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Instructions {
	
	@RequestMapping("/")
    public String initial() {
        return "Good Morning MilkMan! <p> <a href=\"http://localhost:8080/instructions\">Instructions</a>";
    }
	
	@RequestMapping("/instructions")
    public String instructions() {
		 return "List for the day:<table border=1>	<tr><td>1 bottle</td><td>Dona Nene</td><td>Rua Alpha, 10</td></tr>	<tr><td>1 bottle</td><td>Mme.Gaspar</td><td>Rua Alpha, 30</td></tr><tr><td>2 bottles</td><td>Dr. Pascoal</td><td>Rua Beta, 22</td></tr>	</table>";
    }

}
