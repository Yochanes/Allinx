package io.intercom.android.sdk.p032m5.navigation;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import io.intercom.android.sdk.p032m5.navigation.IntercomRootActivityArgs;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ&\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\u0011\u001a\u00020\fJ\u001e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f¨\u0006\u0015"}, m18302d2 = {"Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityLauncher;", "", "<init>", "()V", "startHome", "", "context", "Landroid/content/Context;", "startMessages", "startTickets", "startTicketDetails", "ticketId", "", "from", "startHelpCenterCollections", "collectionIds", "", "metricPlace", "startHelpCenterCollection", "collectionId", "place", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class IntercomRootActivityLauncher {
    public static final int $stable = 0;

    @NotNull
    public static final IntercomRootActivityLauncher INSTANCE = new IntercomRootActivityLauncher();

    private IntercomRootActivityLauncher() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startHelpCenterCollections$default(IntercomRootActivityLauncher intercomRootActivityLauncher, Context context, List list, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            list = EmptyList.f51496a;
        }
        intercomRootActivityLauncher.startHelpCenterCollections(context, list, str);
    }

    public final void startHelpCenterCollection(@NotNull Context context, @NotNull String collectionId, @NotNull String place) {
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(collectionId, "collectionId");
        Intrinsics.m18599g(place, "place");
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.HelpCenterCollectionArgs(collectionId, place), null, null, 12, null));
    }

    public final void startHelpCenterCollections(@NotNull Context context, @NotNull List<String> collectionIds, @NotNull String metricPlace) {
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(collectionIds, "collectionIds");
        Intrinsics.m18599g(metricPlace, "metricPlace");
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.HelpCenterCollectionsArgs(collectionIds, metricPlace), null, null, 12, null));
    }

    public final void startHome(@NotNull Context context) {
        Intrinsics.m18599g(context, "context");
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, IntercomRootActivityArgs.HomeScreenArgs.INSTANCE, null, null, 12, null));
    }

    public final void startMessages(@NotNull Context context) {
        Intrinsics.m18599g(context, "context");
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, IntercomRootActivityArgs.MessagesScreenArgs.INSTANCE, null, null, 12, null));
    }

    public final void startTicketDetails(@NotNull Context context, @NotNull String ticketId, @NotNull String from) {
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(ticketId, "ticketId");
        Intrinsics.m18599g(from, "from");
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.TicketDetailsScreenArgs(ticketId, from), null, null, 12, null));
    }

    public final void startTickets(@NotNull Context context) {
        Intrinsics.m18599g(context, "context");
        context.startActivity(IntercomRootActivityArgsKt.getIntentForArgs$default(context, IntercomRootActivityArgs.TicketsScreenArgs.INSTANCE, null, null, 12, null));
    }
}
