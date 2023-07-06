package com.example.springdatajdbcsample.repository;

import com.example.springdatajdbcsample.entity.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberCrudRepository extends CrudRepository<Member, Integer>
/** 저장 대상 객체의 타입(Member)과 저장 대상 객체의 기본키 타입(@Id 어노테이션을 부여한 필드의 타입) 지정*/{
/**
 *  CrudRepository의 CRUD 메서드 (표...)
 */
}
