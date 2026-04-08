package defpackage;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "SpotWebSocketHelperTest", m18559f = "SpotWebSocketHelperTest.kt", m18560l = {32, 38}, m18561m = "retries")
final class SpotWebSocketHelperTest$retries$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Function1 f31a;

    /* JADX INFO: renamed from: b */
    public Ref.IntRef f32b;

    /* JADX INFO: renamed from: c */
    public Ref.BooleanRef f33c;

    /* JADX INFO: renamed from: d */
    public int f34d;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f35f;

    /* JADX INFO: renamed from: g */
    public int f36g;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f35f = obj;
        this.f36g |= Integer.MIN_VALUE;
        Lazy lazy = SpotWebSocketHelperTest.f30a;
        return SpotWebSocketHelperTest.m73a(null, this);
    }
}
