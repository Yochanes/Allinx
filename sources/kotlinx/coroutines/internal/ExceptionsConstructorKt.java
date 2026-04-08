package kotlinx.coroutines.internal;

import com.exchange.allin.p024ui.widgets.C3513L;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002*(\b\u0002\u0010\u0002\"\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000¨\u0006\u0003"}, m18302d2 = {"Lkotlin/Function1;", "", "Ctor", "kotlinx-coroutines-core"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ExceptionsConstructorKt {

    /* JADX INFO: renamed from: a */
    public static final int f56326a;

    static {
        WeakMapCtorCache weakMapCtorCache = WeakMapCtorCache.f56369a;
        f56326a = m20822b(Throwable.class, -1);
        try {
            int i = FastServiceLoaderKt.f56328a;
        } catch (Throwable unused) {
            WeakMapCtorCache weakMapCtorCache2 = WeakMapCtorCache.f56369a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Function1 m20821a(Class cls) {
        Object next;
        Function1 function1;
        Pair pair;
        ExceptionsConstructorKt$createConstructor$nullResult$1 exceptionsConstructorKt$createConstructor$nullResult$1 = ExceptionsConstructorKt$createConstructor$nullResult$1.f56327a;
        if (f56326a == m20822b(cls, 0)) {
            Constructor<?>[] constructors = cls.getConstructors();
            ArrayList arrayList = new ArrayList(constructors.length);
            int length = constructors.length;
            int i = 0;
            while (true) {
                next = null;
                if (i >= length) {
                    break;
                }
                Constructor<?> constructor = constructors[i];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length2 = parameterTypes.length;
                if (length2 == 0) {
                    pair = new Pair(new C3513L(new C6334a(constructor, 3), 5), 0);
                } else if (length2 != 1) {
                    pair = length2 != 2 ? new Pair(null, -1) : (Intrinsics.m18594b(parameterTypes[0], String.class) && Intrinsics.m18594b(parameterTypes[1], Throwable.class)) ? new Pair(new C3513L(new C6334a(constructor, 0), 5), 3) : new Pair(null, -1);
                } else {
                    Class<?> cls2 = parameterTypes[0];
                    pair = Intrinsics.m18594b(cls2, String.class) ? new Pair(new C3513L(new C6334a(constructor, 1), 5), 2) : Intrinsics.m18594b(cls2, Throwable.class) ? new Pair(new C3513L(new C6334a(constructor, 2), 5), 1) : new Pair(null, -1);
                }
                arrayList.add(pair);
                i++;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iIntValue = ((Number) ((Pair) next).f51427b).intValue();
                    do {
                        Object next2 = it.next();
                        int iIntValue2 = ((Number) ((Pair) next2).f51427b).intValue();
                        if (iIntValue < iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it.hasNext());
                }
            }
            Pair pair2 = (Pair) next;
            if (pair2 != null && (function1 = (Function1) pair2.f51426a) != null) {
                return function1;
            }
        }
        return exceptionsConstructorKt$createConstructor$nullResult$1;
    }

    /* JADX INFO: renamed from: b */
    public static final int m20822b(Class cls, int i) {
        Object objM18312a;
        JvmClassMappingKt.m18575e(cls);
        int i2 = 0;
        do {
            try {
                int i3 = 0;
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                objM18312a = ResultKt.m18312a(th);
            }
        } while (cls != null);
        objM18312a = Integer.valueOf(i2);
        Object objValueOf = Integer.valueOf(i);
        if (objM18312a instanceof Result.Failure) {
            objM18312a = objValueOf;
        }
        return ((Number) objM18312a).intValue();
    }
}
