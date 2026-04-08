package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0002H\u008a@"}, m18302d2 = {"<anonymous>", "", "T"}, m18303k = 3, m18304mv = {1, 5, 1}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", m18559f = "DataMigrationInitializer.kt", m18560l = {45}, m18561m = "invokeSuspend")
final class DataMigrationInitializer$Companion$runMigrations$2$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: a */
    public int f23689a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DataMigration f23690b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$2$1$1(DataMigration dataMigration, Continuation continuation) {
        super(1, continuation);
        this.f23690b = dataMigration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DataMigrationInitializer$Companion$runMigrations$2$1$1(this.f23690b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DataMigrationInitializer$Companion$runMigrations$2$1$1 dataMigrationInitializer$Companion$runMigrations$2$1$1 = (DataMigrationInitializer$Companion$runMigrations$2$1$1) create((Continuation) obj);
        Unit unit = Unit.f51459a;
        dataMigrationInitializer$Companion$runMigrations$2$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i = this.f23689a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj);
            return Unit.f51459a;
        }
        ResultKt.m18313b(obj);
        this.f23689a = 1;
        this.f23690b.cleanUp();
        throw null;
    }
}
