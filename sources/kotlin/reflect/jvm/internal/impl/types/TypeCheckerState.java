package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4;
import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public class TypeCheckerState {

    /* JADX INFO: renamed from: a */
    public final boolean f54855a;

    /* JADX INFO: renamed from: b */
    public final boolean f54856b;

    /* JADX INFO: renamed from: c */
    public final ClassicTypeSystemContext f54857c;

    /* JADX INFO: renamed from: d */
    public final KotlinTypePreparator f54858d;

    /* JADX INFO: renamed from: e */
    public final KotlinTypeRefiner f54859e;

    /* JADX INFO: renamed from: f */
    public int f54860f;

    /* JADX INFO: renamed from: g */
    public ArrayDeque f54861g;

    /* JADX INFO: renamed from: h */
    public SmartSet f54862h;

    /* JADX INFO: compiled from: Proguard */
    public interface ForkPointContext {

        /* JADX INFO: compiled from: Proguard */
        public static final class Default implements ForkPointContext {

            /* JADX INFO: renamed from: a */
            public boolean f54863a;

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.ForkPointContext
            /* JADX INFO: renamed from: a */
            public final void mo20178a(Function0 function0) {
                if (this.f54863a) {
                    return;
                }
                this.f54863a = ((Boolean) ((AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4.C62111) function0).invoke()).booleanValue();
            }
        }

        /* JADX INFO: renamed from: a */
        void mo20178a(Function0 function0);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class LowerCapturedTypePolicy {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ LowerCapturedTypePolicy[] f54864a = {new LowerCapturedTypePolicy("CHECK_ONLY_LOWER", 0), new LowerCapturedTypePolicy("CHECK_SUBTYPE_AND_LOWER", 1), new LowerCapturedTypePolicy("SKIP_LOWER", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        LowerCapturedTypePolicy EF5;

        public static LowerCapturedTypePolicy valueOf(String str) {
            return (LowerCapturedTypePolicy) Enum.valueOf(LowerCapturedTypePolicy.class, str);
        }

        public static LowerCapturedTypePolicy[] values() {
            return (LowerCapturedTypePolicy[]) f54864a.clone();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class SupertypesPolicy {

        /* JADX INFO: compiled from: Proguard */
        public static abstract class DoCustomTransform extends SupertypesPolicy {
        }

        /* JADX INFO: compiled from: Proguard */
        @SourceDebugExtension
        public static final class LowerIfFlexible extends SupertypesPolicy {

            /* JADX INFO: renamed from: a */
            public static final LowerIfFlexible f54865a = new LowerIfFlexible();

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            /* JADX INFO: renamed from: a */
            public final SimpleTypeMarker mo20179a(TypeCheckerState state, KotlinTypeMarker type) {
                Intrinsics.m18599g(state, "state");
                Intrinsics.m18599g(type, "type");
                return state.f54857c.mo19906Z(type);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class None extends SupertypesPolicy {

            /* JADX INFO: renamed from: a */
            public static final None f54866a = new None();

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            /* JADX INFO: renamed from: a */
            public final SimpleTypeMarker mo20179a(TypeCheckerState state, KotlinTypeMarker type) {
                Intrinsics.m18599g(state, "state");
                Intrinsics.m18599g(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @SourceDebugExtension
        public static final class UpperIfFlexible extends SupertypesPolicy {

            /* JADX INFO: renamed from: a */
            public static final UpperIfFlexible f54867a = new UpperIfFlexible();

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
            /* JADX INFO: renamed from: a */
            public final SimpleTypeMarker mo20179a(TypeCheckerState state, KotlinTypeMarker type) {
                Intrinsics.m18599g(state, "state");
                Intrinsics.m18599g(type, "type");
                return state.f54857c.mo19891K(type);
            }
        }

        /* JADX INFO: renamed from: a */
        public abstract SimpleTypeMarker mo20179a(TypeCheckerState typeCheckerState, KotlinTypeMarker kotlinTypeMarker);
    }

    public TypeCheckerState(boolean z2, boolean z3, ClassicTypeSystemContext typeSystemContext, KotlinTypePreparator kotlinTypePreparator, KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.m18599g(typeSystemContext, "typeSystemContext");
        Intrinsics.m18599g(kotlinTypePreparator, "kotlinTypePreparator");
        Intrinsics.m18599g(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f54855a = z2;
        this.f54856b = z3;
        this.f54857c = typeSystemContext;
        this.f54858d = kotlinTypePreparator;
        this.f54859e = kotlinTypeRefiner;
    }

    /* JADX INFO: renamed from: a */
    public final void m20175a() {
        ArrayDeque arrayDeque = this.f54861g;
        Intrinsics.m18596d(arrayDeque);
        arrayDeque.clear();
        SmartSet smartSet = this.f54862h;
        Intrinsics.m18596d(smartSet);
        smartSet.clear();
    }

    /* JADX INFO: renamed from: b */
    public boolean mo19948b(KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m20176c() {
        if (this.f54861g == null) {
            this.f54861g = new ArrayDeque(4);
        }
        if (this.f54862h == null) {
            this.f54862h = new SmartSet();
        }
    }

    /* JADX INFO: renamed from: d */
    public final KotlinTypeMarker m20177d(KotlinTypeMarker type) {
        Intrinsics.m18599g(type, "type");
        return this.f54858d.m20274a(type);
    }
}
