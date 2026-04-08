package io.intercom.android.sdk.p032m5.conversation.p033ui.components.row;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ0\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u00020\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/ui/components/row/TypingIndicatorStyle;", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "borderStroke", "Landroidx/compose/foundation/BorderStroke;", "color", "Landroidx/compose/ui/graphics/Color;", "<init>", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "getBorderStroke", "()Landroidx/compose/foundation/BorderStroke;", "getColor-0d7_KjU", "()J", "J", "component1", "component2", "component3", "component3-0d7_KjU", "copy", "copy-mxwnekA", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;J)Lio/intercom/android/sdk/m5/conversation/ui/components/row/TypingIndicatorStyle;", "equals", "", "other", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final /* data */ class TypingIndicatorStyle {

    @Nullable
    private final BorderStroke borderStroke;
    private final long color;

    @NotNull
    private final Shape shape;

    public /* synthetic */ TypingIndicatorStyle(Shape shape, BorderStroke borderStroke, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(shape, borderStroke, j);
    }

    /* JADX INFO: renamed from: copy-mxwnekA$default, reason: not valid java name */
    public static /* synthetic */ TypingIndicatorStyle m22299copymxwnekA$default(TypingIndicatorStyle typingIndicatorStyle, Shape shape, BorderStroke borderStroke, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            shape = typingIndicatorStyle.shape;
        }
        if ((i & 2) != 0) {
            borderStroke = typingIndicatorStyle.borderStroke;
        }
        if ((i & 4) != 0) {
            j = typingIndicatorStyle.color;
        }
        return typingIndicatorStyle.m22301copymxwnekA(shape, borderStroke, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Shape getShape() {
        return this.shape;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BorderStroke getBorderStroke() {
        return this.borderStroke;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-mxwnekA, reason: not valid java name */
    public final TypingIndicatorStyle m22301copymxwnekA(@NotNull Shape shape, @Nullable BorderStroke borderStroke, long color) {
        Intrinsics.m18599g(shape, "shape");
        return new TypingIndicatorStyle(shape, borderStroke, color, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypingIndicatorStyle)) {
            return false;
        }
        TypingIndicatorStyle typingIndicatorStyle = (TypingIndicatorStyle) other;
        return Intrinsics.m18594b(this.shape, typingIndicatorStyle.shape) && Intrinsics.m18594b(this.borderStroke, typingIndicatorStyle.borderStroke) && Color.m5181c(this.color, typingIndicatorStyle.color);
    }

    @Nullable
    public final BorderStroke getBorderStroke() {
        return this.borderStroke;
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m22302getColor0d7_KjU() {
        return this.color;
    }

    @NotNull
    public final Shape getShape() {
        return this.shape;
    }

    public int hashCode() {
        int iHashCode = this.shape.hashCode() * 31;
        BorderStroke borderStroke = this.borderStroke;
        int iHashCode2 = (iHashCode + (borderStroke == null ? 0 : borderStroke.hashCode())) * 31;
        long j = this.color;
        int i = Color.f17584l;
        return Long.hashCode(j) + iHashCode2;
    }

    @NotNull
    public String toString() {
        return "TypingIndicatorStyle(shape=" + this.shape + ", borderStroke=" + this.borderStroke + ", color=" + ((Object) Color.m5187i(this.color)) + ')';
    }

    private TypingIndicatorStyle(Shape shape, BorderStroke borderStroke, long j) {
        Intrinsics.m18599g(shape, "shape");
        this.shape = shape;
        this.borderStroke = borderStroke;
        this.color = j;
    }
}
