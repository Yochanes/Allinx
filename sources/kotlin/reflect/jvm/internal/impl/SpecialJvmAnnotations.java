package kotlin.reflect.jvm.internal.impl;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class SpecialJvmAnnotations {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashSet f52005a;

    /* JADX INFO: renamed from: b */
    public static final ClassId f52006b;

    static {
        List listM18414O = CollectionsKt.m18414O(JvmAnnotationNames.f52760a, JvmAnnotationNames.f52767h, JvmAnnotationNames.f52768i, JvmAnnotationNames.f52762c, JvmAnnotationNames.f52763d, JvmAnnotationNames.f52765f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listM18414O.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(ClassId.m19576j((FqName) it.next()));
        }
        f52005a = linkedHashSet;
        f52006b = ClassId.m19576j(JvmAnnotationNames.f52766g);
    }
}
