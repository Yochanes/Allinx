package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Stable;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/internal/ComposableLambdaImpl;", "Landroidx/compose/runtime/internal/ComposableLambda;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ComposableLambdaImpl implements ComposableLambda {

    /* JADX INFO: renamed from: a */
    public final int f16898a;

    /* JADX INFO: renamed from: b */
    public final boolean f16899b;

    /* JADX INFO: renamed from: c */
    public Object f16900c;

    /* JADX INFO: renamed from: d */
    public RecomposeScope f16901d;

    /* JADX INFO: renamed from: f */
    public ArrayList f16902f;

    /* JADX INFO: renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final /* synthetic */ class C11831 extends AdaptedFunctionReference implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            int iIntValue = ((Number) obj2).intValue();
            ((ComposableLambdaImpl) this.receiver).m4725b((Composer) obj, iIntValue);
            return Unit.f51459a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$10 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C118410 extends Lambda implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$11 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C118511 extends Lambda implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$12 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C118612 extends Lambda implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$13 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C118713 extends Lambda implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$14 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C118814 extends Lambda implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$15 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C118915 extends Lambda implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$16 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C119016 extends Lambda implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$17 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C119117 extends Lambda implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$18 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C119218 extends Lambda implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$19 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C119319 extends Lambda implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$2 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C11942 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f16904b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f16905c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11942(Object obj, int i) {
            super(2);
            this.f16904b = obj;
            this.f16905c = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int iM4417a = RecomposeScopeImplKt.m4417a(this.f16905c) | 1;
            ComposableLambdaImpl.this.m4724a(iM4417a, (Composer) obj, this.f16904b);
            return Unit.f51459a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$3 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C11953 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f16907b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f16908c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f16909d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11953(Object obj, Object obj2, int i) {
            super(2);
            this.f16907b = obj;
            this.f16908c = obj2;
            this.f16909d = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int iM4417a = RecomposeScopeImplKt.m4417a(this.f16909d) | 1;
            Object obj3 = this.f16907b;
            Object obj4 = this.f16908c;
            ComposableLambdaImpl.this.m4726c(obj3, obj4, (Composer) obj, iM4417a);
            return Unit.f51459a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$4 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C11964 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f16911b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f16912c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Object f16913d;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f16914f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11964(Object obj, Object obj2, Object obj3, int i) {
            super(2);
            this.f16911b = obj;
            this.f16912c = obj2;
            this.f16913d = obj3;
            this.f16914f = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int iM4417a = RecomposeScopeImplKt.m4417a(this.f16914f) | 1;
            Object obj3 = this.f16912c;
            Object obj4 = this.f16913d;
            ComposableLambdaImpl.this.m4727e(this.f16911b, obj3, obj4, (Composer) obj, iM4417a);
            return Unit.f51459a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$5 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C11975 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f16916b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f16917c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Object f16918d;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Object f16919f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f16920g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11975(Object obj, Object obj2, Object obj3, Object obj4, int i) {
            super(2);
            this.f16916b = obj;
            this.f16917c = obj2;
            this.f16918d = obj3;
            this.f16919f = obj4;
            this.f16920g = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int iM4417a = RecomposeScopeImplKt.m4417a(this.f16920g) | 1;
            Object obj3 = this.f16918d;
            Object obj4 = this.f16919f;
            ComposableLambdaImpl.this.m4728g(this.f16916b, this.f16917c, obj3, obj4, (Composer) obj, iM4417a);
            return Unit.f51459a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$6 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C11986 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FlowCollector f16922b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f16923c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Object f16924d;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Object f16925f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Object f16926g;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ int f16927i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11986(FlowCollector flowCollector, Object obj, Object obj2, Object obj3, Object obj4, int i) {
            super(2);
            this.f16922b = flowCollector;
            this.f16923c = obj;
            this.f16924d = obj2;
            this.f16925f = obj3;
            this.f16926g = obj4;
            this.f16927i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int iM4417a = RecomposeScopeImplKt.m4417a(this.f16927i) | 1;
            ComposableLambdaImpl composableLambdaImpl = ComposableLambdaImpl.this;
            Object obj3 = this.f16923c;
            Object obj4 = this.f16924d;
            composableLambdaImpl.m4729h(this.f16922b, obj3, obj4, this.f16925f, this.f16926g, (Composer) obj, iM4417a);
            return Unit.f51459a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$7 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C11997 extends Lambda implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$8 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C12008 extends Lambda implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$9 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "nc", "Landroidx/compose/runtime/Composer;", "<anonymous parameter 1>", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C12019 extends Lambda implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            throw null;
        }
    }

    public ComposableLambdaImpl(int i, Object obj, boolean z2) {
        this.f16898a = i;
        this.f16899b = z2;
        this.f16900c = obj;
    }

    /* JADX INFO: renamed from: a */
    public final Object m4724a(int i, Composer composer, Object obj) {
        ComposerImpl composerImplMo4239q = composer.mo4239q(this.f16898a);
        m4730i(composerImplMo4239q);
        int iM4733a = composerImplMo4239q.mo4220M(this) ? ComposableLambdaKt.m4733a(2, 1) : ComposableLambdaKt.m4733a(1, 1);
        Object obj2 = this.f16900c;
        Intrinsics.m18597e(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        TypeIntrinsics.m18629e(3, obj2);
        Object objInvoke = ((Function3) obj2).invoke(obj, composerImplMo4239q, Integer.valueOf(iM4733a | i));
        RecomposeScopeImpl recomposeScopeImplM4267Y = composerImplMo4239q.m4267Y();
        if (recomposeScopeImplM4267Y != null) {
            recomposeScopeImplM4267Y.f16451d = new C11942(obj, i);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: b */
    public final Object m4725b(Composer composer, int i) {
        ComposerImpl composerImplMo4239q = composer.mo4239q(this.f16898a);
        m4730i(composerImplMo4239q);
        int iM4733a = i | (composerImplMo4239q.mo4220M(this) ? ComposableLambdaKt.m4733a(2, 0) : ComposableLambdaKt.m4733a(1, 0));
        Object obj = this.f16900c;
        Intrinsics.m18597e(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        TypeIntrinsics.m18629e(2, obj);
        Object objInvoke = ((Function2) obj).invoke(composerImplMo4239q, Integer.valueOf(iM4733a));
        RecomposeScopeImpl recomposeScopeImplM4267Y = composerImplMo4239q.m4267Y();
        if (recomposeScopeImplM4267Y != null) {
            recomposeScopeImplM4267Y.f16451d = new C11831(2, this, ComposableLambdaImpl.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: c */
    public final Object m4726c(Object obj, Object obj2, Composer composer, int i) {
        ComposerImpl composerImplMo4239q = composer.mo4239q(this.f16898a);
        m4730i(composerImplMo4239q);
        int iM4733a = composerImplMo4239q.mo4220M(this) ? ComposableLambdaKt.m4733a(2, 2) : ComposableLambdaKt.m4733a(1, 2);
        Object obj3 = this.f16900c;
        Intrinsics.m18597e(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        TypeIntrinsics.m18629e(4, obj3);
        Object objInvoke = ((Function4) obj3).invoke(obj, obj2, composerImplMo4239q, Integer.valueOf(iM4733a | i));
        RecomposeScopeImpl recomposeScopeImplM4267Y = composerImplMo4239q.m4267Y();
        if (recomposeScopeImplM4267Y != null) {
            recomposeScopeImplM4267Y.f16451d = new C11953(obj, obj2, i);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: e */
    public final Object m4727e(Object obj, Object obj2, Object obj3, Composer composer, int i) {
        ComposerImpl composerImplMo4239q = composer.mo4239q(this.f16898a);
        m4730i(composerImplMo4239q);
        int iM4733a = composerImplMo4239q.mo4220M(this) ? ComposableLambdaKt.m4733a(2, 3) : ComposableLambdaKt.m4733a(1, 3);
        Object obj4 = this.f16900c;
        Intrinsics.m18597e(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        TypeIntrinsics.m18629e(5, obj4);
        Object objInvoke = ((Function5) obj4).invoke(obj, obj2, obj3, composerImplMo4239q, Integer.valueOf(iM4733a | i));
        RecomposeScopeImpl recomposeScopeImplM4267Y = composerImplMo4239q.m4267Y();
        if (recomposeScopeImplM4267Y != null) {
            recomposeScopeImplM4267Y.f16451d = new C11964(obj, obj2, obj3, i);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: g */
    public final Object m4728g(Object obj, Object obj2, Object obj3, Object obj4, Composer composer, int i) {
        ComposerImpl composerImplMo4239q = composer.mo4239q(this.f16898a);
        m4730i(composerImplMo4239q);
        int iM4733a = composerImplMo4239q.mo4220M(this) ? ComposableLambdaKt.m4733a(2, 4) : ComposableLambdaKt.m4733a(1, 4);
        Object obj5 = this.f16900c;
        Intrinsics.m18597e(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        TypeIntrinsics.m18629e(6, obj5);
        Object objMo3628n = ((Function6) obj5).mo3628n(obj, obj2, obj3, obj4, composerImplMo4239q, Integer.valueOf(iM4733a | i));
        RecomposeScopeImpl recomposeScopeImplM4267Y = composerImplMo4239q.m4267Y();
        if (recomposeScopeImplM4267Y != null) {
            recomposeScopeImplM4267Y.f16451d = new C11975(obj, obj2, obj3, obj4, i);
        }
        return objMo3628n;
    }

    /* JADX INFO: renamed from: h */
    public final Object m4729h(FlowCollector flowCollector, Object obj, Object obj2, Object obj3, Object obj4, Composer composer, int i) {
        ComposerImpl composerImplMo4239q = composer.mo4239q(this.f16898a);
        m4730i(composerImplMo4239q);
        int iM4733a = composerImplMo4239q.mo4220M(this) ? ComposableLambdaKt.m4733a(2, 5) : ComposableLambdaKt.m4733a(1, 5);
        Object obj5 = this.f16900c;
        Intrinsics.m18597e(obj5, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        TypeIntrinsics.m18629e(7, obj5);
        Object objMo4732l = ((Function7) obj5).mo4732l(flowCollector, obj, obj2, obj3, obj4, composerImplMo4239q, Integer.valueOf(i | iM4733a));
        RecomposeScopeImpl recomposeScopeImplM4267Y = composerImplMo4239q.m4267Y();
        if (recomposeScopeImplM4267Y != null) {
            recomposeScopeImplM4267Y.f16451d = new C11986(flowCollector, obj, obj2, obj3, obj4, i);
        }
        return objMo4732l;
    }

    /* JADX INFO: renamed from: i */
    public final void m4730i(Composer composer) {
        RecomposeScopeImpl recomposeScopeImplMo4225c;
        if (!this.f16899b || (recomposeScopeImplMo4225c = composer.mo4225c()) == null) {
            return;
        }
        composer.mo4211D(recomposeScopeImplMo4225c);
        if (ComposableLambdaKt.m4736d(this.f16901d, recomposeScopeImplMo4225c)) {
            this.f16901d = recomposeScopeImplMo4225c;
            return;
        }
        ArrayList arrayList = this.f16902f;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f16902f = arrayList2;
            arrayList2.add(recomposeScopeImplMo4225c);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (ComposableLambdaKt.m4736d((RecomposeScope) arrayList.get(i), recomposeScopeImplMo4225c)) {
                arrayList.set(i, recomposeScopeImplMo4225c);
                return;
            }
        }
        arrayList.add(recomposeScopeImplMo4225c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m4725b((Composer) obj, ((Number) obj2).intValue());
    }

    /* JADX INFO: renamed from: j */
    public final void m4731j(Function function) {
        if (Intrinsics.m18594b(this.f16900c, function)) {
            return;
        }
        boolean z2 = this.f16900c == null;
        this.f16900c = function;
        if (z2 || !this.f16899b) {
            return;
        }
        RecomposeScope recomposeScope = this.f16901d;
        if (recomposeScope != null) {
            recomposeScope.invalidate();
            this.f16901d = null;
        }
        ArrayList arrayList = this.f16902f;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((RecomposeScope) arrayList.get(i)).invalidate();
            }
            arrayList.clear();
        }
    }

    @Override // kotlin.jvm.functions.Function7
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ Object mo4732l(FlowCollector flowCollector, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Serializable serializable) {
        return m4729h(flowCollector, obj, obj2, obj3, obj4, (Composer) obj5, ((Number) serializable).intValue());
    }

    @Override // kotlin.jvm.functions.Function6
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ Object mo3628n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return m4728g(obj, obj2, obj3, obj4, (Composer) obj5, ((Number) obj6).intValue());
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m4724a(((Number) obj3).intValue(), (Composer) obj2, obj);
    }

    @Override // kotlin.jvm.functions.Function4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return m4726c(obj, obj2, (Composer) obj3, ((Number) obj4).intValue());
    }

    @Override // kotlin.jvm.functions.Function5
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m4727e(obj, obj2, obj3, (Composer) obj4, ((Number) obj5).intValue());
    }
}
