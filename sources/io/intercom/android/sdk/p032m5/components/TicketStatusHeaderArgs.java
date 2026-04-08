package io.intercom.android.sdk.p032m5.components;

import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m18302d2 = {"Lio/intercom/android/sdk/m5/components/TicketStatusHeaderArgs;", "", "title", "", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;)V", "getTitle", "()Ljava/lang/String;", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class TicketStatusHeaderArgs {
    public static final int $stable = 0;

    @NotNull
    private final FontWeight fontWeight;

    @NotNull
    private final String title;

    public TicketStatusHeaderArgs(@NotNull String title, @NotNull FontWeight fontWeight) {
        Intrinsics.m18599g(title, "title");
        Intrinsics.m18599g(fontWeight, "fontWeight");
        this.title = title;
        this.fontWeight = fontWeight;
    }

    public static /* synthetic */ TicketStatusHeaderArgs copy$default(TicketStatusHeaderArgs ticketStatusHeaderArgs, String str, FontWeight fontWeight, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ticketStatusHeaderArgs.title;
        }
        if ((i & 2) != 0) {
            fontWeight = ticketStatusHeaderArgs.fontWeight;
        }
        return ticketStatusHeaderArgs.copy(str, fontWeight);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    @NotNull
    public final TicketStatusHeaderArgs copy(@NotNull String title, @NotNull FontWeight fontWeight) {
        Intrinsics.m18599g(title, "title");
        Intrinsics.m18599g(fontWeight, "fontWeight");
        return new TicketStatusHeaderArgs(title, fontWeight);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TicketStatusHeaderArgs)) {
            return false;
        }
        TicketStatusHeaderArgs ticketStatusHeaderArgs = (TicketStatusHeaderArgs) other;
        return Intrinsics.m18594b(this.title, ticketStatusHeaderArgs.title) && Intrinsics.m18594b(this.fontWeight, ticketStatusHeaderArgs.fontWeight);
    }

    @NotNull
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.fontWeight.f20303a;
    }

    @NotNull
    public String toString() {
        return "TicketStatusHeaderArgs(title=" + this.title + ", fontWeight=" + this.fontWeight + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TicketStatusHeaderArgs(String str, FontWeight fontWeight, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            FontWeight fontWeight2 = FontWeight.f20293b;
            fontWeight = FontWeight.f20298i;
        }
        this(str, fontWeight);
    }
}
