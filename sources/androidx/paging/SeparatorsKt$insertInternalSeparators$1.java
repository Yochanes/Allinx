package androidx.paging;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.paging.SeparatorsKt", m18559f = "Separators.kt", m18560l = {82}, m18561m = "insertInternalSeparators")
final class SeparatorsKt$insertInternalSeparators$1<R, T extends R> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public TransformablePage f31288a;

    /* JADX INFO: renamed from: b */
    public Function3 f31289b;

    /* JADX INFO: renamed from: c */
    public ArrayList f31290c;

    /* JADX INFO: renamed from: d */
    public ArrayList f31291d;

    /* JADX INFO: renamed from: f */
    public Object f31292f;

    /* JADX INFO: renamed from: g */
    public int f31293g;

    /* JADX INFO: renamed from: i */
    public int f31294i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f31295j;

    /* JADX INFO: renamed from: n */
    public int f31296n;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31295j = obj;
        this.f31296n |= Integer.MIN_VALUE;
        return SeparatorsKt.m11408b(null, null, this);
    }
}
