package androidx.compose.foundation.relocation;

import androidx.compose.p013ui.geometry.Rect;
import io.intercom.android.sdk.models.Config;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", m18559f = "BringIntoViewRequester.kt", m18560l = {Config.DEFAULT_RATE_LIMIT_COUNT}, m18561m = "bringIntoView")
final class BringIntoViewRequesterImpl$bringIntoView$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Rect f7910a;

    /* JADX INFO: renamed from: b */
    public Object[] f7911b;

    /* JADX INFO: renamed from: c */
    public int f7912c;

    /* JADX INFO: renamed from: d */
    public int f7913d;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f7914f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ BringIntoViewRequesterImpl f7915g;

    /* JADX INFO: renamed from: i */
    public int f7916i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequesterImpl$bringIntoView$1(BringIntoViewRequesterImpl bringIntoViewRequesterImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f7915g = bringIntoViewRequesterImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7914f = obj;
        this.f7916i |= Integer.MIN_VALUE;
        return this.f7915g.mo3176a(null, this);
    }
}
