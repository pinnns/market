package shop.ohjinn.dangeun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.ohjinn.dangeun.domain.Member;

public interface MemberRepository extends JpaRepository<Member, String> {

}
