package com.security.security.dtos;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class APIError {
    private LocalDateTime timestamp;
    private String message;
    private String details;
    private String path;
}
