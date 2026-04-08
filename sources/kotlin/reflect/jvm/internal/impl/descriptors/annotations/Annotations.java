package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface Annotations extends Iterable<AnnotationDescriptor>, KMappedMarker {

    /* JADX INFO: compiled from: Proguard */
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final Annotations$Companion$EMPTY$1 f52337a = new Annotations$Companion$EMPTY$1();

        /* JADX INFO: renamed from: a */
        public static Annotations m18996a(List list) {
            return list.isEmpty() ? f52337a : new AnnotationsImpl(list);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @SourceDebugExtension
    public static final class DefaultImpls {
        /* JADX INFO: renamed from: a */
        public static AnnotationDescriptor m18997a(Annotations annotations, FqName fqName) {
            AnnotationDescriptor next;
            Intrinsics.m18599g(fqName, "fqName");
            Iterator<AnnotationDescriptor> it = annotations.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.m18594b(next.mo18990c(), fqName)) {
                    break;
                }
            }
            return next;
        }

        /* JADX INFO: renamed from: b */
        public static boolean m18998b(Annotations annotations, FqName fqName) {
            Intrinsics.m18599g(fqName, "fqName");
            return annotations.mo18995h(fqName) != null;
        }
    }

    /* JADX INFO: renamed from: H */
    boolean mo18994H(FqName fqName);

    /* JADX INFO: renamed from: h */
    AnnotationDescriptor mo18995h(FqName fqName);

    boolean isEmpty();
}
