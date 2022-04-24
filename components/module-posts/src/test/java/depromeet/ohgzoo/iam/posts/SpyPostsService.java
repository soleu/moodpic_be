package depromeet.ohgzoo.iam.posts;

import java.util.List;

public class SpyPostsService implements PostsService {
    public CreatePostsRequest createPosts_argumentRequest;
    public CreatePostsResult createPosts_returnValue;
    public Long getPostsByMemberId_argumentMemberId;
    public List<PostsDto> getPostsByMemberId_returnValue;
    public int getPostsByMemberId_argumentPage;
    public int getPostsByMemberId_argumentSize;
    public List<PostsDto> getPostsByTag_returnValue;
    public String getPostsByTag_argumentTag;
    public int getPostsByTag_argumentPage;
    public int getPostsByTag_argumentSize;
    public int getPostsOrderByPopular_argumentPage;
    public int getPostsOrderByPopular_argumentSize;
    public List<PostsDto> getPostsOrderByPopular_returnValue;
    public Long getRecentlyUnwrittenPosts_argumentMemberId;
    public PostsDto getRecentlyUnwrittenPosts_returnValue;

    @Override
    public CreatePostsResult createPosts(Long memberId, CreatePostsRequest request) {
        createPosts_argumentRequest = request;
        return createPosts_returnValue;
    }

    @Override
    public List<PostsDto> getPostsByMemberId(Long memberId, int page, int size) {
        getPostsByMemberId_argumentMemberId = memberId;
        getPostsByMemberId_argumentPage = page;
        getPostsByMemberId_argumentSize = size;
        return getPostsByMemberId_returnValue;
    }

    @Override
    public List<PostsDto> getPostsByTag(String tag, int page, int size) {
        getPostsByTag_argumentTag = tag;
        getPostsByTag_argumentPage = page;
        getPostsByTag_argumentSize = size;

        return getPostsByTag_returnValue;
    }

    @Override
    public List<PostsDto> getPostsOrderByPopular(int page, int size) {
        getPostsOrderByPopular_argumentPage = page;
        getPostsOrderByPopular_argumentSize = size;
        return getPostsOrderByPopular_returnValue;
    }

    @Override
    public PostsDto getRecentlyUnwrittenPosts(Long memberId) {
        getRecentlyUnwrittenPosts_argumentMemberId = memberId;
        return getRecentlyUnwrittenPosts_returnValue;
    }
}
