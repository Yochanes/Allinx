package androidx.datastore.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/datastore/core/DataMigrationInitializer;", "T", "", "Companion", "datastore-core"}, m18303k = 1, m18304mv = {1, 5, 1}, m18306xi = 48)
public final class DataMigrationInitializer<T> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/datastore/core/DataMigrationInitializer$Companion;", "", "datastore-core"}, m18303k = 1, m18304mv = {1, 5, 1}, m18306xi = 48)
    public static final class Companion {
        /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0084 -> B:25:0x0067). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0087 -> B:25:0x0067). Please report as a decompilation issue!!! */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final Object m8245a(List list, InitializerApi initializerApi, ContinuationImpl continuationImpl) throws Throwable {
            DataMigrationInitializer$Companion$runMigrations$1 dataMigrationInitializer$Companion$runMigrations$1;
            List list2;
            Ref.ObjectRef objectRef;
            Iterator<T> it;
            Throwable th;
            if (continuationImpl instanceof DataMigrationInitializer$Companion$runMigrations$1) {
                dataMigrationInitializer$Companion$runMigrations$1 = (DataMigrationInitializer$Companion$runMigrations$1) continuationImpl;
                int i = dataMigrationInitializer$Companion$runMigrations$1.f23681d;
                if ((i & Integer.MIN_VALUE) != 0) {
                    dataMigrationInitializer$Companion$runMigrations$1.f23681d = i - Integer.MIN_VALUE;
                } else {
                    dataMigrationInitializer$Companion$runMigrations$1 = new DataMigrationInitializer$Companion$runMigrations$1(continuationImpl);
                }
            }
            Object obj = dataMigrationInitializer$Companion$runMigrations$1.f23680c;
            Object obj2 = CoroutineSingletons.f51584a;
            int i2 = dataMigrationInitializer$Companion$runMigrations$1.f23681d;
            if (i2 == 0) {
                ResultKt.m18313b(obj);
                ArrayList arrayList = new ArrayList();
                Function2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(list, arrayList, null);
                dataMigrationInitializer$Companion$runMigrations$1.f23678a = arrayList;
                dataMigrationInitializer$Companion$runMigrations$1.f23681d = 1;
                if (initializerApi.mo8248a(dataMigrationInitializer$Companion$runMigrations$2, dataMigrationInitializer$Companion$runMigrations$1) == obj2) {
                    return obj2;
                }
                list2 = arrayList;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = dataMigrationInitializer$Companion$runMigrations$1.f23679b;
                    objectRef = (Ref.ObjectRef) dataMigrationInitializer$Companion$runMigrations$1.f23678a;
                    try {
                        ResultKt.m18313b(obj);
                    } catch (Throwable th2) {
                        Object obj3 = objectRef.f51659a;
                        if (obj3 == null) {
                            objectRef.f51659a = th2;
                        } else {
                            ExceptionsKt.m18297a((Throwable) obj3, th2);
                        }
                    }
                    while (it.hasNext()) {
                        Function1 function1 = (Function1) it.next();
                        dataMigrationInitializer$Companion$runMigrations$1.f23678a = objectRef;
                        dataMigrationInitializer$Companion$runMigrations$1.f23679b = it;
                        dataMigrationInitializer$Companion$runMigrations$1.f23681d = 2;
                        if (function1.invoke(dataMigrationInitializer$Companion$runMigrations$1) == obj2) {
                            return obj2;
                        }
                    }
                    th = (Throwable) objectRef.f51659a;
                    if (th != null) {
                        return Unit.f51459a;
                    }
                    throw th;
                }
                list2 = (List) dataMigrationInitializer$Companion$runMigrations$1.f23678a;
                ResultKt.m18313b(obj);
            }
            objectRef = new Ref.ObjectRef();
            it = list2.iterator();
            while (it.hasNext()) {
            }
            th = (Throwable) objectRef.f51659a;
            if (th != null) {
            }
        }
    }
}
