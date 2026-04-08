package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface TypeAliasExpansionReportStrategy {

    /* JADX INFO: compiled from: Proguard */
    public static final class DO_NOTHING implements TypeAliasExpansionReportStrategy {

        /* JADX INFO: renamed from: a */
        public static final DO_NOTHING f54852a = new DO_NOTHING();

        /* JADX INFO: renamed from: a */
        public final void m20171a(TypeAliasDescriptor typeAlias, UnwrappedType substitutedArgument) {
            Intrinsics.m18599g(typeAlias, "typeAlias");
            Intrinsics.m18599g(substitutedArgument, "substitutedArgument");
        }
    }
}
