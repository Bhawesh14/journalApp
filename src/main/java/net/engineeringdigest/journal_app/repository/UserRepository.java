package net.engineeringdigest.journal_app.repository;

import net.engineeringdigest.journal_app.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {

    User findByUsername(String username);
    void deleteByUsername(String username);
}
