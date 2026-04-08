package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class AnnotationsKt {
    /* JADX INFO: renamed from: a */
    public static final Annotations m18999a(Annotations first, Annotations second) {
        Intrinsics.m18599g(first, "first");
        Intrinsics.m18599g(second, "second");
        return first.isEmpty() ? second : second.isEmpty() ? first : new CompositeAnnotations(first, second);
    }
}
