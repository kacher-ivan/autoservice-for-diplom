package by.diplom.ws.repository;

import by.diplom.ws.model.AutoOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoOrderRepository extends JpaRepository<AutoOrder, Long> {

}
