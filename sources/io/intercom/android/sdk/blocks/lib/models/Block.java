package io.intercom.android.sdk.blocks.lib.models;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.ConversationRatingOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class Block implements Parcelable {
    public static final Parcelable.Creator<Block> CREATOR = new C51781();
    private final BlockAlignment align;
    private final String articleId;
    private final List<BlockAttachment> attachments;
    private final String attribution;
    private final Author author;
    private final Map<String, String> data;
    private final String description;
    private final long duration;
    private final String fallbackUrl;
    private final Link footerLink;
    private final int height;

    /* JADX INFO: renamed from: id */
    private final String f43578id;
    private final Image image;
    private final int imageHeight;
    private final String imageUrl;
    private final int imageWidth;
    private final List<String> items;
    private final String language;
    private final String linkType;
    private final String linkUrl;
    private final List<Link> links;
    private final Uri local_uri;
    private final List<ConversationRatingOption> options;
    private final String previewUrl;
    private final String provider;
    private final int ratingIndex;
    private final String remark;
    private final String siteName;
    private final String text;
    private final String thumbnailUrl;
    private int ticketTypeId;
    private final TicketType ticket_type;
    private final String ticket_type_title;
    private final String title;
    private final String trackingUrl;
    private final BlockType type;
    private final String url;
    private final String username;
    private final int width;

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.models.Block$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C51781 implements Parcelable.Creator<Block> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Block createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Block[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Block createFromParcel(Parcel parcel) {
            return new Block(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Block[] newArray(int i) {
            return new Block[i];
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.models.Block$2 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C51792 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType;

        static {
            int[] iArr = new int[BlockType.values().length];
            $SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType = iArr;
            try {
                iArr[BlockType.PARAGRAPH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType[BlockType.LOCALIMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType[BlockType.IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType[BlockType.LOCAL_ATTACHMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {
        String align;
        String articleId;
        List<BlockAttachment> attachments;
        String attribution;
        Author author;
        Map<String, String> data;
        String description;
        Long duration;
        String fallbackUrl;
        Builder footerLink;
        Integer height;

        /* JADX INFO: renamed from: id */
        String f43579id;
        Image image;
        Integer imageHeight;
        String imageUrl;
        Integer imageWidth;
        List<String> items;
        String language;
        String linkType;
        String linkUrl;
        List<Builder> links;
        Uri local_uri;
        List<ConversationRatingOption.Builder> options;
        String previewUrl;
        String provider;
        Integer ratingIndex;
        Integer rating_index;
        String remark;
        String siteName;
        String text;
        String thumbnailUrl;
        TicketType ticket_type;
        int ticket_type_id;
        String ticket_type_title;
        String title;
        String trackingUrl;
        String type;
        String url;
        String username;
        Integer width;

        public Block build() {
            return new Block(this, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Builder.class == obj.getClass()) {
                Builder builder = (Builder) obj;
                String str = this.type;
                if (str == null ? builder.type != null : !str.equals(builder.type)) {
                    return false;
                }
                String str2 = this.text;
                if (str2 == null ? builder.text != null : !str2.equals(builder.text)) {
                    return false;
                }
                String str3 = this.title;
                if (str3 == null ? builder.title != null : !str3.equals(builder.title)) {
                    return false;
                }
                String str4 = this.description;
                if (str4 == null ? builder.description != null : !str4.equals(builder.description)) {
                    return false;
                }
                String str5 = this.linkType;
                if (str5 == null ? builder.linkType != null : !str5.equals(builder.linkType)) {
                    return false;
                }
                String str6 = this.siteName;
                if (str6 == null ? builder.siteName != null : !str6.equals(builder.siteName)) {
                    return false;
                }
                String str7 = this.articleId;
                if (str7 == null ? builder.articleId != null : !str7.equals(builder.articleId)) {
                    return false;
                }
                Author author = this.author;
                if (author == null ? builder.author != null : !author.equals(builder.author)) {
                    return false;
                }
                Image image = this.image;
                if (image == null ? builder.image != null : !image.equals(builder.image)) {
                    return false;
                }
                Map<String, String> map = this.data;
                if (map == null ? builder.data != null : !map.equals(builder.data)) {
                    return false;
                }
                String str8 = this.language;
                if (str8 == null ? builder.language != null : !str8.equals(builder.language)) {
                    return false;
                }
                String str9 = this.url;
                if (str9 == null ? builder.url != null : !str9.equals(builder.url)) {
                    return false;
                }
                String str10 = this.thumbnailUrl;
                if (str10 == null ? builder.thumbnailUrl != null : !str10.equals(builder.thumbnailUrl)) {
                    return false;
                }
                String str11 = this.linkUrl;
                if (str11 == null ? builder.linkUrl != null : !str11.equals(builder.linkUrl)) {
                    return false;
                }
                String str12 = this.trackingUrl;
                if (str12 == null ? builder.trackingUrl != null : !str12.equals(builder.trackingUrl)) {
                    return false;
                }
                String str13 = this.fallbackUrl;
                if (str13 == null ? builder.fallbackUrl != null : !str13.equals(builder.fallbackUrl)) {
                    return false;
                }
                String str14 = this.username;
                if (str14 == null ? builder.username != null : !str14.equals(builder.username)) {
                    return false;
                }
                String str15 = this.provider;
                if (str15 == null ? builder.provider != null : !str15.equals(builder.provider)) {
                    return false;
                }
                String str16 = this.f43579id;
                if (str16 == null ? builder.f43579id != null : !str16.equals(builder.f43579id)) {
                    return false;
                }
                String str17 = this.align;
                if (str17 == null ? builder.align != null : !str17.equals(builder.align)) {
                    return false;
                }
                Integer num = this.width;
                if (num == null ? builder.width != null : !num.equals(builder.width)) {
                    return false;
                }
                Integer num2 = this.height;
                if (num2 == null ? builder.height != null : !num2.equals(builder.height)) {
                    return false;
                }
                Long l = this.duration;
                if (l == null ? builder.duration != null : !l.equals(builder.duration)) {
                    return false;
                }
                String str18 = this.previewUrl;
                if (str18 == null ? builder.previewUrl != null : !str18.equals(builder.previewUrl)) {
                    return false;
                }
                String str19 = this.attribution;
                if (str19 == null ? builder.attribution != null : !str19.equals(builder.attribution)) {
                    return false;
                }
                List<BlockAttachment> list = this.attachments;
                if (list == null ? builder.attachments != null : !list.equals(builder.attachments)) {
                    return false;
                }
                List<String> list2 = this.items;
                if (list2 == null ? builder.items != null : !list2.equals(builder.items)) {
                    return false;
                }
                Integer num3 = this.rating_index;
                if (num3 == null ? builder.rating_index != null : !num3.equals(builder.rating_index)) {
                    return false;
                }
                Integer num4 = this.ratingIndex;
                if (num4 == null ? builder.ratingIndex != null : !num4.equals(builder.ratingIndex)) {
                    return false;
                }
                String str20 = this.remark;
                if (str20 == null ? builder.remark != null : !str20.equals(builder.remark)) {
                    return false;
                }
                List<ConversationRatingOption.Builder> list3 = this.options;
                if (list3 == null ? builder.options != null : !list3.equals(builder.options)) {
                    return false;
                }
                List<Builder> list4 = this.links;
                if (list4 == null ? builder.links != null : !list4.equals(builder.links)) {
                    return false;
                }
                String str21 = this.imageUrl;
                if (str21 == null ? builder.imageUrl != null : !str21.equals(builder.imageUrl)) {
                    return false;
                }
                Integer num5 = this.imageWidth;
                if (num5 == null ? builder.imageWidth != null : !num5.equals(builder.imageWidth)) {
                    return false;
                }
                Integer num6 = this.imageHeight;
                if (num6 == null ? builder.imageHeight != null : !num6.equals(builder.imageHeight)) {
                    return false;
                }
                String str22 = this.ticket_type_title;
                if (str22 == null ? builder.ticket_type_title != null : !str22.equals(builder.ticket_type_title)) {
                    return false;
                }
                TicketType ticketType = this.ticket_type;
                if (ticketType == null ? builder.ticket_type != null : !ticketType.equals(builder.ticket_type)) {
                    return false;
                }
                if (!Integer.valueOf(this.ticket_type_id).equals(Integer.valueOf(builder.ticket_type_id))) {
                    return false;
                }
                Builder builder2 = this.footerLink;
                Builder builder3 = builder.footerLink;
                if (builder2 != null) {
                    return builder2.equals(builder3);
                }
                if (builder3 == null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            String str = this.type;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.text;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.title;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.description;
            int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.linkType;
            int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.siteName;
            int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
            String str7 = this.articleId;
            int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
            Author author = this.author;
            int iHashCode8 = (iHashCode7 + (author != null ? author.hashCode() : 0)) * 31;
            Image image = this.image;
            int iHashCode9 = (iHashCode8 + (image != null ? image.hashCode() : 0)) * 31;
            Map<String, String> map = this.data;
            int iHashCode10 = (iHashCode9 + (map != null ? map.hashCode() : 0)) * 31;
            String str8 = this.language;
            int iHashCode11 = (iHashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31;
            String str9 = this.url;
            int iHashCode12 = (iHashCode11 + (str9 != null ? str9.hashCode() : 0)) * 31;
            String str10 = this.thumbnailUrl;
            int iHashCode13 = (iHashCode12 + (str10 != null ? str10.hashCode() : 0)) * 31;
            String str11 = this.linkUrl;
            int iHashCode14 = (iHashCode13 + (str11 != null ? str11.hashCode() : 0)) * 31;
            String str12 = this.trackingUrl;
            int iHashCode15 = (iHashCode14 + (str12 != null ? str12.hashCode() : 0)) * 31;
            String str13 = this.fallbackUrl;
            int iHashCode16 = (iHashCode15 + (str13 != null ? str13.hashCode() : 0)) * 31;
            String str14 = this.username;
            int iHashCode17 = (iHashCode16 + (str14 != null ? str14.hashCode() : 0)) * 31;
            String str15 = this.provider;
            int iHashCode18 = (iHashCode17 + (str15 != null ? str15.hashCode() : 0)) * 31;
            String str16 = this.f43579id;
            int iHashCode19 = (iHashCode18 + (str16 != null ? str16.hashCode() : 0)) * 31;
            String str17 = this.align;
            int iHashCode20 = (iHashCode19 + (str17 != null ? str17.hashCode() : 0)) * 31;
            Integer num = this.width;
            int iHashCode21 = (iHashCode20 + (num != null ? num.hashCode() : 0)) * 31;
            Integer num2 = this.height;
            int iHashCode22 = (iHashCode21 + (num2 != null ? num2.hashCode() : 0)) * 31;
            Long l = this.duration;
            int iHashCode23 = (iHashCode22 + (l != null ? l.hashCode() : 0)) * 31;
            String str18 = this.previewUrl;
            int iHashCode24 = (iHashCode23 + (str18 != null ? str18.hashCode() : 0)) * 31;
            String str19 = this.attribution;
            int iHashCode25 = (iHashCode24 + (str19 != null ? str19.hashCode() : 0)) * 31;
            List<BlockAttachment> list = this.attachments;
            int iHashCode26 = (iHashCode25 + (list != null ? list.hashCode() : 0)) * 31;
            List<String> list2 = this.items;
            int iHashCode27 = (iHashCode26 + (list2 != null ? list2.hashCode() : 0)) * 31;
            Integer num3 = this.rating_index;
            int iHashCode28 = (iHashCode27 + (num3 != null ? num3.hashCode() : 0)) * 31;
            Integer num4 = this.ratingIndex;
            int iHashCode29 = (iHashCode28 + (num4 != null ? num4.hashCode() : 0)) * 31;
            String str20 = this.remark;
            int iHashCode30 = (iHashCode29 + (str20 != null ? str20.hashCode() : 0)) * 31;
            List<ConversationRatingOption.Builder> list3 = this.options;
            int iHashCode31 = (iHashCode30 + (list3 != null ? list3.hashCode() : 0)) * 31;
            List<Builder> list4 = this.links;
            int iHashCode32 = (iHashCode31 + (list4 != null ? list4.hashCode() : 0)) * 31;
            Builder builder = this.footerLink;
            int iHashCode33 = (iHashCode32 + (builder != null ? builder.hashCode() : 0)) * 31;
            String str21 = this.imageUrl;
            int iHashCode34 = (iHashCode33 + (str21 != null ? str21.hashCode() : 0)) * 31;
            Integer num5 = this.imageWidth;
            int iHashCode35 = (iHashCode34 + (num5 != null ? num5.hashCode() : 0)) * 31;
            Integer num6 = this.imageHeight;
            int iHashCode36 = (iHashCode35 + (num6 != null ? num6.hashCode() : 0)) * 31;
            String str22 = this.ticket_type_title;
            int iHashCode37 = (iHashCode36 + (str22 != null ? str22.hashCode() : 0)) * 31;
            TicketType ticketType = this.ticket_type;
            return ((iHashCode37 + (ticketType != null ? ticketType.hashCode() : 0)) * 31) + this.ticket_type_id;
        }

        public Builder withAlign(String str) {
            this.align = str;
            return this;
        }

        public Builder withArticleId(String str) {
            this.articleId = str;
            return this;
        }

        public Builder withAttachments(List<BlockAttachment> list) {
            this.attachments = list;
            return this;
        }

        public Builder withAttribution(String str) {
            this.attribution = str;
            return this;
        }

        public Builder withAuthor(Author author) {
            this.author = author;
            return this;
        }

        public Builder withData(Map<String, String> map) {
            this.data = map;
            return this;
        }

        public Builder withDescription(String str) {
            this.description = str;
            return this;
        }

        public Builder withDuration(long j) {
            this.duration = Long.valueOf(j);
            return this;
        }

        public Builder withHeight(int i) {
            this.height = Integer.valueOf(i);
            return this;
        }

        public Builder withImage(Image image) {
            this.image = image;
            return this;
        }

        public Builder withImageHeight(int i) {
            this.imageHeight = Integer.valueOf(i);
            return this;
        }

        public Builder withImageUrl(String str) {
            this.imageUrl = str;
            return this;
        }

        public Builder withImageWidth(int i) {
            this.imageWidth = Integer.valueOf(i);
            return this;
        }

        public Builder withItems(List<String> list) {
            this.items = list;
            return this;
        }

        public Builder withLinkType(String str) {
            this.linkType = str;
            return this;
        }

        public Builder withLocalUri(Uri uri) {
            this.local_uri = uri;
            return this;
        }

        public Builder withOptions(List<ConversationRatingOption.Builder> list) {
            this.options = list;
            return this;
        }

        public Builder withPreviewUrl(String str) {
            this.previewUrl = str;
            return this;
        }

        public Builder withRatingIndex(Integer num) {
            this.ratingIndex = num;
            return this;
        }

        public Builder withRemark(String str) {
            this.remark = str;
            return this;
        }

        public Builder withSiteName(String str) {
            this.siteName = str;
            return this;
        }

        public Builder withText(String str) {
            this.text = str;
            return this;
        }

        public Builder withThumbnailUrl(String str) {
            this.thumbnailUrl = str;
            return this;
        }

        public Builder withTicketType(TicketType ticketType) {
            this.ticket_type = ticketType;
            return this;
        }

        public Builder withTicketTypeTitle(String str) {
            this.ticket_type_title = str;
            return this;
        }

        public Builder withTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder withType(String str) {
            this.type = str;
            return this;
        }

        public Builder withUrl(String str) {
            this.url = str;
            return this;
        }

        public Builder withWidth(int i) {
            this.width = Integer.valueOf(i);
            return this;
        }
    }

    public /* synthetic */ Block(Builder builder, C51781 c51781) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Block block = (Block) obj;
            if (this.width != block.width || this.height != block.height || this.ratingIndex != block.ratingIndex) {
                return false;
            }
            List<BlockAttachment> list = this.attachments;
            if (list == null ? block.attachments != null : !list.equals(block.attachments)) {
                return false;
            }
            List<String> list2 = this.items;
            if (list2 == null ? block.items != null : !list2.equals(block.items)) {
                return false;
            }
            Map<String, String> map = this.data;
            if (map == null ? block.data != null : !map.equals(block.data)) {
                return false;
            }
            if (this.type != block.type || this.align != block.align) {
                return false;
            }
            Author author = this.author;
            if (author == null ? block.author != null : !author.equals(block.author)) {
                return false;
            }
            Image image = this.image;
            if (image == null ? block.image != null : !image.equals(block.image)) {
                return false;
            }
            String str = this.text;
            if (str == null ? block.text != null : !str.equals(block.text)) {
                return false;
            }
            String str2 = this.title;
            if (str2 == null ? block.title != null : !str2.equals(block.title)) {
                return false;
            }
            String str3 = this.description;
            if (str3 == null ? block.description != null : !str3.equals(block.description)) {
                return false;
            }
            String str4 = this.linkType;
            if (str4 == null ? block.linkType != null : !str4.equals(block.linkType)) {
                return false;
            }
            String str5 = this.siteName;
            if (str5 == null ? block.siteName != null : !str5.equals(block.siteName)) {
                return false;
            }
            String str6 = this.articleId;
            if (str6 == null ? block.articleId != null : !str6.equals(block.articleId)) {
                return false;
            }
            String str7 = this.language;
            if (str7 == null ? block.language != null : !str7.equals(block.language)) {
                return false;
            }
            String str8 = this.url;
            if (str8 == null ? block.url != null : !str8.equals(block.url)) {
                return false;
            }
            String str9 = this.thumbnailUrl;
            if (str9 == null ? block.thumbnailUrl != null : !str9.equals(block.thumbnailUrl)) {
                return false;
            }
            String str10 = this.previewUrl;
            if (str10 == null ? block.previewUrl != null : !str10.equals(block.previewUrl)) {
                return false;
            }
            String str11 = this.attribution;
            if (str11 == null ? block.attribution != null : !str11.equals(block.attribution)) {
                return false;
            }
            String str12 = this.linkUrl;
            if (str12 == null ? block.linkUrl != null : !str12.equals(block.linkUrl)) {
                return false;
            }
            String str13 = this.trackingUrl;
            if (str13 == null ? block.trackingUrl != null : !str13.equals(block.trackingUrl)) {
                return false;
            }
            String str14 = this.fallbackUrl;
            if (str14 == null ? block.fallbackUrl != null : !str14.equals(block.fallbackUrl)) {
                return false;
            }
            String str15 = this.username;
            if (str15 == null ? block.username != null : !str15.equals(block.username)) {
                return false;
            }
            String str16 = this.provider;
            if (str16 == null ? block.provider != null : !str16.equals(block.provider)) {
                return false;
            }
            String str17 = this.f43578id;
            if (str17 == null ? block.f43578id != null : !str17.equals(block.f43578id)) {
                return false;
            }
            String str18 = this.remark;
            if (str18 == null ? block.remark != null : !str18.equals(block.remark)) {
                return false;
            }
            List<ConversationRatingOption> list3 = this.options;
            if (list3 == null ? block.options != null : !list3.equals(block.options)) {
                return false;
            }
            List<Link> list4 = this.links;
            if (list4 == null ? block.links != null : !list4.equals(block.links)) {
                return false;
            }
            Uri uri = this.local_uri;
            if (uri == null ? block.local_uri != null : !uri.equals(block.local_uri)) {
                return false;
            }
            String str19 = this.imageUrl;
            if (str19 == null ? block.imageUrl != null : !str19.equals(block.imageUrl)) {
                return false;
            }
            if (this.imageWidth != block.imageWidth || this.imageHeight != block.imageHeight) {
                return false;
            }
            String str20 = this.ticket_type_title;
            if (str20 == null ? block.ticket_type_title != null : !str20.equals(block.ticket_type_title)) {
                return false;
            }
            TicketType ticketType = this.ticket_type;
            if (ticketType == null ? block.ticket_type != null : !ticketType.equals(block.ticket_type)) {
                return false;
            }
            Link link = this.footerLink;
            Link link2 = block.footerLink;
            if (link != null) {
                return link.equals(link2);
            }
            if (link2 == null) {
                return true;
            }
        }
        return false;
    }

    public BlockAlignment getAlign() {
        return this.align;
    }

    public String getArticleId() {
        return this.articleId;
    }

    public List<BlockAttachment> getAttachments() {
        return this.attachments;
    }

    public String getAttribution() {
        return this.attribution;
    }

    public Author getAuthor() {
        return this.author;
    }

    public Map<String, String> getData() {
        return this.data;
    }

    public String getDescription() {
        return this.description;
    }

    public String getFallbackUrl() {
        return this.fallbackUrl;
    }

    public Link getFooterLink() {
        return this.footerLink;
    }

    public int getHeight() {
        return this.height;
    }

    public String getId() {
        return this.f43578id;
    }

    public Image getImage() {
        return this.image;
    }

    public int getImageHeight() {
        return this.imageHeight;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public int getImageWidth() {
        return this.imageWidth;
    }

    public List<String> getItems() {
        return this.items;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getLinkType() {
        return this.linkType;
    }

    public String getLinkUrl() {
        return this.linkUrl;
    }

    public List<Link> getLinks() {
        return this.links;
    }

    public Uri getLocalUri() {
        return this.local_uri;
    }

    public List<ConversationRatingOption> getOptions() {
        return this.options;
    }

    public String getPreviewUrl() {
        return this.previewUrl;
    }

    public String getProvider() {
        return this.provider;
    }

    public int getRatingIndex() {
        return this.ratingIndex;
    }

    public String getRemark() {
        return this.remark;
    }

    public String getSiteName() {
        return this.siteName;
    }

    public String getText() {
        return this.text;
    }

    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public TicketType getTicketType() {
        return this.ticket_type;
    }

    public int getTicketTypeId() {
        return this.ticketTypeId;
    }

    public String getTicketTypeTitle() {
        return this.ticket_type_title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTrackingUrl() {
        return this.trackingUrl;
    }

    public BlockType getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUsername() {
        return this.username;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        List<BlockAttachment> list = this.attachments;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.items;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        Map<String, String> map = this.data;
        int iHashCode3 = (iHashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        BlockType blockType = this.type;
        int iHashCode4 = (iHashCode3 + (blockType != null ? blockType.hashCode() : 0)) * 31;
        BlockAlignment blockAlignment = this.align;
        int iHashCode5 = (iHashCode4 + (blockAlignment != null ? blockAlignment.hashCode() : 0)) * 31;
        Author author = this.author;
        int iHashCode6 = (iHashCode5 + (author != null ? author.hashCode() : 0)) * 31;
        Image image = this.image;
        int iHashCode7 = (iHashCode6 + (image != null ? image.hashCode() : 0)) * 31;
        String str = this.text;
        int iHashCode8 = (iHashCode7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.title;
        int iHashCode9 = (iHashCode8 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.description;
        int iHashCode10 = (iHashCode9 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.linkType;
        int iHashCode11 = (iHashCode10 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.siteName;
        int iHashCode12 = (iHashCode11 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.articleId;
        int iHashCode13 = (iHashCode12 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.language;
        int iHashCode14 = (iHashCode13 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.url;
        int iHashCode15 = (iHashCode14 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.thumbnailUrl;
        int iHashCode16 = (iHashCode15 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.previewUrl;
        int iHashCode17 = (iHashCode16 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.attribution;
        int iHashCode18 = (iHashCode17 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.linkUrl;
        int iHashCode19 = (iHashCode18 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.trackingUrl;
        int iHashCode20 = (iHashCode19 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.fallbackUrl;
        int iHashCode21 = (iHashCode20 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.username;
        int iHashCode22 = (iHashCode21 + (str15 != null ? str15.hashCode() : 0)) * 31;
        String str16 = this.provider;
        int iHashCode23 = (iHashCode22 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String str17 = this.f43578id;
        int iHashCode24 = (((((((iHashCode23 + (str17 != null ? str17.hashCode() : 0)) * 31) + this.width) * 31) + this.height) * 31) + this.ratingIndex) * 31;
        String str18 = this.remark;
        int iHashCode25 = (iHashCode24 + (str18 != null ? str18.hashCode() : 0)) * 31;
        List<ConversationRatingOption> list3 = this.options;
        int iHashCode26 = (iHashCode25 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<Link> list4 = this.links;
        int iHashCode27 = (iHashCode26 + (list4 != null ? list4.hashCode() : 0)) * 31;
        Link link = this.footerLink;
        int iHashCode28 = (iHashCode27 + (link != null ? link.hashCode() : 0)) * 31;
        Uri uri = this.local_uri;
        int iHashCode29 = (iHashCode28 + (uri != null ? uri.hashCode() : 0)) * 31;
        String str19 = this.imageUrl;
        int iHashCode30 = (((((iHashCode29 + (str19 != null ? str19.hashCode() : 0)) * 31) + this.imageWidth) * 31) + this.imageHeight) * 31;
        String str20 = this.ticket_type_title;
        int iHashCode31 = (iHashCode30 + (str20 != null ? str20.hashCode() : 0)) * 31;
        TicketType ticketType = this.ticket_type;
        return iHashCode31 + (ticketType != null ? ticketType.hashCode() : 0);
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        int i = C51792.$SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType[this.type.ordinal()];
        if (i == 1) {
            builder.withText(this.text).withType(this.type.getSerializedName());
            return builder;
        }
        if (i == 2 || i == 3) {
            builder.withType(this.type.getSerializedName()).withUrl(this.url).withLocalUri(this.local_uri).withAttribution(this.attribution.isEmpty() ? null : this.attribution).withPreviewUrl(this.previewUrl.isEmpty() ? null : this.previewUrl).withHeight(this.height).withWidth(this.width);
            return builder;
        }
        if (i != 4) {
            return builder;
        }
        builder.withType(this.type.getSerializedName()).withAttachments(this.attachments);
        return builder;
    }

    public String toString() {
        return "Block{attachments=" + this.attachments + ", items=" + this.items + ", data=" + this.data + ", type=" + this.type + ", align=" + this.align + ", author=" + this.author + ", image=" + this.image + ", text='" + this.text + "', title='" + this.title + "', description='" + this.description + "', linkType='" + this.linkType + "', siteName='" + this.siteName + "', articleId='" + this.articleId + "', language='" + this.language + "', url='" + this.url + "', thumbnailUrl='" + this.thumbnailUrl + "', previewUrl='" + this.previewUrl + "', attribution='" + this.attribution + "', linkUrl='" + this.linkUrl + "', trackingUrl='" + this.trackingUrl + "', fallbackUrl='" + this.fallbackUrl + "', username='" + this.username + "', provider='" + this.provider + "', id='" + this.f43578id + "', width=" + this.width + ", height=" + this.height + ", ratingIndex=" + this.ratingIndex + ", remark='" + this.remark + "', options=" + this.options + ", links=" + this.links + ", footerLink=" + this.footerLink + ", imageUrl=" + this.imageUrl + ", imageWidth=" + this.imageWidth + ", imageHeight=" + this.imageHeight + ", ticket_type_title=" + this.ticket_type_title + ", ticket_type=" + this.ticket_type + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.attachments);
        parcel.writeStringList(this.items);
        parcel.writeInt(this.data.size());
        for (Map.Entry<String, String> entry : this.data.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        BlockType blockType = this.type;
        parcel.writeInt(blockType == null ? -1 : blockType.ordinal());
        BlockAlignment blockAlignment = this.align;
        parcel.writeInt(blockAlignment != null ? blockAlignment.ordinal() : -1);
        parcel.writeParcelable(this.author, i);
        parcel.writeParcelable(this.image, i);
        parcel.writeString(this.text);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.linkType);
        parcel.writeString(this.siteName);
        parcel.writeString(this.articleId);
        parcel.writeString(this.language);
        parcel.writeString(this.url);
        parcel.writeString(this.thumbnailUrl);
        parcel.writeString(this.linkUrl);
        parcel.writeString(this.trackingUrl);
        parcel.writeString(this.fallbackUrl);
        parcel.writeString(this.username);
        parcel.writeString(this.provider);
        parcel.writeString(this.previewUrl);
        parcel.writeString(this.attribution);
        parcel.writeString(this.f43578id);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.duration);
        parcel.writeInt(this.ratingIndex);
        parcel.writeString(this.remark);
        parcel.writeTypedList(this.options);
        parcel.writeTypedList(this.links);
        parcel.writeParcelable(this.footerLink, i);
        parcel.writeParcelable(this.local_uri, i);
        parcel.writeString(this.imageUrl);
        parcel.writeInt(this.imageWidth);
        parcel.writeInt(this.imageHeight);
        parcel.writeString(this.ticket_type_title);
        parcel.writeParcelable(this.ticket_type, i);
    }

    public Block() {
        this(new Builder());
    }

    private Block(Builder builder) {
        this.type = BlockType.typeValueOf(builder.type);
        String str = builder.text;
        this.text = str == null ? "" : str;
        String str2 = builder.title;
        this.title = str2 == null ? "" : str2;
        String str3 = builder.description;
        this.description = str3 == null ? "" : str3;
        String str4 = builder.linkType;
        this.linkType = str4 == null ? "" : str4;
        String str5 = builder.siteName;
        this.siteName = str5 == null ? "" : str5;
        String str6 = builder.articleId;
        this.articleId = str6 == null ? "" : str6;
        Author author = builder.author;
        this.author = author == null ? new Author() : author;
        Image image = builder.image;
        this.image = image == null ? new Image() : image;
        Map<String, String> map = builder.data;
        this.data = map == null ? Collections.EMPTY_MAP : map;
        String str7 = builder.language;
        this.language = str7 == null ? "" : str7;
        String str8 = builder.url;
        this.url = str8 == null ? "" : str8;
        String str9 = builder.thumbnailUrl;
        this.thumbnailUrl = str9 == null ? "" : str9;
        String str10 = builder.linkUrl;
        this.linkUrl = str10 == null ? "" : str10;
        String str11 = builder.trackingUrl;
        this.trackingUrl = str11 == null ? "" : str11;
        String str12 = builder.fallbackUrl;
        this.fallbackUrl = str12 == null ? "" : str12;
        String str13 = builder.username;
        this.username = str13 == null ? "" : str13;
        String str14 = builder.provider;
        this.provider = str14 == null ? "" : str14;
        String str15 = builder.f43579id;
        this.f43578id = str15 == null ? "" : str15;
        this.align = BlockAlignment.alignValueOf(builder.align);
        Integer num = builder.width;
        this.width = num == null ? 0 : num.intValue();
        Integer num2 = builder.height;
        this.height = num2 == null ? 0 : num2.intValue();
        Long l = builder.duration;
        this.duration = l == null ? 0L : l.longValue();
        String str16 = builder.previewUrl;
        this.previewUrl = str16 == null ? "" : str16;
        String str17 = builder.attribution;
        this.attribution = str17 == null ? "" : str17;
        Uri uri = builder.local_uri;
        this.local_uri = uri == null ? Uri.EMPTY : uri;
        String str18 = builder.imageUrl;
        this.imageUrl = str18 == null ? "" : str18;
        Integer num3 = builder.imageWidth;
        this.imageWidth = num3 == null ? 0 : num3.intValue();
        Integer num4 = builder.imageHeight;
        this.imageHeight = num4 != null ? num4.intValue() : 0;
        this.attachments = new ArrayList();
        List<BlockAttachment> list = builder.attachments;
        if (list != null) {
            for (BlockAttachment blockAttachment : list) {
                if (blockAttachment != null) {
                    this.attachments.add(blockAttachment);
                }
            }
        }
        this.items = new ArrayList();
        List<String> list2 = builder.items;
        if (list2 != null) {
            for (String str19 : list2) {
                if (str19 != null) {
                    this.items.add(str19);
                }
            }
        }
        Integer num5 = builder.ratingIndex;
        if (num5 != null) {
            this.ratingIndex = num5.intValue();
        } else {
            Integer num6 = builder.rating_index;
            if (num6 != null) {
                this.ratingIndex = num6.intValue();
            } else {
                this.ratingIndex = -1;
            }
        }
        String str20 = builder.remark;
        this.remark = str20 == null ? "" : str20;
        this.options = new ArrayList();
        List<ConversationRatingOption.Builder> list3 = builder.options;
        if (list3 != null) {
            for (ConversationRatingOption.Builder builder2 : list3) {
                if (builder2 != null) {
                    this.options.add(builder2.build());
                }
            }
        }
        this.links = new ArrayList();
        List<Builder> list4 = builder.links;
        if (list4 != null) {
            for (Builder builder3 : list4) {
                if (builder3 != null) {
                    this.links.add(Link.fromBlock(builder3.build()));
                }
            }
        }
        Builder builder4 = builder.footerLink;
        this.footerLink = builder4 == null ? new Link() : Link.fromBlock(builder4.build());
        String str21 = builder.ticket_type_title;
        this.ticket_type_title = str21 != null ? str21 : "";
        TicketType ticketType = builder.ticket_type;
        this.ticket_type = ticketType == null ? TicketType.INSTANCE.getNULL() : ticketType;
        this.ticketTypeId = builder.ticket_type_id;
    }

    public Block(Parcel parcel) {
        this.attachments = parcel.createTypedArrayList(BlockAttachment.CREATOR);
        this.items = parcel.createStringArrayList();
        int i = parcel.readInt();
        this.data = new HashMap(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.data.put(parcel.readString(), parcel.readString());
        }
        int i3 = parcel.readInt();
        this.type = i3 == -1 ? null : BlockType.values()[i3];
        int i4 = parcel.readInt();
        this.align = i4 != -1 ? BlockAlignment.values()[i4] : null;
        this.author = (Author) parcel.readParcelable(Author.class.getClassLoader());
        this.image = (Image) parcel.readParcelable(Image.class.getClassLoader());
        this.text = parcel.readString();
        this.title = parcel.readString();
        this.description = parcel.readString();
        this.linkType = parcel.readString();
        this.siteName = parcel.readString();
        this.articleId = parcel.readString();
        this.language = parcel.readString();
        this.url = parcel.readString();
        this.thumbnailUrl = parcel.readString();
        this.linkUrl = parcel.readString();
        this.trackingUrl = parcel.readString();
        this.fallbackUrl = parcel.readString();
        this.username = parcel.readString();
        this.provider = parcel.readString();
        this.previewUrl = parcel.readString();
        this.attribution = parcel.readString();
        this.f43578id = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.duration = parcel.readLong();
        this.ratingIndex = parcel.readInt();
        this.remark = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.options = arrayList;
        parcel.readList(arrayList, ConversationRatingOption.class.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        this.links = arrayList2;
        parcel.readList(arrayList2, Link.class.getClassLoader());
        this.footerLink = (Link) parcel.readParcelable(Link.class.getClassLoader());
        this.local_uri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.imageUrl = parcel.readString();
        this.imageWidth = parcel.readInt();
        this.imageHeight = parcel.readInt();
        this.ticket_type_title = parcel.readString();
        this.ticket_type = (TicketType) parcel.readParcelable(TicketType.class.getClassLoader());
    }
}
