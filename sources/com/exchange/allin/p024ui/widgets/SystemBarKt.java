package com.exchange.allin.p024ui.widgets;

import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.exchange.allin.p024ui.helper.ConfigHelper;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiControllerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/helper/ConfigHelper$ViewState;", "configState", "app_localRelease"}, m18303k = 2, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SystemBarKt {
    /* JADX INFO: renamed from: a */
    public static final void m14151a(boolean z2, long j, Composer composer, int i) {
        int i2;
        boolean z3;
        ComposerImpl composerImplMo4239q = composer.mo4239q(-97088746);
        if ((i & 6) == 0) {
            i2 = (composerImplMo4239q.mo4226d(z2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && composerImplMo4239q.mo4242t()) {
            composerImplMo4239q.mo4246x();
            z3 = z2;
        } else {
            long j2 = Color.f17582j;
            SystemUiController systemUiControllerRememberSystemUiController = SystemUiControllerKt.rememberSystemUiController(null, composerImplMo4239q, 0, 1);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerImplMo4239q.mo4247y(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            MutableState mutableStateM9184a = FlowExtKt.m9184a(ConfigHelper.f36904c, composerImplMo4239q);
            Boolean boolValueOf = Boolean.valueOf(z2);
            composerImplMo4239q.mo4221N(2012723766);
            boolean zMo4220M = composerImplMo4239q.mo4220M(systemUiControllerRememberSystemUiController) | ((i3 & 14) == 4) | composerImplMo4239q.mo4220M(mutableStateM9184a) | composerImplMo4239q.mo4235m(lifecycleOwner);
            Object objMo4229g = composerImplMo4239q.mo4229g();
            if (zMo4220M || objMo4229g == Composer.Companion.f16228a) {
                z3 = z2;
                C3552v c3552v = new C3552v(lifecycleOwner, systemUiControllerRememberSystemUiController, j2, z3, mutableStateM9184a);
                composerImplMo4239q.mo4214G(c3552v);
                objMo4229g = c3552v;
            } else {
                z3 = z2;
            }
            composerImplMo4239q.m4265W(false);
            EffectsKt.m4368a(boolValueOf, systemUiControllerRememberSystemUiController, lifecycleOwner, (Function1) objMo4229g, composerImplMo4239q);
            j = j2;
        }
        RecomposeScopeImpl recomposeScopeImplM4267Y = composerImplMo4239q.m4267Y();
        if (recomposeScopeImplM4267Y != null) {
            recomposeScopeImplM4267Y.f16451d = new C3553w(i, j, z3);
        }
    }
}
