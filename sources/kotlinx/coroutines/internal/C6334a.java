package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6334a implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56370a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Constructor f56371b;

    public /* synthetic */ C6334a(Constructor constructor, int i) {
        this.f56370a = i;
        this.f56371b = constructor;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Constructor constructor = this.f56371b;
        Throwable th = (Throwable) obj;
        switch (this.f56370a) {
            case 0:
                int i = ExceptionsConstructorKt.f56326a;
                Object objNewInstance = constructor.newInstance(th.getMessage(), th);
                Intrinsics.m18597e(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                return (Throwable) objNewInstance;
            case 1:
                int i2 = ExceptionsConstructorKt.f56326a;
                Object objNewInstance2 = constructor.newInstance(th.getMessage());
                Intrinsics.m18597e(objNewInstance2, "null cannot be cast to non-null type kotlin.Throwable");
                Throwable th2 = (Throwable) objNewInstance2;
                th2.initCause(th);
                return th2;
            case 2:
                int i3 = ExceptionsConstructorKt.f56326a;
                Object objNewInstance3 = constructor.newInstance(th);
                Intrinsics.m18597e(objNewInstance3, "null cannot be cast to non-null type kotlin.Throwable");
                return (Throwable) objNewInstance3;
            default:
                int i4 = ExceptionsConstructorKt.f56326a;
                Object objNewInstance4 = constructor.newInstance(new Object[0]);
                Intrinsics.m18597e(objNewInstance4, "null cannot be cast to non-null type kotlin.Throwable");
                Throwable th3 = (Throwable) objNewInstance4;
                th3.initCause(th);
                return th3;
        }
    }
}
