package com.tinder.scarlet.lifecycle;

import com.tinder.scarlet.Lifecycle;
import io.reactivex.schedulers.Timed;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0003¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "Lcom/tinder/scarlet/Lifecycle$State;", "p1", "", "Lio/reactivex/schedulers/Timed;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final /* synthetic */ class FlowableLifecycle$combineWith$flowable$2 extends FunctionReferenceImpl implements Function1<List<? extends Timed<Lifecycle.State>>, Lifecycle.State> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List p1 = (List) obj;
        Intrinsics.m18599g(p1, "p1");
        List list = p1;
        boolean z2 = list instanceof Collection;
        if (!z2 || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Timed) it.next()).getClass();
                Intrinsics.m18598f(null, "it.value()");
                Lifecycle.State.Stopped.AndAborted andAborted = Lifecycle.State.Stopped.AndAborted.f43451a;
                if (Intrinsics.m18594b(null, andAborted)) {
                    return andAborted;
                }
            }
        }
        if (!z2 || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((Timed) it2.next()).getClass();
                Intrinsics.m18598f(null, "it.value()");
            }
        }
        return Lifecycle.State.Started.f43450a;
    }
}
