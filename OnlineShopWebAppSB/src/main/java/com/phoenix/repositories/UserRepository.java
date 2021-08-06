package com.phoenix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phoenix.entities.User;
/*
 * @author dharmaraj.pawale@stl.tech
 * @version 1.0
 * @creation_date 2-Aug-2021
 * @copyright Sterlite Technologies Ltd.
 * @description DAO Interface for User
 * 
 */
public interface UserRepository extends JpaRepository<User, String> {

}
