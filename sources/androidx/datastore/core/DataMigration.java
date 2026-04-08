package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/datastore/core/DataMigration;", "T", "", "datastore-core"}, m18303k = 1, m18304mv = {1, 5, 1}, m18306xi = 48)
public interface DataMigration<T> {
    /* JADX INFO: renamed from: a */
    Object mo8243a();

    /* JADX INFO: renamed from: b */
    void mo8244b(ContinuationImpl continuationImpl);

    Object cleanUp();
}
