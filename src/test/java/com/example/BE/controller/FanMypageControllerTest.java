package com.example.BE.controller;

import com.example.BE.fan.Fan;
import com.example.BE.fan.repository.FanRepsitory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Rollback(value = true) // 일단 db반영하고 취소하도록
@Transactional
class FanMypageControllerTest {

    @Autowired
    FanRepsitory fanRepsitory; 
    
    @Test
    @DisplayName("멤버 정보 받아오기 테스트")
    public void getMyPage() throws Exception {
    
        // given

        
        // when


        // then

    }
}