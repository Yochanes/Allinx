package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractMaybeWithUpstream<T, R> extends Maybe<R> implements HasUpstreamMaybeSource<T> {

    /* JADX INFO: renamed from: a */
    public final Maybe f48278a;

    public AbstractMaybeWithUpstream(Maybe maybe) {
        this.f48278a = maybe;
    }
}
