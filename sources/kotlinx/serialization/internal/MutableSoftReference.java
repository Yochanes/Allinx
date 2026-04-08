package kotlinx.serialization.internal;

import java.lang.ref.SoftReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/serialization/internal/MutableSoftReference;", "T", "", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
final class MutableSoftReference<T> {

    /* JADX INFO: renamed from: a */
    public volatile SoftReference f56724a;

    /* JADX INFO: renamed from: a */
    public final synchronized Object m21005a(Function0 function0) {
        Object obj = this.f56724a.get();
        if (obj != null) {
            return obj;
        }
        Object objInvoke = function0.invoke();
        this.f56724a = new SoftReference(objInvoke);
        return objInvoke;
    }
}
