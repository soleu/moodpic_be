package depromeet.ohgzoo.iam.folder;

import depromeet.ohgzoo.iam.folder.folderItem.FolderItemCreateRequest;
import depromeet.ohgzoo.iam.postEvent.PostCreateEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class FolderEventSubscriber {
    private final FolderService folderService;

    @EventListener
    public void handlePostCreateEvent(PostCreateEvent event) {
        FolderItemCreateRequest request = new FolderItemCreateRequest(event.getPostId(), event.getFirstCategory(), event.getSecondCategory(), event.getContent(), event.getTags(), event.isDisclosure());
        folderService.createFolderItem(event.getMemberId(), event.getFolderId(), request);
    }
}