package com.programmers.shoppingMall.repository;

import com.programmers.shoppingMall.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {

    Member findByEmail(String email);

}
