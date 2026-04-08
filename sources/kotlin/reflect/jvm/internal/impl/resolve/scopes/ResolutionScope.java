package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface ResolutionScope {

    /* JADX INFO: compiled from: Proguard */
    @SourceDebugExtension
    public static final class DefaultImpls {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Collection m20002a(ResolutionScope resolutionScope, DescriptorKindFilter descriptorKindFilter, int i) {
            if ((i & 1) != 0) {
                descriptorKindFilter = DescriptorKindFilter.f54433m;
            }
            MemberScope.f54453a.getClass();
            return resolutionScope.mo19040g(descriptorKindFilter, MemberScope$Companion$ALL_NAME_FILTER$1.f54456a);
        }
    }

    /* JADX INFO: renamed from: f */
    ClassifierDescriptor mo19244f(Name name, LookupLocation lookupLocation);

    /* JADX INFO: renamed from: g */
    Collection mo19040g(DescriptorKindFilter descriptorKindFilter, Function1 function1);
}
