package depromeet.ohgzoo.iam.folder.folderItem;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FolderItemMoveRequest {
    @JsonProperty("postId")
    @NotNull
    private Long folderItemId;

    public FolderItemMoveRequest(Long folderItemId) {
        this.folderItemId = folderItemId;
    }
}
