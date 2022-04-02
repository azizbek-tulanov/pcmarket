package com.example.vazifa_2.repository;

import com.example.vazifa_2.entity.User;
import com.example.vazifa_2.projection.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "users",collectionResourceRel = "list", excerptProjection =
        CustomUser.class)
public interface UserRepository extends JpaRepository<User,Integer> {
}
