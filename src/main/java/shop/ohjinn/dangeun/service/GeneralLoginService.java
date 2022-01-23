package shop.ohjinn.dangeun.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.ohjinn.dangeun.repository.MemberRepository;

@Service
@RequiredArgsConstructor
public class GeneralLoginService implements LoginService{

    private final MemberRepository memberRepository;


    @Override
    public void login(long id) {

    }

    @Override
    public void logout() {

    }
}
