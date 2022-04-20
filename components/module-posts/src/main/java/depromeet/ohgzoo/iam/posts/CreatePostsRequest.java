package depromeet.ohgzoo.iam.posts;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CreatePostsRequest {
    private PostsFirstCategory firstCategory;
    private PostsSecondCategory secondCategory;
    private String content;
    private List<String> tags = new ArrayList<>();
    private boolean disclosure;

    @Builder
    public CreatePostsRequest(PostsFirstCategory firstCategory, PostsSecondCategory secondCategory, String content, List<String> tags, boolean disclosure) {
        this.firstCategory = firstCategory;
        this.secondCategory = secondCategory;
        this.content = content;
        this.tags = tags;
        this.disclosure = disclosure;
    }
}
