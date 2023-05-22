package com.dw.dwtestserver01.login;


import com.dw.dwtestserver01.Member.MemberEntity;
import com.dw.dwtestserver01.Member.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
@Service
public class LoginService {
    private final MemberRepository memberRepository;
    /*private final MemberDto.Login memberDto;*/

    public LoginService(MemberRepository memberRepository/*, MemberDto.Login memberDto*/) {
        this.memberRepository = memberRepository;
        /*this.memberDto = memberDto;*/
    }

    public String Login(LoginDto.Post logindto) {
    Optional<MemberEntity> optionalMember =  memberRepository.findByUserId(logindto.getUserId());

        if (optionalMember.isEmpty()) {
        return "Cannot be Empty";
    }
    MemberEntity foundMember = optionalMember.orElseThrow();
        if (!logindto.getPassword().equals(foundMember.getPassword())) {
        return "Not Succesful";
    }
        return "Successful";
}
    /*    if (memberDto.getUserId().equals(logindto.getUserId()) &&
                memberDto.getPassword().equals(logindto.getPassword())) {
                return true;
        }
        return false;
    }*/
}
