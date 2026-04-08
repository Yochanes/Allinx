package coil.util;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
final /* synthetic */ class Time$reset$1 extends FunctionReferenceImpl implements Function0<Long> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
