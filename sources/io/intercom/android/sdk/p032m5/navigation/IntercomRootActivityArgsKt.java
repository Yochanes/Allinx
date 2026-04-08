package io.intercom.android.sdk.p032m5.navigation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.os.BundleCompat;
import io.intercom.android.sdk.p032m5.IntercomRootActivity;
import io.intercom.android.sdk.p032m5.navigation.IntercomRootActivityArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a7\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\f\b\u0002\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0002\u0010\u000f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m18302d2 = {IntercomRootActivityArgsKt.BUNDLE, "", IntercomRootActivityArgsKt.BUNDLE_ARGS, "getArgsForIntent", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs;", "intent", "Landroid/content/Intent;", "getIntentForArgs", "context", "Landroid/content/Context;", "intercomRootActivityArgs", "activityName", "Ljava/lang/Class;", "intentFlags", "", "(Landroid/content/Context;Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs;Ljava/lang/Class;Ljava/lang/Integer;)Landroid/content/Intent;", "intercom-sdk-base_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class IntercomRootActivityArgsKt {

    @NotNull
    private static final String BUNDLE = "BUNDLE";

    @NotNull
    private static final String BUNDLE_ARGS = "BUNDLE_ARGS";

    @NotNull
    public static final IntercomRootActivityArgs getArgsForIntent(@NotNull Intent intent) {
        Intrinsics.m18599g(intent, "intent");
        Bundle bundleExtra = intent.getBundleExtra(BUNDLE);
        if (bundleExtra == null) {
            return IntercomRootActivityArgs.NoContent.INSTANCE;
        }
        IntercomRootActivityArgs intercomRootActivityArgs = (IntercomRootActivityArgs) BundleCompat.m7634a(bundleExtra, BUNDLE_ARGS, IntercomRootActivityArgs.class);
        return intercomRootActivityArgs == null ? IntercomRootActivityArgs.NoContent.INSTANCE : intercomRootActivityArgs;
    }

    @NotNull
    public static final Intent getIntentForArgs(@NotNull Context context, @NotNull IntercomRootActivityArgs intercomRootActivityArgs, @NotNull Class<?> activityName, @Nullable Integer num) {
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(intercomRootActivityArgs, "intercomRootActivityArgs");
        Intrinsics.m18599g(activityName, "activityName");
        Intent intent = new Intent(context, activityName);
        Bundle bundle = new Bundle();
        bundle.putParcelable(BUNDLE_ARGS, intercomRootActivityArgs);
        intent.putExtra(BUNDLE, bundle);
        if (num != null) {
            intent.setFlags(num.intValue());
        }
        return intent;
    }

    public static /* synthetic */ Intent getIntentForArgs$default(Context context, IntercomRootActivityArgs intercomRootActivityArgs, Class cls, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            cls = IntercomRootActivity.class;
        }
        if ((i & 8) != 0) {
            num = 268435456;
        }
        return getIntentForArgs(context, intercomRootActivityArgs, cls, num);
    }
}
