package androidx.os.serialization.serializers;

import androidx.os.serialization.serializers.SparseArraySerializer;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;

/* JADX INFO: renamed from: androidx.savedstate.serialization.serializers.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2197a implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SparseArraySerializer.SparseArraySurrogate.Companion companion = SparseArraySerializer.SparseArraySurrogate.INSTANCE;
        return new ArrayListSerializer(IntSerializer.f56703a);
    }
}
