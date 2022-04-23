package depromeet.ohgzoo.iam.folder;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
@Getter
public class FolderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "folder_item_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    private FirstCategory firstCategory;

    @Enumerated(EnumType.STRING)
    private SecondCategory secondCategory;

    private String content;

    private List<String> tags;

    private Boolean disclosure;

    @Builder
    public FolderItem(Long id, FirstCategory firstCategory, SecondCategory secondCategory, String content, List<String> tags, Boolean disclosure) {
        this.id = id;
        this.firstCategory = firstCategory;
        this.secondCategory = secondCategory;
        this.content = content;
        this.tags = tags;
        this.disclosure = disclosure;
    }

    public FolderItem(FirstCategory firstCategory, SecondCategory secondCategory, String content, List<String> tags, Boolean disclosure) {
        this(null, firstCategory, secondCategory, content, tags, disclosure);
    }
}