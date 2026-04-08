package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.annotation.CheckForNull;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {

    @VisibleForTesting
    static final double HASH_FLOODING_FPP = 0.001d;
    private static final int MAX_HASH_BUCKET_LENGTH = 9;
    private static final Object NOT_FOUND = new Object();

    @VisibleForTesting
    @CheckForNull
    transient int[] entries;

    @CheckForNull
    @LazyInit
    private transient Set<Map.Entry<K, V>> entrySetView;

    @CheckForNull
    @LazyInit
    private transient Set<K> keySetView;

    @VisibleForTesting
    @CheckForNull
    transient Object[] keys;
    private transient int metadata;
    private transient int size;

    @CheckForNull
    private transient Object table;

    @VisibleForTesting
    @CheckForNull
    transient Object[] values;

    @CheckForNull
    @LazyInit
    private transient Collection<V> valuesView;

    /* JADX INFO: renamed from: com.google.common.collect.CompactHashMap$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C41771 extends CompactHashMap<K, V>.Itr<K> {
        public C41771() {
            super(CompactHashMap.this, null);
        }

        @Override // com.google.common.collect.CompactHashMap.Itr
        @ParametricNullness
        public K getOutput(int i) {
            return (K) CompactHashMap.access$100(CompactHashMap.this, i);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.CompactHashMap$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C41782 extends CompactHashMap<K, V>.Itr<Map.Entry<K, V>> {
        public C41782() {
            super(CompactHashMap.this, null);
        }

        @Override // com.google.common.collect.CompactHashMap.Itr
        public /* bridge */ /* synthetic */ Object getOutput(int i) {
            return getOutput(i);
        }

        @Override // com.google.common.collect.CompactHashMap.Itr
        public Map.Entry<K, V> getOutput(int i) {
            return new MapEntry(i);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.CompactHashMap$3 */
    /* JADX INFO: compiled from: Proguard */
    public class C41793 extends CompactHashMap<K, V>.Itr<V> {
        public C41793() {
            super(CompactHashMap.this, null);
        }

        @Override // com.google.common.collect.CompactHashMap.Itr
        @ParametricNullness
        public V getOutput(int i) {
            return (V) CompactHashMap.access$600(CompactHashMap.this, i);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class EntrySetView extends AbstractSet<Map.Entry<K, V>> {
        public EntrySetView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return mapDelegateOrNull.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int iAccess$500 = CompactHashMap.access$500(CompactHashMap.this, entry.getKey());
                if (iAccess$500 != -1 && Objects.equal(CompactHashMap.access$600(CompactHashMap.this, iAccess$500), entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return CompactHashMap.this.entrySetIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            int iAccess$700;
            int iRemove;
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return mapDelegateOrNull.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (CompactHashMap.this.needsAllocArrays() || (iRemove = CompactHashing.remove(entry.getKey(), entry.getValue(), (iAccess$700 = CompactHashMap.access$700(CompactHashMap.this)), CompactHashMap.access$800(CompactHashMap.this), CompactHashMap.access$900(CompactHashMap.this), CompactHashMap.access$1000(CompactHashMap.this), CompactHashMap.access$1100(CompactHashMap.this))) == -1) {
                return false;
            }
            CompactHashMap.this.moveLastEntry(iRemove, iAccess$700);
            CompactHashMap.access$1210(CompactHashMap.this);
            CompactHashMap.this.incrementModCount();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class KeySetView extends AbstractSet<K> {
        public KeySetView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@CheckForNull Object obj) {
            return CompactHashMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return CompactHashMap.this.keySetIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@CheckForNull Object obj) {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            return mapDelegateOrNull != null ? mapDelegateOrNull.keySet().remove(obj) : CompactHashMap.access$200(CompactHashMap.this, obj) != CompactHashMap.access$300();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public final class MapEntry extends AbstractMapEntry<K, V> {

        @ParametricNullness
        private final K key;
        private int lastKnownIndex;

        public MapEntry(int i) {
            this.key = (K) CompactHashMap.access$100(CompactHashMap.this, i);
            this.lastKnownIndex = i;
        }

        private void updateLastKnownIndex() {
            int i = this.lastKnownIndex;
            if (i == -1 || i >= CompactHashMap.this.size() || !Objects.equal(this.key, CompactHashMap.access$100(CompactHashMap.this, this.lastKnownIndex))) {
                this.lastKnownIndex = CompactHashMap.access$500(CompactHashMap.this, this.key);
            }
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public K getKey() {
            return this.key;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V getValue() {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return (V) NullnessCasts.uncheckedCastNullableTToT(mapDelegateOrNull.get(this.key));
            }
            updateLastKnownIndex();
            int i = this.lastKnownIndex;
            return i == -1 ? (V) NullnessCasts.unsafeNull() : (V) CompactHashMap.access$600(CompactHashMap.this, i);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V setValue(@ParametricNullness V v) {
            Map<K, V> mapDelegateOrNull = CompactHashMap.this.delegateOrNull();
            if (mapDelegateOrNull != null) {
                return (V) NullnessCasts.uncheckedCastNullableTToT(mapDelegateOrNull.put(this.key, v));
            }
            updateLastKnownIndex();
            int i = this.lastKnownIndex;
            if (i == -1) {
                CompactHashMap.this.put(this.key, v);
                return (V) NullnessCasts.unsafeNull();
            }
            V v2 = (V) CompactHashMap.access$600(CompactHashMap.this, i);
            CompactHashMap.access$1300(CompactHashMap.this, this.lastKnownIndex, v);
            return v2;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class ValuesView extends AbstractCollection<V> {
        public ValuesView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return CompactHashMap.this.valuesIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    public CompactHashMap() {
        init(3);
    }

    public static /* synthetic */ int access$000(CompactHashMap compactHashMap) {
        return compactHashMap.metadata;
    }

    public static /* synthetic */ Object access$100(CompactHashMap compactHashMap, int i) {
        return compactHashMap.key(i);
    }

    public static /* synthetic */ Object[] access$1000(CompactHashMap compactHashMap) {
        return compactHashMap.requireKeys();
    }

    public static /* synthetic */ Object[] access$1100(CompactHashMap compactHashMap) {
        return compactHashMap.requireValues();
    }

    public static /* synthetic */ int access$1210(CompactHashMap compactHashMap) {
        int i = compactHashMap.size;
        compactHashMap.size = i - 1;
        return i;
    }

    public static /* synthetic */ void access$1300(CompactHashMap compactHashMap, int i, Object obj) {
        compactHashMap.setValue(i, obj);
    }

    public static /* synthetic */ Object access$200(CompactHashMap compactHashMap, Object obj) {
        return compactHashMap.removeHelper(obj);
    }

    public static /* synthetic */ Object access$300() {
        return NOT_FOUND;
    }

    public static /* synthetic */ int access$500(CompactHashMap compactHashMap, Object obj) {
        return compactHashMap.indexOf(obj);
    }

    public static /* synthetic */ Object access$600(CompactHashMap compactHashMap, int i) {
        return compactHashMap.value(i);
    }

    public static /* synthetic */ int access$700(CompactHashMap compactHashMap) {
        return compactHashMap.hashTableMask();
    }

    public static /* synthetic */ Object access$800(CompactHashMap compactHashMap) {
        return compactHashMap.requireTable();
    }

    public static /* synthetic */ int[] access$900(CompactHashMap compactHashMap) {
        return compactHashMap.requireEntries();
    }

    public static <K, V> CompactHashMap<K, V> create() {
        return new CompactHashMap<>();
    }

    public static <K, V> CompactHashMap<K, V> createWithExpectedSize(int i) {
        return new CompactHashMap<>(i);
    }

    private int entry(int i) {
        return requireEntries()[i];
    }

    private int hashTableMask() {
        return (1 << (this.metadata & 31)) - 1;
    }

    private int indexOf(@CheckForNull Object obj) {
        if (needsAllocArrays()) {
            return -1;
        }
        int iSmearedHash = Hashing.smearedHash(obj);
        int iHashTableMask = hashTableMask();
        int iTableGet = CompactHashing.tableGet(requireTable(), iSmearedHash & iHashTableMask);
        if (iTableGet == 0) {
            return -1;
        }
        int hashPrefix = CompactHashing.getHashPrefix(iSmearedHash, iHashTableMask);
        do {
            int i = iTableGet - 1;
            int iEntry = entry(i);
            if (CompactHashing.getHashPrefix(iEntry, iHashTableMask) == hashPrefix && Objects.equal(obj, key(i))) {
                return i;
            }
            iTableGet = CompactHashing.getNext(iEntry, iHashTableMask);
        } while (iTableGet != 0);
        return -1;
    }

    private K key(int i) {
        return (K) requireKeys()[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(AbstractC0000a.m9f(i, "Invalid size: "));
        }
        init(i);
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private Object removeHelper(@CheckForNull Object obj) {
        if (needsAllocArrays()) {
            return NOT_FOUND;
        }
        int iHashTableMask = hashTableMask();
        int iRemove = CompactHashing.remove(obj, null, iHashTableMask, requireTable(), requireEntries(), requireKeys(), null);
        if (iRemove == -1) {
            return NOT_FOUND;
        }
        V vValue = value(iRemove);
        moveLastEntry(iRemove, iHashTableMask);
        this.size--;
        incrementModCount();
        return vValue;
    }

    private int[] requireEntries() {
        int[] iArr = this.entries;
        java.util.Objects.requireNonNull(iArr);
        return iArr;
    }

    private Object[] requireKeys() {
        Object[] objArr = this.keys;
        java.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    private Object requireTable() {
        Object obj = this.table;
        java.util.Objects.requireNonNull(obj);
        return obj;
    }

    private Object[] requireValues() {
        Object[] objArr = this.values;
        java.util.Objects.requireNonNull(objArr);
        return objArr;
    }

    private void resizeMeMaybe(int i) {
        int iMin;
        int length = requireEntries().length;
        if (i <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        resizeEntries(iMin);
    }

    @CanIgnoreReturnValue
    private int resizeTable(int i, int i2, int i3, int i4) {
        Object objCreateTable = CompactHashing.createTable(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            CompactHashing.tableSet(objCreateTable, i3 & i5, i4 + 1);
        }
        Object objRequireTable = requireTable();
        int[] iArrRequireEntries = requireEntries();
        for (int i6 = 0; i6 <= i; i6++) {
            int iTableGet = CompactHashing.tableGet(objRequireTable, i6);
            while (iTableGet != 0) {
                int i7 = iTableGet - 1;
                int i8 = iArrRequireEntries[i7];
                int hashPrefix = CompactHashing.getHashPrefix(i8, i) | i6;
                int i9 = hashPrefix & i5;
                int iTableGet2 = CompactHashing.tableGet(objCreateTable, i9);
                CompactHashing.tableSet(objCreateTable, i9, iTableGet);
                iArrRequireEntries[i7] = CompactHashing.maskCombine(hashPrefix, iTableGet2, i5);
                iTableGet = CompactHashing.getNext(i8, i);
            }
        }
        this.table = objCreateTable;
        setHashTableMask(i5);
        return i5;
    }

    private void setEntry(int i, int i2) {
        requireEntries()[i] = i2;
    }

    private void setHashTableMask(int i) {
        this.metadata = CompactHashing.maskCombine(this.metadata, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private void setKey(int i, K k) {
        requireKeys()[i] = k;
    }

    private void setValue(int i, V v) {
        requireValues()[i] = v;
    }

    private V value(int i) {
        return (V) requireValues()[i];
    }

    @J2ktIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<Map.Entry<K, V>> itEntrySetIterator = entrySetIterator();
        while (itEntrySetIterator.hasNext()) {
            Map.Entry<K, V> next = itEntrySetIterator.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    public int adjustAfterRemove(int i, int i2) {
        return i - 1;
    }

    @CanIgnoreReturnValue
    public int allocArrays() {
        Preconditions.checkState(needsAllocArrays(), "Arrays already allocated");
        int i = this.metadata;
        int iTableSize = CompactHashing.tableSize(i);
        this.table = CompactHashing.createTable(iTableSize);
        setHashTableMask(iTableSize - 1);
        this.entries = new int[i];
        this.keys = new Object[i];
        this.values = new Object[i];
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        incrementModCount();
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            this.metadata = Ints.constrainToRange(size(), 3, 1073741823);
            mapDelegateOrNull.clear();
            this.table = null;
            this.size = 0;
            return;
        }
        Arrays.fill(requireKeys(), 0, this.size, (Object) null);
        Arrays.fill(requireValues(), 0, this.size, (Object) null);
        CompactHashing.tableClear(requireTable());
        Arrays.fill(requireEntries(), 0, this.size, 0);
        this.size = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.containsKey(obj) : indexOf(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.containsValue(obj);
        }
        for (int i = 0; i < this.size; i++) {
            if (Objects.equal(obj, value(i))) {
                return true;
            }
        }
        return false;
    }

    @CanIgnoreReturnValue
    public Map<K, V> convertToHashFloodingResistantImplementation() {
        Map<K, V> mapCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(hashTableMask() + 1);
        int iFirstEntryIndex = firstEntryIndex();
        while (iFirstEntryIndex >= 0) {
            mapCreateHashFloodingResistantDelegate.put(key(iFirstEntryIndex), value(iFirstEntryIndex));
            iFirstEntryIndex = getSuccessor(iFirstEntryIndex);
        }
        this.table = mapCreateHashFloodingResistantDelegate;
        this.entries = null;
        this.keys = null;
        this.values = null;
        incrementModCount();
        return mapCreateHashFloodingResistantDelegate;
    }

    public Set<Map.Entry<K, V>> createEntrySet() {
        return new EntrySetView();
    }

    public Map<K, V> createHashFloodingResistantDelegate(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    public Set<K> createKeySet() {
        return new KeySetView();
    }

    public Collection<V> createValues() {
        return new ValuesView();
    }

    @VisibleForTesting
    @CheckForNull
    public Map<K, V> delegateOrNull() {
        Object obj = this.table;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySetView;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setCreateEntrySet = createEntrySet();
        this.entrySetView = setCreateEntrySet;
        return setCreateEntrySet;
    }

    public Iterator<Map.Entry<K, V>> entrySetIterator() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.entrySet().iterator() : new C41782();
    }

    public int firstEntryIndex() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object obj) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.get(obj);
        }
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return null;
        }
        accessEntry(iIndexOf);
        return value(iIndexOf);
    }

    public int getSuccessor(int i) {
        int i2 = i + 1;
        if (i2 < this.size) {
            return i2;
        }
        return -1;
    }

    public void incrementModCount() {
        this.metadata += 32;
    }

    public void init(int i) {
        Preconditions.checkArgument(i >= 0, "Expected size must be >= 0");
        this.metadata = Ints.constrainToRange(i, 1, 1073741823);
    }

    public void insertEntry(int i, @ParametricNullness K k, @ParametricNullness V v, int i2, int i3) {
        setEntry(i, CompactHashing.maskCombine(i2, 0, i3));
        setKey(i, k);
        setValue(i, v);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySetView;
        if (set != null) {
            return set;
        }
        Set<K> setCreateKeySet = createKeySet();
        this.keySetView = setCreateKeySet;
        return setCreateKeySet;
    }

    public Iterator<K> keySetIterator() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.keySet().iterator() : new C41771();
    }

    public void moveLastEntry(int i, int i2) {
        Object objRequireTable = requireTable();
        int[] iArrRequireEntries = requireEntries();
        Object[] objArrRequireKeys = requireKeys();
        Object[] objArrRequireValues = requireValues();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrRequireKeys[i] = null;
            objArrRequireValues[i] = null;
            iArrRequireEntries[i] = 0;
            return;
        }
        Object obj = objArrRequireKeys[i3];
        objArrRequireKeys[i] = obj;
        objArrRequireValues[i] = objArrRequireValues[i3];
        objArrRequireKeys[i3] = null;
        objArrRequireValues[i3] = null;
        iArrRequireEntries[i] = iArrRequireEntries[i3];
        iArrRequireEntries[i3] = 0;
        int iSmearedHash = Hashing.smearedHash(obj) & i2;
        int iTableGet = CompactHashing.tableGet(objRequireTable, iSmearedHash);
        if (iTableGet == size) {
            CompactHashing.tableSet(objRequireTable, iSmearedHash, i + 1);
            return;
        }
        while (true) {
            int i4 = iTableGet - 1;
            int i5 = iArrRequireEntries[i4];
            int next = CompactHashing.getNext(i5, i2);
            if (next == size) {
                iArrRequireEntries[i4] = CompactHashing.maskCombine(i5, i + 1, i2);
                return;
            }
            iTableGet = next;
        }
    }

    public boolean needsAllocArrays() {
        return this.table == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public V put(@ParametricNullness K k, @ParametricNullness V v) {
        if (needsAllocArrays()) {
            allocArrays();
        }
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.put(k, v);
        }
        int[] iArrRequireEntries = requireEntries();
        Object[] objArrRequireKeys = requireKeys();
        Object[] objArrRequireValues = requireValues();
        int i = this.size;
        int i2 = i + 1;
        int iSmearedHash = Hashing.smearedHash(k);
        int iHashTableMask = hashTableMask();
        int i3 = iSmearedHash & iHashTableMask;
        int iTableGet = CompactHashing.tableGet(requireTable(), i3);
        if (iTableGet != 0) {
            int hashPrefix = CompactHashing.getHashPrefix(iSmearedHash, iHashTableMask);
            int i4 = 0;
            while (true) {
                int i5 = iTableGet - 1;
                int i6 = iArrRequireEntries[i5];
                if (CompactHashing.getHashPrefix(i6, iHashTableMask) == hashPrefix && Objects.equal(k, objArrRequireKeys[i5])) {
                    V v2 = (V) objArrRequireValues[i5];
                    objArrRequireValues[i5] = v;
                    accessEntry(i5);
                    return v2;
                }
                int next = CompactHashing.getNext(i6, iHashTableMask);
                i4++;
                if (next != 0) {
                    k = k;
                    v = v;
                    iTableGet = next;
                } else {
                    if (i4 >= 9) {
                        return convertToHashFloodingResistantImplementation().put(k, v);
                    }
                    if (i2 > iHashTableMask) {
                        iHashTableMask = resizeTable(iHashTableMask, CompactHashing.newCapacity(iHashTableMask), iSmearedHash, i);
                    } else {
                        iArrRequireEntries[i5] = CompactHashing.maskCombine(i6, i2, iHashTableMask);
                    }
                }
            }
        } else if (i2 > iHashTableMask) {
            iHashTableMask = resizeTable(iHashTableMask, CompactHashing.newCapacity(iHashTableMask), iSmearedHash, i);
        } else {
            CompactHashing.tableSet(requireTable(), i3, i2);
        }
        int i7 = iHashTableMask;
        resizeMeMaybe(i2);
        insertEntry(i, k, v, iSmearedHash, i7);
        this.size = i2;
        incrementModCount();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @CheckForNull
    public V remove(@CheckForNull Object obj) {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            return mapDelegateOrNull.remove(obj);
        }
        V v = (V) removeHelper(obj);
        if (v == NOT_FOUND) {
            return null;
        }
        return v;
    }

    public void resizeEntries(int i) {
        this.entries = Arrays.copyOf(requireEntries(), i);
        this.keys = Arrays.copyOf(requireKeys(), i);
        this.values = Arrays.copyOf(requireValues(), i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.size() : this.size;
    }

    public void trimToSize() {
        if (needsAllocArrays()) {
            return;
        }
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        if (mapDelegateOrNull != null) {
            Map<K, V> mapCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(size());
            mapCreateHashFloodingResistantDelegate.putAll(mapDelegateOrNull);
            this.table = mapCreateHashFloodingResistantDelegate;
            return;
        }
        int i = this.size;
        if (i < requireEntries().length) {
            resizeEntries(i);
        }
        int iTableSize = CompactHashing.tableSize(i);
        int iHashTableMask = hashTableMask();
        if (iTableSize < iHashTableMask) {
            resizeTable(iHashTableMask, iTableSize, 0, 0);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.valuesView;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionCreateValues = createValues();
        this.valuesView = collectionCreateValues;
        return collectionCreateValues;
    }

    public Iterator<V> valuesIterator() {
        Map<K, V> mapDelegateOrNull = delegateOrNull();
        return mapDelegateOrNull != null ? mapDelegateOrNull.values().iterator() : new C41793();
    }

    public CompactHashMap(int i) {
        init(i);
    }

    /* JADX INFO: compiled from: Proguard */
    public abstract class Itr<T> implements Iterator<T> {
        int currentIndex;
        int expectedMetadata;
        int indexToRemove;

        private Itr() {
            this.expectedMetadata = CompactHashMap.access$000(CompactHashMap.this);
            this.currentIndex = CompactHashMap.this.firstEntryIndex();
            this.indexToRemove = -1;
        }

        private void checkForConcurrentModification() {
            if (CompactHashMap.access$000(CompactHashMap.this) != this.expectedMetadata) {
                throw new ConcurrentModificationException();
            }
        }

        @ParametricNullness
        public abstract T getOutput(int i);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.currentIndex >= 0;
        }

        public void incrementExpectedModCount() {
            this.expectedMetadata += 32;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            checkForConcurrentModification();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.currentIndex;
            this.indexToRemove = i;
            T output = getOutput(i);
            this.currentIndex = CompactHashMap.this.getSuccessor(this.currentIndex);
            return output;
        }

        @Override // java.util.Iterator
        public void remove() {
            checkForConcurrentModification();
            CollectPreconditions.checkRemove(this.indexToRemove >= 0);
            incrementExpectedModCount();
            CompactHashMap compactHashMap = CompactHashMap.this;
            compactHashMap.remove(CompactHashMap.access$100(compactHashMap, this.indexToRemove));
            this.currentIndex = CompactHashMap.this.adjustAfterRemove(this.currentIndex, this.indexToRemove);
            this.indexToRemove = -1;
        }

        public /* synthetic */ Itr(CompactHashMap compactHashMap, C41771 c41771) {
            this();
        }
    }

    public void accessEntry(int i) {
    }
}
