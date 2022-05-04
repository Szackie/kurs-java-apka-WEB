package io.github.mat3e;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class LangRepository {

    Optional<Lang> findById(Integer id){
        var session = HibernateUtil.buildSessionFactory().openSession();
        var transaction=session.beginTransaction();
        var result = session.get(Lang.class,id);
        transaction.commit();
        session.close();
        return Optional.ofNullable(result);
    }
}
