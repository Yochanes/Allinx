package com.exchange.allin.p024ui.dialog.assets;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.exchange.allin.ui.dialog.assets.AssetsPayNetworkKt$showAssetsPayNetworkBottomSheetDialog$1$1$2$1$1$1$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
final class C2590x7967e3c0 implements Function0<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function1 f36166a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f36167b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BottomSheetDialog f36168c;

    public C2590x7967e3c0(Function1 function1, int i, BottomSheetDialog bottomSheetDialog) {
        this.f36166a = function1;
        this.f36167b = i;
        this.f36168c = bottomSheetDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f36166a.invoke(Integer.valueOf(this.f36167b));
        this.f36168c.dismiss();
        return Unit.f51459a;
    }
}
