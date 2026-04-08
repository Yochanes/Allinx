package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeSource;
import io.reactivex.functions.Function;
import org.reactivestreams.Publisher;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class MaybeToPublisher implements Function<MaybeSource<Object>, Publisher<Object>> {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ MaybeToPublisher[] f48393a = {new MaybeToPublisher("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    MaybeToPublisher EF5;

    public static MaybeToPublisher valueOf(String str) {
        return (MaybeToPublisher) Enum.valueOf(MaybeToPublisher.class, str);
    }

    public static MaybeToPublisher[] values() {
        return (MaybeToPublisher[]) f48393a.clone();
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        return new MaybeToFlowable((MaybeSource) obj);
    }
}
