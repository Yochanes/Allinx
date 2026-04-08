package com.exchange.allin.p024ui.dialog.common;

import android.content.Context;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.exchange.allin.p024ui.dialog.IBottomSheetDialog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p002B.C0001a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"app_localRelease"}, m18303k = 2, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class TipsKt {
    /* JADX INFO: renamed from: a */
    public static final void m13554a(Context context, String str, String str2, Function0 function0) {
        Intrinsics.m18599g(context, "context");
        new IBottomSheetDialog(context, null, new ComposableLambdaImpl(1096836410, new TipsKt$showTipsBottomSheetDialog$2(str, str2, function0), true), 14).show();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m13555b(Context context, String str, String str2) {
        m13554a(context, str, str2, new C0001a(2));
    }
}
