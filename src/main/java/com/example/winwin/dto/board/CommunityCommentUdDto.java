package com.example.winwin.dto.board;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class CommunityCommentUdDto {
    private Long userNumber;
    private Long commentNumber;
    private String udStatus;
}
