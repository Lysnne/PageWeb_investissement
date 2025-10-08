package ikasaidi.backend.repositories;

import ikasaidi.backend.model.Customer;
import ikasaidi.backend.model.Stock;
import ikasaidi.backend.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "transaction", path = "transaction")
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
