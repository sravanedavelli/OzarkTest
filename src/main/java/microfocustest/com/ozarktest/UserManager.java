
package microfocustest.com.ozarktest;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oracle.ozark.core.Models;

/**
 * @author Sravan
 *
 */
@Path("user")
@Controller
public class UserManager {

	@Inject
	UserStore store;

	@Inject
	Models models;

	@GET
	public String get0(@QueryParam("hashtag") String hashtag) {
		models.put("user", store.get(hashtag).get(0));
		return "user.jsp";
	}

	/*
	 * Uncomment individual methods below to try out various options w.r.t return
	 * types supported by MVC
	 */


//    @GET
//    @View("user.jsp")
//    public void get3(@QueryParam("hashtag") String hashtag){
//        models.put("user", store.get(hashtag).get(0));
//    }

}
