package org.jetbrains.anko;

import android.content.DialogInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Landroid/content/DialogInterface;", "invoke"}, m18303k = 3, m18304mv = {1, 1, 13})
final class AlertDialogBuilder$negativeButton$2 extends Lambda implements Function1<DialogInterface, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DialogInterface receiver$0 = (DialogInterface) obj;
        Intrinsics.m18600h(receiver$0, "receiver$0");
        receiver$0.dismiss();
        return Unit.f51459a;
    }
}
