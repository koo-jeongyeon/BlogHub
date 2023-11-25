package com.bloghub.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

public class PostWriteResponseDto {

    private PostWriteInfo tistory;

    public PostWriteInfo getTistory() {
        return tistory;
    }

    public void setTistory(PostWriteInfo tistory) {
        this.tistory = tistory;
    }

    @Getter
    @Setter
    public static class PostWriteInfo {

        private String status;
        private String postId;
        private String url;

    }

}
