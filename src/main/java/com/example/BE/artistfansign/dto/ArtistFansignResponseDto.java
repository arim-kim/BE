package com.example.BE.artistfansign.dto;

import com.example.BE.artistfansign.ArtistFansign;
import com.example.BE.artistfansign.FansignStatus;
import lombok.Getter;

@Getter
public class ArtistFansignResponseDto {

    private String posterImageUrl;
    private String title;
    private FansignStatus status;

    public ArtistFansignResponseDto(ArtistFansign entity) {
        this.posterImageUrl = entity.getPosterImageUrl();
        this.title = entity.getTitle();
        this.status = entity.getStatus();
    }
}
