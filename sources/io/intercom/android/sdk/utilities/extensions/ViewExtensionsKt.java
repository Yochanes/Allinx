package io.intercom.android.sdk.utilities.extensions;

import android.view.View;
import io.intercom.android.sdk.annotations.SeenState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0004"}, m18302d2 = {SeenState.HIDE, "", "Landroid/view/View;", "show", "intercom-sdk-base_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ViewExtensionsKt {
    public static final void hide(@NotNull View view) {
        Intrinsics.m18599g(view, "<this>");
        view.setVisibility(8);
    }

    public static final void show(@NotNull View view) {
        Intrinsics.m18599g(view, "<this>");
        view.setVisibility(0);
    }
}
