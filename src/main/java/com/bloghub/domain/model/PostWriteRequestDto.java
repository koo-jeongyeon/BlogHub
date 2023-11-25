package com.bloghub.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class PostWriteRequestDto {

    private String title;
    private String visibility;
    private String category;
    private Date published;
    private String tag;
    private String content;

}
