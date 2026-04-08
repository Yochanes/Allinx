package io.intercom.android.sdk;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m18302d2 = {"Lio/intercom/android/sdk/IntercomContent;", "", "<init>", "()V", "HelpCenterCollections", "Article", "Carousel", "Survey", "Conversation", "Ticket", "Lio/intercom/android/sdk/IntercomContent$Article;", "Lio/intercom/android/sdk/IntercomContent$Carousel;", "Lio/intercom/android/sdk/IntercomContent$Conversation;", "Lio/intercom/android/sdk/IntercomContent$HelpCenterCollections;", "Lio/intercom/android/sdk/IntercomContent$Survey;", "Lio/intercom/android/sdk/IntercomContent$Ticket;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class IntercomContent {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m18302d2 = {"Lio/intercom/android/sdk/IntercomContent$Article;", "Lio/intercom/android/sdk/IntercomContent;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class Article extends IntercomContent {
        public static final int $stable = 0;

        @NotNull
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Article(@NotNull String id) {
            super(null);
            Intrinsics.m18599g(id, "id");
            this.id = id;
        }

        public static /* synthetic */ Article copy$default(Article article, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = article.id;
            }
            return article.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final Article copy(@NotNull String id) {
            Intrinsics.m18599g(id, "id");
            return new Article(id);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Article) && Intrinsics.m18594b(this.id, ((Article) other).id);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @NotNull
        public String toString() {
            return AbstractC0455a.m2241p(new StringBuilder("Article(id="), this.id, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m18302d2 = {"Lio/intercom/android/sdk/IntercomContent$Carousel;", "Lio/intercom/android/sdk/IntercomContent;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class Carousel extends IntercomContent {
        public static final int $stable = 0;

        @NotNull
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Carousel(@NotNull String id) {
            super(null);
            Intrinsics.m18599g(id, "id");
            this.id = id;
        }

        public static /* synthetic */ Carousel copy$default(Carousel carousel, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = carousel.id;
            }
            return carousel.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final Carousel copy(@NotNull String id) {
            Intrinsics.m18599g(id, "id");
            return new Carousel(id);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Carousel) && Intrinsics.m18594b(this.id, ((Carousel) other).id);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @NotNull
        public String toString() {
            return AbstractC0455a.m2241p(new StringBuilder("Carousel(id="), this.id, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m18302d2 = {"Lio/intercom/android/sdk/IntercomContent$Conversation;", "Lio/intercom/android/sdk/IntercomContent;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class Conversation extends IntercomContent {
        public static final int $stable = 0;

        @NotNull
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Conversation(@NotNull String id) {
            super(null);
            Intrinsics.m18599g(id, "id");
            this.id = id;
        }

        public static /* synthetic */ Conversation copy$default(Conversation conversation, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = conversation.id;
            }
            return conversation.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final Conversation copy(@NotNull String id) {
            Intrinsics.m18599g(id, "id");
            return new Conversation(id);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Conversation) && Intrinsics.m18594b(this.id, ((Conversation) other).id);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @NotNull
        public String toString() {
            return AbstractC0455a.m2241p(new StringBuilder("Conversation(id="), this.id, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010\u000f\u001a\u00020\u0010H×\u0001J\t\u0010\u0011\u001a\u00020\u0004H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m18302d2 = {"Lio/intercom/android/sdk/IntercomContent$HelpCenterCollections;", "Lio/intercom/android/sdk/IntercomContent;", "ids", "", "", "<init>", "(Ljava/util/List;)V", "getIds", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class HelpCenterCollections extends IntercomContent {
        public static final int $stable = 8;

        @NotNull
        private final List<String> ids;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HelpCenterCollections(@NotNull List<String> ids) {
            super(null);
            Intrinsics.m18599g(ids, "ids");
            this.ids = ids;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HelpCenterCollections copy$default(HelpCenterCollections helpCenterCollections, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = helpCenterCollections.ids;
            }
            return helpCenterCollections.copy(list);
        }

        @NotNull
        public final List<String> component1() {
            return this.ids;
        }

        @NotNull
        public final HelpCenterCollections copy(@NotNull List<String> ids) {
            Intrinsics.m18599g(ids, "ids");
            return new HelpCenterCollections(ids);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HelpCenterCollections) && Intrinsics.m18594b(this.ids, ((HelpCenterCollections) other).ids);
        }

        @NotNull
        public final List<String> getIds() {
            return this.ids;
        }

        public int hashCode() {
            return this.ids.hashCode();
        }

        @NotNull
        public String toString() {
            return AbstractC0455a.m2242q(new StringBuilder("HelpCenterCollections(ids="), this.ids, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m18302d2 = {"Lio/intercom/android/sdk/IntercomContent$Survey;", "Lio/intercom/android/sdk/IntercomContent;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class Survey extends IntercomContent {
        public static final int $stable = 0;

        @NotNull
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Survey(@NotNull String id) {
            super(null);
            Intrinsics.m18599g(id, "id");
            this.id = id;
        }

        public static /* synthetic */ Survey copy$default(Survey survey, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = survey.id;
            }
            return survey.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final Survey copy(@NotNull String id) {
            Intrinsics.m18599g(id, "id");
            return new Survey(id);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Survey) && Intrinsics.m18594b(this.id, ((Survey) other).id);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @NotNull
        public String toString() {
            return AbstractC0455a.m2241p(new StringBuilder("Survey(id="), this.id, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m18302d2 = {"Lio/intercom/android/sdk/IntercomContent$Ticket;", "Lio/intercom/android/sdk/IntercomContent;", "id", "", "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class Ticket extends IntercomContent {
        public static final int $stable = 0;

        @NotNull
        private final String id;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ticket(@NotNull String id) {
            super(null);
            Intrinsics.m18599g(id, "id");
            this.id = id;
        }

        public static /* synthetic */ Ticket copy$default(Ticket ticket, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ticket.id;
            }
            return ticket.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final Ticket copy(@NotNull String id) {
            Intrinsics.m18599g(id, "id");
            return new Ticket(id);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Ticket) && Intrinsics.m18594b(this.id, ((Ticket) other).id);
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        @NotNull
        public String toString() {
            return AbstractC0455a.m2241p(new StringBuilder("Ticket(id="), this.id, ')');
        }
    }

    public /* synthetic */ IntercomContent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private IntercomContent() {
    }
}
