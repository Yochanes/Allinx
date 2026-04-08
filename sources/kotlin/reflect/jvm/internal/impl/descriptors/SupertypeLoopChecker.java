package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface SupertypeLoopChecker {

    /* JADX INFO: compiled from: Proguard */
    public static final class EMPTY implements SupertypeLoopChecker {

        /* JADX INFO: renamed from: a */
        public static final EMPTY f52300a = new EMPTY();

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker
        /* JADX INFO: renamed from: a */
        public final Collection mo18970a(TypeConstructor currentTypeConstructor, Collection superTypes, Function1 function1, Function1 function12) {
            Intrinsics.m18599g(currentTypeConstructor, "currentTypeConstructor");
            Intrinsics.m18599g(superTypes, "superTypes");
            return superTypes;
        }
    }

    /* JADX INFO: renamed from: a */
    Collection mo18970a(TypeConstructor typeConstructor, Collection collection, Function1 function1, Function1 function12);
}
