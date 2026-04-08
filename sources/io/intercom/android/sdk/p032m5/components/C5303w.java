package io.intercom.android.sdk.p032m5.components;

import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.components.w */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5303w implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f43775a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f43776b;

    public /* synthetic */ C5303w(String str, String str2) {
        this.f43775a = str;
        this.f43776b = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return TextWithSeparatorKt.m15636e(this.f43775a, this.f43776b, (SemanticsPropertyReceiver) obj);
    }
}
