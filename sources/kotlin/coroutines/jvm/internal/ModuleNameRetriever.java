package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever;", "", "Cache", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
final class ModuleNameRetriever {

    /* JADX INFO: renamed from: a */
    public static final Cache f51602a = new Cache(null, null, null);

    /* JADX INFO: renamed from: b */
    public static Cache f51603b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/coroutines/jvm/internal/ModuleNameRetriever$Cache;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Cache {

        /* JADX INFO: renamed from: a */
        public final Method f51604a;

        /* JADX INFO: renamed from: b */
        public final Method f51605b;

        /* JADX INFO: renamed from: c */
        public final Method f51606c;

        public Cache(Method method, Method method2, Method method3) {
            this.f51604a = method;
            this.f51605b = method2;
            this.f51606c = method3;
        }
    }
}
