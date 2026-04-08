package io.ktor.util.collections.internal;

import androidx.compose.animation.AbstractC0455a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.markers.KMutableIterable;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001d\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/ktor/util/collections/internal/SharedForwardList;", "", "T", "", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class SharedForwardList<T> implements Iterable<T>, KMutableIterable {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty[] f46576c;

    /* JADX INFO: renamed from: a */
    public final SharedForwardList$$special$$inlined$shared$1 f46577a;

    /* JADX INFO: renamed from: b */
    public final SharedForwardList$$special$$inlined$shared$2 f46578b;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(SharedForwardList.class, "head", "getHead$ktor_utils()Lio/ktor/util/collections/internal/ForwardListNode;", 0);
        ReflectionFactory reflectionFactory = Reflection.f51660a;
        f46576c = new KProperty[]{reflectionFactory.mo18615e(mutablePropertyReference1Impl), AbstractC0455a.m2247v(SharedForwardList.class, "tail", "getTail$ktor_utils()Lio/ktor/util/collections/internal/ForwardListNode;", 0, reflectionFactory)};
    }

    public SharedForwardList() {
        SharedForwardList$$special$$inlined$shared$1 sharedForwardList$$special$$inlined$shared$1 = new SharedForwardList$$special$$inlined$shared$1();
        sharedForwardList$$special$$inlined$shared$1.f46579a = null;
        this.f46577a = sharedForwardList$$special$$inlined$shared$1;
        ForwardListNode forwardListNodeM17193c = m17193c();
        SharedForwardList$$special$$inlined$shared$2 sharedForwardList$$special$$inlined$shared$2 = new SharedForwardList$$special$$inlined$shared$2();
        sharedForwardList$$special$$inlined$shared$2.f46580a = forwardListNodeM17193c;
        this.f46578b = sharedForwardList$$special$$inlined$shared$2;
        ForwardListNode forwardListNode = new ForwardListNode(this, null, null, null);
        KProperty[] kPropertyArr = f46576c;
        sharedForwardList$$special$$inlined$shared$1.setValue(this, kPropertyArr[0], forwardListNode);
        ForwardListNode forwardListNodeM17193c2 = m17193c();
        KProperty property = kPropertyArr[1];
        Intrinsics.m18599g(property, "property");
        sharedForwardList$$special$$inlined$shared$2.f46580a = forwardListNodeM17193c2;
    }

    /* JADX INFO: renamed from: c */
    public final ForwardListNode m17193c() {
        return (ForwardListNode) this.f46577a.getValue(this, f46576c[0]);
    }

    /* JADX INFO: renamed from: e */
    public final ForwardListNode m17194e() {
        return (ForwardListNode) this.f46578b.getValue(this, f46576c[1]);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ForwardListNode forwardListNodeM17193c = m17193c();
        Intrinsics.m18596d(forwardListNodeM17193c);
        return new ForwardListIterator(forwardListNodeM17193c);
    }
}
