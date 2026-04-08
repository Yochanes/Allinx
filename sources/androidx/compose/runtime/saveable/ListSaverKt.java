package androidx.compose.runtime.saveable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"runtime-saveable_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ListSaverKt {
    /* JADX INFO: renamed from: a */
    public static final SaverKt$Saver$1 m4749a(Function1 function1, Function2 function2) {
        ListSaverKt$listSaver$1 listSaverKt$listSaver$1 = new ListSaverKt$listSaver$1(function2);
        TypeIntrinsics.m18629e(1, function1);
        SaverKt$Saver$1 saverKt$Saver$1 = SaverKt.f16993a;
        return new SaverKt$Saver$1(function1, listSaverKt$listSaver$1);
    }
}
