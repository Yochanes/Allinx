package kotlinx.coroutines.reactive;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.reactive.PublisherCoroutine", m18559f = "Publish.kt", m18560l = {UserMetadata.MAX_ROLLOUT_ASSIGNMENTS}, m18561m = "send")
final class PublisherCoroutine$send$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public PublisherCoroutine f56430a;

    /* JADX INFO: renamed from: b */
    public Object f56431b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f56432c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ PublisherCoroutine f56433d;

    /* JADX INFO: renamed from: f */
    public int f56434f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublisherCoroutine$send$1(PublisherCoroutine publisherCoroutine, Continuation continuation) {
        super(continuation);
        this.f56433d = publisherCoroutine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f56432c = obj;
        this.f56434f |= Integer.MIN_VALUE;
        this.f56433d.mo11415w(null, this);
        throw null;
    }
}
