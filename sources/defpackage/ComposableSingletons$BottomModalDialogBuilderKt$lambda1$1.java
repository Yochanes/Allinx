package defpackage;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ComposableSingletons$BottomModalDialogBuilderKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class ComposableSingletons$BottomModalDialogBuilderKt$lambda1$1 implements Function4 {

    /* JADX INFO: renamed from: a */
    public static final ComposableSingletons$BottomModalDialogBuilderKt$lambda1$1 f13a = new ComposableSingletons$BottomModalDialogBuilderKt$lambda1$1();

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        BottomSheetDialog dialog = (BottomSheetDialog) obj;
        ((Number) obj4).intValue();
        Intrinsics.m18599g(dialog, "dialog");
        return Unit.f51459a;
    }
}
