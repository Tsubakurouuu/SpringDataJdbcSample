package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Member;

public interface MemberCrudRepository extends CrudRepository<Member, Integer> {

}
