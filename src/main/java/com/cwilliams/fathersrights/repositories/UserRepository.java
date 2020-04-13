package com.cwilliams.fathersrights.repositories;

import com.cwilliams.fathersrights.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// Storage for Database
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    //can write automated sql query
    List<User> findAllByCity(String cityName);

    void deleteUserByUserId(Long userId);
}
