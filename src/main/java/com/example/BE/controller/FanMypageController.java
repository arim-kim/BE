package com.example.BE.controller;

import com.example.BE.fan.dto.FanMyPageResponseDto;
import com.example.BE.fan.dto.FanMyPageUpdateRequestDto;
import com.example.BE.fan.service.FanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class FanMypageController
{

    private final FanService fanService;

    /**
     * 팬 마이페이지 조회 하기
     */
    @GetMapping("/mypage/{id}")
    public FanMyPageResponseDto save(@PathVariable("id") Long id){
        return fanService.findById(id);
    }

    @PutMapping("/mypage/edit/profile/{id}")
    public Long update(@PathVariable("id") Long id,
                       @RequestBody FanMyPageUpdateRequestDto requestDto){
        return fanService.update(id, requestDto);
    }

    @PutMapping("/mypage/edit/certImage/{id}")
    public int updateCertificationImage(@PathVariable("id") Long id,
                       @RequestBody String certificationImageUrl){
        return fanService.updateCertificationImageUrl(id, certificationImageUrl);
    }


}
