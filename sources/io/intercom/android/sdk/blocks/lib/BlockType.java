package io.intercom.android.sdk.blocks.lib;

import android.view.View;
import android.view.ViewGroup;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.blocks.lib.models.ConversationRating;
import io.intercom.android.sdk.blocks.lib.models.Link;
import io.intercom.android.sdk.blocks.lib.models.LinkList;
import io.intercom.android.sdk.models.carousel.ActionType;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import io.intercom.android.sdk.utilities.commons.HtmlCompat;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BlockType {
    private final String serializedName;
    public static final BlockType PARAGRAPH = new C51551("PARAGRAPH", 0, "paragraph");
    public static final BlockType HEADING = new C51662("HEADING", 1, "heading");
    public static final BlockType SUBHEADING = new C51703("SUBHEADING", 2, "subheading");
    public static final BlockType CODE = new C51714("CODE", 3, "code");
    public static final BlockType LINK = new C51725("LINK", 4, ActionType.LINK);
    public static final BlockType CONVERSATIONRATING = new C51736("CONVERSATIONRATING", 5, "conversationRating");
    public static final BlockType LINKLIST = new C51747("LINKLIST", 6, "linkList");
    public static final BlockType UNORDEREDLIST = new C51758("UNORDEREDLIST", 7, "unorderedList");
    public static final BlockType ORDEREDLIST = new C51769("ORDEREDLIST", 8, "orderedList");
    public static final BlockType ATTACHMENTLIST = new C515610("ATTACHMENTLIST", 9, "attachmentList");
    public static final BlockType IMAGE = new C515711("IMAGE", 10, AppearanceType.IMAGE);
    public static final BlockType IMAGETEXT = new C515812("IMAGETEXT", 11, "imageText");
    public static final BlockType BUTTON = new C515913("BUTTON", 12, "button");
    public static final BlockType FACEBOOKLIKEBUTTON = new C516014("FACEBOOKLIKEBUTTON", 13, "facebookLikeButton");
    public static final BlockType TWITTERFOLLOWBUTTON = new C516115("TWITTERFOLLOWBUTTON", 14, "twitterFollowButton");
    public static final BlockType VIDEO = new C516216("VIDEO", 15, "video");
    public static final BlockType VIDEOFILE = new C516317("VIDEOFILE", 16, "videoFile");
    public static final BlockType MESSENGERCARD = new C516418("MESSENGERCARD", 17, "messengerCard");
    public static final BlockType LOCALIMAGE = new C516519("LOCALIMAGE", 18, "localImage");
    public static final BlockType LOCAL_ATTACHMENT = new C516720("LOCAL_ATTACHMENT", 19, "local_attachment");
    public static final BlockType CREATETICKETCARD = new C516821("CREATETICKETCARD", 20, "createTicketCard");
    public static final BlockType UNKNOWN = new C516922("UNKNOWN", 21, "unknown");
    private static final /* synthetic */ BlockType[] $VALUES = $values();

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.BlockType$1 */
    /* JADX INFO: compiled from: Proguard */
    public enum C51551 extends BlockType {
        public C51551(String str, int i, String str2) {
            super(str, i, str2, null);
        }

        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getParagraph().addParagraph(HtmlCompat.fromHtml(block.getText()), block.getAlign(), blockMetadata, viewGroup);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.BlockType$10 */
    /* JADX INFO: compiled from: Proguard */
    public enum C515610 extends BlockType {
        public C515610(String str, int i, String str2) {
            super(str, i, str2, null);
        }

        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getAttachmentList().addAttachmentList(block.getAttachments(), blockMetadata, viewGroup);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.BlockType$11 */
    /* JADX INFO: compiled from: Proguard */
    public enum C515711 extends BlockType {
        public C515711(String str, int i, String str2) {
            super(str, i, str2, null);
        }

        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getImage().addImage(block.getUrl(), BlockType.getLinkUrl(block), block.getDescription(), block.getWidth(), block.getHeight(), block.getAlign(), blockMetadata, viewGroup);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.BlockType$12 */
    /* JADX INFO: compiled from: Proguard */
    public enum C515812 extends BlockType {
        public C515812(String str, int i, String str2) {
            super(str, i, str2, null);
        }

        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            block.getImage();
            return blocksViewHolder.getImageText().addImageText(HtmlCompat.fromHtml(block.getTitle()), HtmlCompat.fromHtml(block.getText()), block.getImageUrl(), block.getDescription(), block.getImageWidth(), block.getImageHeight(), blockMetadata, viewGroup);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.BlockType$13 */
    /* JADX INFO: compiled from: Proguard */
    public enum C515913 extends BlockType {
        public C515913(String str, int i, String str2) {
            super(str, i, str2, null);
        }

        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getButton().addButton(HtmlCompat.fromHtml(block.getText()), BlockType.getLinkUrl(block), block.getAlign(), blockMetadata, viewGroup);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.BlockType$14 */
    /* JADX INFO: compiled from: Proguard */
    public enum C516014 extends BlockType {
        public C516014(String str, int i, String str2) {
            super(str, i, str2, null);
        }

        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getFacebookButton().addFacebookButton(block.getUrl(), block.getAlign(), blockMetadata, viewGroup);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.BlockType$15 */
    /* JADX INFO: compiled from: Proguard */
    public enum C516115 extends BlockType {
        public C516115(String str, int i, String str2) {
            super(str, i, str2, null);
        }

        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getTwitterButton().addTwitterButton("https://twitter.com/" + block.getUsername(), block.getAlign(), blockMetadata, viewGroup);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.BlockType$16 */
    /* JADX INFO: compiled from: Proguard */
    public enum C516216 extends BlockType {
        public C516216(String str, int i, String str2) {
            super(str, i, str2, null);
        }

        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getVideo().addVideo(block.getText(), VideoProvider.videoValueOf(block.getProvider()), block.getId(), blockMetadata, viewGroup);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.BlockType$17 */
    /* JADX INFO: compiled from: Proguard */
    public enum C516317 extends BlockType {
        public C516317(String str, int i, String str2) {
            super(str, i, str2, null);
        }

        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getVideoFile().addVideoFile(block.getText(), block.getUrl(), block.getThumbnailUrl(), blockMetadata, viewGroup);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.BlockType$18 */
    /* JADX INFO: compiled from: Proguard */
    public enum C516418 extends BlockType {
        public C516418(String str, int i, String str2) {
            super(str, i, str2, null);
        }

        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getMessengerCardBlock().addCard(block.getText(), block.getFallbackUrl(), blockMetadata, viewGroup);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.BlockType$19 */
    /* JADX INFO: compiled from: Proguard */
    public enum C516519 extends BlockType {
        public C516519(String str, int i, String str2) {
            super(str, i, str2, null);
        }

        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getLocalImage().addImage(block.getLocalUri(), block.getWidth(), block.getHeight(), block.getAlign(), blockMetadata, viewGroup);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.BlockType$2 */
    /* JADX INFO: compiled from: Proguard */
    public enum C51662 extends BlockType {
        public C51662(String str, int i, String str2) {
            super(str, i, str2, null);
        }

        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getHeading().addHeading(HtmlCompat.fromHtml(block.getText()), block.getAlign(), blockMetadata, viewGroup);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.BlockType$20 */
    /* JADX INFO: compiled from: Proguard */
    public enum C516720 extends BlockType {
        public C516720(String str, int i, String str2) {
            super(str, i, str2, null);
        }

        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getLocalAttachment().addAttachment(block.getAttachments().get(0), blockMetadata, viewGroup);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.BlockType$21 */
    /* JADX INFO: compiled from: Proguard */
    public enum C516821 extends BlockType {
        public C516821(String str, int i, String str2) {
            super(str, i, str2, null);
        }

        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getParagraph().addParagraph(HtmlCompat.fromHtml(block.getText()), block.getAlign(), blockMetadata, viewGroup);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.BlockType$22 */
    /* JADX INFO: compiled from: Proguard */
    public enum C516922 extends BlockType {
        public C516922(String str, int i, String str2) {
            super(str, i, str2, null);
        }

        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            if (block.getText().isEmpty() || blocksViewHolder.getParagraph() == null) {
                throw new BlockTypeNotImplementedException();
            }
            return BlockType.PARAGRAPH.generateViewFromBlockAndLayout(blocksViewHolder, block, viewGroup, blockMetadata);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.BlockType$3 */
    /* JADX INFO: compiled from: Proguard */
    public enum C51703 extends BlockType {
        public C51703(String str, int i, String str2) {
            super(str, i, str2, null);
        }

        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getSubheading().addSubheading(HtmlCompat.fromHtml(block.getText()), block.getAlign(), blockMetadata, viewGroup);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.BlockType$4 */
    /* JADX INFO: compiled from: Proguard */
    public enum C51714 extends BlockType {
        public C51714(String str, int i, String str2) {
            super(str, i, str2, null);
        }

        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getCode().addCode(HtmlCompat.fromHtml(block.getText()), blockMetadata, viewGroup);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.BlockType$5 */
    /* JADX INFO: compiled from: Proguard */
    public enum C51725 extends BlockType {
        public C51725(String str, int i, String str2) {
            super(str, i, str2, null);
        }

        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getLink().addLinkBlock(Link.fromBlock(block), blockMetadata, viewGroup);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.BlockType$6 */
    /* JADX INFO: compiled from: Proguard */
    public enum C51736 extends BlockType {
        public C51736(String str, int i, String str2) {
            super(str, i, str2, null);
        }

        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getConversationRating().addConversationRatingBlock(ConversationRating.fromBlock(block), blockMetadata, viewGroup);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.BlockType$7 */
    /* JADX INFO: compiled from: Proguard */
    public enum C51747 extends BlockType {
        public C51747(String str, int i, String str2) {
            super(str, i, str2, null);
        }

        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getLinkList().addLinkListBlock(LinkList.fromBlock(block), blockMetadata, viewGroup);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.BlockType$8 */
    /* JADX INFO: compiled from: Proguard */
    public enum C51758 extends BlockType {
        public C51758(String str, int i, String str2) {
            super(str, i, str2, null);
        }

        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getUnorderedList().addUnorderedList(block.getItems(), blockMetadata, viewGroup);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.BlockType$9 */
    /* JADX INFO: compiled from: Proguard */
    public enum C51769 extends BlockType {
        public C51769(String str, int i, String str2) {
            super(str, i, str2, null);
        }

        @Override // io.intercom.android.sdk.blocks.lib.BlockType
        public View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
            return blocksViewHolder.getOrderedList().addOrderedList(block.getItems(), blockMetadata, viewGroup);
        }
    }

    private static /* synthetic */ BlockType[] $values() {
        return new BlockType[]{PARAGRAPH, HEADING, SUBHEADING, CODE, LINK, CONVERSATIONRATING, LINKLIST, UNORDEREDLIST, ORDEREDLIST, ATTACHMENTLIST, IMAGE, IMAGETEXT, BUTTON, FACEBOOKLIKEBUTTON, TWITTERFOLLOWBUTTON, VIDEO, VIDEOFILE, MESSENGERCARD, LOCALIMAGE, LOCAL_ATTACHMENT, CREATETICKETCARD, UNKNOWN};
    }

    public /* synthetic */ BlockType(String str, int i, String str2, C51551 c51551) {
        this(str, i, str2);
    }

    public static String getLinkUrl(Block block) {
        return block.getTrackingUrl().isEmpty() ? block.getLinkUrl() : block.getTrackingUrl();
    }

    public static BlockType typeValueOf(String str) {
        try {
            return valueOf(str.toUpperCase(Locale.ENGLISH));
        } catch (IllegalArgumentException | NullPointerException unused) {
            return UNKNOWN;
        }
    }

    public static BlockType valueOf(String str) {
        return (BlockType) Enum.valueOf(BlockType.class, str);
    }

    public static BlockType[] values() {
        return (BlockType[]) $VALUES.clone();
    }

    public abstract View generateViewFromBlockAndLayout(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata);

    public String getSerializedName() {
        return this.serializedName;
    }

    public View getView(BlocksViewHolder blocksViewHolder, Block block, ViewGroup viewGroup, BlockMetadata blockMetadata) {
        try {
            try {
                return generateViewFromBlockAndLayout(blocksViewHolder, block, viewGroup, blockMetadata);
            } catch (NullPointerException unused) {
                return UNKNOWN.generateViewFromBlockAndLayout(blocksViewHolder, block, viewGroup, blockMetadata);
            }
        } catch (BlockTypeNotImplementedException | NullPointerException unused2) {
            throw new BlockTypeNotImplementedException();
        }
    }

    private BlockType(String str, int i, String str2) {
        this.serializedName = str2;
    }
}
