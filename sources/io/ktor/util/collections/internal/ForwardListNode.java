package io.ktor.util.collections.internal;

import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/util/collections/internal/ForwardListNode;", "", "T", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class ForwardListNode<T> {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ KProperty[] f46560e;

    /* JADX INFO: renamed from: a */
    public final ForwardListNode$$special$$inlined$shared$1 f46561a;

    /* JADX INFO: renamed from: b */
    public final ForwardListNode$$special$$inlined$shared$2 f46562b;

    /* JADX INFO: renamed from: c */
    public final SharedForwardList f46563c;

    /* JADX INFO: renamed from: d */
    public final MapNode f46564d;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ForwardListNode.class, "next", "getNext()Lio/ktor/util/collections/internal/ForwardListNode;", 0);
        ReflectionFactory reflectionFactory = Reflection.f51660a;
        f46560e = new KProperty[]{reflectionFactory.mo18615e(mutablePropertyReference1Impl), AbstractC0455a.m2247v(ForwardListNode.class, "previous", "getPrevious()Lio/ktor/util/collections/internal/ForwardListNode;", 0, reflectionFactory)};
    }

    public ForwardListNode(SharedForwardList list, ForwardListNode forwardListNode, MapNode mapNode, ForwardListNode forwardListNode2) {
        Intrinsics.m18599g(list, "list");
        this.f46563c = list;
        this.f46564d = mapNode;
        ForwardListNode$$special$$inlined$shared$1 forwardListNode$$special$$inlined$shared$1 = new ForwardListNode$$special$$inlined$shared$1();
        forwardListNode$$special$$inlined$shared$1.f46565a = forwardListNode;
        this.f46561a = forwardListNode$$special$$inlined$shared$1;
        ForwardListNode$$special$$inlined$shared$2 forwardListNode$$special$$inlined$shared$2 = new ForwardListNode$$special$$inlined$shared$2();
        forwardListNode$$special$$inlined$shared$2.f46566a = forwardListNode2;
        this.f46562b = forwardListNode$$special$$inlined$shared$2;
    }

    /* JADX INFO: renamed from: a */
    public final ForwardListNode m17191a() {
        return (ForwardListNode) this.f46561a.getValue(this, f46560e[0]);
    }

    /* JADX INFO: renamed from: b */
    public final void m17192b() {
        ForwardListNode$$special$$inlined$shared$2 forwardListNode$$special$$inlined$shared$2 = this.f46562b;
        KProperty[] kPropertyArr = f46560e;
        ForwardListNode forwardListNode = (ForwardListNode) forwardListNode$$special$$inlined$shared$2.getValue(this, kPropertyArr[1]);
        Intrinsics.m18596d(forwardListNode);
        ForwardListNode forwardListNodeM17191a = forwardListNode.m17191a();
        SharedForwardList sharedForwardList = forwardListNode.f46563c;
        if (Intrinsics.m18594b(forwardListNodeM17191a, sharedForwardList.m17194e())) {
            KProperty property = SharedForwardList.f46576c[1];
            SharedForwardList$$special$$inlined$shared$2 sharedForwardList$$special$$inlined$shared$2 = sharedForwardList.f46578b;
            sharedForwardList$$special$$inlined$shared$2.getClass();
            Intrinsics.m18599g(property, "property");
            sharedForwardList$$special$$inlined$shared$2.f46580a = forwardListNode;
        }
        ForwardListNode forwardListNodeM17191a2 = forwardListNode.m17191a();
        forwardListNode.f46561a.setValue(forwardListNode, kPropertyArr[0], forwardListNodeM17191a2 != null ? forwardListNodeM17191a2.m17191a() : null);
        ForwardListNode forwardListNodeM17191a3 = forwardListNode.m17191a();
        if (forwardListNodeM17191a3 != null) {
            forwardListNodeM17191a3.f46562b.setValue(forwardListNodeM17191a3, kPropertyArr[1], forwardListNode);
        }
    }
}
