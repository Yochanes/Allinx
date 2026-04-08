package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/ComputedProvidableCompositionLocal;", "T", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ComputedProvidableCompositionLocal<T> extends ProvidableCompositionLocal<T> {

    /* JADX INFO: renamed from: b */
    public final ComputedValueHolder f16333b;

    /* JADX INFO: renamed from: androidx.compose.runtime.ComputedProvidableCompositionLocal$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m18302d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C11711 extends Lambda implements Function0<Object> {

        /* JADX INFO: renamed from: a */
        public static final C11711 f16334a = new C11711(0);

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ComposerKt.m4317d("Unexpected call to default provider");
            throw new KotlinNothingValueException();
        }
    }

    public ComputedProvidableCompositionLocal(Function1 function1) {
        super(C11711.f16334a);
        this.f16333b = new ComputedValueHolder(function1);
    }

    @Override // androidx.compose.runtime.CompositionLocal
    /* JADX INFO: renamed from: a */
    public final ValueHolder mo4352a() {
        return this.f16333b;
    }

    @Override // androidx.compose.runtime.ProvidableCompositionLocal
    /* JADX INFO: renamed from: b */
    public final ProvidedValue mo4359b(Object obj) {
        return new ProvidedValue(this, obj, obj == null, null, null, true);
    }
}
