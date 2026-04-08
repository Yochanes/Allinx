package com.exchange.allin.p024ui.dialog.common;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
final class MenuKt$showMenuBottomSheetDialog$1$1$1$1$1$1$1 implements Function0<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function1 f36240a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f36241b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BottomSheetDialog f36242c;

    public MenuKt$showMenuBottomSheetDialog$1$1$1$1$1$1$1(Function1 function1, String str, BottomSheetDialog bottomSheetDialog) {
        this.f36240a = function1;
        this.f36241b = str;
        this.f36242c = bottomSheetDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f36240a.invoke(this.f36241b);
        this.f36242c.dismiss();
        return Unit.f51459a;
    }
}
