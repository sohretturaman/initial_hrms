package kodlama.io.hrmstrials.businnes.abstarcts;


import kodlama.io.hrmstrials.core.utilities.results.DataResult;
import kodlama.io.hrmstrials.core.utilities.results.Result;
import kodlama.io.hrmstrials.entities.concretes.User;

import java.util.List;

public interface UserService {
   DataResult < List <User> >  getAll () ;
   Result add (User user ) ;


}
// List<Users> getAll() ;