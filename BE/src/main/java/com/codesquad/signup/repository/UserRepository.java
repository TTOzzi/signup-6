package com.codesquad.signup.repository;

import com.codesquad.signup.domain.User;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.math.BigInteger;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, BigInteger> {

    @Query("select user_id from USERS where user_id = :userId")
    Optional<String> findByUserId (@Param("userId") String userId);

    @Query("select email from USERS where email = :email")
    Optional<String> findByEmail (@Param("email") String email);

    @Query("select mobile from USERS where mobile = :mobile")
    Optional<String> findByMobile (@Param("mobile") String mobile);

    @Query("select u from User u where u.id = :user_key")
    Optional<User> findIdById(@Param("user_key") Long id);

    @Modifying
    @Query("update USERS set email = :email where user_Id = :userId and email = 'empty'" )
    void updateEmail(@Param("userId") String userId, @Param("email") String email);

    @Modifying
    @Query("update USERS set mobile = :mobile where user_id = :userId and mobile = 'empty'")
    void updateMobile(@Param("userId") String userId, @Param("mobile") String mobile);

}
