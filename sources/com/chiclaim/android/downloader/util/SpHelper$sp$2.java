package com.chiclaim.android.downloader.util;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "invoke"}, m18303k = 3, m18304mv = {1, 6, 0}, m18306xi = 48)
final class SpHelper$sp$2 extends Lambda implements Function0<SharedPreferences> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f35112a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpHelper$sp$2(Context context) {
        super(0);
        this.f35112a = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f35112a.getApplicationContext().getSharedPreferences("dfire_download_sp", 0);
    }
}
