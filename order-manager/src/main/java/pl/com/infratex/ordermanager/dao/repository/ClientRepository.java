package pl.com.infratex.ordermanager.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.com.infratex.ordermanager.dao.entity.ClientEntity;

@Repository
public interface ClientRepository extends JpaRepository <ClientEntity,Long> {
}
