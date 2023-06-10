package filmparadise.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import filmparadise.entity.MovieData;
@Repository
public interface MovieDataRepository extends JpaRepository<MovieData, Long> {

}
