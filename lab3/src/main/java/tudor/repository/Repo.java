package tudor.repository;

import tudor.domain.Entity;
import tudor.domain.Worker;

import java.util.List;

public interface Repo<ID, E extends Entity<ID>> {
    E findOne(ID id);
    List<E> findAll();
    E save(E entity);
    E delete(ID id);
    E update(E entity);
}
