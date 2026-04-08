package androidx.navigation.internal;

import androidx.navigation.NavDeepLink;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.navigation.internal.h */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2038h implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30514a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ NavDeepLink f30515b;

    public /* synthetic */ C2038h(NavDeepLink navDeepLink, int i) {
        this.f30514a = i;
        this.f30515b = navDeepLink;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String key = (String) obj;
        switch (this.f30514a) {
            case 0:
                Intrinsics.m18599g(key, "key");
                break;
            default:
                Intrinsics.m18599g(key, "key");
                break;
        }
        return Boolean.valueOf(!this.f30515b.m11220c().contains(key));
    }
}
