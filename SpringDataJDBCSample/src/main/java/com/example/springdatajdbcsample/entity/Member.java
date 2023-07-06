package com.example.springdatajdbcsample.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/**
 *  "Member 테이블 엔티티"
 *
 *  """
 *  엔티티 -> '데이터를 담아두는 객체'
 *  엔티티는 데이터베이스 테이블의 한 행(레코드)에 대응하는 객체다.
 *  엔티티의 필드는 테이블의 칼럼값에 대응한다.
 *
 *  <엔티티 사용 시 기억할 "세 가지">
 *
 *  1. 클래스명
 *      클래스명은 대응하는데 데이터베이스의 테이블명으로 하는 경우가 많다.
 *
 *  2. 데이터베이스에 값 넘겨주기
 *      데이터베이스 값을 등록/갱신하는 경우에는 엔티티에 값을 넣어서 넘겨준다.
 *
 *  3. 데이터베이스에서 값 가져오기
 *      데이터베이스에서 값을 가져오는 경우에는 값을 엔티티에 넣어서 가져온다.
 *
 *  <리포지토리란?>
 *  리포지토리란 간단하게 말하면 데이터베이스를 조작하는 클래스이다.
 *  리포지토리를 생성하는 경우에는 반드시 인터페이스를 정의하고 구현해야 한다.
 *  그 이유는 리포지토리 인터페이스의 필드에 리포지토리 구현 클래스를 DI하여 특정 구현에 의존하는 것을 피한다.
 *
 *  <O/R 매퍼란?>
 *      O/R 매퍼(Object-relational Mapper)를 간단하게 설명하면 애플리케이션에서 사용하는 O(Object):'객체'와 R(Relational):'관계형 데이터베이스'의 데이터를 매핑하는 것
 *      O/R 매퍼는 미리 설정된 객체와 관계형 데이터베이스 간의 대응 관계 정보를 가지고 인터페이스의 데이터에 대응하는 테이블에 내보내거나
 *      데이터베이스에서 값을 읽어 들여 인터페이스에 대입하는 작업을 자동으로 실행한다.
 *
 *  <스프링 데이터 JDBC란?>
 *      스프링 데이터 JDBC는 O/R 매퍼이다.
 *      특징으로 스프링 데이터가 제공하는 CrudRepository를 상속해서 자동으로 CRUD를 지원하는 매서드를 사용할 수 있습니다.
 *  """
 */

/** Lombok에서 제공하는 어노테이션 */
@Data /** 클래스에 부여하는 것으로, 전 필드에 대해 getter/setter로 액세스할 수 있습니다. hashCode(), equals(), toString()도 자동 생성됩니다. */
@NoArgsConstructor /** 클래스에 부여하는 것으로, 기본 생성자가 자동 생성됩니다. */
@AllArgsConstructor /** 클래스에 부여하는 것으로, 전 필드에 대해 초기화 값을 인수로 가지는 생성자가 자동 생성됩니다. */
public class Member {
    /**
     * Member 번호
     */
    @Id /** 엔티티 생성 후 테이블의 기본키(Primary Key)에 해당하는 id 필드에 대해 @Id 어노테이션을 부여
            부여하면 org.springframework.data.annotation.Id가 임포트된다. */
    private Integer id;
    /**
     * Member 이름
     */
    private String name;
}
