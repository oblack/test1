package com.codecoda.test1.repository;

import com.codecoda.test1.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

}
