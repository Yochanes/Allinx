package io.intercom.android.sdk.p032m5.conversation.states;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import io.intercom.android.sdk.p032m5.components.avatar.AvatarWrapper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/FooterNoticeState;", "", "title", "", "subtitle", "avatars", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getAvatars", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class FooterNoticeState {
    public static final int $stable = 8;

    @NotNull
    private final List<AvatarWrapper> avatars;

    @NotNull
    private final String subtitle;

    @NotNull
    private final String title;

    public FooterNoticeState(@NotNull String title, @NotNull String subtitle, @NotNull List<AvatarWrapper> avatars) {
        Intrinsics.m18599g(title, "title");
        Intrinsics.m18599g(subtitle, "subtitle");
        Intrinsics.m18599g(avatars, "avatars");
        this.title = title;
        this.subtitle = subtitle;
        this.avatars = avatars;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FooterNoticeState copy$default(FooterNoticeState footerNoticeState, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = footerNoticeState.title;
        }
        if ((i & 2) != 0) {
            str2 = footerNoticeState.subtitle;
        }
        if ((i & 4) != 0) {
            list = footerNoticeState.avatars;
        }
        return footerNoticeState.copy(str, str2, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final List<AvatarWrapper> component3() {
        return this.avatars;
    }

    @NotNull
    public final FooterNoticeState copy(@NotNull String title, @NotNull String subtitle, @NotNull List<AvatarWrapper> avatars) {
        Intrinsics.m18599g(title, "title");
        Intrinsics.m18599g(subtitle, "subtitle");
        Intrinsics.m18599g(avatars, "avatars");
        return new FooterNoticeState(title, subtitle, avatars);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FooterNoticeState)) {
            return false;
        }
        FooterNoticeState footerNoticeState = (FooterNoticeState) other;
        return Intrinsics.m18594b(this.title, footerNoticeState.title) && Intrinsics.m18594b(this.subtitle, footerNoticeState.subtitle) && Intrinsics.m18594b(this.avatars, footerNoticeState.avatars);
    }

    @NotNull
    public final List<AvatarWrapper> getAvatars() {
        return this.avatars;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.avatars.hashCode() + AbstractC0000a.m5b(this.title.hashCode() * 31, 31, this.subtitle);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FooterNoticeState(title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", avatars=");
        return AbstractC0455a.m2242q(sb, this.avatars, ')');
    }
}
