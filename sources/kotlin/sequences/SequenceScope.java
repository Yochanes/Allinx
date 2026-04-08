package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.RestrictsSuspension;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@RestrictsSuspension
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlin/sequences/SequenceScope;", "T", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public abstract class SequenceScope<T> {
    /* JADX INFO: renamed from: c */
    public abstract void mo20357c(Object obj, Continuation continuation);

    /* JADX INFO: renamed from: e */
    public abstract Object mo20358e(Iterator it, RestrictedSuspendLambda restrictedSuspendLambda);
}
