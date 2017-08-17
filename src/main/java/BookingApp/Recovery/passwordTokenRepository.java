package BookingApp.Recovery;

import org.springframework.data.repository.CrudRepository;

public interface passwordTokenRepository extends CrudRepository<PasswordRecovery,Long>{

    PasswordRecovery findByToken(String token);
}
