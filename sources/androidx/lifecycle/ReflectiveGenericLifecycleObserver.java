package androidx.lifecycle;

import androidx.lifecycle.ClassesInfoCache;
import androidx.lifecycle.Lifecycle;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements LifecycleEventObserver {

    /* JADX INFO: renamed from: a */
    public final LifecycleObserver f24942a;

    /* JADX INFO: renamed from: b */
    public final ClassesInfoCache.CallbackInfo f24943b;

    public ReflectiveGenericLifecycleObserver(LifecycleObserver lifecycleObserver) {
        this.f24942a = lifecycleObserver;
        ClassesInfoCache classesInfoCache = ClassesInfoCache.f24840c;
        Class<?> cls = lifecycleObserver.getClass();
        ClassesInfoCache.CallbackInfo callbackInfo = (ClassesInfoCache.CallbackInfo) classesInfoCache.f24841a.get(cls);
        this.f24943b = callbackInfo == null ? classesInfoCache.m9112a(cls, null) : callbackInfo;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    /* JADX INFO: renamed from: j */
    public final void mo148j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        HashMap map = this.f24943b.f24843a;
        List list = (List) map.get(event);
        LifecycleObserver lifecycleObserver = this.f24942a;
        ClassesInfoCache.CallbackInfo.m9113a(list, lifecycleOwner, event, lifecycleObserver);
        ClassesInfoCache.CallbackInfo.m9113a((List) map.get(Lifecycle.Event.ON_ANY), lifecycleOwner, event, lifecycleObserver);
    }
}
