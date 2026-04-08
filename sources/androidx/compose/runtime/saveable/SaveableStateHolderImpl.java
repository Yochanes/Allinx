package androidx.compose.runtime.saveable;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "Companion", "runtime-saveable_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class SaveableStateHolderImpl implements SaveableStateHolder {

    /* JADX INFO: renamed from: e */
    public static final SaverKt$Saver$1 f16970e;

    /* JADX INFO: renamed from: a */
    public final Map f16971a;

    /* JADX INFO: renamed from: b */
    public final MutableScatterMap f16972b;

    /* JADX INFO: renamed from: c */
    public SaveableStateRegistry f16973c;

    /* JADX INFO: renamed from: d */
    public final Function1 f16974d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolderImpl$Companion;", "", "runtime-saveable_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    static {
        SaveableStateHolderImpl$Companion$Saver$1 saveableStateHolderImpl$Companion$Saver$1 = SaveableStateHolderImpl$Companion$Saver$1.f16975a;
        SaveableStateHolderImpl$Companion$Saver$2 saveableStateHolderImpl$Companion$Saver$2 = SaveableStateHolderImpl$Companion$Saver$2.f16976a;
        SaverKt$Saver$1 saverKt$Saver$1 = SaverKt.f16993a;
        f16970e = new SaverKt$Saver$1(saveableStateHolderImpl$Companion$Saver$2, saveableStateHolderImpl$Companion$Saver$1);
    }

    public SaveableStateHolderImpl(Map map) {
        this.f16971a = map;
        long[] jArr = ScatterMapKt.f3844a;
        this.f16972b = new MutableScatterMap();
        this.f16974d = new SaveableStateHolderImpl$canBeSaved$1(this);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    /* JADX INFO: renamed from: e */
    public final void mo3083e(Object obj, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        composer.mo4221N(-1198538093);
        composer.mo4237o(obj);
        Object objMo4229g = composer.mo4229g();
        Object obj2 = Composer.Companion.f16228a;
        if (objMo4229g == obj2) {
            Function1 function1 = this.f16974d;
            if (!((Boolean) ((SaveableStateHolderImpl$canBeSaved$1) function1).invoke(obj)).booleanValue()) {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            Map map = (Map) this.f16971a.get(obj);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = SaveableStateRegistryKt.f16991a;
            Object saveableStateRegistryImpl = new SaveableStateRegistryImpl(map, function1);
            composer.mo4214G(saveableStateRegistryImpl);
            objMo4229g = saveableStateRegistryImpl;
        }
        SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) objMo4229g;
        CompositionLocalKt.m4354a(SaveableStateRegistryKt.f16991a.mo4359b(saveableStateRegistry), composableLambdaImpl, composer, (i & 112) | 8);
        Unit unit = Unit.f51459a;
        boolean zMo4235m = composer.mo4235m(this) | composer.mo4235m(obj) | composer.mo4235m(saveableStateRegistry);
        Object objMo4229g2 = composer.mo4229g();
        if (zMo4235m || objMo4229g2 == obj2) {
            objMo4229g2 = new SaveableStateHolderImpl$SaveableStateProvider$1$1$1(this, obj, saveableStateRegistry);
            composer.mo4214G(objMo4229g2);
        }
        EffectsKt.m4370c(unit, (Function1) objMo4229g2, composer);
        composer.mo4227e();
        composer.mo4213F();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    /* JADX INFO: renamed from: f */
    public final void mo3084f(Object obj) {
        if (this.f16972b.m2079k(obj) == null) {
            this.f16971a.remove(obj);
        }
    }
}
