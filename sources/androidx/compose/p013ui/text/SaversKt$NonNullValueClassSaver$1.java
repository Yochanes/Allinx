package androidx.compose.p013ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/ui/text/SaversKt$NonNullValueClassSaver$1", "Landroidx/compose/ui/text/NonNullValueClassSaver;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SaversKt$NonNullValueClassSaver$1 implements NonNullValueClassSaver<Object, Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Lambda f20029a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Lambda f20030b;

    /* JADX WARN: Multi-variable type inference failed */
    public SaversKt$NonNullValueClassSaver$1(Function1 function1, Function2 function2) {
        this.f20029a = (Lambda) function2;
        this.f20030b = (Lambda) function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // androidx.compose.runtime.saveable.Saver
    /* JADX INFO: renamed from: a */
    public final Object mo3288a(Object obj) {
        return this.f20030b.invoke(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.Lambda] */
    @Override // androidx.compose.runtime.saveable.Saver
    /* JADX INFO: renamed from: b */
    public final Object mo3289b(SaverScope saverScope, Object obj) {
        return this.f20029a.invoke(saverScope, obj);
    }
}
