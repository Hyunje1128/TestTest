package com.example.springdatajdbcsample;

import com.example.springdatajdbcsample.entity.Member;
import com.example.springdatajdbcsample.repository.MemberCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.SocketOption;

/**
 * 스프링 부트 기동 클래스
 */
@SpringBootApplication
public class SpringDataJdbcSampleApplication /** 실제 작업을 처리하는 클래스 */{

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJdbcSampleApplication.class, args)
            .getBean(SpringDataJdbcSampleApplication.class).execute(); /** execute 메서드를 호출 */
    }

    @Autowired /** MemberCrudRepository를 @Autowird로 주입 */
    MemberCrudRepository repository;

    /**
     *  등록과 전체 취득 처리
     */
    private void execute()
    /** execute 메서드로 등록 메서드와 전체 취득 메서드를 호출하도록 작성 */{
        // 등록
        executeInsert();
        // 전체 취득
        executeSelect();
    }

    /**
     *  등록
     */
    private void executeInsert() {
        // 엔티티 생성 (id는 자동 부여되기 때문에 null을 설정)
        Member member1 = new Member(null, "이현제");
        Member member2 = new Member(null, "곽상진");
        Member member3 = new Member(null, "김로건");
        // 리포지토리를 이용해 등록을 수행하고 결과를 취득
        member1 = repository.save(member1);
        member2 = repository.save(member2);
        member3 = repository.save(member3);
        // 결과를 표시
        System.out.println("등록 데이터:" + member1);
        System.out.println("등록 데이터:" + member2);
        System.out.println("등록 데이터:" + member3);
    }

    /**
     *  전체 취득
     */
    private void executeSelect() {
        System.out.println("--- 전체 데이터를 취득합니다. ---");
        // 리포지토리를 이용해 전체 데이터를 취득
        Iterable<Member> members = repository.findAll();
        for (Member member : members) {
            System.out.println(member);
        }
    }
}
