package androidx.paging;

import androidx.compose.animation.AbstractC0455a;
import androidx.paging.LoadState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, m18302d2 = {"Landroidx/paging/PageEvent;", "", "T", "Drop", "Insert", "LoadStateUpdate", "StaticList", "Landroidx/paging/PageEvent$Drop;", "Landroidx/paging/PageEvent$Insert;", "Landroidx/paging/PageEvent$LoadStateUpdate;", "Landroidx/paging/PageEvent$StaticList;", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public abstract class PageEvent<T> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/paging/PageEvent$Drop;", "", "T", "Landroidx/paging/PageEvent;", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Drop<T> extends PageEvent<T> {

        /* JADX INFO: renamed from: a */
        public final LoadType f30773a;

        /* JADX INFO: renamed from: b */
        public final int f30774b;

        /* JADX INFO: renamed from: c */
        public final int f30775c;

        /* JADX INFO: renamed from: d */
        public final int f30776d;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[LoadType.values().length];
                try {
                    iArr[2] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        public Drop(LoadType loadType, int i, int i2, int i3) {
            Intrinsics.m18599g(loadType, "loadType");
            this.f30773a = loadType;
            this.f30774b = i;
            this.f30775c = i2;
            this.f30776d = i3;
            if (loadType == LoadType.f30752a) {
                throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
            }
            if (m11354c() > 0) {
                if (i3 < 0) {
                    throw new IllegalArgumentException(AbstractC0000a.m9f(i3, "Invalid placeholdersRemaining ").toString());
                }
            } else {
                throw new IllegalArgumentException(("Drop count must be > 0, but was " + m11354c()).toString());
            }
        }

        /* JADX INFO: renamed from: c */
        public final int m11354c() {
            return (this.f30775c - this.f30774b) + 1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Drop)) {
                return false;
            }
            Drop drop = (Drop) obj;
            return this.f30773a == drop.f30773a && this.f30774b == drop.f30774b && this.f30775c == drop.f30775c && this.f30776d == drop.f30776d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f30776d) + AbstractC0455a.m2228c(this.f30775c, AbstractC0455a.m2228c(this.f30774b, this.f30773a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            String str;
            int iOrdinal = this.f30773a.ordinal();
            if (iOrdinal == 1) {
                str = "front";
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND");
                }
                str = "end";
            }
            StringBuilder sbM23t = AbstractC0000a.m23t("PageEvent.Drop from the ", str, " (\n                    |   minPageOffset: ");
            sbM23t.append(this.f30774b);
            sbM23t.append("\n                    |   maxPageOffset: ");
            sbM23t.append(this.f30775c);
            sbM23t.append("\n                    |   placeholdersRemaining: ");
            sbM23t.append(this.f30776d);
            sbM23t.append("\n                    |)");
            return StringsKt.m20432d0(sbM23t.toString());
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/paging/PageEvent$Insert;", "", "T", "Landroidx/paging/PageEvent;", "Companion", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Insert<T> extends PageEvent<T> {

        /* JADX INFO: renamed from: g */
        public static final Insert f30777g;

        /* JADX INFO: renamed from: a */
        public final LoadType f30778a;

        /* JADX INFO: renamed from: b */
        public final List f30779b;

        /* JADX INFO: renamed from: c */
        public final int f30780c;

        /* JADX INFO: renamed from: d */
        public final int f30781d;

        /* JADX INFO: renamed from: e */
        public final LoadStates f30782e;

        /* JADX INFO: renamed from: f */
        public final LoadStates f30783f;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/PageEvent$Insert$Companion;", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class Companion {
            /* JADX INFO: renamed from: a */
            public static Insert m11355a(List list, int i, int i2, LoadStates sourceLoadStates, LoadStates loadStates) {
                Intrinsics.m18599g(sourceLoadStates, "sourceLoadStates");
                return new Insert(LoadType.f30752a, list, i, i2, sourceLoadStates, loadStates);
            }
        }

        static {
            List listM18413N = CollectionsKt.m18413N(TransformablePage.f31352e);
            LoadState.NotLoading notLoading = LoadState.NotLoading.f30745c;
            LoadState.NotLoading notLoading2 = LoadState.NotLoading.f30744b;
            f30777g = Companion.m11355a(listM18413N, 0, 0, new LoadStates(notLoading, notLoading2, notLoading2), null);
        }

        public Insert(LoadType loadType, List list, int i, int i2, LoadStates loadStates, LoadStates loadStates2) {
            this.f30778a = loadType;
            this.f30779b = list;
            this.f30780c = i;
            this.f30781d = i2;
            this.f30782e = loadStates;
            this.f30783f = loadStates2;
            if (loadType != LoadType.f30754c && i < 0) {
                throw new IllegalArgumentException(AbstractC0000a.m9f(i, "Prepend insert defining placeholdersBefore must be > 0, but was ").toString());
            }
            if (loadType != LoadType.f30753b && i2 < 0) {
                throw new IllegalArgumentException(AbstractC0000a.m9f(i2, "Append insert defining placeholdersAfter must be > 0, but was ").toString());
            }
            if (loadType == LoadType.f30752a && list.isEmpty()) {
                throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x012d  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0141  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x008e -> B:18:0x00af). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00ed -> B:26:0x00fc). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo11352a(Function2 function2, ContinuationImpl continuationImpl) {
            PageEvent$Insert$filter$1 pageEvent$Insert$filter$1;
            Insert<T> insert;
            LoadType loadType;
            Collection collection;
            PageEvent$Insert$filter$1 pageEvent$Insert$filter$12;
            Iterator<T> it;
            Function2 function22;
            if (continuationImpl instanceof PageEvent$Insert$filter$1) {
                pageEvent$Insert$filter$1 = (PageEvent$Insert$filter$1) continuationImpl;
                int i = pageEvent$Insert$filter$1.f30799u;
                if ((i & Integer.MIN_VALUE) != 0) {
                    pageEvent$Insert$filter$1.f30799u = i - Integer.MIN_VALUE;
                } else {
                    pageEvent$Insert$filter$1 = new PageEvent$Insert$filter$1(this, continuationImpl);
                }
            }
            Object obj = pageEvent$Insert$filter$1.f30797s;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            int i2 = pageEvent$Insert$filter$1.f30799u;
            if (i2 == 0) {
                ResultKt.m18313b(obj);
                List list = this.f30779b;
                ArrayList arrayList = new ArrayList(CollectionsKt.m18452r(list, 10));
                Iterator<T> it2 = list.iterator();
                insert = this;
                loadType = this.f30778a;
                collection = arrayList;
                pageEvent$Insert$filter$12 = pageEvent$Insert$filter$1;
                it = it2;
                function22 = function2;
                if (it.hasNext()) {
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int iIntValue = pageEvent$Insert$filter$1.f30796r;
                int i3 = pageEvent$Insert$filter$1.f30795q;
                Collection collection2 = pageEvent$Insert$filter$1.f30794p;
                Object obj2 = pageEvent$Insert$filter$1.f30793o;
                Iterator<T> it3 = pageEvent$Insert$filter$1.f30792n;
                List list2 = pageEvent$Insert$filter$1.f30791j;
                List list3 = pageEvent$Insert$filter$1.f30790i;
                TransformablePage transformablePage = pageEvent$Insert$filter$1.f30789g;
                Iterator<T> it4 = pageEvent$Insert$filter$1.f30788f;
                Collection collection3 = pageEvent$Insert$filter$1.f30787d;
                LoadType loadType2 = pageEvent$Insert$filter$1.f30786c;
                Insert<T> insert2 = pageEvent$Insert$filter$1.f30785b;
                Function2 function23 = pageEvent$Insert$filter$1.f30784a;
                ResultKt.m18313b(obj);
                PageEvent$Insert$filter$1 pageEvent$Insert$filter$13 = pageEvent$Insert$filter$1;
                it = it4;
                List list4 = list3;
                List list5 = list2;
                LoadType loadType3 = loadType2;
                int i4 = i3;
                Collection collection4 = collection3;
                TransformablePage transformablePage2 = transformablePage;
                Iterator<T> it5 = it3;
                Collection collection5 = collection2;
                Insert<T> insert3 = insert2;
                Function2 function24 = function23;
                Object obj3 = obj;
                if (((Boolean) obj3).booleanValue()) {
                    list4.add(obj2);
                    List list6 = transformablePage2.f31356d;
                    if (list6 != null) {
                        iIntValue = ((Number) list6.get(iIntValue)).intValue();
                    }
                    list5.add(new Integer(iIntValue));
                }
                function22 = function24;
                Collection collection6 = collection5;
                LoadType loadType4 = loadType3;
                List arrayList2 = list5;
                Iterator<T> it6 = it5;
                List list7 = list4;
                TransformablePage transformablePage3 = transformablePage2;
                iIntValue = i4;
                if (it6.hasNext()) {
                    T next = it6.next();
                    i4 = iIntValue + 1;
                    if (iIntValue < 0) {
                        CollectionsKt.m18455s0();
                        throw null;
                    }
                    pageEvent$Insert$filter$13.f30784a = function22;
                    pageEvent$Insert$filter$13.f30785b = insert3;
                    pageEvent$Insert$filter$13.f30786c = loadType4;
                    pageEvent$Insert$filter$13.f30787d = collection4;
                    pageEvent$Insert$filter$13.f30788f = it;
                    pageEvent$Insert$filter$13.f30789g = transformablePage3;
                    pageEvent$Insert$filter$13.f30790i = list7;
                    pageEvent$Insert$filter$13.f30791j = arrayList2;
                    pageEvent$Insert$filter$13.f30792n = it6;
                    pageEvent$Insert$filter$13.f30793o = next;
                    pageEvent$Insert$filter$13.f30794p = collection6;
                    pageEvent$Insert$filter$13.f30795q = i4;
                    pageEvent$Insert$filter$13.f30796r = iIntValue;
                    pageEvent$Insert$filter$13.f30799u = 1;
                    Object objInvoke = function22.invoke(next, pageEvent$Insert$filter$13);
                    if (objInvoke == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    Function2 function25 = function22;
                    obj3 = objInvoke;
                    function24 = function25;
                    LoadType loadType5 = loadType4;
                    collection5 = collection6;
                    obj2 = next;
                    transformablePage2 = transformablePage3;
                    list4 = list7;
                    it5 = it6;
                    list5 = arrayList2;
                    loadType3 = loadType5;
                    if (((Boolean) obj3).booleanValue()) {
                    }
                    function22 = function24;
                    Collection collection62 = collection5;
                    LoadType loadType42 = loadType3;
                    List arrayList22 = list5;
                    Iterator<T> it62 = it5;
                    List list72 = list4;
                    TransformablePage transformablePage32 = transformablePage2;
                    iIntValue = i4;
                    if (it62.hasNext()) {
                        collection62.add(new TransformablePage(transformablePage32.f31353a, list72, transformablePage32.f31355c, arrayList22));
                        pageEvent$Insert$filter$12 = pageEvent$Insert$filter$13;
                        collection = collection4;
                        insert = insert3;
                        loadType = loadType42;
                        if (it.hasNext()) {
                            return new Insert(loadType, (List) collection, insert.f30780c, insert.f30781d, insert.f30782e, insert.f30783f);
                        }
                        TransformablePage transformablePage4 = (TransformablePage) it.next();
                        ArrayList arrayList3 = new ArrayList();
                        arrayList22 = new ArrayList();
                        it62 = transformablePage4.f31354b.iterator();
                        transformablePage32 = transformablePage4;
                        collection62 = collection;
                        pageEvent$Insert$filter$13 = pageEvent$Insert$filter$12;
                        iIntValue = 0;
                        list72 = arrayList3;
                        loadType42 = loadType;
                        insert3 = insert;
                        collection4 = collection62;
                        if (it62.hasNext()) {
                        }
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0087 -> B:18:0x00a6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00d9 -> B:24:0x00e0). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo11353b(Function2 function2, ContinuationImpl continuationImpl) {
            PageEvent$Insert$map$1 pageEvent$Insert$map$1;
            Insert<T> insert;
            LoadType loadType;
            Collection collection;
            PageEvent$Insert$map$1 pageEvent$Insert$map$12;
            Iterator<T> it;
            Function2 function22;
            if (continuationImpl instanceof PageEvent$Insert$map$1) {
                pageEvent$Insert$map$1 = (PageEvent$Insert$map$1) continuationImpl;
                int i = pageEvent$Insert$map$1.f30829s;
                if ((i & Integer.MIN_VALUE) != 0) {
                    pageEvent$Insert$map$1.f30829s = i - Integer.MIN_VALUE;
                } else {
                    pageEvent$Insert$map$1 = new PageEvent$Insert$map$1(this, continuationImpl);
                }
            }
            Object obj = pageEvent$Insert$map$1.f30827q;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            int i2 = pageEvent$Insert$map$1.f30829s;
            if (i2 == 0) {
                ResultKt.m18313b(obj);
                List list = this.f30779b;
                ArrayList arrayList = new ArrayList(CollectionsKt.m18452r(list, 10));
                Iterator<T> it2 = list.iterator();
                insert = this;
                loadType = this.f30778a;
                collection = arrayList;
                pageEvent$Insert$map$12 = pageEvent$Insert$map$1;
                it = it2;
                function22 = function2;
                if (it.hasNext()) {
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Collection collection2 = pageEvent$Insert$map$1.f30826p;
                Collection collection3 = pageEvent$Insert$map$1.f30825o;
                Iterator<T> it3 = pageEvent$Insert$map$1.f30824n;
                Collection collection4 = pageEvent$Insert$map$1.f30823j;
                int[] iArr = pageEvent$Insert$map$1.f30822i;
                TransformablePage transformablePage = pageEvent$Insert$map$1.f30821g;
                Iterator<T> it4 = pageEvent$Insert$map$1.f30820f;
                Collection collection5 = pageEvent$Insert$map$1.f30819d;
                LoadType loadType2 = pageEvent$Insert$map$1.f30818c;
                Insert<T> insert2 = pageEvent$Insert$map$1.f30817b;
                Function2 function23 = pageEvent$Insert$map$1.f30816a;
                ResultKt.m18313b(obj);
                PageEvent$Insert$map$1 pageEvent$Insert$map$13 = pageEvent$Insert$map$1;
                it = it4;
                Collection arrayList2 = collection3;
                Collection collection6 = collection4;
                LoadType loadType3 = loadType2;
                TransformablePage transformablePage2 = transformablePage;
                Iterator<T> it5 = it3;
                Insert<T> insert3 = insert2;
                arrayList2.add(obj);
                function22 = function23;
                PageEvent$Insert$map$1 pageEvent$Insert$map$14 = pageEvent$Insert$map$13;
                Collection collection7 = collection5;
                arrayList2 = collection6;
                TransformablePage transformablePage3 = transformablePage2;
                if (it5.hasNext()) {
                    T next = it5.next();
                    pageEvent$Insert$map$14.f30816a = function22;
                    pageEvent$Insert$map$14.f30817b = insert3;
                    pageEvent$Insert$map$14.f30818c = loadType3;
                    pageEvent$Insert$map$14.f30819d = collection7;
                    pageEvent$Insert$map$14.f30820f = it;
                    pageEvent$Insert$map$14.f30821g = transformablePage3;
                    pageEvent$Insert$map$14.f30822i = iArr;
                    Collection collection8 = arrayList2;
                    pageEvent$Insert$map$14.f30823j = collection8;
                    pageEvent$Insert$map$14.f30824n = it5;
                    pageEvent$Insert$map$14.f30825o = collection8;
                    pageEvent$Insert$map$14.f30826p = collection2;
                    pageEvent$Insert$map$14.f30829s = 1;
                    Object objInvoke = function22.invoke(next, pageEvent$Insert$map$14);
                    if (objInvoke == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    transformablePage2 = transformablePage3;
                    collection5 = collection7;
                    pageEvent$Insert$map$13 = pageEvent$Insert$map$14;
                    function23 = function22;
                    obj = objInvoke;
                    collection6 = arrayList2;
                    arrayList2.add(obj);
                    function22 = function23;
                    PageEvent$Insert$map$1 pageEvent$Insert$map$142 = pageEvent$Insert$map$13;
                    Collection collection72 = collection5;
                    arrayList2 = collection6;
                    TransformablePage transformablePage32 = transformablePage2;
                    if (it5.hasNext()) {
                        collection2.add(new TransformablePage(iArr, (List) arrayList2, transformablePage32.f31355c, transformablePage32.f31356d));
                        pageEvent$Insert$map$12 = pageEvent$Insert$map$142;
                        collection = collection72;
                        insert = insert3;
                        loadType = loadType3;
                        if (it.hasNext()) {
                            return new Insert(loadType, (List) collection, insert.f30780c, insert.f30781d, insert.f30782e, insert.f30783f);
                        }
                        TransformablePage transformablePage4 = (TransformablePage) it.next();
                        iArr = transformablePage4.f31353a;
                        List list2 = transformablePage4.f31354b;
                        arrayList2 = new ArrayList(CollectionsKt.m18452r(list2, 10));
                        it5 = list2.iterator();
                        transformablePage32 = transformablePage4;
                        loadType3 = loadType;
                        insert3 = insert;
                        collection72 = collection;
                        pageEvent$Insert$map$142 = pageEvent$Insert$map$12;
                        collection2 = collection72;
                        if (it5.hasNext()) {
                        }
                    }
                }
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Insert)) {
                return false;
            }
            Insert insert = (Insert) obj;
            return this.f30778a == insert.f30778a && Intrinsics.m18594b(this.f30779b, insert.f30779b) && this.f30780c == insert.f30780c && this.f30781d == insert.f30781d && Intrinsics.m18594b(this.f30782e, insert.f30782e) && Intrinsics.m18594b(this.f30783f, insert.f30783f);
        }

        public final int hashCode() {
            int iHashCode = (this.f30782e.hashCode() + AbstractC0455a.m2228c(this.f30781d, AbstractC0455a.m2228c(this.f30780c, AbstractC0455a.m2233h(this.f30779b, this.f30778a.hashCode() * 31, 31), 31), 31)) * 31;
            LoadStates loadStates = this.f30783f;
            return iHashCode + (loadStates == null ? 0 : loadStates.hashCode());
        }

        public final String toString() {
            List list;
            List list2;
            List list3 = this.f30779b;
            Iterator<T> it = list3.iterator();
            int size = 0;
            while (it.hasNext()) {
                size += ((TransformablePage) it.next()).f31354b.size();
            }
            int i = this.f30780c;
            String strValueOf = i != -1 ? String.valueOf(i) : "none";
            int i2 = this.f30781d;
            String strValueOf2 = i2 != -1 ? String.valueOf(i2) : "none";
            StringBuilder sb = new StringBuilder("PageEvent.Insert for ");
            sb.append(this.f30778a);
            sb.append(", with ");
            sb.append(size);
            sb.append(" items (\n                    |   first item: ");
            TransformablePage transformablePage = (TransformablePage) CollectionsKt.m18402D(list3);
            Object objM18412M = null;
            sb.append((transformablePage == null || (list2 = transformablePage.f31354b) == null) ? null : CollectionsKt.m18402D(list2));
            sb.append("\n                    |   last item: ");
            TransformablePage transformablePage2 = (TransformablePage) CollectionsKt.m18412M(list3);
            if (transformablePage2 != null && (list = transformablePage2.f31354b) != null) {
                objM18412M = CollectionsKt.m18412M(list);
            }
            sb.append(objM18412M);
            sb.append("\n                    |   placeholdersBefore: ");
            sb.append(strValueOf);
            sb.append("\n                    |   placeholdersAfter: ");
            sb.append(strValueOf2);
            sb.append("\n                    |   sourceLoadStates: ");
            sb.append(this.f30782e);
            sb.append("\n                    ");
            String string = sb.toString();
            LoadStates loadStates = this.f30783f;
            if (loadStates != null) {
                string = string + "|   mediatorLoadStates: " + loadStates + '\n';
            }
            return StringsKt.m20432d0(string + "|)");
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/paging/PageEvent$LoadStateUpdate;", "", "T", "Landroidx/paging/PageEvent;", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final /* data */ class LoadStateUpdate<T> extends PageEvent<T> {

        /* JADX INFO: renamed from: a */
        public final LoadStates f30830a;

        /* JADX INFO: renamed from: b */
        public final LoadStates f30831b;

        public LoadStateUpdate(LoadStates loadStates, LoadStates loadStates2) {
            this.f30830a = loadStates;
            this.f30831b = loadStates2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadStateUpdate)) {
                return false;
            }
            LoadStateUpdate loadStateUpdate = (LoadStateUpdate) obj;
            return Intrinsics.m18594b(this.f30830a, loadStateUpdate.f30830a) && Intrinsics.m18594b(this.f30831b, loadStateUpdate.f30831b);
        }

        public final int hashCode() {
            int iHashCode = this.f30830a.hashCode() * 31;
            LoadStates loadStates = this.f30831b;
            return iHashCode + (loadStates == null ? 0 : loadStates.hashCode());
        }

        public final String toString() {
            String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.f30830a + "\n                    ";
            LoadStates loadStates = this.f30831b;
            if (loadStates != null) {
                str = str + "|   mediatorLoadStates: " + loadStates + '\n';
            }
            return StringsKt.m20432d0(str + "|)");
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/paging/PageEvent$StaticList;", "", "T", "Landroidx/paging/PageEvent;", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final /* data */ class StaticList<T> extends PageEvent<T> {

        /* JADX INFO: renamed from: a */
        public final List f30832a;

        public StaticList(List data) {
            Intrinsics.m18599g(data, "data");
            this.f30832a = data;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006e -> B:21:0x0072). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo11352a(Function2 function2, ContinuationImpl continuationImpl) {
            PageEvent$StaticList$filter$1 pageEvent$StaticList$filter$1;
            StaticList<T> staticList;
            Collection arrayList;
            Iterator<T> it;
            if (continuationImpl instanceof PageEvent$StaticList$filter$1) {
                pageEvent$StaticList$filter$1 = (PageEvent$StaticList$filter$1) continuationImpl;
                int i = pageEvent$StaticList$filter$1.f30840j;
                if ((i & Integer.MIN_VALUE) != 0) {
                    pageEvent$StaticList$filter$1.f30840j = i - Integer.MIN_VALUE;
                } else {
                    pageEvent$StaticList$filter$1 = new PageEvent$StaticList$filter$1(this, continuationImpl);
                }
            }
            Object obj = pageEvent$StaticList$filter$1.f30838g;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            int i2 = pageEvent$StaticList$filter$1.f30840j;
            if (i2 == 0) {
                ResultKt.m18313b(obj);
                List list = this.f30832a;
                staticList = this;
                arrayList = new ArrayList();
                it = list.iterator();
                if (it.hasNext()) {
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = pageEvent$StaticList$filter$1.f30837f;
                it = pageEvent$StaticList$filter$1.f30836d;
                arrayList = pageEvent$StaticList$filter$1.f30835c;
                Function2 function22 = pageEvent$StaticList$filter$1.f30834b;
                staticList = pageEvent$StaticList$filter$1.f30833a;
                ResultKt.m18313b(obj);
                if (((Boolean) obj).booleanValue()) {
                    arrayList.add(obj2);
                }
                function2 = function22;
                if (it.hasNext()) {
                    T next = it.next();
                    pageEvent$StaticList$filter$1.f30833a = staticList;
                    pageEvent$StaticList$filter$1.f30834b = function2;
                    pageEvent$StaticList$filter$1.f30835c = arrayList;
                    pageEvent$StaticList$filter$1.f30836d = it;
                    pageEvent$StaticList$filter$1.f30837f = next;
                    pageEvent$StaticList$filter$1.f30840j = 1;
                    Object objInvoke = function2.invoke(next, pageEvent$StaticList$filter$1);
                    if (objInvoke == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    function22 = function2;
                    obj2 = next;
                    obj = objInvoke;
                    if (((Boolean) obj).booleanValue()) {
                    }
                    function2 = function22;
                    if (it.hasNext()) {
                        staticList.getClass();
                        return new StaticList((List) arrayList);
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0078 -> B:21:0x007b). Please report as a decompilation issue!!! */
        @Override // androidx.paging.PageEvent
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo11353b(Function2 function2, ContinuationImpl continuationImpl) {
            PageEvent$StaticList$map$1 pageEvent$StaticList$map$1;
            Function2 function22;
            Collection collection;
            Iterator<T> it;
            StaticList<T> staticList;
            if (continuationImpl instanceof PageEvent$StaticList$map$1) {
                pageEvent$StaticList$map$1 = (PageEvent$StaticList$map$1) continuationImpl;
                int i = pageEvent$StaticList$map$1.f30855j;
                if ((i & Integer.MIN_VALUE) != 0) {
                    pageEvent$StaticList$map$1.f30855j = i - Integer.MIN_VALUE;
                } else {
                    pageEvent$StaticList$map$1 = new PageEvent$StaticList$map$1(this, continuationImpl);
                }
            }
            Object obj = pageEvent$StaticList$map$1.f30853g;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            int i2 = pageEvent$StaticList$map$1.f30855j;
            if (i2 == 0) {
                ResultKt.m18313b(obj);
                List list = this.f30832a;
                ArrayList arrayList = new ArrayList(CollectionsKt.m18452r(list, 10));
                Iterator<T> it2 = list.iterator();
                function22 = function2;
                collection = arrayList;
                it = it2;
                staticList = this;
                if (it.hasNext()) {
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                collection = pageEvent$StaticList$map$1.f30852f;
                it = pageEvent$StaticList$map$1.f30851d;
                Collection collection2 = pageEvent$StaticList$map$1.f30850c;
                Function2 function23 = pageEvent$StaticList$map$1.f30849b;
                staticList = pageEvent$StaticList$map$1.f30848a;
                ResultKt.m18313b(obj);
                collection.add(obj);
                collection = collection2;
                function22 = function23;
                if (it.hasNext()) {
                    T next = it.next();
                    pageEvent$StaticList$map$1.f30848a = staticList;
                    pageEvent$StaticList$map$1.f30849b = function22;
                    Collection collection3 = collection;
                    pageEvent$StaticList$map$1.f30850c = collection3;
                    pageEvent$StaticList$map$1.f30851d = it;
                    pageEvent$StaticList$map$1.f30852f = collection3;
                    pageEvent$StaticList$map$1.f30855j = 1;
                    Object objInvoke = function22.invoke(next, pageEvent$StaticList$map$1);
                    if (objInvoke == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    function23 = function22;
                    obj = objInvoke;
                    collection2 = collection;
                    collection.add(obj);
                    collection = collection2;
                    function22 = function23;
                    if (it.hasNext()) {
                        staticList.getClass();
                        return new StaticList((List) collection);
                    }
                }
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof StaticList) {
                return Intrinsics.m18594b(this.f30832a, ((StaticList) obj).f30832a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f30832a.hashCode() * 961;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PageEvent.StaticList with ");
            List list = this.f30832a;
            sb.append(list.size());
            sb.append(" items (\n                    |   first item: ");
            sb.append(CollectionsKt.m18402D(list));
            sb.append("\n                    |   last item: ");
            sb.append(CollectionsKt.m18412M(list));
            sb.append("\n                    |   sourceLoadStates: null\n                    ");
            return StringsKt.m20432d0(sb.toString() + "|)");
        }
    }

    /* JADX INFO: renamed from: a */
    public Object mo11352a(Function2 function2, ContinuationImpl continuationImpl) {
        return this;
    }

    /* JADX INFO: renamed from: b */
    public Object mo11353b(Function2 function2, ContinuationImpl continuationImpl) {
        return this;
    }
}
