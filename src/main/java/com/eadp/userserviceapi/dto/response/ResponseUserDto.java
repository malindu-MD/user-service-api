package com.eadp.userserviceapi.dto.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ResponseUserDto {

    private String userId;
    private String fullName;
    private String email;
    private byte[] avatarUrl;
    private boolean status;

}
