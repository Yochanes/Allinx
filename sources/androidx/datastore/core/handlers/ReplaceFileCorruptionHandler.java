package androidx.datastore.core.handlers;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.CorruptionHandler;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "T", "Landroidx/datastore/core/CorruptionHandler;", "datastore-core"}, m18303k = 1, m18304mv = {1, 5, 1}, m18306xi = 48)
public final class ReplaceFileCorruptionHandler<T> implements CorruptionHandler<T> {

    /* JADX INFO: renamed from: a */
    public final Lambda f23798a;

    /* JADX WARN: Multi-variable type inference failed */
    public ReplaceFileCorruptionHandler(Function1 produceNewData) {
        Intrinsics.m18599g(produceNewData, "produceNewData");
        this.f23798a = (Lambda) produceNewData;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // androidx.datastore.core.CorruptionHandler
    /* JADX INFO: renamed from: a */
    public final Object mo8242a(CorruptionException corruptionException) {
        return this.f23798a.invoke(corruptionException);
    }
}
