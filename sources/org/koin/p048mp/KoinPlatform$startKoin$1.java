package org.koin.p048mp;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.KoinApplication;
import org.koin.core.logger.PrintLogger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Lorg/koin/core/KoinApplication;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class KoinPlatform$startKoin$1 extends Lambda implements Function1<KoinApplication, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KoinApplication startKoin = (KoinApplication) obj;
        Intrinsics.m18599g(startKoin, "$this$startKoin");
        Intrinsics.m18599g(null, FirebaseAnalytics.Param.LEVEL);
        Intrinsics.m18599g(null, FirebaseAnalytics.Param.LEVEL);
        new PrintLogger(null);
        throw null;
    }
}
