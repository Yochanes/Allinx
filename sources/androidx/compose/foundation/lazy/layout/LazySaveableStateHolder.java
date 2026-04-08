package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "Companion", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class LazySaveableStateHolder implements SaveableStateRegistry, SaveableStateHolder {

    /* JADX INFO: renamed from: a */
    public final SaveableStateRegistry f7415a;

    /* JADX INFO: renamed from: b */
    public final SaveableStateHolder f7416b;

    /* JADX INFO: renamed from: c */
    public final MutableScatterSet f7417c;

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C06291 extends Lambda implements Function1<Object, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SaveableStateRegistry f7418a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06291(SaveableStateRegistry saveableStateRegistry) {
            super(1);
            this.f7418a = saveableStateRegistry;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            SaveableStateRegistry saveableStateRegistry = this.f7418a;
            return Boolean.valueOf(saveableStateRegistry != null ? saveableStateRegistry.mo3079a(obj) : true);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/LazySaveableStateHolder$Companion;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public LazySaveableStateHolder(SaveableStateRegistry saveableStateRegistry, Map map, SaveableStateHolder saveableStateHolder) {
        this.f7415a = SaveableStateRegistryKt.m4756a(map, new C06291(saveableStateRegistry));
        this.f7416b = saveableStateHolder;
        int i = ScatterSetKt.f3851a;
        this.f7417c = new MutableScatterSet();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    /* JADX INFO: renamed from: a */
    public final boolean mo3079a(Object obj) {
        return this.f7415a.mo3079a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map mo3080b() {
        MutableScatterSet mutableScatterSet = this.f7417c;
        Object[] objArr = mutableScatterSet.f3847b;
        long[] jArr = mutableScatterSet.f3846a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.f7416b.mo3084f(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return this.f7415a.mo3080b();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    /* JADX INFO: renamed from: c */
    public final Object mo3081c(String str) {
        return this.f7415a.mo3081c(str);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    /* JADX INFO: renamed from: d */
    public final SaveableStateRegistry.Entry mo3082d(String str, Function0 function0) {
        return this.f7415a.mo3082d(str, function0);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    /* JADX INFO: renamed from: e */
    public final void mo3083e(Object obj, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        composer.mo4221N(-697180401);
        this.f7416b.mo3083e(obj, composableLambdaImpl, composer, i & 126);
        boolean zMo4235m = composer.mo4235m(this) | composer.mo4235m(obj);
        Object objMo4229g = composer.mo4229g();
        if (zMo4235m || objMo4229g == Composer.Companion.f16228a) {
            objMo4229g = new LazySaveableStateHolder$SaveableStateProvider$1$1(this, obj);
            composer.mo4214G(objMo4229g);
        }
        EffectsKt.m4370c(obj, (Function1) objMo4229g, composer);
        composer.mo4213F();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    /* JADX INFO: renamed from: f */
    public final void mo3084f(Object obj) {
        this.f7416b.mo3084f(obj);
    }
}
