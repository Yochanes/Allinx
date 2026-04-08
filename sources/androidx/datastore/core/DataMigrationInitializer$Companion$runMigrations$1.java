package androidx.datastore.core;

import androidx.datastore.core.DataMigrationInitializer;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 5, 1}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.datastore.core.DataMigrationInitializer$Companion", m18559f = "DataMigrationInitializer.kt", m18560l = {42, 57}, m18561m = "runMigrations")
final class DataMigrationInitializer$Companion$runMigrations$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Serializable f23678a;

    /* JADX INFO: renamed from: b */
    public Iterator f23679b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f23680c;

    /* JADX INFO: renamed from: d */
    public int f23681d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23680c = obj;
        this.f23681d |= Integer.MIN_VALUE;
        return DataMigrationInitializer.Companion.m8245a(null, null, this);
    }
}
