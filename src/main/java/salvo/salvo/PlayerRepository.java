package salvo.salvo;

/**
 * Created by nuriamolinalopez on 12/7/17.
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PlayerRepository extends JpaRepository<Player, Long> {

}