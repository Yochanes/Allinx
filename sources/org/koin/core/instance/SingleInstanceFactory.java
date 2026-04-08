package org.koin.core.instance;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Lorg/koin/core/instance/SingleInstanceFactory;", "T", "Lorg/koin/core/instance/InstanceFactory;", "koin-core"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SingleInstanceFactory<T> extends InstanceFactory<T> {

    /* JADX INFO: renamed from: b */
    public Object f58218b;

    @Override // org.koin.core.instance.InstanceFactory
    /* JADX INFO: renamed from: a */
    public final Object mo21805a(InstanceContext instanceContext) {
        Object obj = this.f58218b;
        if (obj == null) {
            return super.mo21805a(instanceContext);
        }
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }

    @Override // org.koin.core.instance.InstanceFactory
    /* JADX INFO: renamed from: b */
    public final Object mo21804b(InstanceContext instanceContext) {
        SingleInstanceFactory$get$1 singleInstanceFactory$get$1 = new SingleInstanceFactory$get$1(this, instanceContext);
        synchronized (this) {
            singleInstanceFactory$get$1.invoke();
        }
        Object obj = this.f58218b;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }
}
