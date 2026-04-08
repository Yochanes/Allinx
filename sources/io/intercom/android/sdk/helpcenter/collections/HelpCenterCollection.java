package io.intercom.android.sdk.helpcenter.collections;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0002/0B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J;\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010%\u001a\u00020\u0007H×\u0001J\t\u0010&\u001a\u00020\u0003H×\u0001J%\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0001¢\u0006\u0002\b.R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0019¨\u00061"}, m18302d2 = {"Lio/intercom/android/sdk/helpcenter/collections/HelpCenterCollection;", "", "summary", "", "id", "title", "articlesCount", "", "collectionsCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSummary$annotations", "()V", "getSummary", "()Ljava/lang/String;", "getId$annotations", "getId", "getTitle$annotations", "getTitle", "getArticlesCount$annotations", "getArticlesCount", "()I", "getCollectionsCount$annotations", "getCollectionsCount", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$intercom_sdk_base_release", "$serializer", "Companion", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@Serializable
public final /* data */ class HelpCenterCollection {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int articlesCount;
    private final int collectionsCount;

    @NotNull
    private final String id;

    @NotNull
    private final String summary;

    @NotNull
    private final String title;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, m18302d2 = {"Lio/intercom/android/sdk/helpcenter/collections/HelpCenterCollection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/intercom/android/sdk/helpcenter/collections/HelpCenterCollection;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<HelpCenterCollection> serializer() {
            return HelpCenterCollection$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ HelpCenterCollection(int i, String str, String str2, String str3, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.m21021a(i, 2, HelpCenterCollection$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.summary = "";
        } else {
            this.summary = str;
        }
        this.id = str2;
        if ((i & 4) == 0) {
            this.title = "";
        } else {
            this.title = str3;
        }
        if ((i & 8) == 0) {
            this.articlesCount = 0;
        } else {
            this.articlesCount = i2;
        }
        if ((i & 16) == 0) {
            this.collectionsCount = 0;
        } else {
            this.collectionsCount = i3;
        }
    }

    public static /* synthetic */ HelpCenterCollection copy$default(HelpCenterCollection helpCenterCollection, String str, String str2, String str3, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = helpCenterCollection.summary;
        }
        if ((i3 & 2) != 0) {
            str2 = helpCenterCollection.id;
        }
        if ((i3 & 4) != 0) {
            str3 = helpCenterCollection.title;
        }
        if ((i3 & 8) != 0) {
            i = helpCenterCollection.articlesCount;
        }
        if ((i3 & 16) != 0) {
            i2 = helpCenterCollection.collectionsCount;
        }
        int i4 = i2;
        String str4 = str3;
        return helpCenterCollection.copy(str, str2, str4, i, i4);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(HelpCenterCollection self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.mo11911z(serialDesc, 0) || !Intrinsics.m18594b(self.summary, "")) {
            output.mo20976t(serialDesc, 0, self.summary);
        }
        output.mo20976t(serialDesc, 1, self.id);
        if (output.mo11911z(serialDesc, 2) || !Intrinsics.m18594b(self.title, "")) {
            output.mo20976t(serialDesc, 2, self.title);
        }
        if (output.mo11911z(serialDesc, 3) || self.articlesCount != 0) {
            output.mo20973o(3, self.articlesCount, serialDesc);
        }
        if (!output.mo11911z(serialDesc, 4) && self.collectionsCount == 0) {
            return;
        }
        output.mo20973o(4, self.collectionsCount, serialDesc);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getArticlesCount() {
        return this.articlesCount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCollectionsCount() {
        return this.collectionsCount;
    }

    @NotNull
    public final HelpCenterCollection copy(@NotNull String summary, @NotNull String id, @NotNull String title, int articlesCount, int collectionsCount) {
        Intrinsics.m18599g(summary, "summary");
        Intrinsics.m18599g(id, "id");
        Intrinsics.m18599g(title, "title");
        return new HelpCenterCollection(summary, id, title, articlesCount, collectionsCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HelpCenterCollection)) {
            return false;
        }
        HelpCenterCollection helpCenterCollection = (HelpCenterCollection) other;
        return Intrinsics.m18594b(this.summary, helpCenterCollection.summary) && Intrinsics.m18594b(this.id, helpCenterCollection.id) && Intrinsics.m18594b(this.title, helpCenterCollection.title) && this.articlesCount == helpCenterCollection.articlesCount && this.collectionsCount == helpCenterCollection.collectionsCount;
    }

    public final int getArticlesCount() {
        return this.articlesCount;
    }

    public final int getCollectionsCount() {
        return this.collectionsCount;
    }

    @NotNull
    public final String getId() {
        return this.id;
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
        return Integer.hashCode(this.collectionsCount) + AbstractC0455a.m2228c(this.articlesCount, AbstractC0000a.m5b(AbstractC0000a.m5b(this.summary.hashCode() * 31, 31, this.id), 31, this.title), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("HelpCenterCollection(summary=");
        sb.append(this.summary);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", articlesCount=");
        sb.append(this.articlesCount);
        sb.append(", collectionsCount=");
        return AbstractC0000a.m17n(sb, this.collectionsCount, ')');
    }

    public HelpCenterCollection(@NotNull String summary, @NotNull String id, @NotNull String title, int i, int i2) {
        Intrinsics.m18599g(summary, "summary");
        Intrinsics.m18599g(id, "id");
        Intrinsics.m18599g(title, "title");
        this.summary = summary;
        this.id = id;
        this.title = title;
        this.articlesCount = i;
        this.collectionsCount = i2;
    }

    public /* synthetic */ HelpCenterCollection(String str, String str2, String str3, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2);
    }

    @SerialName
    public static /* synthetic */ void getArticlesCount$annotations() {
    }

    @SerialName
    public static /* synthetic */ void getCollectionsCount$annotations() {
    }

    @SerialName
    public static /* synthetic */ void getId$annotations() {
    }

    @SerialName
    public static /* synthetic */ void getSummary$annotations() {
    }

    @SerialName
    public static /* synthetic */ void getTitle$annotations() {
    }
}
