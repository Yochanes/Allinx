package androidx.datastore.core.handlers;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.CorruptionHandler;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/datastore/core/handlers/NoOpCorruptionHandler;", "T", "Landroidx/datastore/core/CorruptionHandler;", "datastore-core"}, m18303k = 1, m18304mv = {1, 5, 1}, m18306xi = 48)
public final class NoOpCorruptionHandler<T> implements CorruptionHandler<T> {
    @Override // androidx.datastore.core.CorruptionHandler
    /* JADX INFO: renamed from: a */
    public final Object mo8242a(CorruptionException corruptionException) throws CorruptionException {
        throw corruptionException;
    }
}
