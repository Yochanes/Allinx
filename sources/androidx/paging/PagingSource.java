package androidx.paging;

import androidx.annotation.VisibleForTesting;
import androidx.compose.animation.AbstractC0455a;
import com.google.common.net.HttpHeaders;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u001b\u001cJ\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\u000b\u0010\nR \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001d"}, m18302d2 = {"Landroidx/paging/PagingSource;", "", "Key", "Value", "", "invalidate", "()V", "Lkotlin/Function0;", "onInvalidatedCallback", "registerInvalidatedCallback", "(Lkotlin/jvm/functions/Function0;)V", "unregisterInvalidatedCallback", "Landroidx/paging/InvalidateCallbackTracker;", "invalidateCallbackTracker", "Landroidx/paging/InvalidateCallbackTracker;", "", "getInvalidateCallbackCount$paging_common_release", "()I", "invalidateCallbackCount", "", "getJumpingSupported", "()Z", "jumpingSupported", "getKeyReuseSupported", "keyReuseSupported", "getInvalid", "invalid", "LoadParams", "LoadResult", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class PagingSource<Key, Value> {

    @NotNull
    private final InvalidateCallbackTracker<Function0<Unit>> invalidateCallbackTracker = new InvalidateCallbackTracker<>(null, PagingSource$invalidateCallbackTracker$1.f31194a);

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m18302d2 = {"Landroidx/paging/PagingSource$LoadParams;", "", "Key", "Append", "Companion", "Prepend", HttpHeaders.REFRESH, "Landroidx/paging/PagingSource$LoadParams$Append;", "Landroidx/paging/PagingSource$LoadParams$Prepend;", "Landroidx/paging/PagingSource$LoadParams$Refresh;", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static abstract class LoadParams<Key> {

        /* JADX INFO: renamed from: a */
        public final int f31182a;

        /* JADX INFO: renamed from: b */
        public final boolean f31183b;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/paging/PagingSource$LoadParams$Append;", "", "Key", "Landroidx/paging/PagingSource$LoadParams;", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class Append<Key> extends LoadParams<Key> {

            /* JADX INFO: renamed from: c */
            public final Object f31184c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Append(int i, Object key, boolean z2) {
                super(i, z2);
                Intrinsics.m18599g(key, "key");
                this.f31184c = key;
            }

            @Override // androidx.paging.PagingSource.LoadParams
            /* JADX INFO: renamed from: a, reason: from getter */
            public final Object getF31186c() {
                return this.f31184c;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/PagingSource$LoadParams$Companion;", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class Companion {

            /* JADX INFO: compiled from: Proguard */
            @Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
            public /* synthetic */ class WhenMappings {
                static {
                    int[] iArr = new int[LoadType.values().length];
                    try {
                        iArr[0] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[1] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[2] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                }
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/paging/PagingSource$LoadParams$Prepend;", "", "Key", "Landroidx/paging/PagingSource$LoadParams;", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class Prepend<Key> extends LoadParams<Key> {

            /* JADX INFO: renamed from: c */
            public final Object f31185c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Prepend(int i, Object key, boolean z2) {
                super(i, z2);
                Intrinsics.m18599g(key, "key");
                this.f31185c = key;
            }

            @Override // androidx.paging.PagingSource.LoadParams
            /* JADX INFO: renamed from: a, reason: from getter */
            public final Object getF31186c() {
                return this.f31185c;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/paging/PagingSource$LoadParams$Refresh;", "", "Key", "Landroidx/paging/PagingSource$LoadParams;", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class Refresh<Key> extends LoadParams<Key> {

            /* JADX INFO: renamed from: c */
            public final Object f31186c;

            public Refresh(int i, Object obj, boolean z2) {
                super(i, z2);
                this.f31186c = obj;
            }

            @Override // androidx.paging.PagingSource.LoadParams
            /* JADX INFO: renamed from: a, reason: from getter */
            public final Object getF31186c() {
                return this.f31186c;
            }
        }

        public LoadParams(int i, boolean z2) {
            this.f31182a = i;
            this.f31183b = z2;
        }

        /* JADX INFO: renamed from: a */
        public abstract Object getF31186c();
    }

    public final boolean getInvalid() {
        return this.invalidateCallbackTracker.f30715e;
    }

    @VisibleForTesting
    public final int getInvalidateCallbackCount$paging_common_release() {
        return this.invalidateCallbackTracker.f30714d.size();
    }

    public boolean getJumpingSupported() {
        return false;
    }

    public boolean getKeyReuseSupported() {
        return false;
    }

    public abstract Object getRefreshKey(PagingState pagingState);

    public final void invalidate() {
        if (this.invalidateCallbackTracker.m11339a() && PagingLogger.m11396a(3)) {
            PagingLogger.m11397b(3, "Invalidated PagingSource " + this);
        }
    }

    public abstract Object load(LoadParams loadParams, Continuation continuation);

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public final void registerInvalidatedCallback(@NotNull Function0<Unit> onInvalidatedCallback) {
        Intrinsics.m18599g(onInvalidatedCallback, "onInvalidatedCallback");
        InvalidateCallbackTracker<Function0<Unit>> invalidateCallbackTracker = this.invalidateCallbackTracker;
        Function0 function0 = invalidateCallbackTracker.f30712b;
        boolean z2 = true;
        if (function0 != null && ((Boolean) ((DataSource$invalidateCallbackTracker$2) function0).invoke()).booleanValue()) {
            invalidateCallbackTracker.m11339a();
        }
        boolean z3 = invalidateCallbackTracker.f30715e;
        ?? r3 = invalidateCallbackTracker.f30711a;
        if (z3) {
            r3.invoke(onInvalidatedCallback);
            return;
        }
        ReentrantLock reentrantLock = invalidateCallbackTracker.f30713c;
        try {
            reentrantLock.lock();
            if (!invalidateCallbackTracker.f30715e) {
                invalidateCallbackTracker.f30714d.add(onInvalidatedCallback);
                z2 = false;
            }
            if (z2) {
                r3.invoke(onInvalidatedCallback);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void unregisterInvalidatedCallback(@NotNull Function0<Unit> onInvalidatedCallback) {
        Intrinsics.m18599g(onInvalidatedCallback, "onInvalidatedCallback");
        InvalidateCallbackTracker<Function0<Unit>> invalidateCallbackTracker = this.invalidateCallbackTracker;
        ReentrantLock reentrantLock = invalidateCallbackTracker.f30713c;
        try {
            reentrantLock.lock();
            invalidateCallbackTracker.f30714d.remove(onInvalidatedCallback);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001:\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m18302d2 = {"Landroidx/paging/PagingSource$LoadResult;", "", "Key", "Value", "Error", "Invalid", "Page", "Landroidx/paging/PagingSource$LoadResult$Error;", "Landroidx/paging/PagingSource$LoadResult$Invalid;", "Landroidx/paging/PagingSource$LoadResult$Page;", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static abstract class LoadResult<Key, Value> {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/paging/PagingSource$LoadResult$Error;", "", "Key", "Value", "Landroidx/paging/PagingSource$LoadResult;", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final /* data */ class Error<Key, Value> extends LoadResult<Key, Value> {

            /* JADX INFO: renamed from: a */
            public final Throwable f31187a;

            public Error(Throwable throwable) {
                Intrinsics.m18599g(throwable, "throwable");
                this.f31187a = throwable;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.m18594b(this.f31187a, ((Error) obj).f31187a);
            }

            public final int hashCode() {
                return this.f31187a.hashCode();
            }

            public final String toString() {
                return StringsKt.m20432d0("LoadResult.Error(\n                    |   throwable: " + this.f31187a + "\n                    |) ");
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/paging/PagingSource$LoadResult$Invalid;", "", "Key", "Value", "Landroidx/paging/PagingSource$LoadResult;", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class Invalid<Key, Value> extends LoadResult<Key, Value> {
            public final String toString() {
                return "LoadResult.Invalid";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00042\b\u0012\u0004\u0012\u00028\u00050\u0005:\u0001\u0006¨\u0006\u0007"}, m18302d2 = {"Landroidx/paging/PagingSource$LoadResult$Page;", "", "Key", "Value", "Landroidx/paging/PagingSource$LoadResult;", "", "Companion", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final /* data */ class Page<Key, Value> extends LoadResult<Key, Value> implements Iterable<Value>, KMappedMarker {

            /* JADX INFO: renamed from: g */
            public static final Page f31188g = new Page(EmptyList.f51496a, null, null, 0, 0);

            /* JADX INFO: renamed from: a */
            public final List f31189a;

            /* JADX INFO: renamed from: b */
            public final Object f31190b;

            /* JADX INFO: renamed from: c */
            public final Object f31191c;

            /* JADX INFO: renamed from: d */
            public final int f31192d;

            /* JADX INFO: renamed from: f */
            public final int f31193f;

            /* JADX INFO: compiled from: Proguard */
            @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/paging/PagingSource$LoadResult$Page$Companion;", "", "", "COUNT_UNDEFINED", "I", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
            public static final class Companion {
            }

            public Page(List data, Object obj, Object obj2, int i, int i2) {
                Intrinsics.m18599g(data, "data");
                this.f31189a = data;
                this.f31190b = obj;
                this.f31191c = obj2;
                this.f31192d = i;
                this.f31193f = i2;
                if (i != Integer.MIN_VALUE && i < 0) {
                    throw new IllegalArgumentException("itemsBefore cannot be negative");
                }
                if (i2 != Integer.MIN_VALUE && i2 < 0) {
                    throw new IllegalArgumentException("itemsAfter cannot be negative");
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Page)) {
                    return false;
                }
                Page page = (Page) obj;
                return Intrinsics.m18594b(this.f31189a, page.f31189a) && Intrinsics.m18594b(this.f31190b, page.f31190b) && Intrinsics.m18594b(this.f31191c, page.f31191c) && this.f31192d == page.f31192d && this.f31193f == page.f31193f;
            }

            public final int hashCode() {
                int iHashCode = this.f31189a.hashCode() * 31;
                Object obj = this.f31190b;
                int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
                Object obj2 = this.f31191c;
                return Integer.hashCode(this.f31193f) + AbstractC0455a.m2228c(this.f31192d, (iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31, 31);
            }

            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return this.f31189a.listIterator();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("LoadResult.Page(\n                    |   data size: ");
                List list = this.f31189a;
                sb.append(list.size());
                sb.append("\n                    |   first Item: ");
                sb.append(CollectionsKt.m18402D(list));
                sb.append("\n                    |   last Item: ");
                sb.append(CollectionsKt.m18412M(list));
                sb.append("\n                    |   nextKey: ");
                sb.append(this.f31191c);
                sb.append("\n                    |   prevKey: ");
                sb.append(this.f31190b);
                sb.append("\n                    |   itemsBefore: ");
                sb.append(this.f31192d);
                sb.append("\n                    |   itemsAfter: ");
                sb.append(this.f31193f);
                sb.append("\n                    |) ");
                return StringsKt.m20432d0(sb.toString());
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public Page(List data, Number number, Number number2) {
                this(data, number, number2, Integer.MIN_VALUE, Integer.MIN_VALUE);
                Intrinsics.m18599g(data, "data");
            }
        }
    }
}
