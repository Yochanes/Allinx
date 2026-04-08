package androidx.paging;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"paging-common_release"}, m18303k = 2, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SeparatorsKt {
    /* JADX INFO: renamed from: a */
    public static final void m11407a(List list, Object obj, TransformablePage transformablePage, TransformablePage transformablePage2, int i, int i2) {
        Intrinsics.m18599g(list, "<this>");
        int[] iArrM18463w0 = transformablePage != null ? transformablePage.f31353a : null;
        int[] iArr = transformablePage2 != null ? transformablePage2.f31353a : null;
        if (iArrM18463w0 != null && iArr != null) {
            int[] iArrM18354U = ArraysKt.m18354U(iArrM18463w0, iArr);
            LinkedHashSet linkedHashSet = new LinkedHashSet(MapsKt.m18484g(iArrM18354U.length));
            for (int i3 : iArrM18354U) {
                linkedHashSet.add(Integer.valueOf(i3));
            }
            iArrM18463w0 = CollectionsKt.m18463w0(CollectionsKt.m18447o0(CollectionsKt.m18465x0(linkedHashSet)));
        } else if (iArrM18463w0 == null && iArr != null) {
            iArrM18463w0 = iArr;
        } else if (iArrM18463w0 == null || iArr != null) {
            throw new IllegalArgumentException("Separator page expected adjacentPageBefore or adjacentPageAfter, but both were null.");
        }
        if (obj == null) {
            return;
        }
        list.add(new TransformablePage(iArrM18463w0, CollectionsKt.m18413N(obj), i, CollectionsKt.m18413N(Integer.valueOf(i2))));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b3 -> B:12:0x0037). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m11408b(TransformablePage transformablePage, Function3 function3, ContinuationImpl continuationImpl) {
        SeparatorsKt$insertInternalSeparators$1 separatorsKt$insertInternalSeparators$1;
        ArrayList arrayList;
        ArrayList arrayList2;
        SeparatorsKt$insertInternalSeparators$1 separatorsKt$insertInternalSeparators$12;
        Function3 function32;
        TransformablePage transformablePage2;
        int size;
        int i;
        if (continuationImpl instanceof SeparatorsKt$insertInternalSeparators$1) {
            separatorsKt$insertInternalSeparators$1 = (SeparatorsKt$insertInternalSeparators$1) continuationImpl;
            int i2 = separatorsKt$insertInternalSeparators$1.f31296n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                separatorsKt$insertInternalSeparators$1.f31296n = i2 - Integer.MIN_VALUE;
            } else {
                separatorsKt$insertInternalSeparators$1 = new SeparatorsKt$insertInternalSeparators$1(continuationImpl);
            }
        }
        Object obj = separatorsKt$insertInternalSeparators$1.f31295j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i3 = separatorsKt$insertInternalSeparators$1.f31296n;
        if (i3 == 0) {
            ResultKt.m18313b(obj);
            if (transformablePage.f31354b.isEmpty()) {
                return transformablePage;
            }
            List list = transformablePage.f31354b;
            int size2 = list.size() + 4;
            ArrayList arrayList3 = new ArrayList(size2);
            ArrayList arrayList4 = new ArrayList(size2);
            arrayList3.add(CollectionsKt.m18398B(list));
            List list2 = transformablePage.f31356d;
            arrayList4.add(new Integer(list2 != null ? ((Number) CollectionsKt.m18398B(list2)).intValue() : 0));
            arrayList = arrayList3;
            arrayList2 = arrayList4;
            separatorsKt$insertInternalSeparators$12 = separatorsKt$insertInternalSeparators$1;
            function32 = function3;
            transformablePage2 = transformablePage;
            size = list.size();
            i = 1;
            if (i < size) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            size = separatorsKt$insertInternalSeparators$1.f31294i;
            int i4 = separatorsKt$insertInternalSeparators$1.f31293g;
            Object obj2 = separatorsKt$insertInternalSeparators$1.f31292f;
            ArrayList arrayList5 = separatorsKt$insertInternalSeparators$1.f31291d;
            arrayList = separatorsKt$insertInternalSeparators$1.f31290c;
            Function3 function33 = separatorsKt$insertInternalSeparators$1.f31289b;
            TransformablePage transformablePage3 = separatorsKt$insertInternalSeparators$1.f31288a;
            ResultKt.m18313b(obj);
            ArrayList arrayList6 = arrayList5;
            SeparatorsKt$insertInternalSeparators$1 separatorsKt$insertInternalSeparators$13 = separatorsKt$insertInternalSeparators$1;
            function32 = function33;
            ArrayList arrayList7 = arrayList;
            ArrayList arrayList8 = arrayList6;
            if (obj != null) {
                arrayList7.add(obj);
                arrayList8.add(new Integer(i4));
            }
            arrayList7.add(obj2);
            arrayList8.add(new Integer(i4));
            i = i4 + 1;
            separatorsKt$insertInternalSeparators$12 = separatorsKt$insertInternalSeparators$13;
            arrayList2 = arrayList8;
            arrayList = arrayList7;
            transformablePage2 = transformablePage3;
            if (i < size) {
                Object obj3 = transformablePage2.f31354b.get(i);
                Object obj4 = transformablePage2.f31354b.get(i - 1);
                separatorsKt$insertInternalSeparators$12.f31288a = transformablePage2;
                separatorsKt$insertInternalSeparators$12.f31289b = function32;
                separatorsKt$insertInternalSeparators$12.f31290c = arrayList;
                separatorsKt$insertInternalSeparators$12.f31291d = arrayList2;
                separatorsKt$insertInternalSeparators$12.f31292f = obj3;
                separatorsKt$insertInternalSeparators$12.f31293g = i;
                separatorsKt$insertInternalSeparators$12.f31294i = size;
                separatorsKt$insertInternalSeparators$12.f31296n = 1;
                Object objInvoke = function32.invoke(obj4, obj3, separatorsKt$insertInternalSeparators$12);
                if (objInvoke == coroutineSingletons) {
                    return coroutineSingletons;
                }
                transformablePage3 = transformablePage2;
                i4 = i;
                obj = objInvoke;
                arrayList6 = arrayList2;
                separatorsKt$insertInternalSeparators$13 = separatorsKt$insertInternalSeparators$12;
                obj2 = obj3;
                ArrayList arrayList72 = arrayList;
                ArrayList arrayList82 = arrayList6;
                if (obj != null) {
                }
                arrayList72.add(obj2);
                arrayList82.add(new Integer(i4));
                i = i4 + 1;
                separatorsKt$insertInternalSeparators$12 = separatorsKt$insertInternalSeparators$13;
                arrayList2 = arrayList82;
                arrayList = arrayList72;
                transformablePage2 = transformablePage3;
                if (i < size) {
                    return arrayList.size() == transformablePage2.f31354b.size() ? transformablePage2 : new TransformablePage(transformablePage2.f31353a, arrayList, transformablePage2.f31355c, arrayList2);
                }
            }
        }
    }
}
