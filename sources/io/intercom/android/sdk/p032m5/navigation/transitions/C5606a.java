package io.intercom.android.sdk.p032m5.navigation.transitions;

import io.intercom.android.sdk.p032m5.navigation.transitions.EnterTransitionStyle;
import io.intercom.android.sdk.p032m5.navigation.transitions.ExitTransitionStyle;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.navigation.transitions.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5606a implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44352a;

    public /* synthetic */ C5606a(int i) {
        this.f44352a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f44352a;
        int iIntValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                return Integer.valueOf(EnterTransitionStyle.SLIDE_IN_LEFT.m16290a(iIntValue));
            case 1:
                return Integer.valueOf(EnterTransitionStyle.SLIDE_IN_RIGHT.m16291a(iIntValue));
            case 2:
                return Integer.valueOf(EnterTransitionStyle.SLIDE_UP.m16292a(iIntValue));
            case 3:
                return Integer.valueOf(ExitTransitionStyle.SLIDE_DOWN.m16293a(iIntValue));
            case 4:
                return Integer.valueOf(ExitTransitionStyle.SLIDE_OUT_LEFT.m16294a(iIntValue));
            default:
                return Integer.valueOf(ExitTransitionStyle.SLIDE_OUT_RIGHT.m16295a(iIntValue));
        }
    }
}
