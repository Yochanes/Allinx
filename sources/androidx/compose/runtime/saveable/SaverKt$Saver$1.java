package androidx.compose.runtime.saveable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/runtime/saveable/SaverKt$Saver$1", "Landroidx/compose/runtime/saveable/Saver;", "runtime-saveable_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SaverKt$Saver$1 implements Saver<Object, Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function2 f16996a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1 f16997b;

    public SaverKt$Saver$1(Function1 function1, Function2 function2) {
        this.f16996a = function2;
        this.f16997b = function1;
    }

    @Override // androidx.compose.runtime.saveable.Saver
    /* JADX INFO: renamed from: a */
    public final Object mo3288a(Object obj) {
        return this.f16997b.invoke(obj);
    }

    @Override // androidx.compose.runtime.saveable.Saver
    /* JADX INFO: renamed from: b */
    public final Object mo3289b(SaverScope saverScope, Object obj) {
        return this.f16996a.invoke(saverScope, obj);
    }
}
