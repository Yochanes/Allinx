package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface AdditionalClassPartsProvider {

    /* JADX INFO: compiled from: Proguard */
    public static final class None implements AdditionalClassPartsProvider {

        /* JADX INFO: renamed from: a */
        public static final None f52392a = new None();

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        /* JADX INFO: renamed from: a */
        public final Collection mo18860a(ClassDescriptor classDescriptor) {
            Intrinsics.m18599g(classDescriptor, "classDescriptor");
            return EmptyList.f51496a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        /* JADX INFO: renamed from: b */
        public final Collection mo18861b(Name name, ClassDescriptor classDescriptor) {
            Intrinsics.m18599g(name, "name");
            Intrinsics.m18599g(classDescriptor, "classDescriptor");
            return EmptyList.f51496a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        /* JADX INFO: renamed from: c */
        public final Collection mo18862c(ClassDescriptor classDescriptor) {
            Intrinsics.m18599g(classDescriptor, "classDescriptor");
            return EmptyList.f51496a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        /* JADX INFO: renamed from: d */
        public final Collection mo18863d(ClassDescriptor classDescriptor) {
            Intrinsics.m18599g(classDescriptor, "classDescriptor");
            return EmptyList.f51496a;
        }
    }

    /* JADX INFO: renamed from: a */
    Collection mo18860a(ClassDescriptor classDescriptor);

    /* JADX INFO: renamed from: b */
    Collection mo18861b(Name name, ClassDescriptor classDescriptor);

    /* JADX INFO: renamed from: c */
    Collection mo18862c(ClassDescriptor classDescriptor);

    /* JADX INFO: renamed from: d */
    Collection mo18863d(ClassDescriptor classDescriptor);
}
