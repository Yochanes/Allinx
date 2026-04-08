package com.exchange.allin.p024ui.dialog.guess;

import android.text.TextUtils;
import androidx.compose.runtime.MutableState;
import com.exchange.allin.utils.ext.StringExtKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.exchange.allin.ui.dialog.guess.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2627a implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36289a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MutableState f36290b;

    public /* synthetic */ C2627a(MutableState mutableState, int i) {
        this.f36289a = i;
        this.f36290b = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        switch (this.f36289a) {
            case 0:
                Intrinsics.m18599g(it, "it");
                if (StringExtKt.m14221j(it, false) || it.length() == 0) {
                    this.f36290b.setValue(it);
                }
                break;
            case 1:
                Intrinsics.m18599g(it, "it");
                if (StringExtKt.m14221j(it, false) || it.length() == 0) {
                    this.f36290b.setValue(it);
                }
                break;
            default:
                Intrinsics.m18599g(it, "it");
                if (TextUtils.isDigitsOnly(it) || it.length() == 0) {
                    this.f36290b.setValue(it);
                }
                break;
        }
        return Unit.f51459a;
    }
}
