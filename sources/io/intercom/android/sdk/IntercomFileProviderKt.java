package io.intercom.android.sdk;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m18302d2 = {"fileProviderAuthority", "", "Landroid/content/Context;", "intercom-sdk-base_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class IntercomFileProviderKt {
    @NotNull
    public static final String fileProviderAuthority(@NotNull Context context) {
        Intrinsics.m18599g(context, "<this>");
        return context.getPackageName() + ".IntercomFileProvider";
    }
}
