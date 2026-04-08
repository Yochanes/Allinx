package androidx.work;

import androidx.work.Data;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/work/ArrayCreatingInputMerger;", "Landroidx/work/InputMerger;", "<init>", "()V", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ArrayCreatingInputMerger extends InputMerger {
    @Override // androidx.work.InputMerger
    /* JADX INFO: renamed from: a */
    public final Data mo12085a(ArrayList arrayList) {
        Object newArray;
        Data.Builder builder = new Data.Builder();
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map mapUnmodifiableMap = Collections.unmodifiableMap(((Data) it.next()).f32564a);
            Intrinsics.m18598f(mapUnmodifiableMap, "unmodifiableMap(values)");
            for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Class cls = value != null ? value.getClass() : String.class;
                Object obj = map.get(str);
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        Intrinsics.m18597e(value, "null cannot be cast to non-null type kotlin.Any");
                        int length = Array.getLength(obj);
                        int length2 = Array.getLength(value);
                        Class<?> componentType = obj.getClass().getComponentType();
                        Intrinsics.m18596d(componentType);
                        Object newArray2 = Array.newInstance(componentType, length + length2);
                        System.arraycopy(obj, 0, newArray2, 0, length);
                        System.arraycopy(value, 0, newArray2, length, length2);
                        Intrinsics.m18598f(newArray2, "newArray");
                        value = newArray2;
                    } else {
                        if (!Intrinsics.m18594b(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        int length3 = Array.getLength(obj);
                        newArray = Array.newInstance(cls, length3 + 1);
                        System.arraycopy(obj, 0, newArray, 0, length3);
                        Array.set(newArray, length3, value);
                        Intrinsics.m18598f(newArray, "newArray");
                        value = newArray;
                    }
                } else if (cls.isArray()) {
                    Intrinsics.m18597e(value, "null cannot be cast to non-null type kotlin.Any");
                } else {
                    newArray = Array.newInstance(cls, 1);
                    Array.set(newArray, 0, value);
                    Intrinsics.m18598f(newArray, "newArray");
                    value = newArray;
                }
                map.put(str, value);
            }
        }
        builder.m12094b(map);
        return builder.m12093a();
    }
}
