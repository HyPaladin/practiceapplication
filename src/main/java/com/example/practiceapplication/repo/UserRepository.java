
package com.example.practiceapplication.repo;

import com.example.practiceapplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional(readOnly = true)
public interface UserRepository extends JpaRepository<User, Long> {

    void deleteUserById(Long id);


    User findByEmail(String email);
}
