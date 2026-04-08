package io.intercom.android.sdk.tickets.list.p040ui;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import io.intercom.android.sdk.tickets.TicketStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÇ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\u001cH×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001e"}, m18302d2 = {"Lio/intercom/android/sdk/tickets/list/ui/TicketRowData;", "", "id", "", "title", "subTitle", "status", "Lio/intercom/android/sdk/tickets/TicketStatus;", "isRead", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/tickets/TicketStatus;Z)V", "getId", "()Ljava/lang/String;", "getTitle", "getSubTitle", "getStatus", "()Lio/intercom/android/sdk/tickets/TicketStatus;", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class TicketRowData {
    public static final int $stable = 0;

    @NotNull
    private final String id;
    private final boolean isRead;

    @NotNull
    private final TicketStatus status;

    @NotNull
    private final String subTitle;

    @NotNull
    private final String title;

    public TicketRowData(@NotNull String id, @NotNull String title, @NotNull String subTitle, @NotNull TicketStatus status, boolean z2) {
        Intrinsics.m18599g(id, "id");
        Intrinsics.m18599g(title, "title");
        Intrinsics.m18599g(subTitle, "subTitle");
        Intrinsics.m18599g(status, "status");
        this.id = id;
        this.title = title;
        this.subTitle = subTitle;
        this.status = status;
        this.isRead = z2;
    }

    public static /* synthetic */ TicketRowData copy$default(TicketRowData ticketRowData, String str, String str2, String str3, TicketStatus ticketStatus, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ticketRowData.id;
        }
        if ((i & 2) != 0) {
            str2 = ticketRowData.title;
        }
        if ((i & 4) != 0) {
            str3 = ticketRowData.subTitle;
        }
        if ((i & 8) != 0) {
            ticketStatus = ticketRowData.status;
        }
        if ((i & 16) != 0) {
            z2 = ticketRowData.isRead;
        }
        boolean z3 = z2;
        String str4 = str3;
        return ticketRowData.copy(str, str2, str4, ticketStatus, z3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TicketStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsRead() {
        return this.isRead;
    }

    @NotNull
    public final TicketRowData copy(@NotNull String id, @NotNull String title, @NotNull String subTitle, @NotNull TicketStatus status, boolean isRead) {
        Intrinsics.m18599g(id, "id");
        Intrinsics.m18599g(title, "title");
        Intrinsics.m18599g(subTitle, "subTitle");
        Intrinsics.m18599g(status, "status");
        return new TicketRowData(id, title, subTitle, status, isRead);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TicketRowData)) {
            return false;
        }
        TicketRowData ticketRowData = (TicketRowData) other;
        return Intrinsics.m18594b(this.id, ticketRowData.id) && Intrinsics.m18594b(this.title, ticketRowData.title) && Intrinsics.m18594b(this.subTitle, ticketRowData.subTitle) && this.status == ticketRowData.status && this.isRead == ticketRowData.isRead;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final TicketStatus getStatus() {
        return this.status;
    }

    @NotNull
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isRead) + ((this.status.hashCode() + AbstractC0000a.m5b(AbstractC0000a.m5b(this.id.hashCode() * 31, 31, this.title), 31, this.subTitle)) * 31);
    }

    public final boolean isRead() {
        return this.isRead;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("TicketRowData(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subTitle=");
        sb.append(this.subTitle);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", isRead=");
        return AbstractC0455a.m2243r(sb, this.isRead, ')');
    }
}
