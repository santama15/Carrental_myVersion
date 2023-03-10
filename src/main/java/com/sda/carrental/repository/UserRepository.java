package com.sda.carrental.repository;

import com.sda.carrental.model.operational.Reservation;
import com.sda.carrental.model.property.Car;
import com.sda.carrental.model.users.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long>
{
    Optional<User> findByEmail(String email);
    Optional<User> findByName(String name);

    @Query(value = "SELECT * from User where name  = :dCustomerName", nativeQuery = true)
    List<User> findAllByLastName(String dCustomerName);
}

//    @Query(value = "SELECT * from Reservation where customer_id  = :dCustomerId", nativeQuery = true)
//    List<Reservation> findReservationByCustomerId(@Param("dCustomerId") Long dCustomerId);