package io.intercom.android.sdk.p032m5.conversation.p033ui.components;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.geometry.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\rJ.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u00020\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/MessageListCoordinates;", "", "boundsInParent", "Landroidx/compose/ui/geometry/Rect;", "boundsInWindow", "size", "Landroidx/compose/ui/geometry/Size;", "<init>", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBoundsInParent", "()Landroidx/compose/ui/geometry/Rect;", "getBoundsInWindow", "getSize-NH-jbRc", "()J", "J", "isZero", "", "component1", "component2", "component3", "component3-NH-jbRc", "copy", "copy-cSwnlzA", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;J)Lio/intercom/android/sdk/m5/conversation/ui/components/MessageListCoordinates;", "equals", "other", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final /* data */ class MessageListCoordinates {

    @NotNull
    private final Rect boundsInParent;

    @NotNull
    private final Rect boundsInWindow;
    private final long size;

    public /* synthetic */ MessageListCoordinates(Rect rect, Rect rect2, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(rect, rect2, j);
    }

    /* JADX INFO: renamed from: copy-cSwnlzA$default, reason: not valid java name */
    public static /* synthetic */ MessageListCoordinates m22225copycSwnlzA$default(MessageListCoordinates messageListCoordinates, Rect rect, Rect rect2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            rect = messageListCoordinates.boundsInParent;
        }
        if ((i & 2) != 0) {
            rect2 = messageListCoordinates.boundsInWindow;
        }
        if ((i & 4) != 0) {
            j = messageListCoordinates.size;
        }
        return messageListCoordinates.m22227copycSwnlzA(rect, rect2, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Rect getBoundsInParent() {
        return this.boundsInParent;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Rect getBoundsInWindow() {
        return this.boundsInWindow;
    }

    /* JADX INFO: renamed from: component3-NH-jbRc, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-cSwnlzA, reason: not valid java name */
    public final MessageListCoordinates m22227copycSwnlzA(@NotNull Rect boundsInParent, @NotNull Rect boundsInWindow, long size) {
        Intrinsics.m18599g(boundsInParent, "boundsInParent");
        Intrinsics.m18599g(boundsInWindow, "boundsInWindow");
        return new MessageListCoordinates(boundsInParent, boundsInWindow, size, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageListCoordinates)) {
            return false;
        }
        MessageListCoordinates messageListCoordinates = (MessageListCoordinates) other;
        return Intrinsics.m18594b(this.boundsInParent, messageListCoordinates.boundsInParent) && Intrinsics.m18594b(this.boundsInWindow, messageListCoordinates.boundsInWindow) && Size.m5080a(this.size, messageListCoordinates.size);
    }

    @NotNull
    public final Rect getBoundsInParent() {
        return this.boundsInParent;
    }

    @NotNull
    public final Rect getBoundsInWindow() {
        return this.boundsInWindow;
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m22228getSizeNHjbRc() {
        return this.size;
    }

    public int hashCode() {
        return Long.hashCode(this.size) + ((this.boundsInWindow.hashCode() + (this.boundsInParent.hashCode() * 31)) * 31);
    }

    public final boolean isZero() {
        return Intrinsics.m18594b(this.boundsInParent, Rect.f17525e) && Size.m5080a(this.size, 0L);
    }

    @NotNull
    public String toString() {
        return "MessageListCoordinates(boundsInParent=" + this.boundsInParent + ", boundsInWindow=" + this.boundsInWindow + ", size=" + ((Object) Size.m5085f(this.size)) + ')';
    }

    private MessageListCoordinates(Rect boundsInParent, Rect boundsInWindow, long j) {
        Intrinsics.m18599g(boundsInParent, "boundsInParent");
        Intrinsics.m18599g(boundsInWindow, "boundsInWindow");
        this.boundsInParent = boundsInParent;
        this.boundsInWindow = boundsInWindow;
        this.size = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MessageListCoordinates(Rect rect, Rect rect2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = i & 1;
        Rect rect3 = Rect.f17525e;
        this(i2 != 0 ? rect3 : rect, (i & 2) != 0 ? rect3 : rect2, (i & 4) != 0 ? 0L : j, null);
    }
}
