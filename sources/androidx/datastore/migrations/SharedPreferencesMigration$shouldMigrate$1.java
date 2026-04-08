package androidx.datastore.migrations;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 5, 1}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.datastore.migrations.SharedPreferencesMigration", m18559f = "SharedPreferencesMigration.kt", m18560l = {147}, m18561m = "shouldMigrate")
final class SharedPreferencesMigration$shouldMigrate$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public SharedPreferencesMigration f23799a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f23800b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SharedPreferencesMigration f23801c;

    /* JADX INFO: renamed from: d */
    public int f23802d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigration$shouldMigrate$1(SharedPreferencesMigration sharedPreferencesMigration, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23801c = sharedPreferencesMigration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23800b = obj;
        this.f23802d |= Integer.MIN_VALUE;
        this.f23801c.mo8244b(this);
        return Boolean.FALSE;
    }
}
