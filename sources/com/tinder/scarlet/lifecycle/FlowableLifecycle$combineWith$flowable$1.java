package com.tinder.scarlet.lifecycle;

import com.tinder.scarlet.Lifecycle;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Timed;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00010\u00012*\u0010\u0005\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007 \u0004*\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00070\u00070\u00060\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, m18302d2 = {"<anonymous>", "", "Lio/reactivex/schedulers/Timed;", "Lcom/tinder/scarlet/Lifecycle$State;", "kotlin.jvm.PlatformType", "it", "", "", "apply", "([Ljava/lang/Object;)Ljava/util/List;"}, m18303k = 3, m18304mv = {1, 4, 2})
final class FlowableLifecycle$combineWith$flowable$1<T, R> implements Function<Object[], List<? extends Timed<Lifecycle.State>>> {
    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        Object[] it = (Object[]) obj;
        Intrinsics.m18599g(it, "it");
        ArrayList arrayList = new ArrayList(it.length);
        for (Object obj2 : it) {
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type io.reactivex.schedulers.Timed<com.tinder.scarlet.Lifecycle.State>");
            }
            arrayList.add((Timed) obj2);
        }
        return arrayList;
    }
}
