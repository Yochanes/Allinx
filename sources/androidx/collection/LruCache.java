package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.Lock;
import androidx.collection.internal.LruHashMap;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u000bJ1\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u00012\b\u0010\u0014\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0017\u0010\u000bJ\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u001dJ\r\u0010 \u001a\u00020\u0004¢\u0006\u0004\b \u0010\u001dJ\r\u0010!\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\u001dJ\r\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u001dJ\u0019\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010)R \u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010)R\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010)R\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010)R\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010)R\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010)R\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010)¨\u00060"}, m18302d2 = {"Landroidx/collection/LruCache;", "", "K", "V", "", "maxSize", "", "resize", "(I)V", "key", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "trimToSize", "remove", "", "evicted", "oldValue", "newValue", "entryRemoved", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "create", "sizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "evictAll", "()V", "size", "()I", "hitCount", "missCount", "createCount", "putCount", "evictionCount", "", "snapshot", "()Ljava/util/Map;", "", "toString", "()Ljava/lang/String;", "I", "Landroidx/collection/internal/LruHashMap;", "map", "Landroidx/collection/internal/LruHashMap;", "Landroidx/collection/internal/Lock;", "lock", "Landroidx/collection/internal/Lock;", "collection"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;

    @NotNull
    private final Lock lock;

    @NotNull
    private final LruHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int i) {
        this.maxSize = i;
        if (i <= 0) {
            RuntimeHelpersKt.m2143a("maxSize <= 0");
            throw null;
        }
        this.map = new LruHashMap<>();
        this.lock = new Lock();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final int m2010a(Object obj, Object obj2) {
        int iSizeOf = sizeOf(obj, obj2);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        String message = "Negative size: " + obj + '=' + obj2;
        Intrinsics.m18599g(message, "message");
        throw new IllegalStateException(message);
    }

    @Nullable
    public V create(@NotNull K key) {
        Intrinsics.m18599g(key, "key");
        return null;
    }

    public final int createCount() {
        int i;
        synchronized (this.lock) {
            i = this.createCount;
        }
        return i;
    }

    public void entryRemoved(boolean evicted, @NotNull K key, @NotNull V oldValue, @Nullable V newValue) {
        Intrinsics.m18599g(key, "key");
        Intrinsics.m18599g(oldValue, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i;
        synchronized (this.lock) {
            i = this.evictionCount;
        }
        return i;
    }

    @Nullable
    public final V get(@NotNull K key) {
        V v;
        Intrinsics.m18599g(key, "key");
        synchronized (this.lock) {
            LruHashMap<K, V> lruHashMap = this.map;
            lruHashMap.getClass();
            V v2 = (V) lruHashMap.f3908a.get(key);
            if (v2 != null) {
                this.hitCount++;
                return v2;
            }
            this.missCount++;
            V vCreate = create(key);
            if (vCreate == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    v = (V) this.map.f3908a.put(key, vCreate);
                    if (v != null) {
                        this.map.f3908a.put(key, v);
                    } else {
                        this.size += m2010a(key, vCreate);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (v != null) {
                entryRemoved(false, key, vCreate, v);
                return v;
            }
            trimToSize(this.maxSize);
            return vCreate;
        }
    }

    public final int hitCount() {
        int i;
        synchronized (this.lock) {
            i = this.hitCount;
        }
        return i;
    }

    public final int maxSize() {
        int i;
        synchronized (this.lock) {
            i = this.maxSize;
        }
        return i;
    }

    public final int missCount() {
        int i;
        synchronized (this.lock) {
            i = this.missCount;
        }
        return i;
    }

    @Nullable
    public final V put(@NotNull K key, @NotNull V value) {
        V v;
        Intrinsics.m18599g(key, "key");
        Intrinsics.m18599g(value, "value");
        synchronized (this.lock) {
            this.putCount++;
            this.size += m2010a(key, value);
            v = (V) this.map.f3908a.put(key, value);
            if (v != null) {
                this.size -= m2010a(key, v);
            }
        }
        if (v != null) {
            entryRemoved(false, key, v, value);
        }
        trimToSize(this.maxSize);
        return v;
    }

    public final int putCount() {
        int i;
        synchronized (this.lock) {
            i = this.putCount;
        }
        return i;
    }

    @Nullable
    public final V remove(@NotNull K key) {
        V v;
        Intrinsics.m18599g(key, "key");
        synchronized (this.lock) {
            LruHashMap<K, V> lruHashMap = this.map;
            lruHashMap.getClass();
            v = (V) lruHashMap.f3908a.remove(key);
            if (v != null) {
                this.size -= m2010a(key, v);
            }
        }
        if (v != null) {
            entryRemoved(false, key, v, null);
        }
        return v;
    }

    public void resize(@IntRange int maxSize) {
        if (!(maxSize > 0)) {
            RuntimeHelpersKt.m2143a("maxSize <= 0");
            throw null;
        }
        synchronized (this.lock) {
            this.maxSize = maxSize;
        }
        trimToSize(maxSize);
    }

    public final int size() {
        int i;
        synchronized (this.lock) {
            i = this.size;
        }
        return i;
    }

    public int sizeOf(@NotNull K key, @NotNull V value) {
        Intrinsics.m18599g(key, "key");
        Intrinsics.m18599g(value, "value");
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            Set<Map.Entry<K, V>> setEntrySet = this.map.f3908a.entrySet();
            Intrinsics.m18598f(setEntrySet, "<get-entries>(...)");
            linkedHashMap = new LinkedHashMap(setEntrySet.size());
            Set<Map.Entry<K, V>> setEntrySet2 = this.map.f3908a.entrySet();
            Intrinsics.m18598f(setEntrySet2, "<get-entries>(...)");
            Iterator<T> it = setEntrySet2.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i = this.hitCount;
                int i2 = this.missCount + i;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void trimToSize(int maxSize) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.lock) {
                try {
                    if (!(this.size >= 0 && (!this.map.f3908a.isEmpty() || this.size == 0))) {
                        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
                    }
                    if (this.size <= maxSize || this.map.f3908a.isEmpty()) {
                        break;
                    }
                    Set<Map.Entry<K, V>> setEntrySet = this.map.f3908a.entrySet();
                    Intrinsics.m18598f(setEntrySet, "<get-entries>(...)");
                    Map.Entry entry = (Map.Entry) CollectionsKt.m18400C(setEntrySet);
                    if (entry == null) {
                        return;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    LruHashMap<K, V> lruHashMap = this.map;
                    lruHashMap.getClass();
                    Intrinsics.m18599g(key, "key");
                    lruHashMap.f3908a.remove(key);
                    this.size -= m2010a(key, value);
                    this.evictionCount++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            entryRemoved(true, key, value, null);
        }
    }
}
