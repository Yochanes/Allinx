package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.PublishedApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b!\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "Array", "", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@PublishedApi
public abstract class PrimitiveArrayBuilder<Array> {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m21024c(PrimitiveArrayBuilder primitiveArrayBuilder) {
        primitiveArrayBuilder.mo20993b(primitiveArrayBuilder.mo20994d() + 1);
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo20992a();

    /* JADX INFO: renamed from: b */
    public abstract void mo20993b(int i);

    /* JADX INFO: renamed from: d */
    public abstract int mo20994d();
}
