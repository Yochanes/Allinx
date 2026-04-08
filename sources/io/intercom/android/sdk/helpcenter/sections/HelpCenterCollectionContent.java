package io.intercom.android.sdk.helpcenter.sections;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection$$serializer;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002ABBk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007¢\u0006\u0004\b\u0011\u0010\u0012B\u0081\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0016J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\f0\u0007HÆ\u0003J\t\u00101\u001a\u00020\u000eHÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007HÆ\u0003Jq\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007HÇ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u00107\u001a\u00020\u000eH×\u0001J\t\u00108\u001a\u00020\u0003H×\u0001J%\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0001¢\u0006\u0002\b@R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010!R\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010!R\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010!R\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010(R\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u0018\u001a\u0004\b*\u0010!¨\u0006C"}, m18302d2 = {"Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;", "", "collectionId", "", "title", "summary", "helpCenterArticles", "", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterArticle;", "helpCenterSections", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterSection;", "subCollections", "Lio/intercom/android/sdk/helpcenter/collections/HelpCenterCollection;", "articlesCount", "", "authors", "Lio/intercom/android/sdk/helpcenter/sections/Author;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/util/List;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCollectionId$annotations", "()V", "getCollectionId", "()Ljava/lang/String;", "getTitle$annotations", "getTitle", "getSummary$annotations", "getSummary", "getHelpCenterArticles$annotations", "getHelpCenterArticles", "()Ljava/util/List;", "getHelpCenterSections$annotations", "getHelpCenterSections", "getSubCollections$annotations", "getSubCollections", "getArticlesCount$annotations", "getArticlesCount", "()I", "getAuthors$annotations", "getAuthors", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$intercom_sdk_base_release", "$serializer", "Companion", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@Serializable
public final /* data */ class HelpCenterCollectionContent {
    private final int articlesCount;

    @NotNull
    private final List<Author> authors;

    @NotNull
    private final String collectionId;

    @NotNull
    private final List<HelpCenterArticle> helpCenterArticles;

    @NotNull
    private final List<HelpCenterSection> helpCenterSections;

    @NotNull
    private final List<HelpCenterCollection> subCollections;

    @NotNull
    private final String summary;

    @NotNull
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(HelpCenterArticle$$serializer.INSTANCE), new ArrayListSerializer(HelpCenterSection$$serializer.INSTANCE), new ArrayListSerializer(HelpCenterCollection$$serializer.INSTANCE), null, new ArrayListSerializer(Author$$serializer.INSTANCE)};

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, m18302d2 = {"Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<HelpCenterCollectionContent> serializer() {
            return HelpCenterCollectionContent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ HelpCenterCollectionContent(int i, String str, String str2, String str3, List list, List list2, List list3, int i2, List list4, SerializationConstructorMarker serializationConstructorMarker) {
        if (65 != (i & 65)) {
            PluginExceptionsKt.m21021a(i, 65, HelpCenterCollectionContent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.collectionId = str;
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.summary = "";
        } else {
            this.summary = str3;
        }
        int i3 = i & 8;
        EmptyList emptyList = EmptyList.f51496a;
        if (i3 == 0) {
            this.helpCenterArticles = emptyList;
        } else {
            this.helpCenterArticles = list;
        }
        if ((i & 16) == 0) {
            this.helpCenterSections = emptyList;
        } else {
            this.helpCenterSections = list2;
        }
        if ((i & 32) == 0) {
            this.subCollections = emptyList;
        } else {
            this.subCollections = list3;
        }
        this.articlesCount = i2;
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
            this.authors = emptyList;
        } else {
            this.authors = list4;
        }
    }

    public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HelpCenterCollectionContent copy$default(HelpCenterCollectionContent helpCenterCollectionContent, String str, String str2, String str3, List list, List list2, List list3, int i, List list4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = helpCenterCollectionContent.collectionId;
        }
        if ((i2 & 2) != 0) {
            str2 = helpCenterCollectionContent.title;
        }
        if ((i2 & 4) != 0) {
            str3 = helpCenterCollectionContent.summary;
        }
        if ((i2 & 8) != 0) {
            list = helpCenterCollectionContent.helpCenterArticles;
        }
        if ((i2 & 16) != 0) {
            list2 = helpCenterCollectionContent.helpCenterSections;
        }
        if ((i2 & 32) != 0) {
            list3 = helpCenterCollectionContent.subCollections;
        }
        if ((i2 & 64) != 0) {
            i = helpCenterCollectionContent.articlesCount;
        }
        if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            list4 = helpCenterCollectionContent.authors;
        }
        int i3 = i;
        List list5 = list4;
        List list6 = list2;
        List list7 = list3;
        return helpCenterCollectionContent.copy(str, str2, str3, list, list6, list7, i3, list5);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(HelpCenterCollectionContent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.mo20976t(serialDesc, 0, self.collectionId);
        if (output.mo11911z(serialDesc, 1) || !Intrinsics.m18594b(self.title, "")) {
            output.mo20976t(serialDesc, 1, self.title);
        }
        if (output.mo11911z(serialDesc, 2) || !Intrinsics.m18594b(self.summary, "")) {
            output.mo20976t(serialDesc, 2, self.summary);
        }
        boolean zMo11911z = output.mo11911z(serialDesc, 3);
        EmptyList emptyList = EmptyList.f51496a;
        if (zMo11911z || !Intrinsics.m18594b(self.helpCenterArticles, emptyList)) {
            output.mo20966C(serialDesc, 3, kSerializerArr[3], self.helpCenterArticles);
        }
        if (output.mo11911z(serialDesc, 4) || !Intrinsics.m18594b(self.helpCenterSections, emptyList)) {
            output.mo20966C(serialDesc, 4, kSerializerArr[4], self.helpCenterSections);
        }
        if (output.mo11911z(serialDesc, 5) || !Intrinsics.m18594b(self.subCollections, emptyList)) {
            output.mo20966C(serialDesc, 5, kSerializerArr[5], self.subCollections);
        }
        output.mo20973o(6, self.articlesCount, serialDesc);
        if (!output.mo11911z(serialDesc, 7) && Intrinsics.m18594b(self.authors, emptyList)) {
            return;
        }
        output.mo20966C(serialDesc, 7, kSerializerArr[7], self.authors);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCollectionId() {
        return this.collectionId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    @NotNull
    public final List<HelpCenterArticle> component4() {
        return this.helpCenterArticles;
    }

    @NotNull
    public final List<HelpCenterSection> component5() {
        return this.helpCenterSections;
    }

    @NotNull
    public final List<HelpCenterCollection> component6() {
        return this.subCollections;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getArticlesCount() {
        return this.articlesCount;
    }

    @NotNull
    public final List<Author> component8() {
        return this.authors;
    }

    @NotNull
    public final HelpCenterCollectionContent copy(@NotNull String collectionId, @NotNull String title, @NotNull String summary, @NotNull List<HelpCenterArticle> helpCenterArticles, @NotNull List<HelpCenterSection> helpCenterSections, @NotNull List<HelpCenterCollection> subCollections, int articlesCount, @NotNull List<Author> authors) {
        Intrinsics.m18599g(collectionId, "collectionId");
        Intrinsics.m18599g(title, "title");
        Intrinsics.m18599g(summary, "summary");
        Intrinsics.m18599g(helpCenterArticles, "helpCenterArticles");
        Intrinsics.m18599g(helpCenterSections, "helpCenterSections");
        Intrinsics.m18599g(subCollections, "subCollections");
        Intrinsics.m18599g(authors, "authors");
        return new HelpCenterCollectionContent(collectionId, title, summary, helpCenterArticles, helpCenterSections, subCollections, articlesCount, authors);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HelpCenterCollectionContent)) {
            return false;
        }
        HelpCenterCollectionContent helpCenterCollectionContent = (HelpCenterCollectionContent) other;
        return Intrinsics.m18594b(this.collectionId, helpCenterCollectionContent.collectionId) && Intrinsics.m18594b(this.title, helpCenterCollectionContent.title) && Intrinsics.m18594b(this.summary, helpCenterCollectionContent.summary) && Intrinsics.m18594b(this.helpCenterArticles, helpCenterCollectionContent.helpCenterArticles) && Intrinsics.m18594b(this.helpCenterSections, helpCenterCollectionContent.helpCenterSections) && Intrinsics.m18594b(this.subCollections, helpCenterCollectionContent.subCollections) && this.articlesCount == helpCenterCollectionContent.articlesCount && Intrinsics.m18594b(this.authors, helpCenterCollectionContent.authors);
    }

    public final int getArticlesCount() {
        return this.articlesCount;
    }

    @NotNull
    public final List<Author> getAuthors() {
        return this.authors;
    }

    @NotNull
    public final String getCollectionId() {
        return this.collectionId;
    }

    @NotNull
    public final List<HelpCenterArticle> getHelpCenterArticles() {
        return this.helpCenterArticles;
    }

    @NotNull
    public final List<HelpCenterSection> getHelpCenterSections() {
        return this.helpCenterSections;
    }

    @NotNull
    public final List<HelpCenterCollection> getSubCollections() {
        return this.subCollections;
    }

    @NotNull
    public final String getSummary() {
        return this.summary;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.authors.hashCode() + AbstractC0455a.m2228c(this.articlesCount, AbstractC0455a.m2233h(this.subCollections, AbstractC0455a.m2233h(this.helpCenterSections, AbstractC0455a.m2233h(this.helpCenterArticles, AbstractC0000a.m5b(AbstractC0000a.m5b(this.collectionId.hashCode() * 31, 31, this.title), 31, this.summary), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("HelpCenterCollectionContent(collectionId=");
        sb.append(this.collectionId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", summary=");
        sb.append(this.summary);
        sb.append(", helpCenterArticles=");
        sb.append(this.helpCenterArticles);
        sb.append(", helpCenterSections=");
        sb.append(this.helpCenterSections);
        sb.append(", subCollections=");
        sb.append(this.subCollections);
        sb.append(", articlesCount=");
        sb.append(this.articlesCount);
        sb.append(", authors=");
        return AbstractC0455a.m2242q(sb, this.authors, ')');
    }

    public HelpCenterCollectionContent(@NotNull String collectionId, @NotNull String title, @NotNull String summary, @NotNull List<HelpCenterArticle> helpCenterArticles, @NotNull List<HelpCenterSection> helpCenterSections, @NotNull List<HelpCenterCollection> subCollections, int i, @NotNull List<Author> authors) {
        Intrinsics.m18599g(collectionId, "collectionId");
        Intrinsics.m18599g(title, "title");
        Intrinsics.m18599g(summary, "summary");
        Intrinsics.m18599g(helpCenterArticles, "helpCenterArticles");
        Intrinsics.m18599g(helpCenterSections, "helpCenterSections");
        Intrinsics.m18599g(subCollections, "subCollections");
        Intrinsics.m18599g(authors, "authors");
        this.collectionId = collectionId;
        this.title = title;
        this.summary = summary;
        this.helpCenterArticles = helpCenterArticles;
        this.helpCenterSections = helpCenterSections;
        this.subCollections = subCollections;
        this.articlesCount = i;
        this.authors = authors;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HelpCenterCollectionContent(String str, String str2, String str3, List list, List list2, List list3, int i, List list4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        str2 = (i2 & 2) != 0 ? "" : str2;
        str3 = (i2 & 4) != 0 ? "" : str3;
        int i3 = i2 & 8;
        EmptyList emptyList = EmptyList.f51496a;
        this(str, str2, str3, i3 != 0 ? emptyList : list, (i2 & 16) != 0 ? emptyList : list2, (i2 & 32) != 0 ? emptyList : list3, i, (i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? emptyList : list4);
    }

    @SerialName
    public static /* synthetic */ void getArticlesCount$annotations() {
    }

    @SerialName
    public static /* synthetic */ void getAuthors$annotations() {
    }

    @SerialName
    public static /* synthetic */ void getCollectionId$annotations() {
    }

    @SerialName
    public static /* synthetic */ void getHelpCenterArticles$annotations() {
    }

    @Deprecated
    @SerialName
    public static /* synthetic */ void getHelpCenterSections$annotations() {
    }

    @SerialName
    public static /* synthetic */ void getSubCollections$annotations() {
    }

    @SerialName
    public static /* synthetic */ void getSummary$annotations() {
    }

    @SerialName
    public static /* synthetic */ void getTitle$annotations() {
    }
}
