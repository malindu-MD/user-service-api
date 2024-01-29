package com.eadp.userserviceapi.dto.paginate;

import com.eadp.userserviceapi.dto.response.ResponseUserDto;
import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PaginateUsersResponseDto {

    private long count;
    private List<ResponseUserDto> data;

}
