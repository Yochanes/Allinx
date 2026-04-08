package androidx.datastore.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.datastore.core.DataMigration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/datastore/migrations/SharedPreferencesMigration;", "T", "Landroidx/datastore/core/DataMigration;", "Api24Impl", "datastore_release"}, m18303k = 1, m18304mv = {1, 5, 1}, m18306xi = 48)
public final class SharedPreferencesMigration<T> implements DataMigration<T> {

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, m18302d2 = {"<anonymous>", "", "T", "it"}, m18303k = 3, m18304mv = {1, 5, 1}, m18306xi = 48)
    @DebugMetadata(m18558c = "androidx.datastore.migrations.SharedPreferencesMigration$1", m18559f = "SharedPreferencesMigration.kt", m18560l = {}, m18561m = "invokeSuspend")
    final class C15321 extends SuspendLambda implements Function2<Object, Continuation<? super Boolean>, Object> {
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C15321(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((C15321) create(obj, (Continuation) obj2)).invokeSuspend(Unit.f51459a);
            return Boolean.TRUE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            ResultKt.m18313b(obj);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$2 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, m18302d2 = {"<anonymous>", "", "T", "it"}, m18303k = 3, m18304mv = {1, 5, 1}, m18306xi = 48)
    @DebugMetadata(m18558c = "androidx.datastore.migrations.SharedPreferencesMigration$2", m18559f = "SharedPreferencesMigration.kt", m18560l = {}, m18561m = "invokeSuspend")
    final class C15332 extends SuspendLambda implements Function2<Object, Continuation<? super Boolean>, Object> {
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C15332(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((C15332) create(obj, (Continuation) obj2)).invokeSuspend(Unit.f51459a);
            return Boolean.TRUE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            ResultKt.m18313b(obj);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$3 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, m18302d2 = {"<anonymous>", "", "T", "it"}, m18303k = 3, m18304mv = {1, 5, 1}, m18306xi = 48)
    @DebugMetadata(m18558c = "androidx.datastore.migrations.SharedPreferencesMigration$3", m18559f = "SharedPreferencesMigration.kt", m18560l = {}, m18561m = "invokeSuspend")
    final class C15343 extends SuspendLambda implements Function2<Object, Continuation<? super Boolean>, Object> {
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C15343(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((C15343) create(obj, (Continuation) obj2)).invokeSuspend(Unit.f51459a);
            return Boolean.TRUE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            ResultKt.m18313b(obj);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$4 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n"}, m18302d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "T"}, m18303k = 3, m18304mv = {1, 5, 1}, m18306xi = 48)
    final class C15354 extends Lambda implements Function0<SharedPreferences> {
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    @Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m18302d2 = {"Landroidx/datastore/migrations/SharedPreferencesMigration$Api24Impl;", "", "Landroid/content/Context;", "context", "", "name", "", "a", "(Landroid/content/Context;Ljava/lang/String;)Z", "datastore_release"}, m18303k = 1, m18304mv = {1, 5, 1}, m18306xi = 48)
    public static final class Api24Impl {
        @JvmStatic
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static final boolean m8259a(@NotNull Context context, @NotNull String name) {
            Intrinsics.m18599g(context, "context");
            Intrinsics.m18599g(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    @Override // androidx.datastore.core.DataMigration
    /* JADX INFO: renamed from: a */
    public final Object mo8243a() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.datastore.core.DataMigration
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo8244b(ContinuationImpl continuationImpl) {
        SharedPreferencesMigration$shouldMigrate$1 sharedPreferencesMigration$shouldMigrate$1;
        if (continuationImpl instanceof SharedPreferencesMigration$shouldMigrate$1) {
            sharedPreferencesMigration$shouldMigrate$1 = (SharedPreferencesMigration$shouldMigrate$1) continuationImpl;
            int i = sharedPreferencesMigration$shouldMigrate$1.f23802d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sharedPreferencesMigration$shouldMigrate$1.f23802d = i - Integer.MIN_VALUE;
            } else {
                sharedPreferencesMigration$shouldMigrate$1 = new SharedPreferencesMigration$shouldMigrate$1(this, continuationImpl);
            }
        }
        Object obj = sharedPreferencesMigration$shouldMigrate$1.f23800b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = sharedPreferencesMigration$shouldMigrate$1.f23802d;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            sharedPreferencesMigration$shouldMigrate$1.f23799a = this;
            sharedPreferencesMigration$shouldMigrate$1.f23802d = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        SharedPreferencesMigration sharedPreferencesMigration = sharedPreferencesMigration$shouldMigrate$1.f23799a;
        ResultKt.m18313b(obj);
        if (((Boolean) obj).booleanValue()) {
            sharedPreferencesMigration.getClass();
            throw null;
        }
    }

    @Override // androidx.datastore.core.DataMigration
    public final Object cleanUp() {
        throw null;
    }
}
