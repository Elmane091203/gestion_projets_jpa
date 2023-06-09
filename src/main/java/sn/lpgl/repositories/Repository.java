package sn.lpgl.repositories;

import java.util.List;

public interface Repository<Nafissa> {
    int create(Nafissa t);

    List<Nafissa> getAll();

    Nafissa get(int id);

    int update(Nafissa t);

    int delete(int id);
}
