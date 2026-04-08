package coil.util;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
public /* synthetic */ class Time$provider$1 extends FunctionReferenceImpl implements Function0<Long> {

    /* JADX INFO: renamed from: a */
    public static final Time$provider$1 f34021a = new Time$provider$1(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Long.valueOf(System.currentTimeMillis());
    }
}
