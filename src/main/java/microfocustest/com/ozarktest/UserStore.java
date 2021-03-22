
package microfocustest.com.ozarktest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author @GET
 */
@ApplicationScoped
public class UserStore {
    
    private List<User> users = new ArrayList<>();
    
    @PostConstruct
    public void bootstrap(){
    	users.add(new User("Sravan","Edavelli","sedavelli"));
    }
    
    public List<User> get(String hashtag){
        return users.stream().filter(u -> u.getUserid().contains(hashtag)).collect(Collectors.toList());
    }
}
